package sec07.ex01;
import javax.naming.InitialContext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;
 
 
import javax.naming.Context;
import javax.sql.DataSource;

public class MemberDAO {
    /*
     * private static final String driver = "oracle.jdbc.driver.OracleDriver";
     * private static final String url = "jdbc:oracle:thin:@localhost:1521:XE";
     * private static final String user = "scott"; 
     * private static final String pwd = "tiger";
     */
    
    private Connection con;
    private PreparedStatement pstmt;
    private DataSource dataFactory;
    
    public MemberDAO() {
        try {
            Context ctx = new InitialContext();
            Context envContext = (Context) ctx.lookup("java:/comp/env");
            dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public List<MemberVO> listMembers() {
        List<MemberVO> list = new ArrayList<MemberVO>();
        try {
            // connDB();
            con = dataFactory.getConnection();
            String query = "select * from t_member";
            System.out.println("prepareStatement: " + query);
            pstmt = con.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                String id = rs.getString("id");
                String pwd = rs.getString("pwd");
                String name = rs.getString("name");
                String email = rs.getString("email");
                java.sql.Date joinDate = rs.getDate("joinDate");
                
                MemberVO vo = new MemberVO();
                vo.setId(id);
                vo.setPwd(pwd);
                vo.setName(name);
                vo.setEmail(email);
                vo.setJoinDate(joinDate);
                list.add(vo);
            }
            
            rs.close();
            pstmt.close();
            con.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
}
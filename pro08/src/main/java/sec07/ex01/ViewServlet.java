package sec07.ex01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

@WebServlet("/viewmembers") // MemberServlet에서 "viewmembers"로 포워딩하므로 이 경로로 변경해야 합니다.
public class ViewServlet extends HttpServlet {
	
    public ViewServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				response.setContentType("text/html;charset=utf-8");
				PrintWriter out = response.getWriter();
				List membersList=(List) request.getAttribute("membersList");

				out.println("<html><body>");
				out.print("<table border=1><tr align='center'bgcolor='lightgreen'>");
				// 오타 수정: 비밀먼호 -> 비밀번호, <t>삭제</td> -> <td>삭제</td>
				out.print("<td>아이디</td><td>비밀번호</td><td>이름</td><td>이메일</td><td>가입일</td><td>삭제</td></tr>");
				
				// "redirect를 이용한 바인딩 실습입니다" 메시지를 테이블 안에 한 행으로 추가
				out.print("<tr><td colspan='6'>redirect를 이용한 바인딩 실습입니다</td></tr>");
				
				if (membersList != null && !membersList.isEmpty()) { // 데이터가 있을 경우만 루프 실행
				    for (int i = 0; i < membersList.size(); i++) {
				        MemberVO memberVO = (MemberVO) membersList.get(i);
				        String id = memberVO.getId();
				        String pwd = memberVO.getPwd();
				        String name = memberVO.getName();
				        String email = memberVO.getEmail();
				        Date joinDate = memberVO.getJoinDate();
				        out.print("<tr><td>" + id + "</td><td>" + pwd + "</td><td>" + name + "</td><td>"
				                + email + "</td><td>" + joinDate + "</td><td>"
				                + "<a href='/pro08/member3?command=delMember&id=" + id 
				                + "'>삭제</a></td></tr>");
				    }
				} else {
				    out.print("<tr><td colspan='6'>회원 정보가 없습니다.</td></tr>"); // 데이터가 없을 경우 메시지 출력
				}

				out.print("</table>"); // 테이블을 닫습니다.
				out.println("</body></html>"); // HTML 문서를 가장 마지막에 닫습니다.
	}
}
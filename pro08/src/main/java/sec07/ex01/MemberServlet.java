package sec07.ex01;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

@WebServlet("/member3")
public class MemberServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
    	doHandle(request,response);
    }
    public void    doPost(HttpServletRequest request, HttpServletResponse response) 
            throws IOException, ServletException {
    	doHandle(request,response);
    }
    private void doHandle(HttpServletRequest request, HttpServletResponse response) 
            throws IOException, ServletException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        MemberDAO dao = new MemberDAO();
        List memberList=dao.listMembers();
        request.setAttribute("membersList", memberList);
        RequestDispatcher dispatch = request.getRequestDispatcher("viewmembers");
        dispatch.forward(request, response);
    }
}
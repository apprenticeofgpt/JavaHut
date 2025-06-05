package sec01.ex01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException {
	    doPost(req, resp); // GET 요청도 POST처럼 처리
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException {

	    String id = req.getParameter("userId");
	    String pwd = req.getParameter("userPwd");

	    System.out.println("======= 로그인 요청 도착 =======");
	    System.out.println("입력된 ID: [" + id + "]");
	    System.out.println("입력된 PW: [" + pwd + "]");

	    resp.setContentType("text/html;charset=UTF-8");
	    PrintWriter out = resp.getWriter();

	    if ("admin".equals(id) && "1234".equals(pwd)) {
	        out.println("<h2>로그인 성공!</h2>");
	        out.println("<p>" + id + "님 환영합니다.</p>");
	    } else {
	        out.println("<h2>로그인 실패</h2>");
	        out.println("<p>아이디나 비밀번호가 틀렸습니다.</p>");
	    }
	    String[] subjects = req.getParameterValues("subject");

	    if (subjects != null) {
	        for (String subject : subjects) {
	            System.out.println("선택한 과목:" + subject);
	        }
	    }

	}

}

package sec03.ex01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/SecondServlet02")
public class SecondServlet02 extends HttpServlet {
	

	public SecondServlet02() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				response.setContentType("text/html;charset=utf-8");
				PrintWriter out = response.getWriter();
				out.println("<html><body>");
				out.println("location를 이용한 redirect 실습입니다.");
				out.println("<html><body>");
	}

	

}

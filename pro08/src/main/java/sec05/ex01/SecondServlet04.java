package sec05.ex01;

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
@WebServlet("/SecondServlet04")
public class SecondServlet04 extends HttpServlet {
	

	public SecondServlet04() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				response.setContentType("text/html;charset=utf-8");
				PrintWriter out = response.getWriter();
				String name=request.getParameter("name");
				out.println("<html><body>");
				out.print("이름:"+name);
				out.print("<br>");
				out.print("dispatch를 이용한 forward 실습입니다");
				out.println("</body></html>");
	}

	

}

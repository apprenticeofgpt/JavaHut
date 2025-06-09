package sec06.ex01;

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
@WebServlet("/SecondServlet05")
public class SecondServlet05 extends HttpServlet {
	

	public SecondServlet05() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				response.setContentType("text/html;charset=utf-8");
				PrintWriter out = response.getWriter();
				String address=(String)request.getAttribute("address");
				out.println("<html><body>");
				out.print("주소:"+address);
				out.print("<br>");
				out.print("redirect를 이용한 바인딩 실습입니다");
				out.println("</body></html>");
	}

	

}

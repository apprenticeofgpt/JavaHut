package sec04.ex01;

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
@WebServlet("/SecondServlet03")
public class SecondServlet03 extends HttpServlet {
	

	public SecondServlet03() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				response.setContentType("text/html;charset=utf-8");
				PrintWriter out = response.getWriter();
				String name=request.getParameter("name");
				out.println("<html><body>");
				out.println("이름:"+name);
				out.println("<br>");
				out.println("</body></html>");
	}

	

}

package sec08.ex01;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
@WebServlet("/cget")
public class GetServletContext extends HttpServlet {
	

	public GetServletContext() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				response.setContentType("text/html;charset=utf-8");
				PrintWriter out = response.getWriter();
				ServletContext context = getServletContext();
				List member = (ArrayList)context.getAttribute("member");
				String name=(String)member.get(0);
				int age=(Integer)member.get(1);
				out.print("<html><body>");
				out.print(name+"<br>");
				out.print(age+"<br>");
				out.print("</body></html>");
	}

	

}

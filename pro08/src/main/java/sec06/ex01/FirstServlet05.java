package sec06.ex01;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/FirstServlet05")
public class FirstServlet05 extends HttpServlet {
	

    public FirstServlet05() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		request.setAttribute("address", "강원도 원주시");
		RequestDispatcher dispatch = request.getRequestDispatcher("SecondServlet05");
		dispatch.forward(request,response);
	}

}

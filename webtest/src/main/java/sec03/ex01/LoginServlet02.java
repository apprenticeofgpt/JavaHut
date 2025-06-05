package sec03.ex01;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * Servlet implementation class LoginServlet02
 */
@WebServlet("/LoginServlet02")
public class LoginServlet02 extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("init 메서드 호출");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 한글 처리
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8");

        // 출력 스트림 준비
        PrintWriter out = response.getWriter();

        // 폼에서 전송된 파라미터 받기
        String id = request.getParameter("user_id");
        String pw = request.getParameter("user_pw");
        String address = request.getParameter("user_address");  // hidden 필드 값

        // 서버 콘솔 출력
        System.out.println("아이디 : " + id);
        System.out.println("비밀번호 : " + pw);
        System.out.println("주소 : " + address);

        // 클라이언트 응답
        out.println("<html><body>");
        out.println("<h2>로그인 정보</h2>");
        out.println("<p>아이디: " + id + "</p>");
        out.println("<p>비밀번호: " + pw + "</p>");
        out.println("<p>주소: " + address + "</p>");
        out.println("</body></html>");

        out.close();
    }
}
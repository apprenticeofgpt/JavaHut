package sec01.ex01; // 현재 클래스가 포함된 패키지

import jakarta.servlet.ServletException; // 서블릿 관련 예외 클래스
import jakarta.servlet.annotation.WebServlet; // 어노테이션 기반 URL 매핑
import jakarta.servlet.http.HttpServlet; // 서블릿의 기본 상위 클래스
import jakarta.servlet.http.HttpServletRequest; // 클라이언트 요청 정보 담은 객체
import jakarta.servlet.http.HttpServletResponse; // 응답을 클라이언트로 보내는 객체
import java.io.IOException; // 입출력 예외 처리


@WebServlet("/first")  // first로 매핑
public class FirstServlet extends HttpServlet {

	// 서블릿이 최초 요청될 때 한 번만 실행되는 초기화 메서드
    @Override
    public void init() throws ServletException {
        System.out.println("init 메서드 호출");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("doGet 메서드 호출");
    }

    @Override
    public void destroy() {
        System.out.println("destroy 메서드 호출");
    }
}

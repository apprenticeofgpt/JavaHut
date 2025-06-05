package sec02.ex01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calc")
public class CalcServlet extends HttpServlet {

    private static final float USD_RATE = 1320.0f;
    private static final float JPY_RATE = 9.0f;
    private static final float CNY_RATE = 180.0f;
    private static final float GBP_RATE = 1500.0f;
    private static final float EUR_RATE = 1400.0f;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8");

        PrintWriter pw = response.getWriter();

        String command = request.getParameter("command");
        String won = request.getParameter("won");
        String operator = request.getParameter("operator");

        if (command != null && command.equals("calculate")) {
            float wonValue = Float.parseFloat(won);
            String result = calculate(wonValue, operator);

            pw.println("<html><head><title>결과</title></head><body>");
            pw.println("<h1>변환 결과</h1>");
            pw.printf("<p>%s</p>%n", result);
            pw.println("<a href='calc'>환율 계산기로 돌아가기</a>");
            pw.println("</body></html>");
            return;
        }

        // 최초 접근 시 계산 폼 출력
        pw.println("<html><head><title>환율 계산기</title></head><body>");
        pw.println("<h2>환율 계산기</h2>");
        pw.println("<form name='frmCalc' method='get' action='calc'>");  // ✅ 상대 경로 사용
        pw.println("원화: <input type='text' name='won' size='10' /><br>");
        pw.println("<select name='operator'>");
        pw.println("<option value='dollar'>달러</option>");
        pw.println("<option value='en'>엔화</option>");
        pw.println("<option value='wian'>위안</option>");
        pw.println("<option value='pound'>파운드</option>");
        pw.println("<option value='euro'>유로</option>");
        pw.println("</select><br>");
        pw.println("<input type='hidden' name='command' value='calculate' />");
        pw.println("<input type='submit' value='변환' />");
        pw.println("</form>");
        pw.println("</body></html>");
        pw.close();
    }

    private static String calculate(float won, String operator) {
        String result = null;

        switch (operator) {
            case "dollar":
                result = String.format("%.6f", won / USD_RATE);
                break;
            case "en":
                result = String.format("%.6f", won / JPY_RATE);
                break;
            case "wian":
                result = String.format("%.6f", won / CNY_RATE);
                break;
            case "pound":
                result = String.format("%.6f", won / GBP_RATE);
                break;
            case "euro":
                result = String.format("%.6f", won / EUR_RATE);
                break;
        }

        return result;
    }
}

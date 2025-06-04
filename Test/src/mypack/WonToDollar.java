package mypack;
import java.util.Scanner;

public class WonToDollar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("원화를 입력하세요(단위 원)>> ");
        int won = Integer.parseInt(sc.next()); // 문자열을 정수로 변환

        double dollar =  (won * 1.2)/1000;

        System.out.printf("%d원은 %.2f$입니다\n", won, dollar);

        sc.close();
    }
}

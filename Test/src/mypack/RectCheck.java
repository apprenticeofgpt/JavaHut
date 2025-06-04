package mypack;
import java.util.Scanner;

public class RectCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("점 (x, y)의 좌표를 입력하세요 >> ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        // 사각형 범위: x: 100~200, y: 100~200
        if (x >= 100 && x <= 200 && y >= 100 && y <= 200) {
            System.out.printf("(%d, %d)는 사각형 안에 있습니다.\n", x, y);
        } else {
            System.out.printf("(%d, %d)는 사각형 안에 없습니다.\n", x, y);
        }

        sc.close();
    }
}

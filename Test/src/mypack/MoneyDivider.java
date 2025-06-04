package mypack;
import java.util.Scanner;

public class MoneyDivider {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("금액 입력: ");
        int input = sc.nextInt();

        int amount = input;

        int fiftyThousand = amount / 50000;
        amount %= 50000;

        int tenThousand = amount / 10000;
        amount %= 10000;

        int thousand = amount / 1000;
        amount %= 1000;

        int hundred = amount / 100;
        amount %= 100;

        int ten = amount / 10;
        amount %= 10;

        int one = amount;

        System.out.println("오만원권 " + fiftyThousand + "매");
        System.out.println("만원권 " + tenThousand + "매");
        System.out.println("천원권 " + thousand + "매");
        System.out.println("백원 " + hundred + "개");
        System.out.println("십원 " + ten + "개");
        System.out.println("일원 " + one + "개");

        sc.close();
    }
}

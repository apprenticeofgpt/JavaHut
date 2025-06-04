package mypack;

import java.util.Scanner;

public class JavaException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] intArray = new int[5];
		intArray[0] = 0;

		// 나눗셈 예외 처리 루프
		while (true) {
			try {
				System.out.print("나눗셈 입력: ");
				int div = sc.nextInt();
				System.out.print("나눌 숫자 입력: ");
				int divisor = sc.nextInt();

				int result = div / divisor; // 나눗셈 연산
				System.out.println("결과: " + result);
				break;

			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요.");
			} catch (java.util.InputMismatchException e) {
				System.out.println("숫자만 입력해주세요.");
				sc.nextLine(); // 버퍼 비우기
			}
			finally
			{
				System.out.println("finally");
			}
		}

		// 배열 예외 처리
		try {
			for (int i = 0; i < 5; ++i) {
				intArray[i + 1] = i + 1 + intArray[i];
				System.out.println("intArray[" + (i + 1) + "] = " + intArray[i + 1]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array out of index");
		}

		sc.close();
	}
}

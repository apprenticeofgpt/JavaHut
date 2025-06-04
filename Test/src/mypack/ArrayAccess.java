package mypack;

import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iArray[] = new int[5];

		int max = 0;
		System.out.println("양수를 5개 입력하시오");
		for (int i = 0; i < 5; ++i) {
			iArray[i] = sc.nextInt();
			if (iArray[i] > max) {
				max = iArray[i];
			}
		}
		System.out.println("가장 큰 수는: " + max + "입니다");
		sc.close();
	}

}

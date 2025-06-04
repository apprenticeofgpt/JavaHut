package mypack;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		System.out.print("입력: ");
		Scanner scanner = new Scanner(System.in);

		String name = scanner.next();
		System.out.println(name + " Hello");

		scanner.close();
	}
}

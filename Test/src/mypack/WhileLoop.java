package mypack;

import java.util.*;

public class WhileLoop {
	public static void main(String[] args) {
		int cnt = 0, sum = 0;
		char c = 'a';
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하고 마지막에 -1 입력");

		int n = sc.nextInt();
		while (n != -1) {
			sum += n;
			cnt++;
			n = sc.nextInt();
		}
		if (cnt == 0)
			System.out.println("입력된 수가 없습니다");
		else {
			System.out.println("정수의 개수는 " + cnt + "개이며");
			System.out.println("평균은 " + (double) sum / cnt + "입니다");
		}
		sc.close();
		/////////////////////
		do {
			System.out.print(c);
			c=(char)(c+1);
		}while(c<='z');
		System.out.println();
		/////////////////////
		for(int i=2;i<=9;++i)
		{
			for(int j=1;j<=9;++j)
			{
				System.out.print(i+"x"+j+"="+i*j+" ");
			}
			System.out.println();
		}
	}
}

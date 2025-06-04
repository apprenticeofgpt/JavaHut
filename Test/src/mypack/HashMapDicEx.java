package mypack;
import java.util.*;
public class HashMapDicEx {
	public static void main(String[] args) {
		HashMap<String,String> dic= new HashMap<String,String>();
		dic.put("apple", "사과");
		dic.put("number", "숫자");
		dic.put("window", "창문");
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("finding word?");
			String enq=sc.next();
			if(enq.equals("exit")) {
				System.out.println("exit.");
				break;
			}
			String kor=dic.get(enq);
			if(kor==null) System.out.println(enq +" does not exist");
			else System.out.println(kor);
		}
		sc.close();
	}
}

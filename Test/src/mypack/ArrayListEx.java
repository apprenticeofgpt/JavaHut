package mypack;
import java.util.*;
public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;++i) {
			System.out.print("input name>>");
			String s=sc.next();
			al.add(s);
		}
		for(int i=0;i<al.size();++i) {
			String name=al.get(i);
			System.out.println(name+" ");
		}
		int longestindex=0;
		for(int i=1;i<al.size();++i) {
			if(al.get(longestindex).length() < al.get(i).length())
				longestindex=i;
					
		}
		System.out.println("\n The longest name is :"+al.get(longestindex));
		sc.close();
	}
}

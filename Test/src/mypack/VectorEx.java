package mypack;

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		int sum=0;
		for(int i=0;i<10;++i) {
			v.add(i);
		}

		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println(v);

		for (int i = 0; i < v.size(); ++i) {
			int n = v.get(i);
			System.out.print(n+" ");
		}
		System.out.println();
		for(int i=0;i<v.size();++i) {
			int n=v.elementAt(i);
			sum+=n;
		}
		System.out.println(sum);

	}
}

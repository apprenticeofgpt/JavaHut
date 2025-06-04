package mypack;
abstract class Calc{
	public abstract int add(int a,int b);
	public abstract int subtract(int a,int b);
	public abstract double average(int []a);
}
public class GoodCalc extends Calc{
	@Override
	public  int add(int a,int b) {
		return a+b;
	}
	@Override
	public  int subtract(int a,int b) {
		return a-b;
	}
	@Override
	public  double average(int[] a) {
		double sum=0;
		for(int i=0;i<a.length;++i) {
			sum+=a[i];
		}
		return sum/a.length;
	}
	public static void main(String[] args) {
		GoodCalc gc=new GoodCalc();
		System.out.println(gc.add(2, 3));
		System.out.println(gc.subtract(5, 2));
		System.out.println(gc.average(new int[] {2,3,4}));
	}

}

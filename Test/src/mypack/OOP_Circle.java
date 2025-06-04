package mypack;
import java.util.*;
public class OOP_Circle {
	int radius;
	String name;
	int width;

	public OOP_Circle() {
		radius=3;
		name="";
	}
	public OOP_Circle(int r,String n)
	{
		radius=r;
		name=n;
	}

	public double get_area() {
		return radius * radius * 3.14;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		OOP_Circle pizza=new OOP_Circle();
		pizza.radius=10;
		pizza.name="페퍼로니";
		double area=pizza.get_area();
		System.out.println(pizza.name+" area: "+area);
		
		OOP_Circle donut=new OOP_Circle();
		System.out.print("input>> ");
		donut.width=sc.nextInt();
		donut.radius=sc.nextInt();
		
		System.out.println("donuts area: "+donut.get_area());
		sc.close();
		
		OOP_Circle rect=new OOP_Circle(10,"rect");
		System.out.println("rect: "+rect.radius+" "+rect.name+" "+rect.get_area());
		
	}
}

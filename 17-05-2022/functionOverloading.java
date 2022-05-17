import java.util.*;
class Area{
	int l,b,h;
	void area(int l)
	{
		System.out.println("Area of Square is : "+(l*l));
	}
	void area(int l, int b)
	{
		System.out.println("Area of Rectangle is : "+(l*b));
	}
	void area(float b, float h)
	{
		System.out.println("Area of Triangle is : "+(b*h)/2);
	}
	void area(float r)
	{
		System.out.println("Area of Circle is : "+(3.14*r*r));
	}
}
public class functionOverloading{
	public static void main(String[] args){
		int l;
		float h, r, b;
		Area ar = new Area();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length : ");
		l = sc.nextInt();
		System.out.println("Enter the breadth : ");
		b = sc.nextInt();
		System.out.println("Enter the height : ");
		h = sc.nextInt();
		System.out.println("Enter the radius : ");
		r = sc.nextInt();
		ar.area(l);
		ar.area(l, b);
		ar.area(b, h);
		ar.area(r);
	}
}

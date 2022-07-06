import java.util.Scanner;
interface calc{
	final double pi = 3.14;
	void area();
	void perimeter();
}

class Circle implements calc{
	int r;
	Circle(int r){
		this.r = r;
	}
	
	public void area(){
		System.out.println("Area of Circle is : "+(pi*this.r*this.r));
	}
	public void perimeter(){
		System.out.println("Perimeter of Circle is : "+(2*pi*this.r));
	}
}
class Rectangle implements calc{
	int l, b;
	Rectangle(int l, int b){
		this.l = l;
		this.b = b;
	}
	public void area(){
		System.out.println("Area of Circle is : "+(this.l*this.b));
	}
	public void perimeter(){
		System.out.println("Perimeter of Circle is : "+(2*(this.l+this.b)));
	}
}

public class InterfaceAreaPerimeter{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int rad, l, b, i, ch;
		do{
			System.out.print("1) Circle\n2) Rectangle\n3) Exit\nEnter Your Choice : ");
			ch = sc.nextInt();
			switch(ch){
				case 1:
					System.out.print("Enter the radius : ");
					rad = sc.nextInt();
					calc c = new Circle(rad);
					c.area();
					c.perimeter();
				break;
				
				case 2:
					System.out.print("Enter the Length : ");
					l = sc.nextInt();
					System.out.print("Enter the Breadth : ");
					b = sc.nextInt();
					calc r = new Rectangle(l, b);
					r.area();
					r.perimeter();
				break;
				case 3:
				System.exit(0);
				default:
					System.out.print("Invalid Choice!");
			}
		}while(ch!=3);
	}
}


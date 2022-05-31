import java.util.*;
import GraphicPackage.*;
public class PackageProgram{
	public static void main(String[] args){
		int ch;
		double l, b, a, r, h;
		Scanner sc = new Scanner(System.in);
		
		/*Area rect = new Rectangle();
		Area cir = new Circle();
		Area tri = new Triangle();
		Area sq = new Square();*/
		do{
			System.out.print("1. Rectangle\n2. Circle\n3. Triangle\n4. Square\n5. Exit\nEnter Your Choice : ");
			ch = sc.nextInt();
			switch(ch){
			
				case 1:
					System.out.print("Enter the Length : ");
					l = sc.nextDouble();
					System.out.print("Enter the Breadth : ");
					b = sc.nextDouble();
					Rectangle rect = new Rectangle(l, b);
					rect.Area();
				break;
				
				case 2:
					System.out.print("Enter the Radius : ");
					r = sc.nextDouble();
					Circle cir = new Circle(r);
					cir.Area();
				break;
				
				case 3:
					System.out.print("Enter the Base : ");
					b = sc.nextDouble();
					System.out.print("Enter the Height : ");
					h = sc.nextDouble();
					Triangle tri = new Triangle(b,h);
					tri.Area();
				break;
				
				case 4:
					System.out.print("Enter the Side : ");
					a = sc.nextDouble();
					Square sq = new Square(a);
					sq.Area();
				break;
				
				case 5:
					System.exit(0);
				
				default:
					System.out.println("Invalid Choice!");
			}
		}while(ch != 5);
	}
}

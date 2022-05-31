package GraphicPackage;
interface Area{
	void Area();
}
public class Rectangle implements Area{
	double l, b;
	public Rectangle(double l, double b){
		this.l = l;
		this.b = b;
	}
	public void Area(){
		System.out.println("Area of the Rectangle is : "+(l*b));
	}
}

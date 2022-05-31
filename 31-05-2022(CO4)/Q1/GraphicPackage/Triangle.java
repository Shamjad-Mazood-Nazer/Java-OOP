package GraphicPackage;
interface Area{
	void Area();
}
public class Triangle implements Area{
	double b, h;
	public Triangle(double b, double h){
		this.h = h;
		this.b = b;
	}
	public void Area(){
		System.out.println("Area of the Triangle is : "+(.5*b*h));
	}
}

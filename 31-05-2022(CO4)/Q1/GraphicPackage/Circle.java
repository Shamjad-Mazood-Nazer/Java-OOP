package GraphicPackage;
interface Area{
	void Area();
}
public class Circle implements Area{
	double pi = 3.14, r;
	public Circle(double r){
		this.r = r;
	}
	public void Area(){
		System.out.println("Area of the Circle is : "+(pi*r*r));
	}
}

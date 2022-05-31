package GraphicPackage;
interface Area{
	void Area();
}
public class Square implements Area{
	double a;
	public Square(double a){
		this.a = a;
	}
	public void Area(){
		System.out.println("Area of the Square is : "+(a*a));
	}
}

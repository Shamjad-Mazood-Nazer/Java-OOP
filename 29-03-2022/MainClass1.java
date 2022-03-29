class Second{
	int x = 5;
	void printDemo(){
		System.out.println("Hello from Second Class");
	}
}
class S2MCA{
	int rollno, marks;
	String unireg, name;
}
public class MainClass1{
	int var = 20;
	public static void main(String args[]){
		MainClass obj = new MainClass();
		Second objsec = new Second();
		Second objsec2 = new Second();
		S2MCA std = new S2MCA();
		System.out.println(obj.var);
		System.out.println(objsec.x);
		
		objsec.printDemo();
		System.out.println(objsec2.x);
		objsec2.printDemo();
		
		std.rollno = 36;
		System.out.println("\nS2MCA Class\nRollNo : "+std.rollno);
		std.name = "Shamjad";
		System.out.println("Name : "+std.name);
		std.marks = 40;
		System.out.println("Marks : "+std.marks);
		std.unireg = "AJC20MCA";
		System.out.println("UniReg : "+std.unireg);
	}
}

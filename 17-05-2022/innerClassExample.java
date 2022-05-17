class outerClass{
	int x = 10;
	class innerClass{
		int y = 5;
	}
}
public class innerClassExample{
	public static void main(String[] args){
		outerClass outer_obj = new outerClass();
		outerClass.innerClass inner_obj = outer_obj.new innerClass();
		System.out.println("OUTER CLASS - x : "+outer_obj.x);
		System.out.println("INNER CLASS - y : "+inner_obj.y);
	}
}


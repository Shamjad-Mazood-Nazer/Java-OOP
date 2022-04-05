class Product{
	String pcode, pname;
	double price;
	void details(){
		System.out.println("PRODUCT DETAILS");
		System.out.println("PCode : "+pcode);
		System.out.println("PName : "+pname);
		System.out.println("Price : "+price);
	}
}
public class ProductDetails{
	public static void main(String args[]){
		Product p1 = new Product();
		p1.pcode = "M200J9PI";
		p1.pname = "POCO M2";
		p1.price = 10999;
		System.out.println("\nProduct 1:-");
		p1.details();
		
		Product p2 = new Product();
		p2.pcode = "XMSH05HM";
		p2.pname = "Mi Band 3";
		p2.price = 1799;
		System.out.println("\nProduct 2:-");
		p2.details();
				
		Product p3 = new Product();
		p3.pcode = "EPSP5248";
		p3.pname = "Camlin Scale";
		p3.price = 5;
		System.out.println("\nProduct 3:-");
		p3.details();
				
		if(p1.price<p2.price && p1.price<p3.price){
			System.out.println("\n\nProduct with lowest price is :");
			p1.details();
		}
		else if(p2.price < p3.price){
			System.out.println("\n\nProduct with lowest price is :");
			p2.details();
		}
		else{
			System.out.println("\n\nProduct with lowest price is :");
			p3.details();
		}
	}
}

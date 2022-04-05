import java.util.Scanner;
public class IPScanner{
	public static void main(String args[]){
		String name;
		System.out.println("Enter your Name : ");
		Scanner S = new Scanner(System.in);
		name = S.nextLine();
		System.out.println("Name is : "+name);
	}
}

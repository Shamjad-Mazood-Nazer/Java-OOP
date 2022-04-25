import java.util.*;
public class ArrSort{
	public static void main(String args[]){
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the Array : ");
		size = sc.nextInt();
		String[] Names = new String[size];
		System.out.println("Enter the Elements of the Array : ");
		for(int i=0; i<size; i++){
			Names[i] = sc.nextLine();
		}
		Arrays.sort(Names);
		for(int i=0; i<size; i++){
			System.out.print(Names[i]);
		}

	}
}

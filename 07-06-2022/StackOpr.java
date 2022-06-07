import java.util.*;
import java.io.*;

public class StackOpr
{
	public static void main(String args[])
	{
		int i, n, e;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Limit : ");
		n = sc.nextInt();
		Stack<Integer> s = new Stack<>();
		boolean result = s.empty();
		System.out.println("Is the Stack Empty? : "+result);
		System.out.print("Enter "+n+" elements : ");
		for(i=0; i<n; i++)
		{
			e = sc.nextInt();
			s.push(e);
		}
		System.out.print("Elements in the Stack : ");
		System.out.print(s+" ");
		System.out.println("\nPOP last element : "+s.pop());
		result = s.empty();
		System.out.print("Now the Elements in the Stack : ");
		System.out.print(s+" ");
		System.out.println("\nIs the Stack Empty? : "+result);
	}
}

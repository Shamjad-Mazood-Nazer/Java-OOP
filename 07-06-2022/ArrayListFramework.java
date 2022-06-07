import java.util.*;
class ArrayListFramework
{
	public static void main(String args[])
	{
		String name, del, check;
		char clean;
		int i, n;
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arrList = new ArrayList<String>();
		System.out.print("Enter the limit : ");
		n = sc.nextInt();
		System.out.println("Enter the names :");
		for(i=0; i<n; i++)
		{
			name = sc.next();
			arrList.add(name);
		}
		System.out.println("\nElements on the Array List are :");
			System.out.println(arrList);

		Collections.sort(arrList);
		System.out.println("\nSort using Collection Package is :");
			System.out.println(arrList);
		System.out.print("\nEnter the name you wish to remove : ");
		del = sc.next();
			arrList.remove(del);
		System.out.println("Updated Array List by removing of "+del+" is : "+arrList);
		System.out.print("\nEnter a name you wish to search : ");
			check = sc.next();
		
		if(arrList.contains(check))
		{
			System.out.println(check+" is present in the Array List.");
		}
		else
		{
			System.out.println(check+" is not present in the Array List.");
		}
		
		System.out.print("\nClear the arrayList ? [y/N] : ");
		clean = sc.next().charAt(0);
		if(clean == 'y')
		{
			System.out.println("Clearing the Array List!...");
				arrList.clear();
			System.out.print("Now Array List is : "+arrList);
			System.out.println();
		}
	}
}

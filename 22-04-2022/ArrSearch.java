import java.util.*;
class ArrSearch{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int size, item, flag = 0, pos = 0;
		System.out.print("Enter the size for the array : ");
		size= sc.nextInt();
		int[] arr= new int[size];
		System.out.println("\nEnter the elements for the array : ");
		for(int i=0;i<size;i++)
			arr[i]= sc.nextInt();
		System.out.print("Enter the item to search : ");
		item= sc.nextInt();
		for(int i=0; i<size; i++){
			if(arr[i] == item)
				flag = 1;
				pos = i;
		}
		if(flag == 1)
			System.out.println(item+" found in the Array!");
		else
			System.out.println(item+" not found in the Array!");
		sc.close();
	}
}

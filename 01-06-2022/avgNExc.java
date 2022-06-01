import java.io.*;
import java.util.Scanner;
class negativeInput extends Exception{
	public negativeInput(String msg){
		super(msg);
	}
}

public class avgNExc{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n, i, temp, sum=0;
		double avg=0;
		System.out.print("Enter the limit : ");
		n = sc.nextInt();
		int[] a = new int[n];
//		int[] temp = new int[n];
		System.out.println("Enter the elements : ");
		for(i=0; i<n; i++){
			temp = sc.nextInt();
			 
			try{
				if(temp < 0){
					i--;
					throw new negativeInput("Negative number cannot be calculated!");
				}
				else{
					a[i] = temp;
				}
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		
		System.out.print("Array is : ");
		for(i=0; i<n; i++){
			System.out.print(a[i]+" ");
			sum += a[i];
		}
		avg = sum/n;
		System.out.println();
		System.out.println("Average of positive numbers is : "+avg);
	}
}

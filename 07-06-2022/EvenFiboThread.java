import java.io.*;
import java.util.Scanner;

class Fibo implements Runnable{
	int a=0, b=1, c=0, n;	
	Fibo(int n){
		this.n = n;
	}
	public void run(){
		System.out.print(a+" "+b+" ");
		for(int i=0; i<n; i++){
			c = a+b;
			a = b;
			b = c;			
			System.out.print(c+" ");
		}
	}
}
class Even implements Runnable{
	int n, i;
	Even(int n){
		this.n = n;
	}
	public void run(){
		System.out.print("\nEven Number of range "+n+" : ");
		for(i=1; i<=n; i++){
			if(i%2 == 0){
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
}

class EvenFiboThread{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i, n;
		System.out.print("Enter the Limit for Fibonacci and Even number : ");
		n = sc.nextInt();
		System.out.print("Fibonacci Series upto "+n+" is : ");
		Fibo f = new Fibo(n);
		//f.start();
		Thread t = new Thread(f);
		t.start();
		Even e = new Even(n);
		//e.start();
		Thread t1 = new Thread(e);
		t1.start();
	}
}

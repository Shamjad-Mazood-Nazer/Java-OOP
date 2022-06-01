import java.io.*;
import java.util.Scanner;

class Fibo implements Runnable{
	int a=0, b=1, c=0, n;	
	Fibo(int n){
		this.n = n;
	}
	public void run(){
		System.out.print(a+" "+b+" ");
//		System.out.println(b);
		for(int i=0; i<n; i++){
			a = b;
			b = c;
			c = a+b;
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
		System.out.print("Even Number of range "+n+" : ");
		for(i=n; i>0; i--){
			if(i%2 == 0){
				System.out.print(i+" ");
			}
		}
	}
}

class EvenFiboThread{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i, n;
		System.out.println("Enter the Limit for Fibonacci and Even number : ");
		n = sc.nextInt();
		/*Fibo f = new Fibo(n);
		f.start();
		Even e = new Even(n);
		e.start();*/
		Thread t = new Thread(t);
	}
}

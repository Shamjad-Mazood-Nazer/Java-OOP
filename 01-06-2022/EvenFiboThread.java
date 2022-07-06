/*import java.io.*;
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
}*/


import java.util.Scanner;
class Fibonacci extends Thread{
	int size;
	Fibonacci(int size){
		this.size=size;
	}
	public void run(){
		int num1=0, num2=1;
		System.out.println("Fibonacci series : 0, 1, ");
		for(int i=2;i<size;i++){
			int temp=num1;
			num1= num2;
			num2= temp+num1;
			System.out.println("Fibonacci series : "+num2+", ");
		}
	}
}
class EvenNumber extends Thread{
	int range;
	EvenNumber(int range){
	this.range= range;
	}
	public void run(){
		for(int i=0;i<range;i++){
			if(i%2==0){
				System.out.println("Even number are  : "+i);
			}
		}
	}
}
public class EvenFiboThread{
	public static void main(String[] args) {
		int size, range;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the limit of fibonacci series : ");
		size= sc.nextInt();
		System.out.println("Enter the range of even numbers : ");
		range= sc.nextInt();
		Fibonacci fib= new Fibonacci(size);
		EvenNumber even= new EvenNumber(range);
		fib.start();
		even.start();
		sc.close();
	}
}

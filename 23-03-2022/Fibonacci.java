public class Fibonacci{
	public static void main(String args[]){
		int c,i,num=0,a=1,b=1;
		System.out.println(a+"\n"+b);
		for(i=0;i<5;i++){
			c = a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}
}

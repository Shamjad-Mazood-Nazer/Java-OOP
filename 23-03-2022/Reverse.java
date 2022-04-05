public class Reverse{
	public static void main(String args[]){
		int num = 4321, rev = 0;
		System.out.println("Num is : "+num);
		for(int i=1;i<=4;i++){
			int rem = num%10;			
			rev = (rev*10)+rem;
			num = num/10;
		}
		System.out.println("Reverse of the Number is : "+rev);
	}
}

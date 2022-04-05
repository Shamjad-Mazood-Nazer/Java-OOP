public class Palindrome{
	public static void main(String args[]){
		int rem,i,num=121,rev=0;
		System.out.println("DIGIT is : "+num);
		int temp=num;
		for(i=0;i<=2;i++){
			rem = num%10;
			rev = (rev*10)+rem;
			num = num/10;
		}
		if(temp == rev){
			System.out.println("Palindrome is : "+rev);
		}
		else{
			System.out.println(num+" is not a Palindrome");
		}
	}
}

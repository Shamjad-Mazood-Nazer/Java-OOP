public class SumOfDigit{
	public static void main(String args[]){
		int num=456,i,sum=0;
		System.out.println("DIGIT is : "+num);
		for(i=1;i<4;i++){
			int rem = num%10;			
			sum = sum+rem;
			num = num/10;
		}
		System.out.println("SUM is : "+sum);
	}
}

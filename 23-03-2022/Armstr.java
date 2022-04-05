public class Armstr{
	public static void main(String args[]){
		int temp,num=153,arm=0,i;
		temp=num;
		System.out.println("Num is : "+num);
		for(i=1;i<4;i++){
			int rem = num%10;			
			
			num = num/10;
			arm = rem*rem*rem;
		}
		if(arm == temp){
			System.out.println(num+" is Armstrong");
		}
		else{
			System.out.println(num+" is not Armstrong");
		}
	}
}

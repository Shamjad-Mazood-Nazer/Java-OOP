class ArrLarge{
	public static void main(String[] args){
		int[] a = {10,12,2,1,5};
		int large = a[0];
		for(int i=0; i<a.length; i++){
			if(large<a[i]){
				large = a[i];
			}	
		}
		System.out.println("Largest Number is : "+large);
	}
}

class ArrEvenOdd{
	public static void main(String[] args){
		int[] a={1,2,3,4,5,6};
		int[] Even;
		for(int i=0; i<a.length; i++){
			if(a[i]%2 == 0){
				System.out.println(a[i]+" : Even Number");
			}
			else{
				System.out.println(a[i]+" : Odd Number");
			}
		}
	}
}

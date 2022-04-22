class ArrAsc{
	public static void main(String args[]){
		int[] a = {3,2,5,1,4};
		int  temp;
		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i] > a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);
		}
	}
}

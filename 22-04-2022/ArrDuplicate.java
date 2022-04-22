class ArrDuplicate{
	public static void main(String[] args){
		int[] a = {1, 2, 3, 4, 2, 1};
		for(int i=0; i<a.length; i++){
			int temp = a[i];
			for(int j=i+1; j<a.length; j++){
				if(temp == a[j]){
					System.out.println(temp);
				}
			}
		}
	}
}

class ArrDuplicate{
	int[] a = {1, 2, 3, 4, 2, 1};
	for(int i=0; i<a.length; i++){
		int temp = a[0];
		for(int j=i+1; j<a.length; i++){
			if(temp == a[i]){
				System.out.println(temp);
			}
		}
	}
}

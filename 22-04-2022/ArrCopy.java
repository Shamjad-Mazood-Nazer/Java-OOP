class ArrCopy{
	public static void main(String args[]){
		int[] a = {3,2,5,1,4};
		int[] b = new int[5];
		System.out.print("Array A : {");
		for(int i=0; i<a.length; i++){			
			System.out.print(a[i]+", ");
		}
		System.out.println("}");
		System.out.print("\nArray B : {");
		for(int i=0; i<a.length; i++){
			b[i] = a[i];
			System.out.print(b[i]+", ");
		}
		System.out.println("}");
	}
}

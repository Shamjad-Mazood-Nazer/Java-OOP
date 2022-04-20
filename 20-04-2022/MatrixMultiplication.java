import java.util.Scanner;
public class MatrixMultiplication{
	public void Display(int[][] matrix, int row, int col){
		System.out.println("MATRIX IS :\n");
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				System.out.println(matrix[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
	public void Mul(int[][] a, int[][] b, int row_1, int col_1, int row_2, int col_2){
		System.out.println("Matrix Multiplication :\n");
		int[][] multi = new int[row_1][col_2];
		
		for(int i=0; i<row_1; i++){
			for(int j=0; j<*******; j++){
				mutli[i][j] = 0;
				for(int k=0; k<row; k++){
					multi[i][j]=a[i][k]*b[k][j];
				}
			}
		}
		
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the rows Matrix1 : ");
		int row_1 = sc.nextInt();
		System.out.print("Enter the cols Matrix1 : ");
		int col_1 = sc.nextInt();
		System.out.print("Enter the rows Matrix2 : ");
		int row_2 = sc.nextInt();
		System.out.print("Enter the cols Matrix2 : ");
		int col_2 = sc.nextInt();
		int[][] matrix = new int[row][col];
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				System.out.println("Enter the "+(i,j)+" : ");
				matrix[i][j] = sc.nextInt();
			}
		}

import java.util.Scanner;
import java.io.*;
public class UnamePwdException{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String uname, pwd;
		int i;
		System.out.print("Enter the user name : ");
		uname = sc.next();
		System.out.print("Enter the password : ");
		pwd = sc.next();
		System.out.println("Your user name is : "+uname);
		System.out.print("Your password is : ");
		for(i=0; i<pwd.length(); i++){
			System.out.print("*");
		}		
		System.out.println();
		try{
			if(uname == null){
				throw new 
	}
}

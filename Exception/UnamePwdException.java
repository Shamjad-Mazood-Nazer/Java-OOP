import java.util.Scanner;
import java.io.*;

class IncompleteException extends Exception{
	public IncompleteException(String error){
		super(error);
	}
}

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
			if(uname == null && uname == " "){
				throw new IncompleteException("USERNAME is Incomplete or NULL!");
			}
			else if(pwd == null && pwd == " "){
				throw new IncompleteException("PASSWORD is missing or NULL!");
			}
			else if(pwd.length() <= 6){
				throw new IncompleteException("PASSWORD character must be greater than 6 characters!");
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}

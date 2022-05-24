import java.util.Scanner;
class Publisher{
	int pid;
	String pname;
	Publisher(int pid, String pname){
		this.pid = pid;
		this.pname = pname;
	}
}

class Book extends Publisher{
	int bid;
	String bname;
	Book(int pid, String pname, int bid, String bname){
		super(pid, pname);
		this.bid = bid;
		this.bname = bname;
	}
}

class Literature extends Book{
	int lid;
	String lname;
	Literature(int pid, String pname, int bid, String bname, int lid, int lname){
		super(pid, pname, bid, bname);
		this.lid = lid;
		this.lname = lname;
	}
}

class Fiction extends Book{
	int fid;
	String fname;
	Fiction(int pid, String pname, int bid, String bname, int fid, int fname){
		super(pid, pname, bid, bname);
		this.fid = fid;
		this.fname = fname;
	}
}

public class BookDetails{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n, i;
		int pid, bid, lid, fid;
		String pname, bname, lname, fname;
		System.out.println("Enter the limit : ");
		n = sc.nextInt();
		for(i=0; i<n; i++){
			System.out.println("Enter the Publisher ID : ");
			pid = sc.nextInt();
			System.out.println("Enter the Publisher Name : ");
			pname = sc.next();
			System.out.println("Enter the Book ID : ");
			bid = sc.nextInt();
			System.out.println("Enter the Book Name : ");
			bname = sc.next();
			System.out.println("Enter the Literature ID : ");
			lid = sc.nextInt();
			System.out.println("Enter the Literature Name : ");
			lname = sc.next();
			System.out.println("Enter the Fiction ID : ");
			fid = sc.nextInt();
			System.out.println("Enter the Fiction Name : ");
			fname = sc.next();
			
		}
	}
}

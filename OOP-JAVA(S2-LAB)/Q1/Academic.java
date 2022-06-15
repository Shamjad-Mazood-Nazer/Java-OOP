import java.util.*;
class Student{
	int sid, mark1, mark2;
	String name, dept;
	Student(int sid, String name, String dept, int mark1, int mark2){
		this.sid = sid;
		this.name = name;
		this.dept = dept;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}
}
class Sports extends Student{
	int rank;
	String item;
	Sports(int sid, String name, String dept, int mark1, int mark2, int rank, String item){
		super(sid, name, dept, mark1, mark2);
		this.rank = rank;
		this.item = item;
	}
}

class Result extends Sports{
	int total;
	Result(int sid, String name, String dept, int mark1, int mark2, int rank, String item){
		super(sid, name, dept, mark1, mark2, rank, item);
		total = mark1+mark2;
	}
	void display(){
		System.out.println("Student ID \t\t: "+sid);
		System.out.println("Student Name \t\t: "+name);
		System.out.println("Student Department \t: "+dept);
		System.out.println("Student Mark1 \t\t: "+mark1);
		System.out.println("Student Mark2 \t\t: "+mark2);
		System.out.println("Sports rank \t\t: "+rank);
		System.out.println("Sport Item \t\t: "+item);
		System.out.println("Student Total Mark \t: "+total);
	}
}

public class Academic{
	public static void main(String args[]){
		int n, i, sid, mark1, mark2, rank;
		String name, dept, item;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Limit : ");
		n = sc.nextInt();
		Result[] arr = new Result[n];
		for(i=0;i<n;i++){
			System.out.println("Enter the Details of Student["+i+1+"]\n------------------------------------------\n");
			System.out.print("Enter Student ID \t\t: ");
			sid = sc.nextInt();
			System.out.print("Enter Student Name \t\t: ");
			name = sc.next();
			System.out.print("Enter Student Department \t: ");
			dept = sc.next();
			System.out.print("Enter Student Mark1 \t\t: ");
			mark1 = sc.nextInt();
			System.out.print("Enter Student Mark2 \t\t: ");
			mark2 = sc.nextInt();
			System.out.print("Enter Sport rank \t\t: ");
			rank = sc.nextInt();
			System.out.print("Enter Sport item \t\t: ");
			item = sc.next();
			arr[i] = new Result(sid, name, dept, mark1, mark2, rank, item);
		}
		for(i=0; i<n; i++){
			System.out.println("\nDetails of the Student["+(i+1)+"] is : \n");
			arr[i].display();
		}
		sc.close();
	}
}
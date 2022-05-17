import java.util.*;
class Employee
{
	int empid;
	double salary;
	String name, address;
	Employee(int emp_id, String emp_name, String emp_address, double emp_salary){
		empid = emp_id;
		name = emp_name;
		address = emp_address;
		salary = emp_salary;
	}
}
class Teacher extends Employee
{
	String department, subject;
	Teacher(int empid, String name, String address,  String dept, String sub, double salary)
	{
		super(empid, name, address, salary);
		department = dept;
		subject = sub;
	}
	void display()
	{
		System.out.println("EMP ID : "+empid);
		System.out.println("EMP NAME : "+name);
		System.out.println("EMP ADDRESS : "+address);
		System.out.println("EMP DEPARTMENT : "+department);
		System.out.println("SUBJECT TAUGHT : "+subject);
		System.out.println("EMP SALARY : "+salary);
	}
}

public class employeeTeacher{
	public static void main(String args[]){
		int n, empid;
		String name, address, department, subject;
		double salary;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit : ");
		n = sc.nextInt();
		Teacher[] arr = new Teacher[n];
		for(int i=0; i<n; i++){
			System.out.print("Enter the Employee ID : ");
			empid = sc.nextInt();
			System.out.print("Enter the Employee Name : ");
			name = sc.nextLine();
			System.out.print("Enter the Employee Address : ");
			address = sc.nextLine();
			System.out.print("Enter the Employee Department : ");
			department = sc.nextLine();
			System.out.print("Enter the Employee Subject : ");
			subject = sc.nextLine();
			System.out.print("Enter the Employee Salary : ");
			salary = sc.nextDouble();
		}
		for(int i=0; i<n; i++){
			arr[i] = new Teacher(empid, name, address, department, subject, salary);
			arr[i].display();
		}
	}
}

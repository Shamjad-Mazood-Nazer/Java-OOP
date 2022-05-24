import java.util.*;

class Person{
	String Name, Gender, Address;
	int Age;
	Person(String name, String gender, String address, int age){
		Name = name;
		Gender = gender;
		Address = address;
		Age = age;
	}
}

class Employee extends Person{
	int empid, salary;
	String company_name, qualification;
	Employee(String Name, String Gender, String Address, int Age, int EmpId, String CompanyName, String Qualify, int Salary){
		super(Name, Gender, Address, Age);
		empid = EmpId;
		company_name = CompanyName;
		qualification = Qualify;
		salary = Salary;
	}
}

class Teacher extends Employee{
	int tid;
	String dept, sub;
	Teacher(String Name, String Gender, String Address, int Age, int empid, String company_name, String qualification, int salary, int teacherid, String department, String subject){
		super(Name, Gender, Address, Age, empid, company_name, qualification, salary);
		tid = teacherid;
		dept = department;
		sub = subject;
	}
	
	void Display(int i){
		System.out.println("DETAILS ("+(i+1)+"):-\n--------------\n");
		System.out.println("EMP-ID : "+empid);
		System.out.println("TEACHER-ID : "+tid);
		System.out.println("NAME : "+Name);
		System.out.println("ADDRESS : "+Address);
		System.out.println("GENDER : "+Gender);
		System.out.println("AGE : "+Age);
		System.out.println("COMANY NAME : "+company_name);
		System.out.println("QUALIFICATION : "+qualification);
		System.out.println("DEPARTMENT : "+dept);
		System.out.println("SUBJECT : "+sub);
		System.out.println("SALARY : "+salary);
	}
}

public class PersonEmployee{
	public static void main(String args[]){
		int n, empid, age, teacherid, salary;
		String name, address, gender, companyname, qualify, dept, sub;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Limit : ");
		n = sc.nextInt();
		Teacher[] arr = new Teacher[n];
		for(int i=0; i<n; i++){
			System.out.println("Enter the ["+(i+1)+"] Employee ID : ");
			empid = sc.nextInt();
			
			System.out.println("Enter the Teacher ID : ");
			teacherid = sc.nextInt();
			
			System.out.println("Enter the Name : ");
			name = sc.next();
			
			System.out.println("Enter the Address : ");
			address = sc.next();
						
			System.out.println("Enter the Gender : ");
			gender = sc.next();
			
			System.out.println("Enter the Age : ");
			age = sc.nextInt();
						
			System.out.println("Enter the Company Name : ");
			companyname = sc.next();
			
			System.out.println("Enter the Qualification : ");
			qualify = sc.next();
			
			System.out.println("Enter the Deaprtment : ");
			dept = sc.next();
			
			System.out.println("Enter the Subject : ");
			sub = sc.next();
			
			System.out.println("Enter the Salary : ");
			salary = sc.nextInt();
			
			arr[i] = new Teacher(name, gender, address, age, empid, companyname, qualify, salary, teacherid, dept, sub);
		}
		for(int i=0; i<n; i++){
			arr[i].Display(i);
		}
	}
}

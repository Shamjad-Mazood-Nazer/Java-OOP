class Student{
	string std_name;
	int m1,m2,m3,std_id;
	void details(){
		System.out.println("Student Details : ");
		System.out.println("STD_ID : "+std_id);
		System.out.println("NAME : "+std_name);
		System.out.println("\nMarks of 3 Subjects\nJAVA : "+m1);
		System.out.println("DBMS : "+m2);
		System.out.println("NSA : "+m3);
	}
}
public class StudentDetails{
	public static void main(String args[]){
		Student s1 = new Student();
		s1.std_id = 13312;
		s1.std_name = "SHAMJAD MAZOOD NAZER";
		s1.m1 = 44;
		s1.m2 = 40;
		s1.m3 = 46;
		System.out.println("")
		s1.details();
		
		

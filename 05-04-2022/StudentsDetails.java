class StudentsData{
	int std_id;
	String name;
	int m1, m2, m3;
	StudentsData(){
		std_id = 13313;
		name = "SHEFANY SHANAVAS";
		m1 = 44;
		m2 = 45;
		m3 = 43;
	}
	StudentsData(int id, String std_name, int DBMS, int NSA, int JAVA){
		std_id = id;
		m1 = DBMS;
		m2 = NSA;
		m3 = JAVA;
		name = std_name;
	}
	StudentsData(int DBMS, int NSA, int JAVA){
		std_id = 13310;
		name = "SANIO LUKE SEBASTIAN";
		m1 = DBMS;
		m2 = NSA;
		m3 = JAVA;
	}
	void display(){
		System.out.println("Student ID \t: "+std_id);
		System.out.println("Student NAME \t: "+name);
		System.out.println("A-DBMS \t\t: "+m1);
		System.out.println("NSA \t\t: "+m2);
		System.out.println("JAVA \t\t: "+m3);
		System.out.println("TOTAL MARK \t: "+(m1+m2+m3));
		System.out.println("AVERAGE MARK \t: "+(m1+m2+m3)/3);
	}
}

public class StudentsDetails{
	public static void main(String args[]){
		StudentsData S = new StudentsData();
		System.out.println("\nDefault Constructor\n");
		S.display();
		
		StudentsData obj2 = new StudentsData(13312, "SHAMJAD MAZOOD NAZER", 47, 48, 50);
		System.out.println("\nConstructor Parameter\n");
		obj2.display();
		
		StudentsData obj3 = new StudentsData(50, 50, 50);
		System.out.println("\nMixed Constructor\n");
		obj3.display();
	}
}

import java.util.*;
class Compare2HashSet{
	public static void main(String[] args)
	{
		HashSet<String> hset1 = new HashSet<>();
		hset1.add("RED");
		hset1.add("GREY");
		hset1.add("BLACK");
		hset1.add("ORANGE");
		
		HashSet<String> hset2 = new HashSet<String>();
		hset2.add("RED");
		hset2.add("BLUE");
		hset2.add("GREEN");
		hset2.add("ORANGE");
		
		HashSet<String> result = new HashSet<String>();
		for(String elements : hset1){
			System.out.print(hset2.contains(elements) ? "[YES]\n" : "[NO]\n");
		}
	}
}

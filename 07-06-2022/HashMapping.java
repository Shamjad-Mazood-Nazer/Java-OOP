import java.util.*;
class HashMapping
{
	public static void main(String args[]){
		Map<String, Integer> HM = new HashMap<String, Integer>();
		HM.put("SHAMJAD", new Integer(21));
		HM.put("JADSPRIT", new Integer(93));
		HM.put("JAD", new Integer(9));
		for(Map.Entry<String, Integer> ME : HM.entrySet()){
			System.out.print(ME.getKey()+" : ");
			System.out.println(ME.getValue());
		}
	}
}

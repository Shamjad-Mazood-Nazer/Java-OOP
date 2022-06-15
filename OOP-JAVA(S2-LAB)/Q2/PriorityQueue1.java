import java.util.*;
public class PriorityQueue1{
	public static void main(String args[]){
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("SHAMJAD");
		queue.add("JAD");
		queue.add("SANIO");
		queue.add("SHEFANY");
		queue.add("RAMU");
		queue.add("RAJU");
		queue.add("DHAMU");
		System.out.println("The elements in the queue are : ");
		Iterator itr = queue.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next()+" ");
		}
		System.out.println("\n\nRemoving an Element from Queue : "+queue.remove());
		System.out.print(queue);
	}
}
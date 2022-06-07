import java.util.*;
class PriorityQueue1{
	public static void main(String args[]){
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Shamjad");
		queue.add("Jadsprit");
		queue.add("Jad");
		System.out.println("Head : "+queue.element());
		System.out.println("Peek : "+queue.peek());
		System.out.print("Iterating through Queue Elements : ");
		Iterator itr = queue.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
		
		queue.remove();
		queue.poll();
		System.out.println("\nAfter removing 2 elements : ");
		Iterator<String> itr2 = queue.iterator();
		while(itr2.hasNext()){
			System.out.println(itr2.next()+" ");
		}
		System.out.print("\n");
	}
}	

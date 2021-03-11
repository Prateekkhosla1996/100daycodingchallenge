import java.util.PriorityQueue;

public class PriorityQueueImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.add(10);
		pq.add(30);
		pq.add(50);
		System.out.println(pq);
		System.out.println(pq.isEmpty());
		System.out.println(pq.contains(30));
		System.out.println(pq.contains(130));
		System.out.println(pq.remove(10));
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
	}

}

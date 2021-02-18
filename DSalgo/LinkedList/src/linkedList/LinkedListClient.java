package linkedList;

public class LinkedListClient {

	public static void main(String[] args) throws Exception {  
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		LinkedList l2 = new LinkedList();
		
		ll.addLast(10);
		l2.addLast(20);
		ll.addLast(30);
		l2.addLast(40);
		ll.addLast(50);
		l2.addLast(60);
		ll.addLast(70);
		l2.addLast(80);
		ll.addLast(90);
		l2.addLast(100);
		ll.addLast(110);
		ll.display();
		System.out.println();
//		ll.addAt(2, 66);
		l2.display();
		System.out.println();
		System.out.println(ll.removeFirst());
		System.out.println(ll.removeLast());
		ll.display();
		System.out.println();
		System.out.println("this is head-> "+ll.getFirst());
		System.out.println("this is tail-> "+ll.getLast());
//		System.out.println("index data-> "+ll.getAt(7));
		System.out.println(ll.getNodeAt(2));
		System.out.println(ll.mid());
		System.out.println(ll.kthFromLast(3));
//		System.out.println(ll.getFirst());
	}
//	
}

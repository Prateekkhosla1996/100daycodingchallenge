package linkedList;

public class LinkedListClient {

	public static void main(String[] args) throws Exception {  
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.addFirst(40);
		ll.addFirst(50);
		ll.addLast(60);
		ll.addLast(70);
		ll.addLast(80);
		ll.display();
		ll.addAt(2, 66);
		System.out.println();
		ll.display();
		System.out.println();
		System.out.println("this is head-> "+ll.getFirst());
		System.out.println("this is tail-> "+ll.getLast());
		System.out.println("index data-> "+ll.getAt(7));
		System.out.println(ll.getNodeAt(2));
		
	}

}

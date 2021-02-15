package linkedList;

public class LinkedList {
	private class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
		}
		public Node() {
			
		}
	}
	private Node head;
	private Node tail;
	private int size;
	public void display() {
		Node temp = this.head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
	}
	public void addFirst(int item) {
		//create new node
		Node nn = new Node();
		nn.data=item;
		nn.next=null;
		//attach
		if(size>=1) {
			nn.next=head;
		}
		//summary object update
		if(this.size==0) {
			this.head=nn;
			this.tail=nn;
			size++;
		}else {
			this.head=nn;
			size++;
		}
	}
	public void addLast(int item) {
		//create node
		Node nn = new Node();
		nn.data=item;
		nn.next=null;
		//attach
		if(size>=1) {
			tail.next=nn;
		}
		//summary object update
		if(size==0) {
			this.head=nn;
			this.tail=nn;
			this.size++;
		}else {
			this.tail=nn;
			this.size++;
		}
	}
	public int getFirst() throws Exception{
		if(this.size==0) {
			throw new Exception("LL is empty");
		}
		return this.head.data;
	}
	public int getLast() throws Exception{
		if(this.size==0) {
			throw new Exception("LL is empty");
		}
		return this .tail.data;
	}
	public int getAt(int idx) throws Exception{
		if(this.size==0) {
			throw new Exception("LL is empty");
		}
		if(idx < 0 ||idx >= this.size) {
			throw new Exception("Invalid Index");
		}
		Node temp = this.head;
		for(int i = 1; i <= idx; i++) {
			temp = temp.next;
		}
		return temp.data;
	}
	public Node getNodeAt(int idx) throws Exception{
		if(this.size==0) {
			throw new Exception("LL is empty");
		}
		if(idx < 0 ||idx >= this.size) {
			throw new Exception("Invalid Index");
		}
		Node temp = this.head;
		for(int i = 1; i <= idx; i++) {
			temp = temp.next;
		}
		return temp;
	}
	public void addAt(int idx, int item)throws Exception{
		if(idx < 0 ||idx >= this.size) {
			throw new Exception("Invalid Index");
		}
		if(idx==0) {
			addFirst(item);
		}
		if(idx==size) {
			addLast(item);
		}else {
			//create
			Node nn = new Node();
			nn.data = item;
			nn.next = null;
			//get the node before the index and after the index
			Node nodeminus1=getNodeAt(idx-1);
			Node nodeplus1=nodeminus1.next;
			nodeminus1.next=nn;
			nn.next=nodeplus1;
			size++;
		}
	}
}

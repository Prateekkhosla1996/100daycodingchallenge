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
	public int removeFirst() throws Exception{
		if(size==0) {
			throw new Exception("LL is empty");
		}
		int remove = head.data;
		if(this.size==1) {
			this.head=null;
			this.tail=null;
			size=0;
		}else {
			this.head=head.next;
			size--;
		}
		return remove;
	}
	
	public int removeLast()  throws Exception{
		if(size==0) {
			throw new Exception("LL is empty");
		}
		int remove = tail.data;
		if(size==1) {
			head=null;
			tail=null;
			size=0;
		}else {
			Node lastminusone = getNodeAt(size-2);
			tail=lastminusone;
			tail.next=null;
			size--;
		}
		return remove;
	}
	public int mid() {
		Node slow=this.head;
		Node fast=this.head;
		while(fast.next!=null&&fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow.data;
	}
	
	public LinkedList mergedTwoSortedLinkedList(LinkedList l1,LinkedList l2) {
		LinkedList merged = new LinkedList();
		Node one=l1.head;
		Node two=l2.head;
		while(one!=null&&two!=null) {
			if(one.data<two.data) {
				merged.addLast(one.data);
				one=one.next;
			}else {
				merged.addLast(two.data);
				one=one.next;
			}
		}
		while(one!=null) {
			merged.addLast(one.data);
			one=one.next;
		}
		while(two!=null) {
			merged.addLast(two.data);
			two=two.next;
		}
		return merged;
	}
	public int kthFromLast(int k) {
		Node fast=head;
		Node slow=head;
		for(int i=0;i<k;i++) {
			fast=fast.next;
		}
		while(fast!=tail) {
			fast=fast.next;
			slow=slow.next;
		}
		return slow.data;
	}
	private Node getNodeAt2(int idx){
        Node temp = head;
        for(int i=0; i<idx;i++){
            temp=temp.next;
        }
        return temp;
    }
	public void reverseDI() {
	      int li=0;
	      int ri=size-1;
	      while(li<=ri){
	          Node left = getNodeAt2(li);
	          Node right = getNodeAt2(ri);
	          int temp = left.data;
	          left.data=right.data;
	          right.data=temp;
	          li++;
	          ri--;
	      }
	    }
	public void reversePI(){
	      // write your code here
	      
	      Node prev = null;
	      Node curr=head;
	      while(curr!=null){
	      Node ocn=curr.next;
	          curr.next=prev;
	          
	          prev=curr;
	          curr=ocn;
	      }
	      Node temp = head;
	      head=tail;
	      tail=temp;
	    }
	  
	
}

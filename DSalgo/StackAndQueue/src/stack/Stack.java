package stack;

public class Stack {
	protected int[] data=new int[10];
	protected int tos;
	
	public int pop() throws Exception{
		if(isEmpty()) {
			throw new Exception("Stack is empty");
		}
		int popval = this.data[tos];
		this.data[tos]=0;
		tos--;
		
		return popval;
	}
	public void push(int item) throws Exception{
		if(size()==this.data.length) {
			throw new Exception("Stack is full");
		}
		tos++;
		data[tos]=item;
	}
	public boolean isEmpty(){
		return size()==0;
	}
	public int size() {
		return tos+1;
	}
	public int top() throws Exception{
		if(isEmpty()) {
			throw new Exception("Stack is empty");
		}
		
		return this.data[this.tos];
	}
	
	public void display() {
		for(int i=data.length-1;i>0;i--) {
			System.out.print(data[i]+" ");
		}
	}

}

package stack;

public class Client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Stack st = new Stack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		st.push(70);
		st.push(80);
		st.push(90);
		System.out.println(st.pop());
		st.display();
	}

}

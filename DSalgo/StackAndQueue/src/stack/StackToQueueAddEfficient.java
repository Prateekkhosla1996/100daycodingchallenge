package stack;
import java.io.*;
import java.util.Stack;
public class StackToQueueAddEfficient {

	  public static class StackToQueueAdapter {
	    Stack<Integer> mainS;
	    Stack<Integer> helperS;

	    public StackToQueueAdapter() {
	      mainS = new Stack<>();
	      helperS = new Stack<>();
	    }

	    int size() {
	      // write your code here
	      return mainS.size();
	    }

	    void add(int val) {
	      // write your code here
	      mainS.add(val);
	    }

	    int remove() {
	      // write your code here
	      if(size()==0){
	          System.out.println("Queue underflow");
	          return -1;
	      }
	      while(mainS.size()>1){
	          helperS.push(mainS.pop());
	      }
	      int topE = mainS.pop();
	      while(helperS.size()>0){
	          mainS.add(helperS.pop());
	      }
	      
	      return topE;
	    }

	    int peek() {
	      // write your code here
	      if(size()==0){
	          System.out.println("Queue underflow");
	          return -1;
	      }
	      while(mainS.size()>1){
	          helperS.push(mainS.pop());
	      }
	      int topE = mainS.pop();
	      mainS.add(topE);
	      while(helperS.size()>0){
	          mainS.add(helperS.pop());
	      }
	      
	      return topE;
	    }
	  }

	  public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StackToQueueAdapter qu = new StackToQueueAdapter();

	    String str = br.readLine();
	    while (str.equals("quit") == false) {
	      if (str.startsWith("add")) {
	        int val = Integer.parseInt(str.split(" ")[1]);
	        qu.add(val);
	      } else if (str.startsWith("remove")) {
	        int val = qu.remove();
	        if (val != -1) {
	          System.out.println(val);
	        }
	      } else if (str.startsWith("peek")) {
	        int val = qu.peek();
	        if (val != -1) {
	          System.out.println(val);
	        }
	      } else if (str.startsWith("size")) {
	        System.out.println(qu.size());
	      }
	      str = br.readLine();
	    }
	  }
	}
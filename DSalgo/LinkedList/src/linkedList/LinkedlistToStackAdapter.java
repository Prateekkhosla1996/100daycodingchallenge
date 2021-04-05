package linkedList;

import java.io.*;
import java.util.*;
import java.util.LinkedList;

  public class LinkedlistToStackAdapter {
    LinkedList<Integer> list;

    public LinkedlistToStackAdapter() {
      list = new LinkedList<>();
    }


    int size() {
      // write your code here
      return list.size();
    }

    void push(int val) {
      // write your code here
      list.addFirst(val);
    }

    int pop() {
      // write your code here
      return list.removeFirst();
    }

    int top() {
      // write your code here
      return list.getFirst();
    }
  
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    LinkedlistToStackAdapter st = new LinkedlistToStackAdapter();

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("push")){
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push(val);
      } else if(str.startsWith("pop")){
        int val = st.pop();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("top")){
        int val = st.top();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("size")){
        System.out.println(st.size());
      }
      str = br.readLine();
    }
  }
}
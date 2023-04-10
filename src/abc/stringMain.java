package abc;

import java.util.Stack;

public class stringMain {

	public static void main(String[] args) {
	     // TODO Auto-generated method stub
        String[] strings = {"a","a","b","b","a"};
        
        int a=strings.length;
        
        Stack<String> stack = new Stack<>();
        int i;
        
        for(i=0;i<a;i++) {			//no need to declare range as (a-1)
            if(stack.isEmpty()) {
                stack.push(strings[i]);
                // ----> Not Required <----
//                if(stack.peek().equals(strings[i+1])) {
//                    stack.pop();
//                }
//                else {
//                    stack.push(strings[i+1]);
//                }
            }
            else {
                if(stack.peek().equals(strings[i])) {		//change it to i+1 from i. if we use (i+1) then the indexOutofbound error occur. 
                    stack.pop();
                }
                else {
                    stack.push(strings[i]);
                }
            }
        }
        
        System.out.println(stack.size());
    }

}

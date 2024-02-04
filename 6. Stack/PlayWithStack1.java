import java.util.Stack;
import java.util.*; 

public class PlayWithStack1 {

	public static void main(String[] args) {
		
		    Stack<Integer> myStack = new Stack<Integer>(); 
		    Stack<Integer> s1 = new Stack<>(); 
		    int a, b;
			
		      myStack.push(5);  				
		      myStack.push(10);
		      myStack.push(8);
		      System.out.print("myStack: " + myStack);
		      
		      s1=myStack;
		      System.out.print("\ns1: " + s1);
		      
		      a=myStack.pop();  				
		      b=myStack.pop();
		      //myStack.push(a+b);
		      System.out.print("\nmyStack: " + myStack);
		      System.out.print("\nFinal myStack: ");
		      while (!myStack.empty()){
		           System.out.print(myStack.peek() + " ");
		           myStack.pop();
		      }
		      System.out.print("\nmyStack: " + myStack);
		      System.out.print("\ns1: " + s1);
		   } 
}

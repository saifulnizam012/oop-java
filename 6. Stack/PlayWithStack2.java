import java.util.Stack;
import java.util.*; 

public class Stack2 {

	public static void main(String[] args) {
				
			Stack<Clock> myStack = new Stack<>(); 
			Clock clock1 = new Clock(8,30,0);
			Clock clock2;
			
				      myStack.push(clock1.getCopy());
				      //myStack.push(10);
				      clock1.addTimeMinute(32);
				      myStack.push(clock1.getCopy());
				      clock1.incrementHours();
				      myStack.push(clock1.getCopy());
				      System.out.println("myStack: " + myStack);
				      clock2=myStack.pop();
				      System.out.print("remove item : " + clock2.toString() + " from myStack");
				      System.out.print("\nFinal myStack: ");
				      while (!myStack.empty()){
				           System.out.print(myStack.peek().toString() + " ");
				           clock2=myStack.pop();
				      }
				   } 
		
	}
// Java proram to evaluate value of a postfix expression 
import java.util.*;
public class PostfixMachine_Geek4Geeks {
	static int evaluatePostfix(String exp) { 
		Stack<Integer> stack=new Stack<>(); //create a stack 
		
		char c=exp.charAt(0); 
		for(int i=0;i<exp.length();i++) { 
			c=exp.charAt(i); 
			if(c==';') 
				return stack.pop();
			if(Character.isWhitespace(c))
				;
			else if(Character.isDigit(c)) // If operand, push element into stack
				stack.push(c - '0');  
			else {       			 // If operator, pop two elements from stack 						
				int val1 = stack.pop(); // and apply the operator
				int val2 = stack.pop(); 
				switch(c) 
					{ 
						case '+': stack.push(val2+val1); break; 
						case '-': stack.push(val2- val1); break; 
						case '/': stack.push(val2/val1); break; 
						case '*': stack.push(val2*val1); break; 
					} 
				} 
		
		i++;
		} 
			return stack.pop();	 
	} 	
	
	public static void main(String[] args) { 
		Scanner in = new Scanner(System.in); 
		//String InStr="4 2 3 * +"; 	
		String InStr = in.nextLine(); 
		System.out.println("Postfix Notation: "+ InStr); 
		System.out.println("Result: "+evaluatePostfix(InStr)); 
	} 
}
package Lab;
import java.util.*;

public class Palindrome {
	public static void main(String[ ] args) {
		Scanner sc = new Scanner(System.in); 
		int loop = sc.nextInt();
		String inputString;  
		for (int i =0; i<loop; i++) {
			inputString = sc.next();

			if (isPalindrome(inputString)){
				System.out.println("It is a Palindrome");
			}
			else{
				System.out.println("Not a palindrome");
			}
		}
	}

	public static boolean isPalindrome(String input) {  
		Queue<Character> myQueue = new Queue<Character>( );
		Stack<Character> myStack = new Stack<Character>( );
		char letter;

		for (int i = 0; i < input.length( ); i++) {
			letter = input.charAt(i);
			myQueue.enqueue(letter);
			myStack.push(letter);
		}    
		while (!myQueue.isEmpty( )) {
			if (myQueue.dequeue( ) != myStack.pop( ))
				return false;
		}
		return true; 
	}
}
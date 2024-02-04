import java.util.*;

public class TestTokenizer {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
		
		System.out.print("Enter a string: ");
		String str= sc.nextLine(); //reads string
		//System.out.print("Input String: " + str);
		StringTokenizer st = new StringTokenizer(str);
	    while (st.hasMoreTokens()){
	    	String nextT = st.nextToken();
	    	if (!(nextT.equals(";"))) {
	    		System.out.println(nextT);
	    		
	    	}
	    	else {
	    		//System.out.print ("End of String."); 
	    	    break;
	    	}
	    }	      
	}
}
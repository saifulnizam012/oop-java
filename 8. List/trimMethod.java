//2. trim, split symbols and print all words without list
import java.util.*;
public class trimMethod {

   public static void main(String[] args) {
        
	    String speech = "     People infected with Covid-19! with health problem: experience severe symptoms";
	    //speech= speech.trim();
		
	    String[] result = speech.split("\\W+"); //splits the string with symbols
	    for (int x=0; x<result.length; x++) { 
	      	 System.out.println("line " + (x+1) + ": " + result[x]);
	    
   }
}
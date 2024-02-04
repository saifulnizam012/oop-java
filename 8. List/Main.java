//0. print all words words
import java.util.*;
public class Main {

  	public static void main(String[] args) {

    		String speech = "Four score and seven years ago";
    		String[] result = speech.split("\\s");
    		for (int x=0; x<result.length; x++) 
      			System.out.println(result[x]);
  	}
}

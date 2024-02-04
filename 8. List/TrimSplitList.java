// trim, split symbols and print using list

import java.util.*;
import java.lang.*; 
public class TrimSplitList {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList <String>(); 
		String passage = "        Hey! this @ is Rama -samy*yo&  .   ";
		
		System.out.println("passage: \"" +  passage + "\"");
		passage=passage.trim();
		System.out.println("passage after trim: \"" +  passage + "\"");
		String delims = "\\W+"; // split any non word 
		String [] words = passage.split(delims); 
		for (String str : words){
			System.out.println(str + " ");
			list1.add(str);
		}
		System.out.println("list1: "+ list1);
	}	
}
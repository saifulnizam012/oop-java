// 6. iterator to search a word in list
/iterator in java
import java.util.*; 
import java.lang.*; 
public class TestIterator {
	
	  // Java program to iterate over an arraylist using Iterator 

	     public static void main(String[] args) { 
		  // initializing ArrayList 
		  List<Integer> myNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8); 
		  List<String> myList = new ArrayList<String>(); 
			myList.add("Please");
			myList.add("Stay");
			myList.add("at"); 
			myList.add(1,"my");
			myList.add("Home");
			myList.add("or");
			myList.add("your");
			myList.add("Home");
			myList.add("#Covid19");
			
		  Iterator it = myList.iterator(); 
		  String str="Home";
		  int j=0;
		  while (it.hasNext()) { 
			 String str1= (String)it.next();
			   if(str1.equals(str))
				   j++;
		  }
		  
		  System.out.println("\nno of Home in myList : " + j); 
	      
		  System.out.println("\nElements of myNumbers: " + myNumbers); 
		 
		  Iterator it2 = myNumbers.iterator();
		  System.out.println();
		  System.out.print("myNumbers list: ");
	      while (it2.hasNext()) 
			   System.out.print(it2.next() + " "); 
	     } 
	     
	}


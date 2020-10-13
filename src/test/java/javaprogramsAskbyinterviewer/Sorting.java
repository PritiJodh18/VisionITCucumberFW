package javaprogramsAskbyinterviewer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Sorting {
public static void main(String[] args) {
	 List<Integer> list2=new ArrayList<Integer>();  
	  list2.add(21);  
	  list2.add(11);  
	  list2.add(51);  
	  list2.add(1);  
	  //Sorting the list  
	  Collections.sort(list2);  
	  Collections.reverse(list2);
	  System.out.println(list2);
	  HashSet<String> set=new HashSet<String>();  
      set.add("One");    
      set.add("Two");    
      set.add("Three");   
      set.add("Four");  
      set.add("Five");  
      System.out.println(set);
      Iterator<String> i=set.iterator();  
      while(i.hasNext())  
      {  
      System.out.println(i.next());  
      }  

      HashSet<String> set1=new HashSet<String>();  
      set1.add("C");
      set1.add("a");
      set1.add("p");  
      set1.add("g");  
      set1.add("e");  
      set1.add("m");
      set1.add("i");
      set1.add("n");
      set1.add("i");
      //Collections.sort(set1);
      //Traversing elements  
      
      Iterator<String> itr=set1.iterator();  
      while(itr.hasNext()){  
       System.out.println(itr.next());  
      } 
}  
}

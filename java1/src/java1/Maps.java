package java1;
import java.util.*;

public class Maps {

	public static void main(String[] args) {
		//Hashmap
		HashMap<Integer,String> empid=new HashMap<Integer,String>();
		empid.put(123456,"Tamalika");
		empid.put(12456,"john");
		empid.put(456,"cerl");
		empid.put(1345,"joti");
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry n:empid.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }

		//Hashtable
      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Jill");  
	      ht.put(5,"Rohit");  
	      ht.put(6,"Jack");  
	      ht.put(7,"Ram"); 
	      System.out.println("\nThe elements of Hashtable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
      //TreeMap
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Annie");    
	      map.put(9,"Carlotte");    
	      map.put(10,"Catie");
	      System.out.println("\nThe elements of Treetable are ");
	      for(Map.Entry n:map.entrySet()) {
	    	  System.out.println(n.getKey()+" "+n.getValue());
	      }


		
	}

}

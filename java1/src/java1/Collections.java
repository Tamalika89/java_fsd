package java1;
import java.util.*;

public class Collections {

	public static void main(String[] args) {
		//ArrayList
		System.out.println("ArrayList");
		ArrayList<String> name=new ArrayList<String>();   
	      name.add("Tamalika");//
	      name.add("Dipti");    	   
	      System.out.println(name);
	      //vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(78); 
	      vec.addElement(51); 
	      System.out.println(vec);
	      //linked_list
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> city=new LinkedList<String>();  
	      city.add("Kolkata");  
	      city.add("Mumbai"); 
	      Iterator<String> itr=city.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());
	      }
	      //HashSet
	      System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(10);  
	       set.add(11);  
	       set.add(12);
	       set.add(13);
	       System.out.println(set);
	       //LinkedHashSet
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(11);  
	       set2.add(13);  
	       set2.add(12);
	       set2.add(14);	       
	       System.out.println(set2);
	      	} 

}



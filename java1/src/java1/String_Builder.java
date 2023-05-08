package java1;

public class String_Builder {

	public static void main(String[] args) {
		String str= new String("Hello");
		String str1 = new String("How are You?");
		System.out.println(str.length());//length of a string
		System.out.println(str.isEmpty());//check the string is empty or not
		System.out.println(str.indexOf('l'));//check the character of a index 
		System.out.println(str.compareTo(str1));//Comparing two string
		System.out.println(str.toLowerCase());//convert to lowercase
		String replace=str.replace('e', 'f');//replace
		System.out.println(replace);
		String x="Welcome to Java program";
		String y="WeLcOmE tO Java program";
		System.out.println(x.equals(y));//equal
 
		System.out.println("\n");
		System.out.println("Creating StringBuffer");
		//Creating StringBuffer and append method
		StringBuffer s=new StringBuffer("Welcome to Java!");
		s.append("");
		System.out.println(s);
		s.insert(0, 'w');
		System.out.println(s);

		//replace 
		StringBuffer sb=new StringBuffer("Hello");
		sb.replace(0, 2, "hEl");
		System.out.println(sb);

		//delete
		sb.delete(0, 1);
		System.out.println(sb);
		
		//StringBuilder
		System.out.println("\n");
		System.out.println("Creating StringBuilder");
		StringBuilder sb1=new StringBuilder("Happy");
		sb1.append("Learning");
		System.out.println(sb1);

		System.out.println(sb1.delete(0, 1));

		System.out.println(sb1.insert(1, "Welcome"));

		System.out.println(sb1.reverse());
				
		//conversion	
		System.out.println("\n");
		System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
		
		String s1 = "Hello"; 
        
        // conversion from String object to StringBuffer 
        StringBuffer sbr = new StringBuffer(s1); 
        sbr.reverse();
        System.out.println("String to StringBuffer");
        System.out.println(sbr); 
          
        // conversion from String object to StringBuilder 
        StringBuilder sbl = new StringBuilder(str); 
        sbl.append("world"); 
        System.out.println("String to StringBuilder");
        System.out.println(sbl);              





		

	}

}

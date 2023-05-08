
public class Call_by_Value {
	int data=50;  
	  
	 void change(int data){  
	 data=data+50; 
	 }  

	public static void main(String[] args) {
		Call_by_Value obj=new Call_by_Value();  
		  
		   System.out.println("before change "+obj.data);  
		   obj.change(100);  
		   System.out.println("after change "+obj.data); 
	}

}

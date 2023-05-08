package java1;

public class Method_overloading {

	public static void main(String[] args) {
		Method_overloading m= new Method_overloading();
		  //m.fun(2,2,3); 
        m.fun(10,20);
    }
    static void fun(int a,int b,int c){
        System.out.print("Multiplication is:"+ a*b*c);
    }
    static void fun(int a,int b){
    	int c=a+b;
        System.out.print("Sum is:"+c);
        

	}

}

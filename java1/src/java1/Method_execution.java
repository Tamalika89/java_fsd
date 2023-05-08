package java1;

public class Method_execution {
	public static int sum(int a,int b) {
		int c=a+b;
		return c;
		
	}

	public static void main(String[] args) {
		Method_execution m =new Method_execution();
		int ans=m.sum(10, 20);
		System.out.println(ans);
	}

}

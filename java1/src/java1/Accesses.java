package java1;
class mo{
	public int x = 34;
    protected int y =5;
    int z = 46;
    private int a = 8;
    public void op() {
    	System.out.println(x);
    	System.out.println(y);
    	System.out.println(z);
    	System.out.println(a);
    	
    }
    
}

public class Accesses {

	public static void main(String[] args) {
		mo m= new mo();
		m.op();
		System.out.println(m.x);//public
		System.out.println(m.y);//protected
		System.out.println(m.z);//default
		//System.out.println(m.a);//private so its cannot access outside the class
		
		
	}

}

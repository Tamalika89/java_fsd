package pack2;
import pack1.*;
//outside the package by subclass protected variable can access

public class Protected1 extends Protected {


	public static void main(String[] args) {
		Protected1 obj = new Protected1();
		obj.display();
		
	}

}

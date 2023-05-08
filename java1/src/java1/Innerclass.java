package java1;
class outer1{
	void show() {
		System.out.println("This is Outer class");
	}
	class inner{
		void display() {
			System.out.println("This is Inner class");
		}
	}
}

public class Innerclass {

	public static void main(String[] args) {
		outer1 obj= new outer1();
		outer1.inner obj1= obj.new inner();
		obj1.display();

	}
}

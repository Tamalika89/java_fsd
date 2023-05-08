package java1;
class Outer{
	void show() {
		System.out.println("This is Outer class");
	}
}

public class Annonymous {

	public static void main(String[] args) {
		Outer obj=new Outer(){
			public void show() {
				System.out.println("This is anonymous inner class");
			}
		};
		obj.show();

	}

}


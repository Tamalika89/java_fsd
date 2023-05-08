//Parameterized constructor
public class Parameterized_constructor {
	int id;
	String name;
	Parameterized_constructor(int i,String n){
		id=i;
		name=n;
	}
	void display() {
		System.out.println(id +" "+name);
	}

	public static void main(String[] args) {
		Parameterized_constructor obj= new Parameterized_constructor(12356,"TAMALIKA");
		Parameterized_constructor obj1= new Parameterized_constructor(18356,"PUJA");
		obj.display();
		obj1.display();
		
	}

}

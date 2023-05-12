class Mythraedrunnable implements Runnable {

	@Override
	public void run() {
		int i=0;
		while(i<300) {
			System.out.println("My thread is running");
			i++;
		}
		
		
		
	}
	
}
class Mythraedrunnable1 implements Runnable {

	@Override
	
	public void run() {
		int i=0;
		while(i<300) {
			System.out.println("My thread is stopped");
			i++;
		}
		
		
	}
	
}
public class Myrunnable {

	public static void main(String[] args) {
		Mythraedrunnable t= new Mythraedrunnable();
		Mythraedrunnable1 t1= new Mythraedrunnable1();
		Thread gun =new Thread(t);
		Thread gun2=new Thread(t1);
		gun.start();
		gun2.start();
		
		
		

	}

}

class newthread1 extends Thread{
	public void run() {
		int i=0;
		while(i<100) {
			System.out.println("My thread is not running");
			System.out.println("I am sad");
			i++;
		}
	}
}
class newthread2 extends Thread{
	public void run() {
		int i=0;
		while(i<100) {
			System.out.println("Thread is running");
			i++;
		}
	}

	
}

public class thread {

	public static void main(String[] args) {
		newthread1 th= new newthread1();
		th.start();
		newthread2 th2= new newthread2();
		th2.start();

	}

}

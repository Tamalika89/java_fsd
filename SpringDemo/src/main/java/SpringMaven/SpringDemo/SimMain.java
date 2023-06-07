package SpringMaven.SpringDemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SimMain {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("Spring.xml");
		Airtel airtel=ac.getBean(Airtel.class);
//		airtel.dataTypeOfSim();
//		airtel.typeOfSim();
		System.out.println(airtel.getDataStrength());
		Idea idea=ac.getBean(Idea.class);
		idea.display();

		



	}

}

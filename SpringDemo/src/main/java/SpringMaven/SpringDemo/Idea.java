package SpringMaven.SpringDemo;
public class Idea implements Sim{

		private String dataStrength;
		
		
		public Idea(String dataStrength) {
			this.dataStrength = dataStrength;
		}

		public void display() {
			System.out.println(dataStrength);
		}
		
		public void typeOfSim() {
			// TODO Auto-generated method stub
			System.out.println("idea is the sim");
		}

		public void dataTypeOfSim() {
			// TODO Auto-generated method stub
			System.out.println("it has 4G access");
		}

	}






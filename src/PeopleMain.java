import java.util.ArrayList;

public class PeopleMain {

	public static void main(String args[]) {
		People p1 = new People("Nidhesh", 24, "Events Manager");
		People p2 = new People("Jason", 25, "Software Tester");
		People p3 = new People("Tiberu", 22, "Software Developer");
		People p4 = new People("Callum", 23, "Java God");
		People p5 = new People("Marcell", 25, "Unemployed");
		

		System.out.println(p1.toString());// compiler writes here p1.toString()
		System.out.println(p2.toString());// compiler writes here p2.toString()
		System.out.println(p3.toString());// compiler writes here p2.toString()
		System.out.println(p4.toString());// compiler writes here p2.toString()
		System.out.println(p5.toString());// compiler writes here p2.toString()
		
		ArrayList<People> users = new ArrayList<People>(); 
		
		users.add(p1);
		users.add(p2);
		users.add(p3);
		users.add(p4);
		users.add(p5);
		
		//user 
		String person1 = "Nidhesh";
		
		System.out.println(searchName(person1,users));

	}
	
	private static boolean searchName(String name, ArrayList<People> users) {
		for(People person : users) {
			if(person.toString().contains(name)) {
				return true;
			}
		}		
		return false;
	}

}

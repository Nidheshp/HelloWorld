
public class People {

	private String Name;
	private int Age;
	private String JobTitle;

	public People(String Name, int Age, String JobTitle) {
		this.Name = Name;
		this.Age = Age;
		this.JobTitle = JobTitle;
	}

	public String toString() {// overriding the toString() method
		return Name + " " + Age + " " + JobTitle;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

}

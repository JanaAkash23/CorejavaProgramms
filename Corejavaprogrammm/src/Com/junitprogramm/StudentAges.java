package Com.junitprogramm;

public class StudentAges {
	int age;
	String name, res;
	public StudentAges(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public String calculateAge() {
		if(age>=18)
			res="above 18";
		else
			res="bellow 18";
		return res;
	}
	
	public void disp() {
		System.out.println(name + " is " + res);
	}
}

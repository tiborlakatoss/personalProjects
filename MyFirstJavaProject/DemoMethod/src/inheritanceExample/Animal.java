package inheritanceExample;

public class Animal {

	private int age;

	public Animal() {
		setAge(1);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	static void uzenet() {
		System.out.println("Sziasztok");
	}

}

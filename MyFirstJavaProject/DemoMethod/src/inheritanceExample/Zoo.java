package inheritanceExample;

public class Zoo {

	public static void main(String[] args) {

		Animal ghita = new Animal();
		ghita.setAge(5);
		System.out.println("Ghita are " + ghita.getAge() + " ani");

		Lion lionKing = new Lion();
		lionKing.setAge(2);
		lionKing.setNrDinti(30);
		System.out.println("LionKing are " + lionKing.getAge() + " ani");
		System.out.println("LionKing are " + lionKing.getNrDinti() + " dinti");

		Animal zebra;
		zebra = new Animal();
		zebra.getAge();
		Animal.uzenet();
		Lion oroszlan = new Lion();

		for (int i = 1; i <= 5; i++) {

			// oroszlan.setAge(i);
			System.out.println(oroszlan.getAge() + " ");

		}

		System.out.println(oroszlan.getAge());
		System.out.println(lionKing.getAge());

	}

}

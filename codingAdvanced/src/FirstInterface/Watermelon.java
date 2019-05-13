package FirstInterface;

public class Watermelon extends AbstractCleanup implements Eatable {


	public static void main(String[] args) {
		Watermelon watermelon = new Watermelon();
		watermelon.eat();
		Stone stone = new Stone();
		Pie pie = new Pie();
		System.out.println(watermelon.EXPIRATION_DATE);

	}

	@Override
	public void eat() {

		
	}

	@Override
	public boolean needsToWashDishes() {
		System.out.println("the dhieshes does not needs to be cleaned");
		return true;
	}
}

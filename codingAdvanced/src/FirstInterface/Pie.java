package FirstInterface;

public class Pie extends AbstractCleanup implements Eatable {

	@Override
	public void eat() {

	}

	@Override
	public boolean needsToWashDishes() {
		System.out.println("the dishes needs to be cleaned");
		return true;
	}

}

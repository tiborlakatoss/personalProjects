package FirstInterface;

public abstract class AbstractCleanup {

	private int DishesRemeaning;

	public int getDishesRemeaning() {
		return DishesRemeaning;
	}

	public void throwToGarbage() {
		System.out.println("Throwing remainings to bin");
	}

	public abstract boolean needsToWashDishes();

}

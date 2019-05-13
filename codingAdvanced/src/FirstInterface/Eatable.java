package FirstInterface;

import java.time.LocalDate;

public interface Eatable {
	public final LocalDate EXPIRATION_DATE = LocalDate.of(2020, 1, 1);

	void eat();

	default boolean isEatabla()

	{
		return true;

	}

}

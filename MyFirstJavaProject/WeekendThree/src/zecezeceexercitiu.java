import java.util.Arrays;

public class zecezeceexercitiu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = { 2, 10, 2, 7, 10, 10, 2, 20, 20, 20, 20 };

		boolean contor10 = false;
		boolean contor20 = false;

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1] && array[i] == 10) {
				contor10 = true;
			}

		}
		System.out.println(contor10);

		for (int i = 0; i < array.length - 1; i++) {

			if (array[i] == array[i + 1] && array[i] == 20) {

				contor20 = true;
			}
		}
		System.out.println(contor20);

}
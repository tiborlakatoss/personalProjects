import java.util.Arrays;

public class ExercitiuDinNou {

	public static void main(String[] args) {

		int[] myArray = { 2, 5, 7, 9, -4, 2, 11, -12 };

		Arrays.sort(myArray);
		System.out.println(Arrays.toString(myArray));
		System.out.println(myArray[myArray.length - 1]);
		System.out.println(myArray[myArray.length - 2]);

	}

}

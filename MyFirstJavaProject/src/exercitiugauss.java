
public class exercitiugauss {

	public static void main(String[] args) {

		int[] gauss = { 10, 1, 2, 3, 4, 6, 8, 7, 9, 0 };

		int sumGauss = (gauss.length * (gauss.length + 1)) / 2;
		int sumaarray = 0;
		for (int i = 0; i < gauss.length; i++)

			sumaarray += gauss[i];
		{
			int elemLipsa = sumGauss - sumaarray;
			System.out.println("suma lipsa este " + elemLipsa);
		}

	}

}

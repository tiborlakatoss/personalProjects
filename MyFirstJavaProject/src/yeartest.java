package HomeWork;

public class yeartest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 2012;
		if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
			
			System.out.println(" Anul este bisect " + a);
			
		}else {
			System.out.println(" Anul nu este bisect "+a);

		}

	}

}

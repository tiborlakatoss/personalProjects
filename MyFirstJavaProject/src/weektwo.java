package HomeWork;

public class weektwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
			int x = 5;
			
			
			boolean y = (x >= 5) | (++x <= 6);

			System.out.println(x);

		}
		int viteza = 55;

		if (viteza < 60) {
			System.out.println("nu primesti amenda");
		} else  {
			System.out.println("primesti amenda");
		}
		if (viteza > 70) {
			System.out.println("nu primesti amenda");
		} else {
			System.out.println("primesti amenda");

		}

		int grade = 5;

		switch (grade) {

		case 10:
			System.out.println("excelent");
			break;
		case 9:
		case 7:
			System.out.println("well done!");
		case 5:
			System.out.println("you passed");

		}

		{
			int x = 10;
			while (x < 20) {
				System.out.println("value of x: " + x);
				x++;
			}

			{
				int p = 30;
				while (x < 20) {
					System.out.print("value of x: " + x);
					x++;
					System.out.print("/n");
					
				}
			}
		}

	}

}

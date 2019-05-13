package HomeWork;

public class exercitii {


	public static void main(String[] args) {

		{
			boolean a = true;
			boolean b = false;
			boolean c;

			c = a;
			a = b;
			b = c;

			// c=a b=c b=a

			System.out.println("a este: " + a + " b este:" + b);

		}

		{
			char a = 'x';
			char b = 'y';
			char c;

			c = a;
			a = b;
			b = c;

			System.out.println(" a este: " + a + " b este:" + b);

		}

		{
			byte t = -22;
			byte u = +66;
			byte schimb;

			// schimb=t;t=u;u=schimb;

			schimb = t;
			t = u;
			u = schimb;

			System.out.println("t este:" + t + " este:" + u);

			{

				short a = 2;
				short b = 3;
				short c = 4;
				short d;

				d = a;
				a = b;
				b = d;

				System.out.println(" a este: " + a + " b este: " + b + " c este: " + c);

				{

					int cap = 1;
					int picior = 2;
					int dinti;

					dinti = cap;
					cap = picior;
					picior = dinti;

					System.out.println("cap este: " + cap + "picior este:" + picior);

					{

						long masini = 46500;
						long biciclete = 22000;
						long autobuze = 32;
						long troleu;

						troleu = masini;
						masini = biciclete;
						biciclete = troleu;

						System.out.println(" masini sunt: " + masini +  " ,biciclete" + biciclete + " autobuze" + autobuze);

						{

							float portocale = 5.4f;
							float banane = 7.2f;
							float ananas;

							ananas = portocale;
							portocale = banane;
							banane = ananas;

							System.out.println(" portocalele este: " + portocale + " bananele sunt: " + banane);
							{

								double emag = 299.99;
								double flanco = 285.99;
								double cel = 265.50;
								double domo;

								domo = emag;
								emag = flanco;
								flanco = cel;
								cel = domo;

								System.out.println(" emag este: " + emag + " flanco este: " + flanco + " cel este: " + cel);

							}

							{

								int g = 7;
								float h = 12.5f;
								int j;

								j = (int) g;
								g = (int) h;
								h = j;

								h = j;
								System.out.println(" g este: " + g + " h este:" + h);
								
							

						}
					}

				}

			}

		}
	}
}
}
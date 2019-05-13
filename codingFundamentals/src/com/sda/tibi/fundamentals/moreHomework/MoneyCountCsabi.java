package com.sda.tibi.fundamentals.moreHomework;

import java.util.Scanner;

public class MoneyCountCsabi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int deposit;
		int withdraw;
		int loan;
		int selection = 0;
		int net = 0;

		while (selection != 5) {

			System.out.println("What do you wnat to do (1.Deposit, 2.Withdraw, 3.Loan; 4.Info, 5.Exit)?");
			Scanner scanner = new Scanner(System.in);
			selection = scanner.nextInt();

			if (selection == 1) {
				System.out.println("Deposit. What amount?");
				deposit = scanner.nextInt();
				net = net + deposit;
				System.out.println("Current net: " + net);
			}
			if (selection == 2) {
				System.out.println("Withdraw. What amount?");
				withdraw = scanner.nextInt();
				if (net >= withdraw) {
					net = net - withdraw;
					System.out.println("Current net: " + net);
				} else {
					System.out.println("Not enough money on account.");
				}
			}

			if (selection == 3) {
				System.out.println("Loan. What amount?");
				loan = scanner.nextInt();
				if ((net - loan) >= -10000) {
					net = net - loan;
					System.out.println("Tranzaction resulted negative net: " + net);
				} else {
					System.out.println("Payment cannot be made.");
				}
			}
			if (selection == 4) {
				System.out.println("Your current net is: " + net);
			}

		}
		System.out.println("Have a nice day! Good bye!");
	}

}

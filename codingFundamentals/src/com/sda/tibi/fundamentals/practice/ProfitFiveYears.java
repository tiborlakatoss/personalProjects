package com.sda.tibi.fundamentals.practice;

import java.util.Scanner;

public class ProfitFiveYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("you have: "+newInvestment+ "RON after one year");
		//
		// System.out.println(newInvestment*profit) ;
		//
		// newInvestment=newInvestment*profit+newInvestment;
		//
		// System.out.println("you have: "+newInvestment+ "RON after two years");
		//

		/*
		 * Calculate how many years it will take to double your investment with 5%
		 * return/ year. Then read from console the percentage of return .
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("insert profit: ");
		double investment = 100;
		double profit = scanner.nextDouble();
		double numberOfYears = 0;

		double doubleInvestment = investment * 2;

		do {

			investment += investment * profit;

			// investment=investment+investment*pforit
			numberOfYears++;
			System.out.print(investment + " ");
		}

		while (investment <= doubleInvestment);
		System.out.println(" ");

		System.out.println(" numbes of years" + numberOfYears);

	}
}
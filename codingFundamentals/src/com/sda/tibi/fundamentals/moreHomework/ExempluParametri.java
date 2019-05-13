package com.sda.tibi.fundamentals.moreHomework;

public class ExempluParametri {

	public static void main(String[] args) {
		StringBuilder a = new StringBuilder("ANA");
		add(a);

		System.out.println(a);
	}

	public static StringBuilder add(StringBuilder x) {

		x.append("BOB");
		return (x);
	}

}

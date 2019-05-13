package com.sda.advanced.main;

import com.sda.advanced.model.BirthCertificate;

public class Main {

	public static void main(String[] args) {
		createBirthCertificate();
	}

	public static void createBirthCertificate() {
		BirthCertificate PaulBs = new BirthCertificate();
		PaulBs.setName("Paul");
		PaulBs.setSurname("Trestian");
		PaulBs.setAge(10);
		PaulBs.setBirthPlace("Romania");
		PaulBs.setBirthYear(1990);
		PaulBs.setGender('M');

		BirthCertificate anasBirthCertificate = new BirthCertificate("Ana", "Ana", 10, 'F', "USA", 1920);
		BirthCertificate anasSecondBC = new BirthCertificate("Ana", "Ana", 10, 'F', "USA", 1920);
		System.out.println(anasSecondBC.toString());
		System.out.println(anasBirthCertificate.toString());

		if (anasSecondBC.equals(anasBirthCertificate)) {
			System.out.println("duplicate certificate");
		} else {
			System.out.println("unique certificate");
		}

	}

	public void createBirthCertificateNonStatic() {

	}
}

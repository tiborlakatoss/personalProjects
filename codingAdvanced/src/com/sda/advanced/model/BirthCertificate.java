package com.sda.advanced.model;

import java.util.Random;

//BirthCertificate - name, surname, age, gender, birthPlace, birthYear
public class BirthCertificate {
	private String name;
	private String surname;
	private int age;
	private char gender = 'M';
	private String birthPlace;
	private int birthYear;

	public BirthCertificate() {
	}

	public BirthCertificate(String name, String surname, int birthYear) {

		this.name = name;
		this.surname = surname;
		this.birthYear = birthYear;
	}

	public BirthCertificate(String name, String surname, int age, char gender, String birthPlace, int birthYear) {

		this.name = name;
		this.surname = surname;
		this.age = age;
		this.gender = gender;
		this.birthPlace = birthPlace;
		this.birthYear = birthYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public char getGender() {
		return this.gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public static int generateUniqueCode() {
		return new Random().nextInt(1000);
	}

	@Override
	public String toString() {
		return "BirthCertificate [name=" + name + ", surname=" + surname + ", age=" + age + ", gender=" + gender
				+ ", birthPlace=" + birthPlace + ", birthYear=" + birthYear + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((birthPlace == null) ? 0 : birthPlace.hashCode());
		result = prime * result + birthYear;
		result = prime * result + gender;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BirthCertificate other = (BirthCertificate) obj;
		if (age != other.age)
			return false;
		if (birthPlace == null) {
			if (other.birthPlace != null)
				return false;
		} else if (!birthPlace.equals(other.birthPlace))
			return false;
		if (birthYear != other.birthYear)
			return false;
		if (gender != other.gender)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

//	@Override
//	public String toString() {
//
//		return " name= " + name + " surname= " + surname;

}

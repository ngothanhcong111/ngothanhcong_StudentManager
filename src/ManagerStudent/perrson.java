package ManagerStudent;

import java.util.Scanner;

public class perrson {
	String fullName,dateOfBirth;
	public perrson(String fullName, String dateOfBirth) {
		super();
		this.fullName = fullName;
		this.dateOfBirth = dateOfBirth;
	}
	public perrson () {
	
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public void inputInfoPerson() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		System.out.println("Enter Date of birth: ");
		String date = sc.nextLine();
	}
@Override	
	public String toString() {
		return("Full Name: " + this.fullName + "\n" + "Date of Birth: " + this.dateOfBirth);
	}
	
}

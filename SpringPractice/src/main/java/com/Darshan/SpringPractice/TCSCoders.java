package com.Darshan.SpringPractice;

public class TCSCoders {

	private int yearsOfExperience;
	private TCSTesters testers;
	
	public TCSTesters getTesters() {
		return testers;
	}

	public void setTesters(TCSTesters testers) {
		this.testers = testers;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		System.out.println("Setter Called");  // Setter Injection  we are calling setter() to assign a value
		this.yearsOfExperience = yearsOfExperience;
	}

	public void code() {
		System.out.println("Lets Do Coding...");
		
		testers.test();
	}
}

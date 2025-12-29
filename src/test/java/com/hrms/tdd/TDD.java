package com.hrms.tdd;

import org.testng.annotations.Test;

public class TDD {
	
	@Test(dependsOnMethods = {"openingDoor"})
	public void knockingDoor() {
		System.out.println("someones knocking on the door");
	}
	@Test
	public void openingDoor() {
		System.out.println("I will open the door only bc someone knocked");
	}
	@Test
	public void closingDoor() {
		System.out.println("closing door");
	}
	

}

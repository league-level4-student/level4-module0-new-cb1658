package _01_Encapsulate_the_Data;

public class EncapsulateTheData {

	// 1. Encapsulate all the members. DONE

	// 2. Implement the setter restrictions described above each member variable. DONE


	
	// 3. Pass all the JUnit tests.

	/* 
	 * All negative arguments should set itemsReceived to 0.
	 */

	
	public void setItemsReceived(int a) {
		if(a < 0) {
			this.itemsReceived = 0; 
		}
		else {
			this.itemsReceived = a; 
		}
	}
	private int itemsReceived;

	/*
	 * degreesTurned must be locked between 0.0 and 360.0 inclusive.
	 * 
	 * All parameters outside this range should set degreesTurned to the nearest
	 * bound.
	 */

	
	

	
	public void setDegreesTurned(Double n) {
		if(n>=0.0 && n <= 360.0) {
			this.degreesTurned = n;
		}
		else {
			if(n > 360) {
				n = 360.0;
			}
			if(n<0) {
				n = 0.0;
			}
		}
	}
	
	public double getDegreesTurned() {
		return this.degreesTurned;
	}
	
	private double degreesTurned;
	/*
	 * nomenclature must not contain an empty String.
	 * 
	 * An empty String parameter should set nomenclature to a String with a single
	 * space.
	 */
	public void setNomenclature(String n) {
		if(!(n == "")) {
			this.nomenclature = n;
		}
		else {
			this.nomenclature = " ";
		}
	}

	private String nomenclature;

	/*
	 * memberObj must not be a String.
	 * 
	 * A String parameter should set memberObj to a new Object();
	 * 
	 * Hint: Use the instanceof operator.
	 * 
	 * Example:
	 * 
	 * Robot rob = new Robot();
	 * 
	 * System.out.println(rob instanceof Robot); // prints true
	 * 
	 * System.out.println(rob instanceof Random); //prints false
	 */
	public void setMemberObj(Object n) {
		if(!(n instanceof String)) {
			this.memberObj = n;
		}
	}
	
	public Object getMemberObj() {
		return this.memberObj;
	}

	private Object memberObj;

}

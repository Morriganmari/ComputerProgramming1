package programming1CriticalThinking1;

/**
 * This is a program to print the following information about
 * a fictional person: First Name, Last Name, Street Address,
 * City, and Zip Code.
 * 
 * @author Shayna Almond
 */

public class Programming1CriticalThinking1 {
	/*
	 * Create and initialize the values to be printed out
	 * Print out the information for the user
	 */

	public static void main(String[] args) {
		// Initialize the variables to be printed out
		String firstName = "Ariel";
		String lastName = "Johnson";
		String streetAddress = "418 King Blvd";
		String city = "Houston";
		int zipCode = 65809;

		//Print each variable with the name and variable to clarify for the user
		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);
		System.out.println("Street address: " + streetAddress);
		System.out.println("City: " + city);  
		System.out.println("Zipcode: " + zipCode);
	}

}
 
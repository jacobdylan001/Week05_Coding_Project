package Week05;

public class App {
// Created a class called App to act as the main class to call the created methods.
	public static void main(String[] args) {
	// Created two new instances of AsteriskLogger and SpacedLogger.
		Logger asterisk = new AsteriskLogger();
		Logger spaced = new SpacedLogger();
		
		asterisk.log("Java");
		
		System.out.println("--------------------");
		
		asterisk.error("Java");
		
		System.out.println("--------------------");
		
		spaced.log("Java");
		
		System.out.println("--------------------");
		
		spaced.error("Java");
	}

}

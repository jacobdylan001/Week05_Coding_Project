package Week05;

public class AsteriskLogger implements Logger {
// Implemented logger into AsteriskLogger.
	@Override
	public void log(String string) {
		System.out.println("***" + string + "***");
	}

	@Override
	public void error(String string) {
		System.out.println("********************\n"
				+ "***Error: " + string + "***\n"
				
						+ "********************");
	}

}
 
package Week05;

public class SpacedLogger implements Logger {
// Implemented Logger into SpacedLogger.
	@Override
	public void log(String string) {
		String spaceString= "";
		for (int i = 0; i < string.length(); i++) {
			spaceString += string.charAt(i);
		if (i != string.length() - 1) {
			spaceString += " ";
		}
	}
		System.out.println(spaceString);
}
	@Override
	public void error(String string) {
		String spaceString= "";
		for (int i = 0; i < string.length(); i++) {
			spaceString += string.charAt(i);
		if (i != string.length() - 1) {
			spaceString += " ";
			}
		}
		System.out.println("ERROR: " + spaceString);
	}
}
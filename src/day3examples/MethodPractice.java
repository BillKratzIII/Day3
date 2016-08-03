package day3examples;

public class MethodPractice {
	public static void main(String[] args) {
		boolean doWeHaveAllTheNotebooks = true;

		String whatHappened = notebook(doWeHaveAllTheNotebooks);
		System.out.println(whatHappened);
	}

	public static String notebook(boolean isLost) {
		String whatToDoNow = null;
		if (isLost) {
			whatToDoNow = "Good, we have all the books.";
		} else {
			whatToDoNow = "Blame the students.";
		}
		return whatToDoNow;
	}

}

import java.util.*;
import java.util.AbstractMap.SimpleEntry;

class Program {

	public static void main(String args[]) {
		new Program();
	}

	private List<SimpleEntry<String, String>> phrases = Arrays.asList(
		new SimpleEntry<>("Hello", "Ellohay"),
		new SimpleEntry<>("Pig Latin", "Igpay Atinlay"),
		new SimpleEntry<>("The first month is Janurary", "Ethay irstfay onthmay isway Anuraryjay"),
		new SimpleEntry<>("The floor is sticky", "Ethay loorfay isway tickysay")
	);

	public Program() {
		for (var pair : phrases) {
			testEquals(pair.getKey(), pair.getValue(), translateEnglishToPigLatin(pair.getKey()));
		}
	}

	private String translateEnglishToPigLatin(String english) {
		// TODO
		return "";
	}

	private void testEquals(String input, String expect, String actual) {
		if (expect.toLowerCase().equals(actual.toLowerCase())) {
			if (!expect.equals(expect.toLowerCase()) && expect.equals(actual)) {
				System.out.printf("PASS (Bonus)! %s -> %s%n", input, actual);
			} else {
				System.out.printf("PASS! %s -> %s%n", input, actual);
			}
		} else {
			System.out.printf("FAIL!%n");
			System.out.printf("  Input: %s%n", input);
			System.out.printf("  Expect: %s%n", expect);
			System.out.printf("  Actual: %s%n", actual);
		}
	}

}

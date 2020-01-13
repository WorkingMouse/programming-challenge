import java.util.Map;

class Program {

	public static void main(String args[]){
		new Program();
	}

	private Map<String, String> phrases = Map.of(
			"Hello", "Ellohay",
			"Pig Latin", "Igpay Atinlay",
			"The first month is Janurary", "Ethay irstfay onthmay isway Anuraryjay",
			"The floor is sticky", "Ethay oorflay isway ickystay"
	);

	public Program() {
		for (Map.Entry<String, String> pair : phrases.entrySet()) {
			testEquals(pair.getKey(), pair.getValue(), translateEnglishToPigLatin(pair.getKey()));
		}
	}

	private String translateEnglishToPigLatin(String english) {
		// TODO
		return "";
	}

	private void testEquals(String input, String expect, String actual) {
		if (expect.toLowerCase() == actual.toLowerCase()) {
			if (expect != expect.toLowerCase() && expect == actual) {
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

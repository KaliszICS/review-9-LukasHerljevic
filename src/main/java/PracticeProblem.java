public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int lettersToFive(String str, char ch) {
		int count = 0;
		int index = 0;
		while (index < str.length() && count < 5) {
			if (str.charAt(index) == ch) {
				count++;
			}
			index++;
		}
		if (count == 5) {
			return index;
		} else {
			return -1;
		}
	}

}

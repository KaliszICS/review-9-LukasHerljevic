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

		public static int countLetter(String text, char target) {
    int count = 0;

    for (int i = 0; i < text.length(); i++) {
        if (text.charAt(i) == target) {
            count++;
        }
    }

    return count;
}

	}public static int oddSum(int num1, int num2) {
    
    int start = Math.min(num1, num2);
    int end = Math.max(num1, num2);
    
    int sum = 0;

    for (int i = start; i <= end; i++) {
        
        if (i % 2 != 0) {
            sum += i;
        }
    }

    return sum;
}

}

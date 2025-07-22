package assignments;

public class Assignment15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "Java programming is fun and challenging";

		int length = sentence.length();
		System.out.println("Total no of char available in the sentence: " + length);

		String lowercaseValue = sentence.toLowerCase();
		System.out.println("Convert Lowercase" + lowercaseValue);
		// print reverse
		String reverseString = "";
		for (int i = sentence.length() - 1; i >= 0; i--) {
			reverseString += sentence.charAt(i);

		}
		System.out.println("Reversed string:" + reverseString);
	}

}

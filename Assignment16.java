package assignments;

public class Assignment16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";
		int length = paragraph.length();
		System.out.println("Total no of occurence in the paragraph: " + length);

		String wordToFind = "Java";
		int count = 0;
		int index = 0;

		// System.out.println("Searching for word: " + wordToFind);
		System.out.println("Paragraph: " + paragraph);

		// Search for all occurrences of "Java"
		while ((index = paragraph.indexOf(wordToFind, index)) != -1) {
			System.out.println("Found at index: " + index);
			count++;
			index += wordToFind.length();
		}

		System.out.println("\nTotal number of occurrences of '" + wordToFind + "': " + count);
	}

}

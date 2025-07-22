package assignments;

public class Assignment18a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "race a car";

		// Remove all non alphabetic char
		String splchar = value.replaceAll("[^a-zA-Z]", "");
		System.out.println("Remove alphabets from the string: " + splchar);

		// check palindrome then true
		String reversed = new StringBuilder(splchar).reverse().toString();

		boolean isPalindrome = splchar.equals(reversed);

		System.out.println("Output: " + isPalindrome);
		// print plaindrome or not
		if (splchar.equals(reversed)) {
			System.out.println("The string is a palindrome.");
		} else {
			System.out.println("The string is not a palindrome.");
		}
	}

}

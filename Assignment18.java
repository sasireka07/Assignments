package assignments;

public class Assignment18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "A man, a plan, a canal: Panama";

		// Convert to lowercase
		String toLowercase = value.toLowerCase();
		System.out.println("Original Value: " + toLowercase);

		// Remove all non alphabetic char
		String splchar = toLowercase.replaceAll("[^a-zA-Z]", "");
		System.out.println("Remove alphabets from the string: " + splchar);

		// check palindrome then true
		String reversed = new StringBuilder(splchar).reverse().toString();

		boolean isPalindrome = splchar.equals(reversed);

		System.out.println("Output: " + isPalindrome);
		// print plaindrome or not
		if (splchar.equals(reversed)) {
			System.out.println("The string is a palindrome.");
		} else {
			System.out.println("The string is NOT a palindrome.");
		}
	}

}

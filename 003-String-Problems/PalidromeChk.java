package Strings;

public class PalindromeStr {

	public static void main(String[] args) {

		String str = "namana";
		System.out.println("The string is: "+str);
		String temp="";
		for(int i = str.length()-1; i>=0; i--) {
			temp += str.charAt(i);
		}
		
		//check if contents of both the strings are equal
		if(temp.equalsIgnoreCase(str)) {
			System.out.println("The string is palindrome");
		}
		else {
			System.out.println("The string is palindrome");
		}
	}
}

	
/*
 * For a password to be valid, it must meet all of the following rules. 
 - The password doesn't already exist in the array list
 - The password is between 7 and 12 characters exclusive 
 - The password has at least one number, but any password with a 6 is not allowed 
 - Spaces are not permitted in passwords 
 - The password must contain at least 2 capital vowels (Count y as a vowel, repeated vowels are allowed like in BOOK or EYE) 
 - The words "admin" and "mod" may be used as passwords and ignores other rules save for one: the password should only be added if it isn't already in the array list. 	
 */
				
		import java.util.ArrayList;
		import java.util.Arrays;
		import java.util.Scanner;

		public class PasswordTDD {
			
			
			public static Scanner sc = new Scanner(System.in);
			
			
			public static ArrayList<String> passwordList = new ArrayList<String>(
					Arrays.asList("admin", "BUGGY55", "RAYLEIGH77", "SCOpper88", "CROCUS99", "R0gER3","HellOO11@"));

			public static void main(String[] args) {
				System.out.print("Please Enter a password : ");				
				String word = sc.nextLine();

				System.out.println(passwordValidate(word, passwordList));

			}

			public static boolean inList(String word) {
				if (passwordList.contains(word)) {
					System.out.println(" password is in current list");
					return false;
				} else {
					return true;
				}
			}

			public static boolean passwordLength(String word) {
				if (word.length() < 7 || word.length() > 12) {
					System.out.println(" password must be 8 to 11 characters");
					return false;
				} else {
					return true;
				}
			}

			public static boolean passwordNumber(String word) {
				char ch;
				boolean isNum = false;
				for (int i = 0; i < word.length(); i++) {
					ch = word.charAt(i);
					if (Character.isDigit(ch) && ch != '6') {
						isNum = true;
					}
				}
				if (isNum == false) {
				System.out.println(" password can not contain number 6 ");
				}
				return isNum;
			}

			public static boolean passwordSpace(String word) {
				if (word.contains(" ")) {
					System.out.println(" password can not have space in between");
					return false;
				} else
					return true;
			}

			public static boolean passwordVowel(char c) {
				char[] vowels = { 'A', 'E', 'I', 'O', 'U', 'Y' };
				String a = String.valueOf(c);
				String b = new String(vowels);
				if (b.contains(a)) {
					return true;
				} else {
			//		System.out.println(" password does not contain two Vowel");
					return false;
				}
			}

			public static boolean passwordCapitalVowel(String word) {
				boolean vowels = false;
				int num = 0;
				for (char c : word.toCharArray()) {
					if (passwordVowel(c)) {
						System.out.println(" Counter for Vowel : " + num );
						num++;
					}
					if (num >= 2) {
						vowels = true;
					}
				}
				if (vowels == false) {
				System.out.println(" password needs atleast 2 Capital Vowels");
				}
				return vowels;
			}

			public static boolean passwordValidate(String word, ArrayList<String> passwordList ) {
				if ((passwordLength(word) && passwordNumber(word) && passwordSpace(word) && passwordCapitalVowel(word)
						&& inList(word)) == true || (word.equalsIgnoreCase("mod") && inList(word) == true)
						|| (word.equalsIgnoreCase("admin") && inList(word) == true)) {
					System.out.println(" Adding to the current List !!");
					passwordList.add(word);
					System.out.println(passwordList);
					return true;
				} else {
					return false;
				}
			}
		}
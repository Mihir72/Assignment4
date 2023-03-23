
import java.util.Scanner;

public class Solution5 {
	
	static String replaceSpaces(String input) {
		String output = "";
		for(int i = 0; i < input.length(); ++i) {
			if(input.charAt(i) != ' ') {
				output += input.charAt(i);
			}
		}
		
		return output;
	}
	
	static boolean isAnagram(String input1, String input2) {
		input1 = replaceSpaces(input1);
		input2 = replaceSpaces(input2);  // there is inbuild method which is generalized method for string but i had created my own for a specific purpose for the sake of maintianing the logic wriiten by me not using all inbuild method
		
		input1 = input1.toLowerCase();
		input2 = input2.toLowerCase();
		
		int arr1[] = new int[26];
		int arr2[] = new int[26];
		
		
		for(int i = 0; i < input1.length(); ++i) {
			if(input2.length() > i)
				arr2[input2.charAt(i)-97] += 1;
			arr1[input1.charAt(i)-97] += 1;
		}
		
		for(int i = 0; i < arr1.length; ++i) {
			if(arr1[i] != arr2[i])
				return false;
		}
		return true;
	}

	public static void main(String...args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the two strings one by one");
		String str1 = s.nextLine();
		String str2 = s.nextLine();
		
		boolean flag = isAnagram(str1, str2);
		if(flag)
			System.out.print("Yes both the strings are anagram to each other");
		else
			System.out.print("No the strings are not anagram to each other");
		
		
	}
	
}

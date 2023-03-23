import java.util.Scanner;

public class Solution8{


 static void maxFreq(String input) {
		
		int arr[] = new int[256];
		int max = 0;
		
		for(int i = 0; i < input.length(); ++i) {
				 arr[input.charAt(i)] += 1;
			     if(arr[i] > max)
			    	 max = arr[i]; 
		}
		
		
		
		for(int i = 0; i < input.length(); ++i) {
			if(arr[input.charAt(i)] == max) {
				System.out.print(input.charAt(i));
                                                                                return;

			}
		}
		
		
		
	}

public static void main(String...args){

Scanner s = new Scanner(System.in);
System.out.println("Enter your string");
String str = s.nextLine();
maxFreq(str);



}




}
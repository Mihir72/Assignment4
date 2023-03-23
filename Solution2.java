import java.util.Scanner;
import java.util.HashMap;
public class Solution2{


static void printDuplicates(String input){// here i am using the array of 256 size because the user will enter the string should be in any format either in the lower case or in upper case or in the mixed case so based on that i have to print the characters becuase according to java the things are case sensitive matters here for an example a and A both are different 

 int arr[] = new int[256];
 for(int i = 0; i < input.length(); ++i){
  
  arr[input.charAt(i)] += 1;
if(arr[input.charAt(i)] ==2)
  System.out.print(input.charAt(i) + " ");
}

}

public static void main(String[]args){

System.out.println("Enter your string");
Scanner s = new Scanner(System.in);
String str = s.next();
printDuplicates(str);



}



}
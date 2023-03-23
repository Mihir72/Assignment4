import java.util.Scanner;

public class Solution6{

static boolean isPangram(String input){

 input = input.replace(" ", "");
 input = input.toLowerCase();
 
int arr[] = new int[26];
for(int i  = 0; i < input.length(); ++i){
            arr[input.charAt(i) - 97] += 1;
  }

for(int i = 0; i < arr.length; ++i){
     if(arr[i] == 0)
          return false;
}


return true;


}


public static void main(String...args){

System.out.println("Enter the string and check whether your string is pangram or not");
Scanner s = new Scanner(System.in);
String str = s.nextLine();
boolean flag = isPangram(str);


if(flag)
System.out.print("Your given string is pangram");
else
System.out.print("No your given string is not a pangram because all the alphabets characters are not present there");




}





}
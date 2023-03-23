import java.util.Scanner;


public class Solution7{

static boolean isUnique(String input){
 int freq[] = new int[256];
 
for(int i = 0; i < input.length(); ++i){
             if(input.charAt(i) != ' ')
               freq[input.charAt(i)] += 1;
  }

for(int i = 0; i < input.length(); ++i){
           if(freq[input.charAt(i)] > 1)
              return false;
  }


return true;

}

public static void main(String...args){
System.out.println("Enter the your string");
Scanner s = new Scanner(System.in);
String str = s.nextLine();

boolean flag = isUnique(str);

if(flag)
System.out.print("Yes your string contains all unique character");
else
System.out.print("No your string doesn't contains all unquie character");




}




}
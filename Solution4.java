import java.util.Scanner;

public class Solution4{

static int totalConsonent(String input){
	      int count = 0;
	      for(int i = 0; i < input.length(); ++i){
	          char temp = input.charAt(i);
	         if((temp >= 65 && temp <= 90) || 
                               (temp >= 97 && temp <= 122) &&
                                !((temp == 'a'  || temp == 'A')
	             || (temp == 'e'  || temp == 'E')
	             || (temp == 'i'  || temp == 'I')
	             || (temp == 'o' || temp == 'O')
	             || (temp == 'u' || temp == 'U')))
	          count++;
	}


	return count;
	}


	static int totalVowels(String input){
	int count = 0;
	      for(int i = 0; i < input.length(); ++i){
	          char temp = input.charAt(i);
	         if((temp == 'a'  || temp == 'A')
	             || (temp == 'e'  || temp == 'E')
	             || (temp == 'i'  || temp == 'I')
	             || (temp == 'o' || temp == 'O')
	             || (temp == 'u' || temp == 'U'))
	          count++;
	}


	return count;

	}



	static int totalSpecialCharater(String input){

	 int count = 0;

	  for(int i = 0; i < input.length(); ++i){
	     char temp = input.charAt(i);
	     if((temp >= 32 && temp <=47) ||
	         (temp >= 58 && temp <= 64) ||
	          (temp >= 91 && temp <= 96) ||
	          (temp >= 123 && temp <= 126) )
	     count++;

	}

	return count;
	}

public static void main(String...args){

System.out.println("Enter the string of your choice and you will get it's corresponding consonents, vowels and special characters present there");
Scanner s = new Scanner(System.in);
String str = s.next();
int conso = totalConsonent(str);
int vow = totalVowels(str);
int spec = totalSpecialCharater(str);

System.out.println("total no of consonent in the input string is: "+ conso);
System.out.println("total no of vowels in the input string is: " + vow);
System.out.println("total no of special characters in the input string is : " + spec);







}






}
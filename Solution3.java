

public class Solution3{


public static void main(String...args){

 String str = "2552"; // according to question it has been mentioned to wap for this test case only though i am not taking any string as an input explicitly
 
  int low = 0;
  int high = str.length() - 1;
  boolean isPalindrome = true;

while(low < high){
 
  if(str.charAt(low) != str.charAt(high)){
      isPalindrome = false;
      break;
}

low++;
 high--;
}


if(isPalindrome)
  System.out.print("Yes the input string " + str + "  is palindrome");

else 
System.out.print("No the input string " + str + " is not palindrome");

}



}
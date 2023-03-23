import java.util.HashMap;

public class Solution1{

static String removeDuplicates(String input){
   HashMap<Character,Integer> hm = new HashMap<>();
   String output = "";
    for(int i = 0; i < input.length(); ++i){
           if(!hm.containsKey(input.charAt(i))){
                     hm.put(input.charAt(i), 1);
                  output += input.charAt(i);
         }                                                          // here is no need of else block because we had completed our target with only if block though there is no point of writtig else statement where we need to do some operation on map
}


return output;

}// Time Complexity : O(n)
 // Space Complexity : O(n)-> when no element is duplicates, here we know that there is duplicate element for a particular test case


static String removeDuplicates2(String input){
    int arr[] = new int[26];
   // as we know here all the test cases i had taken on all are in lower case though we don't require here to convert the string into any specific case for which we could write our code
   
   String output = "";
   for(int i = 0; i < input.length(); ++i){
           if( (arr[input.charAt(i)-97] += 1) == 1)
                   output += input.charAt(i);
// here we don't need to do any operation on else part though i am not writting anything into it
            
}

return output;

}

public static void main(String[]args){



  String str = "abcabacabc";
    System.out.println("string before removing: "+ str);  
   // str = removeDuplicates(str);  --> although this method is general purpose method to remove duplicates for any kind of string i am writting the still another logic for more clearity
   
   str = removeDuplicates2(str);
System.out.print("string after removing duplicates: "+ str);
   




} // Note :- all the methods i had written here are all general purpose method for a specific kind of problem that's not for this particular test case only






}
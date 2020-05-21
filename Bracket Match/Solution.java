import java.io.*;
import java.util.*;

class Solution {
  
  static int bracketMatch(String text) {
    // your code goes here
    
    // iterate String 
    // check the opening bracket 
    // ending bracket 
    // mismatch --> increase the count 
    // else add the ream stack
    /**

( )  )(
  ^
*/
    
    Stack<Character> stack = new Stack<>();
    int count = 0;
    for(char c : text.toCharArray()){
      if(c == '('){
        stack.push(c);
      }else if(c == ')'){
        if(!stack.empty() && stack.pop() == '('){
           
        }else {
          count++;
        }
      }
    }
       
    count += stack.size();
    
    return count;
  }

  public static void main(String[] args) {
    String text = "())(";
     System.out.println(bracketMatch(text));
                  
  }

}

/**

() | )(

(())() - > 0

*/
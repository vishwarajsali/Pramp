import java.util.*;
// dog , frog = og = 3
// dog, frgo = 7
// sali.vishwaraj@gmail.com
// 7132109235 vish
// chrisgarcia769@gmail.com
// 7085573354
class Solution {

  static int deletionDistance(String str1, String str2) {
    // your code goes here
    int s1 = str1.length();
    int s2 = str2.length();
    
    int[][] dp = new int[s1][s2];
    
    for(int i =0; i< s1; i++){
      for(int j = 0; j< s2; j++){
        if(i == 0) dp[i][j] = j;
        else if(j == 0)dp[i][j] = i;
        else if(str1.charAt(i-1) == str2.charAt(j-1)){
          dp[i][j] = dp[i-1][j-1];
        }
        else{
          dp[i][j] = 1 + Math.min(dp[i-1][j], dp[i][j-1]);
        }
      }
    }
    
   return dp[s1-1][s2];
  }

  public static void main(String[] args) {
    String str1 = "dog", str2 = "frog";
    System.out.println(deletionDistance(str1, str2));
  }

}
 import java.util.*;

class Solution {
  
  static double findGrantsCap(double[] grantsArray, double newBudget) {
    // your code goes here
    
    int len = grantsArray.length;
    Arrays.sort(grantsArray);
    double total = 0, count = 0; //80
    for(double i : grantsArray){
      double newlen = len - count;
      
      if(i * newlen > (newBudget - total)){
        return (newBudget - total)/ newlen;
      }
        count++;
        total += i;
    }
     
    return -1;
    
  //flexton  
    
  }

  public static void main(String[] args) {
    double[] grantsArray = {2, 100, 50, 120, 1000};
    double newBudget = 190;
      System.out.println(findGrantsCap(grantsArray,newBudget));
  }

}

/*
2,100,50,120,167  -  400 
400 - 439 

Time Complexity: sorting the grants array takes O(N⋅log(N)), calculating the surplus is O(N) due to the grants summation, and finally the for loop takes another O(N). In total, the time complexity is O(N⋅log(N)) before sorting and O(N) after sorting.

*/
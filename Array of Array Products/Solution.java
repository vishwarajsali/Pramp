import java.io.*;
import java.util.*;

class Solution {
  
  static int[] arrayOfArrayProducts1(int[] arr) {
    
    if(arr == null || arr.length <= 1) return new int[0];
    // your code goes here
    int[] output = new int[arr.length];
    for(int i = 0; i < arr.length; i++){
      int prod = 1; 
      for(int j = 0 ; j < arr.length; j++){
        if(i != j){
          prod *= arr[j];
        }
      }
      output[i] = prod;
    }
    
    return output;
  }
  
  static int[] arrayOfArrayProducts(int[] arr) {
    
    if(arr == null || arr.length <= 1) return new int[0];
    // your code goes here
    int len = arr.length;
    int[] output = new int[len];
    output[0] = 1;
    for(int i = 1; i<len; i++ ){
        output[i] = output[i-1] * arr[i-1];
    }

    int prod = 1;
    for(int j = len-1; j>=0; j-- ){
        output[j] = output[j] * prod;
        prod *= arr[j];

    }


    return output;
  
  }


  // Time = o(n2) space = O(n)
  public static void main(String[] args) {
    System.out.println(Arrays.toString(arrayOfArrayProducts(new int[] {2,3,0,982,10})));
  }

}


/*
 
 8, 10, 2
 
    
 
 10 * 2 , 8 *2 , 8*10
 
    ->
           8,   10,  2
   
   
  dp1[] =  1   8*1   10*(8*1)
  
                      <-
           8,     10,  2
  
  dp2[]                1
           10*(2*1)  2*1
           
           
           
           
           
  
   
    10*2, 8*2, 8*10
    
    
    
 
 

  arr->  8, 10, 2
  for i 0 -> len
    for j 0 -> len
      if i != j 
        
  
  _____________
  
  [20, 16, 80] # by calculating: [10*2, 8*2, 8*10]

  20 = 

*/

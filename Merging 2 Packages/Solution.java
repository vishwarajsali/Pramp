import java.io.*;
import java.util.*;

class Solution {

  static int[] getIndicesOfItemWeights(int[] arr, int limit) {
    // your code goes here
    
    HashMap<Integer, Integer> map = new HashMap<>();
    
    for(int i = 0; i< arr.length; i++){
      if(map.containsKey(arr[i])){ 
        return new int[]{i,map.get(arr[i])};
      }else {
        map.put(limit - arr[i], i);
      } 
    }
    
    return new int[0];
  }

  public static void main(String[] args) {
    int[] arr = {4, 6, 10, 15, 16};
    int lim = 21;
    System.out.println(Arrays.toString(getIndicesOfItemWeights(arr, lim)));
  }

}

/**

arr
find two number with the sum of the lim 
map -> lim - ar[i], i 
return map[i] curr

key => lim - ar[i] 
value -> i 


4, 6, 10, 15, 16 | 21 

21 -6 - 15, 1


*/
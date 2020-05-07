 
import java.util.*;

class Solution {

  static int getDifferentNumber(int[] arr) {
    // your code goes here
    
    HashSet<Integer> set = new HashSet<>();
    for(Integer i : arr){
      set.add(i);
    }
     
    
    int res = 0; 
    
    //set.contains("4")
    
    while(set.contains(res)) res++;
    
    return res;
  }

  public static void main(String[] args) {

  }

}

/**

0 - max 

4 5 6 1 2 3

11 1 4 24 

5 ,6, 2 ,3 1 => 1 2 3 5 6

res = 0


0,1,2,3,5,6
res = 4

nlogn+n = nlogn

O(n), O(n)/O(1)

one loop


*/
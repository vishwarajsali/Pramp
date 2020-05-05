class Solution {
  
  static int indexEqualsValueSearch(int[] arr) {
    // your code goes here
    int output = Integer.MAX_VALUE;
    int start = 0, end = arr.length-1;
    while(start<= end){
      int mid = start + (end - start)/2;
      
      if(arr[mid] == mid){
         output = Math.min(output, mid);
        end = mid-1;
      }else if(arr[mid] < mid){
        start = mid +1;
      }else {
        end = mid-1;
      }
    }
    return output ==Integer.MAX_VALUE ? -1: output ;
  }
  
  /*
  0. 1 2 3  4  5
  -5,0,2,3,10,29
  
  
  0 1 2 3 4 5
         ^
    
  [-8,0,2,5]
          
  arr[i] - i < 0)
  */

  public static void main(String[] args) {
    System.out.println(indexEqualsValueSearch(new int[] {0,1, 2, 3, 4,5}));
  }

}

/**
0 1 2 3
-1,0,3,6
   ^
 0.1 2 3 4 5   
-8 0 2 3 5 6 -> 
       ^

  >
  <
  
  

mid == num 
return 
if(mid > arr[mid]){
start = mid +1;
}else {
end = mid -1;
}
*/
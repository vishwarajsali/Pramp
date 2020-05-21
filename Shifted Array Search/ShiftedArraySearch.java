

public class ShiftedArraySearch {

  static int shiftedArrSearch(int[] shiftArr, int num) {
    // your code goes here
    int peek = findPeek(shiftArr);
    int start = 0, end = shiftArr.length-1;
    if(shiftArr[start] > num){
      start = peek;
    }else if(shiftArr[end] > num) {
      end = peek;
    }
    
    while(start < end){
      int mid = start  +(end - start)/2;
      if(shiftArr[mid] == num){
        return mid;
      }else if(shiftArr[mid] < num) {
        start = mid;
      }else {
        end = mid;
      }
    }
    
    
    return -1;
  }
  
  static int findPeek(int[] arr){
    int index = -1;
    
    int start = 0, end = arr.length;
    while(start <= end){
      int mid = start + (end - start)/2;
      if(arr[mid] < arr[mid-1]){
        end = mid;
      }else if(arr[mid] < arr[mid+1]) {
        start = mid;
      }else {
        return mid;
      }
        
    }
    
    
    return index;
    
  }

  public static void main(String[] args) {
    int[]  shiftArr = {9, 12, 17, 2, 4, 5};
    int num = 2;
      
      System.out.println(shiftedArrSearch(shiftArr, num));
  }

}
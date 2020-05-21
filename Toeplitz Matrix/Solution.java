 
class Solution {

	static boolean isToeplitz(int[][] arr) {
		// your code goes here
    
    for(int row = 0; row < arr.length; row++){
      for(int col = 0; col < arr[0].length; col++){
        
        if(row > 0 && col > 0 && (arr[row][col] != arr[row-1][col-1])){
          return false;
        }
      }
    }
    
    return true;
	}

	public static void main(String[] args) {
	
	}
}



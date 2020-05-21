
public class Solution {
	
  static int findBusiestPeriod(int[][] data) {
    // your code goes here
   int visitors = 0;
    int maxVisitors = Integer.MIN_VALUE;
    int timeStamp = data[0][0];
    int len = data.length -1;
    for(int i = 0; i<= len; i++){
      
      if(data[i][2] == 1){
        visitors+= data[i][1];
      }else {
        visitors-= data[i][1];
      }
       
      if( i == len  ||data[i][0] != data[i+1][0]){
        
        if(maxVisitors < visitors){
          maxVisitors= visitors;
          timeStamp = data[i][0];
        }
      }
    }
    return timeStamp;
  }

  public static void main(String[] args) {

  }

}
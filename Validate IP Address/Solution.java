 

class Solution {

	static boolean validateIP(String ip) {
		// your code goes here
    String[] ips = ip.split("\\.");
    System.out.println(Arrays.toString(ips));
    if(ips.length != 4) return false;
    System.out.println(Arrays.toString(ips));
    
    for(String s : ips){
      int b;
      try{
        b = Integer.parseInt(s);
        if(b<0 || b> 255)return false;
      }catch(Exception e){
        return false;
      }
    }
    
    return true;
	}

	public static void main(String[] args) {
    System.out.println(validateIP("12.34.5.6"));
	}
}

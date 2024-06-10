// Binary to Decimal

class Solution {
    public int binary_to_decimal(String str) {
        // Code here
      
      
       int len = str.length();
       
       int sum = 0;
       int i = 0;
       
       while(len > i){
           int rem = str.charAt(len - 1 -i) - '0';
           sum += rem * Math.pow(2 , i++);
           
       }
       return sum;
    
        
    }
}


package business;

/**
 *
 * @author amadou diallo
 */
public class LetterCodeLogic {
    
    public static String Encode(String msg) {
       String result = "",m;
        char c;
        int x;
        
            m = msg.toUpperCase() + "(from Encode)";
        for (int i = 0; i < m.length(); i++) {
           c = m.charAt(i);
           x = c; // char and int are equivalent based on ASCII
           
        if (x == 32) {
               x = 0;
               
           } else {
               x -= 64;
        if (x < 1 || x > 26) {
               x = 99;
           }
               
           } result += String.valueOf(x) + " ";
           
       }
        
        
        
        return result;
    }
      public static String Decode(String msg) {
          //should be numbers separated by commas:
          //ex: "1,2,24,0,25"
          String result = "";
          int x;
          char c;
          String[] nums = msg.split(",");
          //for the examples;
          //nums [0] = "1"
          //nums [1] = "2"
          //nums [2] = "24"
          //nums [3] = "0"
          //nums {4} = "25"
          
       for (int i=0; i < nums.length; i++) {
           try {
               x = Integer.parseInt(nums[i]);
               
               if (x == 0) {
                   c = ' ';
               } else if (x < 1 || x > 26) {
                   c = '?';
               } else {
                   c = (char) (x + 64);
                   
               }
           } catch (NumberFormatException e) {
               c = '?';
               
           }
           result += c;
       }
          
          
        
          return result;
      }
    
}

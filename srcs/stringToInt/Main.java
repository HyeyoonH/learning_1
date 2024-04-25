
class Solution{
    // public boolean isDigit(char c) {
    //     return (c >= '0' && c <='9');     
    // }
    public int myAtoiSolution1(String s) {
        s = s.replace(" ", "");
        boolean isNegative = false;
        int i = 0;
        try{
            if(s.charAt(0) == '-'){
                isNegative = true;
                i = 1;
            } else if(s.charAt(0) == '+'){
                i = 1;
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        int result = 0;
        // while(i < s.length() && isDigit(s.charAt(i))){
        while(i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            
            System.out.println("digit: " + digit);

            // validate the value of digit & result
            if(isNegative && (result > (Integer.MIN_VALUE*-1 - digit)/10)){
                System.out.println(result);
                System.out.println((Integer.MIN_VALUE - digit)/10);
                return Integer.MIN_VALUE;
            } else if (!isNegative && (result > (Integer.MAX_VALUE - digit)/10)){
                System.out.println(result);
                return Integer.MAX_VALUE;
            }
            
            System.out.println(result);

            result = result*10 + digit;
            i++;
        }
        
        return (isNegative ? result*-1 : result);
    }

    // Passes all test cases
    public int myAtoi(String s) {
        final int MAX_LAST_DIGIT = Integer.MAX_VALUE % 10;
        final int MIN_LAST_DIGIT = Integer.MIN_VALUE % 10;

        s = s.trim();
        if (s.length() ==0) return 0;

        int i=0;
        int sign = 1;
        if(s.charAt(0) == '-'){
            i = 1;
            sign = -1;
        }
        if(s.charAt(0) == '+'){
            i = 1;
        }

        int result =0;
        while(i < s.length() && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';

            if(sign > 0){
                if((result > (Integer.MAX_VALUE/10)) || ((result == (Integer.MAX_VALUE/10)) && digit > MAX_LAST_DIGIT)){
                    return Integer.MAX_VALUE;
                }
            } else {
                if(((result*-1) < (Integer.MIN_VALUE/10)) || ((result*-1 == (Integer.MIN_VALUE/10)) && digit*-1 < MIN_LAST_DIGIT)){
                    return Integer.MIN_VALUE;
                }
            }
            result = result*10 + digit;

            i++;
        }
       return result*sign;
    }
}

public class Main{
    public static void main(String[] atgs){
        Solution s = new Solution();
        s.myAtoi(null);

    }
}
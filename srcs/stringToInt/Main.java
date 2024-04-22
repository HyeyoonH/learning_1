Class Solution{
    public boolean isDigit(char c) {
        return (c >= '0' && c <='9');     
    }
    
    public int myAtoi(String s) {
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
}


public class Main{
    public static void main(String[] atgs){

    }
}
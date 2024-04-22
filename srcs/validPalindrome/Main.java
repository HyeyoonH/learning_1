class Solution{

    public boolean isPalindromeCharAt(String s) {
        s = s.toLowerCase();
        StringBuffer sb = new StringBuffer();
        char[] charArray = s.toCharArray();
        for(char c: charArray){
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }

        int forwardPointer = 0;
        int backwardPointer = sb.length() -1;
        while(forwardPointer < backwardPointer){
            if(sb.charAt(backwardPointer--) != sb.charAt(forwardPointer++)){
                return false;
            }
        }
        return true;
    }

    public boolean isPalindromeRegex(String s) {
        String pattern = "[^a-zA-Z\\d]";
        s = s.toLowerCase();
        s = s.replaceAll(pattern, "");
        System.out.println(s);
        
        for(int forwardPointer=0, backwardPointer = s.length()-1; forwardPointer < (s.length()/2); forwardPointer++, backwardPointer--){
            if (s.charAt(forwardPointer) != s.charAt(backwardPointer)) {
                return false;
            }
        }
       
        return true;
    }
}

public class Main{
    public static void main(String[] args){
        String input = "A man, a plan, a canal: Panama";
        // System.out.println(new Solution().isPalindromeRegex(input));
        System.out.println(new Solution().isPalindromeCharAt(input));

    }

}
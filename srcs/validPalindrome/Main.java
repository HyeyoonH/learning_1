class Solution{
    public boolean isPalindrome(String s) {
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

    }

}
import java.util.*;

class Solution{
        
    public int minLen(String[] strs){
        int minLen = strs[0].length();
        for(String s: strs){
            minLen = Math.min(s.length(), minLen);
        }
        return minLen;
    }
    public String longestCommonPrefix(String[] strs) {
        StringBuffer sb = new StringBuffer();
        int minLen = minLen(strs);
        if(minLen == 0 || strs == null) return "";
        if(strs.length ==1) return strs[0];
        
        Arrays.sort(strs);
         for(int position=0; position < minLen; position++){
           char c = strs[0].charAt(position);
             for(int i=1; i < strs.length; i++){
               if(c != strs[i].charAt(position)){
                   return String.valueOf(sb);
               } else {
                   if(i == strs.length-1){
                       sb = sb.append(c);
                   }
               }
               
            }
        }
        // return sb.toString(); toString() also works.
        return String.valueOf(sb);
    }

}


public class Main {
    public static void main(String[] args){
        
        Solution solution = new Solution();
        String[] input1 = {"flower","flow","flight"};
        String[] input2 = new String[]{"dog","racecar","car"};

        System.out.println(solution.longestCommonPrefix(input1));

    }
}
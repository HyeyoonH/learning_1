import java.util.*;

class Solution {
    public int mapMethod(String s){
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            if (map.containsKey(c)){
                map.put(c, map.get(c) +1);
            } else {
                map.put(c, 1);
            }
        }
        
        for(int j=0; j < s.length(); j++){
            if(map.get(s.charAt(j)) ==1){
                return j;
            }
        }
        
        return -1; 
    }
    
    public int arrayMethod(String s){
        int[] alphabetArray = new int[26];
        
        for(int i=0; i < s.length(); i++){
            int j = s.charAt(i) - 'a';
            alphabetArray[j] +=1;
        }
        
        for(int k =0; k < s.length(); k++){
            int indexOfChar = s.charAt(k) -'a';
            if(alphabetArray[indexOfChar] ==1){
                return k;   
            }
        }
        return -1;
    }

    public int firstUniqChar(String s) {
        return mapMethod(s);
    }

}


public class Main{
    public static void main(String[] args){
        Solution solution = new Solution();
        String s = "leetcode";

        System.out.println(solution.firstUniqChar(s));

    }

}
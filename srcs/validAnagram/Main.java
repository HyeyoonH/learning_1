import java.util.*;

class Solution{
    public boolean usingCharArray(String s, String t){
        if(s.length() != t.length()){
            return false;
        }    
        char[] charArrayS = s.toCharArray();
        char[] charArrayT = t.toCharArray();

        Arrays.sort(charArrayS);
        Arrays.sort(charArrayT);
        
        return Arrays.equals(charArrayS, charArrayT);
        
        // for(int i=0; i < s.length(); i++){
        //     if (charArrayS[i] != charArrayT[i]){
        //         return false;
        //     }
        // }
        //  return true;
    
    }
    
    public boolean usingHashMap(String s, String t){
        Map<Character, Integer> map = new HashMap<Character, Integer>();
         
         for(int i=0; i < s.length(); i++){
             if(map.containsKey(s.charAt(i))){
                 map.put(s.charAt(i), map.get(s.charAt(i)) +1);
             } else {
                 map.put(s.charAt(i), 1);
             }
         }
         
         for(int j=0; j < t.length(); j++){
             if(map.containsKey(t.charAt(j))){
                 map.put(t.charAt(j), map.get(t.charAt(j))-1);
             } else {
                 return false;
             }    
         }
         
        //  for(Map.Entry<Character, Integer> entry: map.entrySet()){
        //      if(entry.getValue() !=0){
        //          return false;
        //      }
        //  }
        for(int count: map.values()){
            if(count != 0){
                return false;
            }
        }
         return true;
     }
     
     public boolean usingArray(String s, String t){
         int[] intArray = new int[26];
         s = s.toLowerCase();
         t = t.toLowerCase();
         
         for(int i=0; i < s.length(); i++){
             int index = s.charAt(i) -'a';
             intArray[index] = intArray[index]+1;
         }
         
         for(int j=0; j < t.length(); j++){
             int index = t.charAt(j) -'a';
             intArray[index] = intArray[index] - 1;
         }
         
         for(int count: intArray){
             if(count !=0){
                 return false;
             }
         }
         
         return true;
     }
     
     public boolean isAnagram(String s, String t) {
         // return usingHashMap(s,t);
         return usingArray(s,t);
     }
}


public class Main{
    public static void main(String[] args){
        String s = "anagram";
        String t = "nagaram";
        
        System.out.println(new Solution().usingCharArray(s, t));
    }
}
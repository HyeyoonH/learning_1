class Solution{
        
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) return strs[0];

        int minStrLength = strs[0].length();
        for(int i=1; i< strs.length; i++){
            if(strs[i].length() < minStrLength){
                minStrLength = strs[i].length();
            }
        }
    
        StringBuffer sb = new StringBuffer();
        for(int j=0; j < minStrLength; j++){
            char c = strs[0].charAt(j) ; 
            boolean same = true;
            for(int k=1; k < strs.length; k++){
                if(c != strs[k].charAt(j)){
                    same = false;
                    break;
                }
            }
            if (!same) break;
            sb.append(c);
        }

    return sb.toString();
    }

}


public class Main {
    public static void main(String[] args){

    }
}
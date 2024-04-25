class Solution{
    public int firstSolution(String haystack, String needle){
        int firstIndex = -1;
        for(int i=0; i < haystack.length(); i++){
            firstIndex = i;
            for(int j=0; j < needle.length();j++){
                if(haystack.charAt(i++) == needle.charAt(j)){
                    System.out.println("J: " + firstIndex);
                    if(j == needle.length()-1) {
                        return firstIndex;
                    }
                }else {
                    j=0;
                    i = firstIndex +1;
                    firstIndex = -1;
                    break;
                }
            }
        }
        return firstIndex;   
    }

    public int secondSolution(String haystack, String needle){
        for(int firstIndex = 0; firstIndex <= haystack.length() - needle.length(); firstIndex++){
            for(int i=0; i < needle.length(); i++){
                if(needle.charAt(i) != haystack.charAt(firstIndex+i)){
                    break;
                } else if (i == (needle.length()-1)){
                    return firstIndex;
                }
            }
        }
        return -1;
    }

    public int strStr(String haystack, String needle) {
        return secondSolution(haystack, needle);
    }
}

class Main {
    public static void main(String[] args){

    }
}
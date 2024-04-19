import java.util.*;
import java.io.*; 

class SolutionMethod {
    public int[] twoSum(int[] nums, int target) {
        // System.out.println(this.getClass().getPackage());

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i=0; i < nums.length; i++){
            map.put(i, nums[i]);
        }
        
        for(int j=0; j < map.size(); j++){
            int number = map.get(j);
            int complement = target - number;
            
            if(map.containsValue(complement)){
                for(int k=0; k < map.size(); k++){
                    if((k!=j) && (map.get(k) == complement)){
                        return new int[]{j, k};
                    }
                }
            }
        }
        return new int[]{-1,-1};
    }
    
}

public class Solution {
    public static void main(String[] args){
        SolutionMethod solution = new SolutionMethod();
        int[] input = {2,7,11,15};
        int[] restuls = solution.twoSum(input, 9);
        for(int index: restuls){
            System.out.println(index);
        }        
    }
}



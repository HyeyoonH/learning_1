class Solution {
    
    public int[] twoSum(int[] nums, int target) {
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



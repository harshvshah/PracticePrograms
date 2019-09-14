package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length < 2){
            return null;
        }
        Map<Integer, Integer> hashMap = new HashMap();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(hashMap.containsKey(complement)){
                return new int[]{hashMap.get(complement), i};
            }
            hashMap.put(nums[i], i);
        }
        return null;
    }
}

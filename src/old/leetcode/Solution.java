package old.leetcode;

import java.util.HashMap;
import java.util.Map;


/**
 * 集合中两个元素相加为target的元素
 * @author xiongying
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> result = new HashMap<>(nums.length);
        for(Integer j = 0; j < nums.length; j++){
            if(result.containsKey(target-nums[j]) && !j.equals(result.get(target-nums[j]))){
                return new int[]{j,result.get(target-nums[j])};
            }
            result.put(nums[j],j);
        }
        return new int[]{};
    }
}

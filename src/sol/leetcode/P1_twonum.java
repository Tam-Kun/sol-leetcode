package sol.leetcode;

import java.util.HashMap;

public class P1_twonum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] sol = new int[2];
        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(target-nums[i])) {
                sol[0] = i;
                sol[1] = map.get(target-nums[i]);
                break;
            }
            map.put(nums[i], i);
        }

        return sol;
    }

}

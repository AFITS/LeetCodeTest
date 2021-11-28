package LCTEST;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class W11281 {

    class Solution {
        public List<Integer> targetIndices(int[] nums, int target) {
            if (nums.length == 0) return null;
            Arrays.sort(nums);
            LinkedList<Integer> res = new LinkedList<>();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    res.add(i);
                }
            }
            return res;
        }
    }
}

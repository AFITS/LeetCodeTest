package 双指针;

import java.util.HashSet;

// 非双指针类型题目
public class LC1_两数之和 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public void twoSum1(int []nums, int target){
        HashSet<Integer > set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){

        }
    }


}

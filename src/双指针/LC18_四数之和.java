package 双指针;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class LC18_四数之和 {
    public static void main(String[] args) {
//        int nums[] = new int[]{1,0,-1,0,-2,2};
//        int nums[] = new int[]{-2, -1, -1, 1, 1, 2, 2};
        int nums[] = new int[]{0,0,0,1000000000,1000000000,1000000000,1000000000};
        Solution solution = new Solution();
        System.out.println(solution.fourSum(nums, 1000000000));
    }

    static class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            List<List<Integer>> ans = new ArrayList<>();
            int n = nums.length;

            if (n < 4) return ans;
            Arrays.sort(nums);

            for (int first = 0; first < n - 3; first++) {
                if (first >= 1 && nums[first] == nums[first - 1]) {
                    continue;
                }

                if ((long)nums[first] + nums[first + 1] + nums[first + 2] + nums[first + 3] > target) break;
                if ((long)nums[first] + nums[n - 1] + nums[n - 2] + nums[n - 3] < target) continue;

                for (int second = first + 1; second < n - 2; second++) {
                    if (second > first + 1 && nums[second] == nums[second - 1]) continue;
                    if ((long)nums[first] + nums[second] + nums[second + 1] + nums[second + 2] > target) break;
                    if ((long)nums[first] + nums[second] + nums[n - 2] + nums[n - 1] < target) continue;

                    int tt = target - (nums[first] + nums[second]);
                    int left = second + 1;
                    int right = n - 1;
                    while (left < right) {
                        if (nums[left] + nums[right] == tt) {
                            ans.add(Arrays.asList(nums[first], nums[second], nums[left], nums[right]));
                            left++;
                            right--;
                            while (left < right && nums[left] == nums[left - 1]) left++;
                            while (left < right && nums[right] == nums[right + 1]) right--;
                        } else if (nums[left] + nums[right] < tt) {
                            left++;
                        } else {
                            right--;
                        }
                    }
                }
            }
            return ans;
        }
    }
}

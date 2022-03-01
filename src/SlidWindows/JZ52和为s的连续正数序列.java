package SlidWindows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JZ52和为s的连续正数序列 {
    public static int[][] findContinuousSequence(int target) {
        List<int[]> ans = new ArrayList<>();
        for (int l = 1, r = 2; l < r; ) {
            int sum = (r + l) * (r - l + 1) / 2;
            if (sum == target) {
                int[] num = new int[r - l + 1];
                for (int i = 0; i < num.length; i++) {
                    num[i] = i + l;
                }
                ans.add(num);
                l++;
            } else if (sum < target) {
                r++;
            } else {
                l++;
            }
        }
        return ans.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(findContinuousSequence(1001)));
        System.out.println(findContinuousSequence(15));
    }
}

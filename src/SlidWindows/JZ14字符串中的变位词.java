package SlidWindows;

import java.util.Arrays;

/**
 * JZ14 字符串中的变位词
 * s1的一种排列组合是s2的子串
 * <p>
 * 输入: s1 = "ab" s2 = "eidbaooo"
 * 输出: True
 * 解释: s2 包含 s1 的排列之一 ("ba").
 */
public class JZ14字符串中的变位词 {

    public static boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if (n > m) return false;

        int[] c1 = new int[26];
        int[] c2 = new int[26];
        for (int i = 0; i < n; i++) {
            ++c1[s1.charAt(i) - 'a'];   // s1分别统计
            ++c2[s2.charAt(i) - 'a'];   // s2分别统计
        }
        if (Arrays.equals(c1, c2)) return true;
        for (int i = n; i < m; i++) {
            ++c2[s2.charAt(i) - 'a'];   // 滑动窗口
            --c2[s2.charAt(i - n) - 'a'];
            if (Arrays.equals(c1, c2)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "eidbaooo"));
    }
}

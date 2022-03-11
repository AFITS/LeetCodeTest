package SlidWindows;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class LC16不含重复字段的最长字符串 {

    // 方法一：暴力法
    public static int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if (len <= 1) return len;
        int maxNum = 1;

        for (int i = 0; i < len; i++) {
            int tempLen = 0;
            HashSet<Character> hashSet = new HashSet<>();
            for (int j = i; j < len; j++) {
                if (hashSet.contains(s.charAt(j))) {
                    hashSet.clear();
                    break;
                } else {
                    hashSet.add(s.charAt(j));
                    tempLen++;
                    maxNum = Math.max(tempLen, maxNum);
                }
            }
        }
        return maxNum;
    }

    // 方法二：滑动窗口
    public static int lengthOfLongestSubstring2(String s) {
        int max = 0;
        int[] dic = new int[128];
        for (int r = 0, l = 0; r < s.length(); r++) {
            dic[s.charAt(r)]++;
            while (dic[s.charAt(r)] > 1) {
                dic[s.charAt(l)]--;
                l++;
            }
            max = Math.max(max, r - l + 1);
        }
        return max;
    }

    public static int lengthOfLongestSubstring3(String s) {
        int[] map = new int[26];
        int max = 0;
        for (int l = 0, r = 0; r < s.length(); r++) {
            map[s.charAt(r) - 'a']++;
            while (map[s.charAt(r) - 'a'] > 1) {
                map[s.charAt(l) - 'a']--;
                l++;
            }
            max = Math.max(max, r - l + 1);
        }
        return max;

    }


    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring3("abcabcbb"));

    }

}

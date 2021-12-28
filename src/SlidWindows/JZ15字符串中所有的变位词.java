package SlidWindows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JZ15字符串中所有的变位词 {
    public static List<Integer> findAnagrams(String s, String p) {
        int n = s.length(); //长的
        int m = p.length(); //短的
        List<Integer> result = new ArrayList<>();
        if (n < m) return result;
        int[] c1 = new int[26];
        int[] c2 = new int[26];
        for (int i = 0; i < m; i++) {
            ++c1[s.charAt(i) - 'a'];
            ++c2[p.charAt(i) - 'a'];
        }
        if (Arrays.equals(c1, c2)) result.add(0);
        for (int i = m; i < n; i++) {
            ++c1[s.charAt(i) - 'a'];
            --c1[s.charAt(i - m) - 'a'];
            if (Arrays.equals(c1, c2)) result.add(i - m + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findAnagrams("baa", "aa"));

    }
}

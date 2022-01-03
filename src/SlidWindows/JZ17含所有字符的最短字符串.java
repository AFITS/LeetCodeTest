package SlidWindows;

import java.util.Arrays;

public class JZ17含所有字符的最短字符串 {
    public String minWindow(String s, String t) {
        int[] c1 = new int[126];
        int[] c2 = new int[126];
        int m = s.length();
        int n = t.length();

        int start = 0;
        int end = 0;
        for (int i = 0; i < n; i++) {
            c1[t.charAt(i) - 'a']++;
            c2[t.charAt(i) - 'a']++;
        }
        if (Arrays.equals(c1, c2)) {
            return t;
        }

//        for (int i = m; i < n; i++) {
//            if (c2[s.charAt(i) - 'a'] == 0) {
//                continue;
//            } else {
//                c1[s.charAt(i) - 'a']++;
//                c1[s.charAt(i-m) - 'a']++;
//                if(Arrays.equals(c1,c2)){
//                    start
//                }
//            }

        return "";
    }


}

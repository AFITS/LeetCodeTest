package LCTEST;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.sql.Array;
import java.util.Arrays;

public class LC2022W1_字符串组成 {
    static class Solution {
        public int wordCount(String[] startWords, String[] targetWords) {
            int max = 0;
            for (int i = 0; i < startWords.length; i++) {
                String temp = startWords[i];
                int n = temp.length();
                int flag = 0;
                for (String target : targetWords) {
                    target = trans(target);
                    if (target.startsWith(temp) && target.length() == n + 1) {
                        System.out.println(">>"+target.substring(1, n)+">>"+temp);
                        flag++;
                    }
                }
                max = Math.max(flag, max);
            }
            return max;
        }

        public String trans(String t) {
            char[] array = t.toCharArray();
            Arrays.sort(array);

            System.out.println(array);
            return Arrays.toString(array);
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        String start[]=new String[]{ "ant","act","tack"};
        String start[]=new String[]{ "act","tack"};
        String target[]=new String[]{"actk","act","acti"};

        System.out.println(solution.wordCount(start, target));
    }
}

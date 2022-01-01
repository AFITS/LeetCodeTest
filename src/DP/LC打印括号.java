package DP;

import java.util.ArrayList;
import java.util.List;

public class LC打印括号 {
    static class Solution {
        public List<String> result = new ArrayList<>();

        // 回溯法
        public List<String> generateParenthesis(int n) {
            kuohao(n, n, new StringBuilder(""));
            return result;
        }

        public void kuohao(int l, int r, StringBuilder s) {
            if (l == 0 && r == 0) {
                result.add(s.toString());
                return;
            }
            if (l > 0) {
                s.append("(");
                kuohao(l - 1, r, s);
                s = s.deleteCharAt(s.length() - 1);
            }
            if (r > 0 && r > l) {
                s.append(")");
                kuohao(l, r - 1, s);
                s = s.deleteCharAt(s.length() - 1);
            }
        }



        public List<String> generateParenthesis2(int n) {
            dfs(0, 0, n, "");
            return result;
        }

        public void dfs(int l, int r, int n, String s) {
            if (l == n && r == n) {
                result.add(s.toString());
                return;
            }
            if (l < n) {
                dfs(l + 1, r, n, s + "(");
            }
            if (r < l && r < n) {
                dfs(l, r + 1, n, s + ")");
            }
        }
    }


    public static void main(String[] args) {
        System.out.println(new Solution().generateParenthesis(3));
    }
}

//package DP;
//
//
///**
// * 最长回文字符串
// * 1、原问题与子问题：子字符串也是回文
// * 2、动态规划的状态：
// * 3、边界条件：1、2
// * 4、转义方程：P(i,j) = P(i+1,j-1) & Si = Sj
// */
//public class LC5最长回文字符串 {
//    class Solution1 {
//        // 暴力法
//        public String longestPalindrome(String s) {
//            int len = s.length();
//            if (len < 2) return s;
//
//            char[] charArray = s.toCharArray();
//            int begin = 0;
//            int maxLine = 1;
//
//            for (int i = 0; i < len - 1; i++)
//                for (int j = i + 1; j < len; j++) {
////                    if (j - i + 1 > maxLine&&)
//                    {
//
//                    }
//                }
//
//
////        }
////
////        public boolean checkString(int i, int j,   ){
////
////        }
//    }
//
//
//}

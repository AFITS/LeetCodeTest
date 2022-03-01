package LCTEST;

public class LC6004 {
    static class Solution {
        int res = 0;

        public int countOperations(int num1, int num2) {
            if (num1 == num2) {
                res++;
                return res;
            }
            if (num1 > num2) {
                num1 = num1 - num2;
                res++;
                countOperations(num1, num2);
            } else {
                num2 = num2 - num1;
                res++;
                countOperations(num1, num2);
            }
            return res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countOperations(6, 4));
    }

}

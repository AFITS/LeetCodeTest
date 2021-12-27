package LCTEST;

/**
 * pass
 *
 */
public class LT5963 {
    class Solution {
        public boolean isSameAfterReversals(int num) {
            if (num == 0) return true;
            int temp = num / 10;
            return temp * 10 != num;
        }
    }
}

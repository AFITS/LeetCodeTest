package SORT_排序;

import javax.print.attribute.HashAttributeSet;
import java.util.HashMap;

public class JZ60出现频率最高的k个数字 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int len = map.size();
        return null;
    }
    // todo  采用最小堆的方式

}

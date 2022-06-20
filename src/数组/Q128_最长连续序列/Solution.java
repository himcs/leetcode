package 数组.Q128_最长连续序列;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int maxLen = 0;
        int need;
        for (Integer integer : set) {
            if (set.contains(integer - 1)) {
                continue;
            }
            int l = 1;
            need = integer + 1;
            while (set.contains(need)) {
                need++;
                l++;
            }
            maxLen = Math.max(l, maxLen);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int i = new Solution().longestConsecutive(new int[]{100, 4, 200, 1, 3, 2});
        System.out.println(i);
    }
}

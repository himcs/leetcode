package 滑动窗口.Q76_最小覆盖子串;

public class Solution {
    // 滑动窗口
    public String minWindow(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        if (sLen == 0 || tLen == 0 || sLen < tLen) {
            return "";
        }
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();

        int[] intS = new int[128];
        int[] intT = new int[128];

        for (int i = 0; i < tLen; i++) {
            intT[charsT[i]]++;
        }

        int minLen = sLen + 1;
        int minLeft = 0;
        int left = 0;
        int right = 0;
        // 目前窗口 与 t 差距，多了不+，少了-1
        int distinct = 0;

        while (right < sLen) {
            // 向右++
            // 其他字符
            char charRight = charsS[right];
            if (intT[charRight] == 0) {
                right++;
                continue;
            }
            if (intS[charRight] < intT[charRight]) {
                distinct++;
            }
            intS[charRight]++;
            while (distinct == tLen) {
                if (right - left < minLen) {
                    minLen = right - left;
                    minLeft = left;
                }
                //左边界
                char charLeft = charsS[left];
                if (intT[charLeft] == 0) {
                    left++;
                    continue;
                }
                if (intS[charLeft] == intT[charLeft]) {
                    distinct--;
                }
                intS[charLeft]--;
                left++;
            }
            right++;
        }
        if (minLen == sLen + 1) {
            return "";
        }

        // distinct s与t相似度
//         相同字符 <= [t] distinct +1
//          相同字符

        return s.substring(minLeft, minLeft + minLen + 1);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";
        String s1 = new Solution().minWindow(s, t);
        System.out.println(s1);
    }
}

package 字符串.Q5_最长回文子串;

/**
 * 中心扩散法
 */
public class Solution2 {

    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        int maxLength = 1;
        int left = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int l1 = checkPalindrome(s, i, i);
            int l2 = checkPalindrome(s, i, i + 1);
            int maxL = Math.max(l1, l2);
            if (maxL > maxLength) {
                maxLength = maxL;
                // 画图分析
                left = i - (maxL - 1) / 2;
            }
        }
        return s.substring(left, left + maxLength);
    }

    private int checkPalindrome(String s, int left, int right) {
        int i = left;
        int j = right;
        while (i >= 0 && j < s.length()) {
            if (s.charAt(i) == s.charAt(j)) {
                i--;
                j++;
            } else {
                break;
            }

        }
        //j-i+1-2 = j-i-1
        return j - i - 1;
    }

    public static void main(String[] args) {
        String babad = new Solution2().longestPalindrome("babad");
        System.out.println(babad);
    }
}


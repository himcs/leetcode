package 二分查找.Q392_判断子序列;

public class Solution {
  public boolean isSubsequence(String s, String t) {
    int left = 0;
    int right = t.length() - 1;
    for (int i = 0; i < s.length(); i++) {
      char target = s.charAt(i);
      boolean find = false;
      while (left <= right) {

        if (t.charAt(left) == target)
        {
          find = true;
          left++;
          break;
        }
        left++;
      }
      if (!find) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    boolean subsequence = new Solution().isSubsequence("baa", "bbaaaa");
    System.out.println(subsequence);
  }
}

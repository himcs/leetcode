package 字符串.Q521_最长特殊序列;

public class Solution {
  public int findLUSlength(String a, String b) {
    if (a.equals(b)) return -1;
    return Math.max(a.length(), b.length());
  }
}

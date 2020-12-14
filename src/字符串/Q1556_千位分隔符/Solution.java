package 字符串.Q1556_千位分隔符;

public class Solution {
  public String thousandSeparator(int n) {
    String s = String.valueOf(n);

    char[] chars = s.toCharArray();
    String res = "";
    int t = 0;
    for (int i = chars.length-1; i > -1; i--) {
      res += chars[i];
      t++;
      if (t == 3 && i!=0) {
        t = 0;
        res += '.';
      }
    }
    return new StringBuilder(res).reverse().toString();
  }
}

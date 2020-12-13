package 字符串.Q824_山羊拉丁文;

public class Solution {
  public String toGoatLatin(String S) {
    String[] s = S.split(" ");
    String yy = "aeiou";
    for (int i = 0; i < s.length; i++) {
      String world = s[i];
      if (yy.contains(String.valueOf(world.charAt(0)).toLowerCase())) {
        s[i] = s[i] + "ma";
      } else {
        if (s[i].length() == 1) {
          s[i] = s[i] + "ma";
        } else {
          s[i] = s[i].substring(1) + s[i].charAt(0) + "ma";
        }
      }
      for (int j = 0; j < i + 1; j++) {
        s[i] += "a";
      }
    }
    return String.join(" ", s);
  }
}

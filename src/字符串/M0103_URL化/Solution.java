package 字符串.M0103_URL化;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
  public String replaceSpaces(String S, int length) {
    char[] chars = S.toCharArray();
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < length; i++) {
      if(chars[i] == ' ')
      {
        stringBuilder.append("%20");
      }else{
        stringBuilder.append(chars[i]);
      }
    }
    return stringBuilder.toString();
  }
}

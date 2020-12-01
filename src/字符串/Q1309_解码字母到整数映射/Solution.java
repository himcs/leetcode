package 字符串.Q1309_解码字母到整数映射;

public class Solution {
    public String freqAlphabets(String s) {
        StringBuffer sb = new StringBuffer();
        char[] c = s.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            if((i+2)<c.length && c[(i+2)]=='#')
            {
                sb.append((char) ('a' + Integer.parseInt(s.substring(i, i + 2)) - 1));
                i+=2;
            }
            else{
                sb.append((char) ('a' + Integer.parseInt(s.substring(i,i+1)) - 1));
            }
        }


        return sb.toString();
    }
}

package 字符串.Offer58_左旋转字符串;

public class Offer58_左旋转字符串 {
    public String reverseLeftWords(String s, int n) {
        n = n % s.length();
        return s.substring(n).concat(s.substring(0, n));
    }
}

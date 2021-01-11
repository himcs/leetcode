package 二分查找.M1005_稀疏数组搜索;

public class Solution {
  public int findString(String[] words, String s) {
    int left = 0;
    int right = words.length - 1;
    while (left <= right) {
      while (words[left].isEmpty() && left < right) {
        left++;
      }
      while (words[right].isEmpty() && left < right) {
        right--;
      }
      int mid = (left + right) / 2;
      int tempMid = mid;
      while (words[mid].isEmpty() && mid <= right) {
        mid++;
      }
      String midVal = words[mid];
      if (midVal.equals(s)) {
        return mid;
      } else if (midVal.compareTo(s) > 0) {
        right = tempMid - 1;
      } else {
        left = tempMid + 1;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    int mCrS =
        new Solution()
            .findString(
                new String[] {
                  "DirNnILhARNS hOYIFB",
                  "SM ",
                  "YSPBaovrZBS",
                  "evMMBOf",
                  "mCrS",
                  "oRJfjw gwuo",
                  "xOpSEXvfI"
                },
                "mCrS");
    System.out.println(mCrS);
  }
}

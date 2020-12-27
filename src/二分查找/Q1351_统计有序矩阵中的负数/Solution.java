package 二分查找.Q1351_统计有序矩阵中的负数;

public class Solution {
  public int countNegatives(int[][] grid) {
    int negativeCount = 0;
    for (int[] ints : grid) {
      int c = binarySearch(ints, 0, ints.length - 1);
      if (c >= 0) {
        negativeCount += (ints.length - c);
      }
    }
    return negativeCount;
  }

  public int binarySearch(int[] arr, int start, int end) {
    int pos = -1;
    while (start <= end) {
      int mid = (start + end) >>> 1;
      if (arr[mid] < 0) {
        pos = mid;
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return pos;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
//    [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
    int[] a1 = new int[] {1,1,-1,-2};
    int[] a2 = new int[] {-1,-1,-2,-3};
    int i = solution.countNegatives(new int[][] {a1, a2});
    System.out.println(i);
  }
}

package 二分查找.Offer11_旋转数组的最小数字;

public class Solution {
  //    [3,4,5,1,2]
  //    midVal > left ; midVal = left;

  //    [1,2,3,4,5]
  public int minArray(int[] numbers) {
    int left = 0;
    int right = numbers.length - 1;
    while (left <= right) {
      int mid = (left + right) / 2;
      int midVal = numbers[mid];
      if (midVal > numbers[right]) {
        left = mid + 1;
      } else if (midVal < numbers[right]) {
        right = mid;
      } else {
        right--;
      }
    }
    return numbers[left];
  }

  public static void main(String[] args) {
    //
    int[] ints = {3, 4, 5, 1, 2};
    int i = new Solution().minArray(ints);
    System.out.println(i);
  }
}

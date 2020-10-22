package 数组.Q1588_所有奇数长度子数组的和;

/**
 * 思路:计算每个元素出现的次数并相加得到最终结果
 * 一个元素在奇数子数组
 * =》一个元素 左右两次均为奇数个元素  或 偶数个元素 的方案次数
 * =》 左方案 (i+1) 由方案(len-i)
 * => 计算奇偶方案数  奇=x/2  偶=x+1/2
 * => 次数 = 左奇*右奇 + 左偶*右偶
 */
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int lOdd = (i + 1) / 2;
            int lEven = (i + 1 + 1) / 2;
            int rOdd = (len - i) / 2;
            int rEven = (len - i + 1) / 2;
            sum += arr[i] * (lOdd * rOdd + lEven * rEven);
        }
        return sum;
    }
}
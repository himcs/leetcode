package 数组.Q1385_两个数组间的距离值;

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            boolean ok = true;
            for (int j = 0; j < arr2.length; j++) {
                if (Math.abs(arr1[i] - arr2[j]) <= d) {
                    ok = false;
                }
            }
            if (ok) {
                sum++;
            }
        }
        return sum;
    }
}
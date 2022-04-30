package 排序.Q75_颜色分类;

/**
 * 双指针
 */
public class Solution2 {
    public void sortColors(int[] nums) {

        //定义
        //[0,p0) 是0
        //[p0,i) 是1
        //[p2,nums.length -1) 是2
        int i = 0;
        int p0 = 0;
        int p2 = nums.length - 1;
        while (i <= p2) {
            if (nums[i] == 0) {
                swap(nums, i, p0);
                p0++;
                i++;
            } else if (nums[i] == 1) {
                i++;
            } else {
                //nums[i] == 2
                swap(nums, i, p2);
                p2--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    public static void main(String[] args) {
        int[] t = new int[]{2, 0, 2, 1, 1, 0};
        new Solution2().sortColors(t);
        System.out.println(t);
    }
}

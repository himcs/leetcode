package 数组.Q1491_去掉最低工资和最高工资后的工资平均值;

class Solution {
    public double average(int[] salary) {
        int len = salary.length;
        int min = salary[0];
        int max = 0;
        int sum = 0;
        for(int i = 0; i < len; i++)
        {
            min = Math.min(salary[i],min);
            max = Math.max(salary[i],max);
            sum += salary[i];
        }
        return ((double)(sum-min-max))/(len-2);
    }
}
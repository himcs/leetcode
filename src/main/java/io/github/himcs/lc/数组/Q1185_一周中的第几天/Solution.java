package io.github.himcs.lc.数组.Q1185_一周中的第几天;

import java.time.LocalDate;

public class Solution {
    public static void main(String[] args) {
        System.out.printf(new Solution().dayOfTheWeek(31, 8, 2019));
    }

    public String dayOfTheWeek(int day, int month, int year) {
        String[] week = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        LocalDate localDate = LocalDate.of(year, month, day);
        int dow0 = (int) Math.floorMod(localDate.toEpochDay() + 3, 7);
        return week[dow0 + 1];
    }

    public boolean isLeapYear(int prolepticYear) {
        return ((prolepticYear & 3) == 0) && ((prolepticYear % 100) != 0 || (prolepticYear % 400) == 0);
    }
}

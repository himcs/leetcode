package io.github.himcs.lc.字符串.Q1507_转变日期格式;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public String reformatDate(String date) {
        String[] s = date.split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append(s[2]);
        sb.append("-");

        sb.append(getMonth(s[1]));
        sb.append("-");
        sb.append(String.format("%02d", Integer.valueOf(s[0].substring(0, s[0].length() - 2))));

        return sb.toString();
    }

    public String getMonth(String month) {
        List list =
                Arrays.asList(
                        "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec");
        return String.format("%02d", list.indexOf(month) + 1);
    }
}

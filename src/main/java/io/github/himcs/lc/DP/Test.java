package io.github.himcs.lc.DP;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        String format = String.valueOf(new BigDecimal("42.00").stripTrailingZeros());
        System.out.println(format);
    }
}

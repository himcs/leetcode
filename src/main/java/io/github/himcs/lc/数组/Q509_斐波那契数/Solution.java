package io.github.himcs.lc.数组.Q509_斐波那契数;

public class Solution {
    public int fib(int N) {
        if (N == 0)
            return 0;
        if (N == 1)
            return 1;
        else return fib(N - 1) + fib(N - 2);
    }
}

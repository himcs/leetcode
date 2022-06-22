package io.github.himcs.lc.排序.Q1356_根据数字二进制下1的数目排序;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] sortByBits(int[] arr) {
        List<Integer> a = Arrays.stream(arr).boxed().collect(Collectors.toList());

        Collections.sort(
                a,
                (o1, o2) -> {
                    String s = Integer.toBinaryString(o1);
                    String s2 = Integer.toBinaryString(o2);
                    int t1 = 0;
                    int t2 = 0;
                    for (int i = 0; i < s.length(); i++) {
                        if (s.charAt(i) == '1') {
                            t1++;
                        }
                    }

                    for (int i = 0; i < s2.length(); i++) {
                        if (s2.charAt(i) == '1') {
                            t2++;
                        }
                    }
                    if (t1 > t2) {
                        return 1;
                    } else if (t1 < t2) {
                        return -1;
                    } else {
                        if (o1 > o2) {
                            return 1;
                        } else if (o1 < o2) {
                            return -1;
                        } else {
                            return 0;
                        }
                    }
                });

        return a.stream().mapToInt(t -> t).toArray();
    }
}

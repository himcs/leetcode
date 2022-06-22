package io.github.himcs.lc.数组.Q1337_方阵中战斗力最弱的K行;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            map.put(i, soldiersNum(mat[i]));
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((t1, t2) -> {
            if (t1 == t2) {
                return t1.getKey() - t2.getKey();
            }
            return t1.getValue() - t2.getValue();
        });
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = list.get(i).getKey();
        }
        return res;
    }

    public int soldiersNum(int[] a) {
        int sum = 0;
        for (int i : a) {
            if (i == 0)
                break;
            else
                sum++;
        }
        return sum;

    }


}

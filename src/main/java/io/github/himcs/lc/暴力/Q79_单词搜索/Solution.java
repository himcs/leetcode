package io.github.himcs.lc.暴力.Q79_单词搜索;

import java.util.ArrayList;
import java.util.List;

class Solution {
    char[][] board;
    int m;
    int n;
    char[] wChars;
    boolean find = false;
    int wLen;

    public static void main(String[] args) {
        char[][] board = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        boolean abcb = new Solution().exist(board, "SEE");
        System.out.println(abcb);
    }

    public boolean exist(char[][] board, String word) {
        /**
         * 思路：
         * 遍利每一个起点 存储路径
         * 成功条件 路径完全匹配
         * 跳过条件 无路可走（上下左右|排除路径点）
         */
        this.board = board;
        m = board.length;
        wLen = word.length();
        if (m == 0) {
            return wLen == 0;
        }
        wChars = word.toCharArray();
        n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                /**
                 * 寻找起点
                 */
                if (board[i][j] != wChars[0]) {
                    continue;
                }
                List<String> trace = new ArrayList<>();
                trace.add(i + "_" + j);
                backTrace(trace, i, j);
                if (find == true) {
                    return true;
                }
            }
        }
        return false;
    }

    private void backTrace(List<String> trace, int x, int y) {
        if (trace.size() == wLen) {
            find = true;
            return;
        }

        int topX = x - 1;
        int butX = x + 1;
        int leftY = y - 1;
        int rightY = y + 1;
        char needChar = wChars[trace.size()];
        if (topX >= 0 && !trace.contains(topX + "_" + y) && board[topX][y] == needChar) {
            trace.add(topX + "_" + y);
            backTrace(trace, topX, y);
            trace.remove(trace.size() - 1);
        }
        if (butX < m && !trace.contains(butX + "_" + y) && board[butX][y] == needChar) {
            trace.add(butX + "_" + y);
            backTrace(trace, butX, y);
            trace.remove(trace.size() - 1);
        }
        if (leftY >= 0 && !trace.contains(x + "_" + leftY) && board[x][leftY] == needChar) {
            trace.add(x + "_" + leftY);
            backTrace(trace, x, leftY);
            trace.remove(trace.size() - 1);
        }
        if (rightY < n && !trace.contains(x + "_" + rightY) && board[x][rightY] == needChar) {
            trace.add(x + "_" + rightY);
            backTrace(trace, x, rightY);
            trace.remove(trace.size() - 1);
        }
    }
}
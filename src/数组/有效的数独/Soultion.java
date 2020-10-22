package 数组.有效的数独;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        //每一行
        for (char[] hangs : board) {
            if (!isOk(hangs)) {
                return false;
            }
        }
        //每一列
        for (int i = 0; i < 9; i++) {
            char[] lie = new char[9];
            for (int j = 0; j < 9; j++) {
                lie[j] = board[j][i];
            }
            if (!isOk(lie)) {
                return false;
            }
        }
        //矩阵
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                int index = 0;
                char[] juzhen = new char[9];
                for (int x = i; x < i + 3; x++) {
                    for (int y = j; y < j + 3; y++) {
                        juzhen[index++] = board[x][y];
                    }
                }
                if (!isOk(juzhen)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isOk(char[] nine) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : nine) {
            int value = map.getOrDefault(c, 0) + 1;
            if (c != '.' && value > 1)
                return false;
            map.put(c, value);
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = new char[][]{new char[]{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                                                            new char[]{'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                                                            new char[]{'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                                                            new char[]{'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                                                            new char[]{'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                                                            new char[]{'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                                                            new char[]{'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                                                            new char[]{'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                                                            new char[]{'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        new Solution().isValidSudoku(board);
    }
}
package io.github.himcs.lc.数组.Q999_可以被一步捕获的棋子数;

class Solution {
    public int numRookCaptures(char[][] board) {
        int sum = 0;
        //获取下标
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'p') {
                    if (check(board, i, j)) {
                        sum++;
                    }
                }
            }
        }
        return sum;
    }

    public boolean check(char[][] board, int x, int y) {
        //东
        for (int i = y - 1; i > -1; i--) {
            if (isBlock(board[x][i]))
                break;
            else if (board[x][i] == 'R')
                return true;
        }
        //西
        for (int i = y + 1; i < board[x].length; i++) {
            if (isBlock(board[x][i]))
                break;
            else if (board[x][i] == 'R')
                return true;
        }
        //南
        for (int i = x + 1; i < board.length; i++) {
            if (isBlock(board[i][y]))
                break;
            else if (board[i][y] == 'R')
                return true;
        }
        //北
        for (int i = x - 1; i > -1; i--) {
            if (isBlock(board[i][y]))
                break;
            else if (board[i][y] == 'R')
                return true;
        }

        return false;
    }

    public boolean isBlock(char c) {
        return 'B' == c || 'p' == c;
    }
}
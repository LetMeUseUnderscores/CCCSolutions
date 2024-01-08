import java.util.Scanner;

public class CCC06J5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char config = sc.next().charAt(0);
        int[][] board = new int[9][9];
        //0 is empty, 1 is black, 2 is white
        if(config == 'a') {
            board[4][4] = board[5][5] = 2;
            board[4][5] = board[5][4] = 1;
        } else if (config == 'b') {
            for(int r = 1, c = 1; r <= 8; r++, c++) {
                board[r][c] = 1;
            }
            for(int r = 8, c = 1; r >= 1; r--, c++) {
                board[r][c] = 2;
            }
        } else {
            for(int r = 1; r < 9; r++) {
                board[r][3] = board[r][4] = 1;
                board[r][5] = board[r][6] = 2;
            }
        }
        int N = sc.nextInt();

        for(int i = 1; i <= N; i++) {
            int moveR = sc.nextInt();
            int moveC = sc.nextInt();
            int colour = i % 2 == 0 ? 2 : 1;
            board[moveR][moveC] = colour;
            if(moveC + 1 < 9 && board[moveR][moveC + 1] == 3 - colour) {
                for(int c = moveC + 1; c < 9; c++) {
                    if(board[moveR][c] == colour) {
                        for(int j = moveC + 1; j < c; j++) {
                            board[moveR][j] = colour;
                        }
                        break;
                    }
                }
            }
            if(moveR + 1 < 9 && board[moveR + 1][moveC] == 3 - colour) {
                for(int c = moveR + 1; c < 9; c++) {
                    if(board[c][moveC] == colour) {
                        for(int j = moveR + 1; j < c; j++) {
                            board[j][moveC] = colour;
                        }
                        break;
                    }
                }
            }
            if(moveC - 1 > 0 && board[moveR][moveC - 1] == 3 - colour) {
                for(int c = moveC - 1; c > 0; c--) {
                    if(board[moveR][c] == colour) {
                        for(int j = moveC - 1; j > c; j--) {
                            board[moveR][j] = colour;
                        }
                        break;
                    }
                }
            }
            if(moveR - 1 > 0 && board[moveR - 1][moveC] == 3 - colour) {
                for(int c = moveR - 1; c > 0; c--) {
                    if(board[c][moveC] == colour) {
                        for(int j = moveR - 1; j > c; j--) {
                            board[j][moveC] = colour;
                        }
                        break;
                    }
                }
            }
            if(moveR + 1 < 9 && moveC + 1 < 9 && board[moveR + 1][moveC + 1] == 3 - colour) {
                for(int c = moveR + 1, d = moveC + 1; c < 9; c++, d++) {
                    if(board[c][d] == colour) {
                        for(int j = moveR + 1, k = moveC + 1; j < c; j++, k++) {
                            board[j][k] = colour;
                        }
                        break;
                    }
                }
            }
            if(moveR - 1 > 0 && moveC + 1 < 9 && board[moveR - 1][moveC + 1] == 3 - colour) {
                for(int c = moveR - 1, d = moveC + 1; c > 0; c--, d++) {
                    if(board[c][d] == colour) {
                        for(int j = moveR - 1, k = moveC + 1; j > c; j--, k++) {
                            board[j][k] = colour;
                        }
                        break;
                    }
                }
            }
            if(moveR + 1 < 9 && moveC - 1 > 0 && board[moveR + 1][moveC - 1] == 3 - colour) {
                for(int c = moveR + 1, d = moveC - 1; c < 9; c++, d--) {
                    if(board[c][d] == colour) {
                        for(int j = moveR + 1, k = moveC - 1; j < c; j++, k--) {
                            board[j][k] = colour;
                        }
                        break;
                    }
                }
            }
            if(moveR - 1 > 0 && moveC - 1 > 0 && board[moveR - 1][moveC - 1] == 3 - colour) {
                for(int c = moveR - 1, d = moveC - 1; c > 0; c--, d--) {
                    if(board[c][d] == colour) {
                        for(int j = moveR - 1, k = moveC - 1; j > c; j--, k--) {
                            board[j][k] = colour;
                        }
                        break;
                    }
                }
            }
        }
        int blackCount = 0;
        int whiteCount = 0;
        for(int r = 1; r < 9; r++) {
            for(int c = 1; c < 9; c++) {
                if(board[r][c] == 1) {
                    blackCount++;
                } else if(board[r][c] == 2) {
                    whiteCount++;
                }
            }
        }
        System.out.println(blackCount + " " + whiteCount);
    }
}

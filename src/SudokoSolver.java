public class SudokoSolver {
    public static void main(String[] args) {
        int[][] bord = {
            {0,5,0,0,0,3,0,0,0},
            {0,0,3,0,4,0,0,0,9},
            {0,0,0,0,7,0,2,0,3},
            {0,0,0,7,0,0,0,8,0},
            {8,6,0,0,0,0,0,9,7},
            {0,1,0,0,0,6,0,0,0},
            {9,0,6,0,5,0,0,0,0},
            {7,0,0,0,1,0,5,0,0},
            {0,0,0,6,0,0,0,2,0}
        };
        if (solve(bord)) {
            display(bord);
        } 
        else {
            System.out.println(" cant be solved ");
        }
    }

    static void display(int[][] bord) {
        for (int[] row : bord) {
            for (int num : row) {
                System.out.print(num + " ");

            }
            System.out.println();
        }
    }

    static boolean solve(int[][] bord) {
        // this how we are replacing r,c from argument
        int n = bord.length;
        int row = -1;
        int col = -1;
        boolean empty = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (bord[i][j] == 0) {
                    row = i;
                    col = j;
                    empty = false;
                    break;
                }
            }
            // if we found the empty in the row
            if (empty == false) {
                break;
            }

        }
        if (empty == true) {
            return true;
            // suduku is solved
        }

        // backtracking
        for (int num = 1; num <= 9; num++) {
            if (isSafe(bord, row, col, num)) {
                bord[row][col] = num;
                if (solve(bord)) {
                    return true;
                }
                else {
                    bord[row][col] = 0;
                }
            }
        }

        return false;
    }

    static boolean isSafe(int[][] bord, int row, int col, int number) {
        // checking for the row
        for (int i = 0; i < bord.length; i++) {
            if (bord[row][i] == number) {
                return false;
            }
        }
        // checking the column
        for (int[] num : bord) {
            if (num[col] == number) {
                return false;
            }
        }

        int sqrt = (int) (Math.sqrt(bord.length));
        int startRow = row - row % sqrt;
        int startCol = col - col % sqrt;
        for (int r = startRow; r < startRow + sqrt; r++) {
            for (int c = startCol; c < startCol + sqrt; c++) {

                if (bord[r][c] == number) {
                    return false;
                }

            }

        }
        return true;
    }
}

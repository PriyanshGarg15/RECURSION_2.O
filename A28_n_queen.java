public class A28_n_queen {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board=new boolean[n][n];
        Print(board,n,0);
    }
    public static void Print(boolean [][] board,int tq,int row) {
        if (tq == 0) {
			Display(board);
            System.out.println();
			return;
		}
        for(int col = 0; col < board.length; col++) {
			if (isitsafe(board, row, col) == true) {
				board[row][col] = true;
				Print(board,tq - 1,row+1);
				board[row][col] = false;
			}
		}
    }
	public static boolean isitsafe(boolean[][] board, int row, int col) {
		// upper case
		int r = row;
		while (r >= 0) {
			if (board[r][col] == true) {
				return false;
			}
			r--;
		}
		// left diagonal
		r = row;
		int c = col;
		while (r >= 0 && c >= 0) {
			if (board[r][c] == true) {
				return false;
			}
			c--;
			r--;
		}
		// right diagonal
		r = row;
		c = col;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c] == true) {
				return false;
			}
			c++;
			r--;
		}
		return true;
	}
    public static void Display(boolean[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}

	}
}

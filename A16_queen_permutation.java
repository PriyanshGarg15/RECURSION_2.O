public class A16_queen_permutation {
	public static void main(String[] args) {
		boolean[] board = new boolean[4];
		int no_oqueen = 2;
		Queen(board, no_oqueen, 0, "");

	}

	public static void Queen(boolean[] board, int tq, int qpsf, String ans) {
		if (tq == qpsf) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < board.length; i++) {
			if (board[i] == false) {// queen placed nhi hai 

				board[i] = true;// queen place
				
				Queen(board, tq, qpsf +1, ans+"b"+i+"q"+qpsf+" ");

				board[i]=false;// undo 
			}

		}

	}

}
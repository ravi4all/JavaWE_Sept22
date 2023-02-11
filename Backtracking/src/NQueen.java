public class NQueen {
	
	static int getCount(boolean board[][], int currentRow) {
		int count = 0;
		
		// Positive Base Case
		if(currentRow == board.length) {
			return 1;
		}
		
		for(int col = 0; col < board[currentRow].length; col++) {
			if(isSafeArea(board, currentRow, col)) {
				board[currentRow][col] = true;
				count = count + getCount(board, currentRow+1);
				// backtracking
				board[currentRow][col] = false;
			}
		}
		return count;
	}
	
	static boolean isSafeArea(boolean[][] board, int row, int col) {
		// check if queen is available in same column
		for(int i = row; i >= 0; i--) {
			if(board[i][col]) {
				return false;
			}
		}
		
		// check if queen is available in upper left diagonal
		for(int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if(board[i][j]) {
				return false;
			}
		}
		
		// check if queen is available in upper right diagonal
		for(int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
			if(board[i][j]) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		boolean [][]board = new boolean[4][4];
		System.out.println(getCount(board,0));

	}

}

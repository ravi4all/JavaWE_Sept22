public class SudokuSolver {
	
	static boolean solver(int board[][], int row, int col) {
		
		// Move to the next row
		if(col == board[0].length) {
			col = 0;
			row += 1;
		}
		
		// check if board if filled
		if(row == board.length) {
			return true;
		}
		
		// check if there is zero or any other number
		if(board[row][col] != 0) {
			return solver(board, row, col+1);
		}
		
		for(int i = 1; i <= 9; i++) {
			if(isSafe(row, col, i, board)) {
				board[row][col] = i;
			}
		}
		
	}
	
	static boolean isPresentInRow(int row, int value, int [][]board) {
		return false;
	}
	static boolean isPresentInCol(int col, int value, int [][]board) {
		return false;
	}
	static boolean isPresentInGrid(int row, int col, int value, int[][] board) {
		return false;
	}
	
	static boolean isSafe(int row, int col, int value, int[][] board) {
		return !isPresentInRow(row, value, board) && 
				!isPresentInCol(col, value, board) && 
				!isPresentInGrid(row, col, value, board);
	}

	public static void main(String[] args) {
		int board[][] = {
				{5,3,0,0,7,0,0,0,0},
				{6,0,0,1,9,5,0,0,0},
				{0,9,8,0,0,0,0,6,0},
				{8,0,0,0,6,0,0,0,3},
				{4,0,0,8,0,3,0,0,1},
				{7,0,0,0,2,0,0,0,6},
				{0,6,0,0,0,0,2,8,0},
				{0,0,0,4,1,9,0,0,5},
				{0,0,0,0,8,0,0,7,9}
		};
		solver(board,0,0);
		
	}

}

public class WordSearch {
	
	static boolean isValid = false;
	
	public static boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++) {
        	for(int j = 0; j < board[0].length; j++) {
        		if(isMatch(i, j, board, word)) {
        			return true;
        		}
        	}
        }
        return false;
    }
	
	static boolean isMatch(int row, int col, char[][]board, String word) {
		if(word.length() == 0) {
			return true;
		}
		if(row < 0 || col < 0 || row == board.length || col == board[0].length || board[row][col] != word.charAt(0)) {
			return false;
		}
		board[row][col] = '#';
		int directions[][] = {
				{0,1},		// right
				{1,0},		// down
				{0,-1},		// left
				{-1,0}		// up
		};
		for(int direction = 0; direction < directions.length; direction++) {
			int rowDirection = directions[direction][0];
			int colDirection = directions[direction][1];
			isValid = isMatch(row + rowDirection, col + colDirection, board, word.substring(1));
			if(isValid) {
				break;
			}
		}
		board[row][col] = word.charAt(0);
		return isValid;
	}

	public static void main(String[] args) {
		char board[][] = {
				{'A','B','C','E'},
				{'S','F','C','S'},
				{'A','D','E','E'}
				};
		//String word = "ABCCED";
		//String word = "SEED";
		String word = "ABCB";
		boolean result = exist(board, word);
		System.out.println(result);
		
	}

}

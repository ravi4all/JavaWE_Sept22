import java.util.ArrayList;

public class LetterCombination {
	static String keyPadKeys[] = {
			".", "@#$", "abc", "def",
			"ghi", "jkl", "mno", "pqrs",
			"tuv", "wxyz"
	};
	
	static ArrayList<String> combination(String number) {
		
		if(number.length() == 0) {
			ArrayList<String> list = new ArrayList<>();
			list.add("");
			return list;
		}
		
		char fnum = number.charAt(0);	// '2'
		String remString = number.substring(1);	 // "3"
		int index = fnum - '0';	// 50 - 48
		String key = keyPadKeys[index];		// "abc"
		ArrayList<String> result = new ArrayList<>();
		for(int i = 0; i < key.length(); i++) {
			ArrayList<String> temp = combination(remString);
			for(String str : temp) {
				result.add(key.charAt(i) + str);
			}
		}
		return result;
		
	}

	public static void main(String[] args) {
		
		combination("23");

	}

}

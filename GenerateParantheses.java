import java.util.ArrayList;

public class GenerateParantheses {
	
	static ArrayList<String> generate(int n){
		ArrayList<String> ans = new ArrayList<>();
		helper(ans, "", 0, 0, n);
		return ans;
	}
	
	static void helper(ArrayList<String> ans, String str, int open, int close, int n) {
		// Base Case
		if(str.length() == n * 2) {
			ans.add(str);
			return;
		}
		
		if(open < n) {
			helper(ans, str + "(", open + 1, close, n);
		}
		
		if(close < open) {
			helper(ans, str + ")", open, close + 1, n);
		}
	}

	public static void main(String[] args) {
		int n = 3;
		ArrayList<String> res = generate(n);
		System.out.println(res);

	}

}

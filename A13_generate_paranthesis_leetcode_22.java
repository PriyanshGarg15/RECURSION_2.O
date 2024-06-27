
public class A13_generate_paranthesis_leetcode_22 {
    public static void main(String[] args) {
		int n=3;
		parenthesis(n, 0, 0, "");

	}
	public static void parenthesis(int n,int open,int close,String ans) {
		if(open==n && close==n) {
			System.out.println(ans);
			return;
		}
		if(open>n||close>open)
			return;
        if(open<n)
            parenthesis(n,open+1,close,ans+"(");
        if(close<open)
            parenthesis(n,open,close+1,ans+")");
	}
}
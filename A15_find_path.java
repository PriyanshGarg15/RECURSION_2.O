public class A15_find_path {
	public static void main(String[] args) {
		int n=3;
		int m=4;
		findpaths(n-1, m-1, 0, 0, "");
	}
	public static void findpaths(int n,int m,int r,int c,String ans) {
		if(r==n&&c==m)
		{
			System.out.println(ans);
			return;
		}
		if(r>n ||c>m)
			return ;	
		findpaths(n, m, r+1, c, ans+"H");
		findpaths(n, m, r, c+1, ans+"V");
	}  

}
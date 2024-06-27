public class A1_factorial_tail_recursion {
	//tail recursion matlab recursion ke bad kuch kam nahi hoga !!
    public static void main(String[] args) {
		int n=5;
		System.out.println(fac(n,1));
	}
	public static int fac(int n,int ans) {
		if(n==0)
			return ans;
		return fac(n-1,ans*n);
	}
}
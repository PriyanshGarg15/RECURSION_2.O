public class A2_factorial_head_recursion {
    //head recursion matlab recursion seh ane ke bad kuch na kuch kam hora hoga!!
	public static void main(String[] args) {
		int n=5;
		System.out.println(fac(n));
	}
	public static int fac(int n) {
		if(n==0)
			return 1;
		return n*fac(n-1);	
	}

}



// -----------------------
// we can aslounderstand in this way !



// public class A2_factorial_head_recursion {
// 	public static void main(String[] args) {
// 		int n=5;
// 		System.out.println(fac(n));
// 	}
// 	public static int fac(int n) {
// 		if(n==0)
// 			return 1;

//      int fact=fac(n-1);
// 		return n*fact;	
// 	}

// }
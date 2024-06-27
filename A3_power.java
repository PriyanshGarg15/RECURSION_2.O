//using head recursion
public class A3_power {

    public static void main(String[] args) {
		int a=5;
		int n=2;
		System.out.println(pow(a,n));

	}
	public static int pow(int a,int n) {
		 if(n==0)
			return 1;
		
		return a*pow(a,n-1);
	}
}


// ---------------------------

// //using tailrecursion
// public class A3_power {

//     public static void main(String[] args) {
// 		int a=5;
// 		int n=2;
// 		System.out.println(pow(a,n,1));

// 	}
// 	public static int pow(int a,int n,int ans) {
// 		 if(n==0)
// 			return ans;
		
// 		return pow(a,n-1,ans*a);
// 	}
// }


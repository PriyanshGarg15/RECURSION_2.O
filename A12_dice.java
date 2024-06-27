public class A12_dice {
    public static void main(String[] args) {
		int n=4;
		int faces=3;
		printpath(n,0,"",faces);
	}
	public static void printpath(int n,int curr,String ans,int faces) {
		if(curr==n) {
			System.out.println(ans);
			return;
		}
		if(curr>n) {
			return;
		}
		for(int dice=1;dice<=faces;dice++) {
			printpath(n,curr+dice,ans+dice,faces);
		}
	}
}

// ----------------------------------------------------------
                               // if asked to count possible outcomes !!
// package recursion;                               
// public class A12_dice {
//     public static void main(String[] args) {
// 		int n = 4;
//         int faces=3;
// 		int c=Boardpath(n, 0, "");
//         System.out.println(c);
// 	}

// 	public static int Boardpath(int n, int curr, String ans) {
// 		if (curr == n) {
// 			System.out.println(ans + " ");
// 			return 1;
// 		}
// 		if (curr > n) {
// 			return 0;
// 		}
//         //jitne face utni call(to auto,mate it according to user we used for loop in above case)
// 		int fp = Boardpath(n, curr + 1, ans + 1);
// 		int sp = Boardpath(n, curr + 2, ans + 2);
// 		int tp = Boardpath(n, curr + 3, ans + 3);
// 		return fp + sp + tp;

// 	}
// }
// given_n_coins_tell_all_possible_outcomes
public class A9_coin_toss{
    public static void main(String[] args) {
        int n=3;
        outcomes(n,"");
    }
    public static void outcomes(int n,String ans){
        if(n==0) {
			System.out.println(ans);
			return;
		}
        outcomes(n-1,ans+'H');
		outcomes(n-1,ans+'T');
    }
}


// -----------------------
// // or understand this way



// // given_n_coins_tell_all_possible_outcomes
// public class A9_coin_toss{
//     public static void main(String[] args) {
//         int n=3;
//         outcomes(n,"");
//     }
//     public static void outcomes(int n,String ans){
//         if(n==0) {
// 			System.out.println(ans);
// 			return;
// 		}
//         char c1='H';
// 		char c2='T';
//         outcomes(n-1,ans+c1);
// 		outcomes(n-1,ans+c2);
//     }
// }
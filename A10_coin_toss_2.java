// given_n_coins_tell_all_possible_outcomes except 2H together

public class A10_coin_toss_2 {
    public static void main(String[] args) {
        int n=3;
        outcomes(n,"");
    }
    public static void outcomes(int n,String ans){
        if(n==0) {
			System.out.println(ans);
			return;
		}
        if(ans.length() ==0|| ans.charAt(ans.length()-1)!='H')
            outcomes(n-1,ans+'H');
		outcomes(n-1,ans+'T');
    }
}
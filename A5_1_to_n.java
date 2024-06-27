public class A5_1_to_n {
    public static void main(String[] args){
		int n=5;
		fun(n);
	}
	public static void fun(int n){
		if(n==0)
			return;
		fun(n-1);
        System.out.println(n); //for inc order	

	}
}
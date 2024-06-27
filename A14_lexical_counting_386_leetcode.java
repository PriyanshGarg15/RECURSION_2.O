public class A14_lexical_counting_386_leetcode {
    public static void main(String[] args) {
		int n=1000;
		counting(0,n);
	}
	public static void counting(int curr,int n) {
		if(curr>n)
			return;
		System.out.println(curr);
		int i=0;
		if(curr==0) {
			i=1;
		}
		for(;i<=9;i++) {
			counting(curr*10+i,n);
		}
		
	}
}
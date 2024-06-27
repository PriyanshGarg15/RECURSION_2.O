//move all disk from a to b with conditions to be maintained !!
public class A27_tower_of_hanoi{
	public static void main(String[] args) {
		int n=3;
		String src="A";
		String hlp="B";
		String des="C";
		toh(n,src,hlp,des);
	}
	public static void toh(int n,String src,String des,String help) {
		if(n==0)
			return;
		toh(n-1, src, help , des);
		System.out.println("Move "+n+"th disk from "+src+" to "+des);
		toh(n-1, help, des, src);
	}

}


//iseh rat lo  !!


//approach
/* 
 *hey recursion n-1 disk uthakar help meh rakh de
 aur fir help seh utha kar des meh rakhd e
*/
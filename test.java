public class test
{
    public static void main(String[] args) {
        fun(10);

    }
    

    public static void fun(int n) {
        fun(n-1);
        System.out.println(n);
        if(n==0)
        {
            return;
        }
    }
}
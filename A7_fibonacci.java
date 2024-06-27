public class A7_fibonacci {
    public static void main(String[] args) {
        int n=6;
        int ans=fibo(n);
        System.out.println(ans);
    }
    public static int fibo(int n) {
        if(n==0||n==1)
        {
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}


// ----------------------------

// public class A7_fibonacci {
//     public static void main(String[] args) {
//         int n=6;
//         int ans=fibo(n);
//         System.out.println(ans);
//     }
//     public static int fibo(int n) {
//         if(n==0||n==1)
//         {
//             return n;
//         }
//         int f1=fibo(n-1);
//         int f2=fibo(n-2);
//         return f1+f2;
//     }
// }
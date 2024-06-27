public class A17_queen_combination {
    public static void main(String[] args) {
        int n = 4; // Size of the board
        int k = 2; // Number of queens
        Queen(n, k, 0, "", 0);
    }

    public static void Queen(int n, int tq, int qpsf, String ans, int idx) {
        // tq --> total Queen
        // qpsf --> Queen placed so far
        if (tq == qpsf) {
            System.out.println(ans);
            return;
        }
        for (int i = idx; i < n; i++) {
            Queen(n, tq, qpsf + 1, ans + "b" + i + "q" + qpsf + " ", i + 1);
        }
    }
}

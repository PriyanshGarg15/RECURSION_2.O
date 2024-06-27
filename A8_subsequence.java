public class A8_subsequence {
    public static void main(String[] args) {
        String s = "abc";
        sub(s, "", 0);
    }

    public static void sub(String s, String ans, int i) {
        if (i == s.length()) {
            System.out.println(ans);
            return;
        }
        // Include the current character
        sub(s, ans + s.charAt(i), i + 1);
        // Exclude the current character
        sub(s, ans, i + 1);
    }
}
import java.util.*;

public class A22_combinations 
{
    public static void main(String[] args) 
    {
        boolean[] board = new boolean[4];
        int no_oqueen = 2;
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        fun(board, no_oqueen, 0, ll, ans);
        System.out.println(ans);
    }

    public static void fun(boolean[] board, int no_oqueen, int start, List<Integer> ll, List<List<Integer>> ans) 
    {
        if (ll.size() == no_oqueen) {
            ans.add(new ArrayList<>(ll));
            return;
        }
        for (int i = start; i < board.length; i++) 
        {
                ll.add(i);
                fun(board, no_oqueen, i + 1, ll, ans);
                ll.remove(ll.size() - 1);
        }
    }
}

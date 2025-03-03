import java.util.*;
public class A24_pallindrome_partitinong {

	public static void main(String[] args) {
		String str = "nitin";
		List<String> list = new ArrayList<>();
		List<List<String>> ans = new ArrayList<>();
		PrintPartitioning(str, list,ans);
		System.out.println(ans);

	}

	public static void PrintPartitioning(String ques, List<String> list,List<List<String>> ans ) {
		if (ques.length() == 0) {
			//System.out.println(list);
			ans.add(new ArrayList<String>(list));
		}

		for (int i = 1; i <= ques.length(); i++) {
			String s = ques.substring(0, i);

			if (isPalidromString(s)) {
				list.add(s);
				PrintPartitioning(ques.substring(i), list,ans);
				list.remove(list.size()-1);
			}

		}
	}

	public static boolean isPalidromString(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}

			i++;
			j--;
		}
		return true;

	}

}
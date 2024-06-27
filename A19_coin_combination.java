public class A19_coin_combination {

	public static void main(String[] args) {
		int[] coin = { 2, 3, 5, 6 };
		int amount = 10;
		printCombintation(coin, amount, "", 0);

	}

	public static void printCombintation(int[] coin, int amount, String ans, int idx) {
		if (amount == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = idx; i < coin.length; i++) {
			if (amount >= coin[i]) {
				printCombintation(coin, amount - coin[i], ans + coin[i], i);
			}

		}

	}

}
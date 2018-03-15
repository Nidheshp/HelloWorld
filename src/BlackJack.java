
public class BlackJack {

	public static void main(String[] args) {

		System.out.println(blackjack(21, 22));
		System.out.println(blackjack(21, 20));
		System.out.println(blackjack(16, 20));
		System.out.println(blackjack(22, 20));
		System.out.println(blackjack(7, 7));
		System.out.println(blackjack(22, 22));

	}

	public static int blackjack(int num1, int num2) {

		if (num1 > 21 && num2 > 21) {
			return 0;
		} else if (num1 > 21 && num2 <= 21) {
			return num2;
		} else if (num2 > 21 && num1 <= 21) {
			return num1;
		} else if (num2 >= num1) {
			return num2;
		} else if (num1 >= num2) {
			return num1;
		}

		return 0;
	}
}
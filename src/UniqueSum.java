
public class UniqueSum {

	public static void main(String[] args) {

		System.out.println(Sum(15, 18, 18));
		System.out.println(Sum(18, 16, 18));
		System.out.println(Sum(18, 18, 17));
		System.out.println(Sum(15, 16, 17));
		System.out.println(Sum(18, 18, 18));

	}

	public static int Sum(int add1, int add2, int add3) {

		int sum = 0;
		
		if (add1 != add2 && add1 != add3) {
			sum += add1;
		}
		if (add2 != add1 && add2 != add3) {
			sum += add2;
		}
		if (add3 != add1 && add3 != add2) {
			sum += add3;
		}
		return sum;

	}
}

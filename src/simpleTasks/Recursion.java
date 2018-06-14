
public class Recursion {
	public static void main(String[] args) {
		System.out.println(numbers(10, false));
	}

	public static int numbers(int num, boolean middle) {
		if (num < 10000 && !middle) {
			System.out.print(num + " ");
			return numbers(num * 10, false);
		} else if (num == 10000 && !middle) {
			System.out.print(num + " ");
			return numbers(num, true);
		} else if (num > 10 && middle) {
			System.out.print(num + " ");
			return numbers(num / 10, true);
		}
		return 10;
	}
}

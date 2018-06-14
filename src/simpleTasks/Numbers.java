import java.io.IOException;
import java.util.Scanner;

public class Numbers {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int number = Integer.parseInt(scan.nextLine());
		int length = (int)(Math.log10(number)+1);
		int[] numArray = new int[length];
		for (int i = numArray.length-1; i >= 0; i--) {
			numArray[i] = number % 10;
			number /= 10;
		}
		for (int i = 0; i < numArray.length; i++) {
			System.out.print(numArray[i] + " ");

		}
	}
}

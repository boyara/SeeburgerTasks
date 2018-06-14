import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SquareMatrix {

	public static int counter = 1;
	public static int[][] matrix;

	public static int tempRow;
	public static int tempCol;

	public static int maxRow;
	public static int minRow;
	public static int maxCol;
	public static int minCol;

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		int x = Integer.parseInt(scan.nextLine());
		matrix = new int[x][x];

		maxRow = matrix.length - 1;
		minRow = 0;
		maxCol = matrix.length - 1;
		minCol = 0;

		String startPosition = "topLeft"; // topRight, botLeft, botRight, center
		String direction = "clockwise"; // anti-clockwise

		if (startPosition.equals("topLeft")) {
			tempRow = 0;
			tempCol = 0;
			if (direction.equals("clockwise")) {
				while (counter <= x * x) {
					right();
					tempRow++;
					down();
					tempCol--;
					left();
					tempRow--;
					up();
					tempCol++;
				}
			}
			if (direction.equals("anti-clockwise")) {
				while (counter <= x * x) {
					down();
					tempCol++;
					right();
					tempRow--;
					up();
					tempCol--;
					left();
					tempRow++;
				}
			}
		}
		if (startPosition.equals("topRight")) {
			tempRow = 0;
			tempCol = matrix.length - 1;
			if (direction.equals("clockwise")) {
				while (counter <= x * x) {
					down();
					tempCol--;
					left();
					tempRow--;
					up();
					tempCol++;
					right();
					tempRow++;
				}
			}
			if (direction.equals("anti-clockwise")) {
				while (counter <= x * x) {
					left();
					tempRow++;
					down();
					tempCol++;
					right();
					tempRow--;
					up();
					tempCol--;
				}
			}
		}
		if (startPosition.equals("botRight")) {
			tempRow = matrix.length - 1;
			tempCol = matrix.length - 1;
			if (direction.equals("clockwise")) {
				while (counter <= x * x) {
					left();
					tempRow--;
					up();
					tempCol++;
					right();
					tempRow++;
					down();
					tempCol--;
				}
			}
			if (direction.equals("anti-clockwise")) {
				while (counter <= x * x) {
					up();
					tempCol--;
					left();
					tempRow++;
					down();
					tempCol++;
					right();
					tempRow--;
				}
			}
		}
		if (startPosition.equals("botLeft")) {
			tempRow = matrix.length - 1;
			tempCol = 0;
			if (direction.equals("clockwise")) {
				while (counter <= x * x) {
					up();
					tempCol++;
					right();
					tempRow++;
					down();
					tempCol--;
					left();
					tempRow--;
				}
			}
			if (direction.equals("anti-clockwise")) {
				while (counter <= x * x) {
					right();
					tempRow--;
					up();
					tempCol--;
					left();
					tempRow++;
					down();
					tempCol++;
				}
			}
		}
		if (startPosition.equals("center")) {
			if (matrix.length % 2 == 1) {
				tempRow = 0;
				tempCol = 0;
				if (direction.equals("clockwise")) {
					counter = -matrix.length * matrix.length;
					centerClockwise();
				}
				if (direction.equals("anti-clockwise")) {
					counter = -matrix.length * matrix.length;
					centerAntiClockwise();
				}
			} else {
				System.out.println("Incorrect value.");
				return;
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void down() {
		for (int i = minRow; i <= maxRow; i++) {
			matrix[tempRow++][tempCol] = Math.abs(counter++);
		}
		minCol++;
		tempRow--;
	}

	public static void right() {
		for (int i = minCol; i <= maxCol; i++) {
			matrix[tempRow][tempCol++] = Math.abs(counter++);
		}
		maxRow--;
		tempCol--;
	}

	public static void up() {
		for (int i = maxRow; i >= minRow; i--) {
			matrix[tempRow--][tempCol] = Math.abs(counter++);
		}
		maxCol--;
		tempRow++;
	}

	public static void left() {
		for (int i = maxCol; i >= minCol; i--) {
			matrix[tempRow][tempCol--] = Math.abs(counter++);
		}
		minRow++;
		tempCol++;
	}

	public static void centerClockwise() {
		while (counter <= -1) {
			right();
			tempRow++;
			down();
			tempCol--;
			left();
			tempRow--;
			up();
			tempCol++;
		}
	}

	public static void centerAntiClockwise() {
		while (counter <= -1) {
			down();
			tempCol++;
			right();
			tempRow--;
			up();
			tempCol--;
			left();
			tempRow++;
		}
	}
}

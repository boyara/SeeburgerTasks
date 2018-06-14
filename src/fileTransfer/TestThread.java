package fileTransfer;

public class TestThread {
	public static void main(String args[]) {
		// while (true) {
		FileMove R1 = new FileMove("Moving Files");
		R1.start();
		FileMove R2 = new FileMove("EmptyCheck");
		R2.start();
		// }
	}
}
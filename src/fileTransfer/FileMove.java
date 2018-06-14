package fileTransfer;

import java.nio.file.Path;

class FileMove implements Runnable {
	private Thread t;
	private String threadName;

	FileMove(String name) {
		threadName = name;
		System.out.println("Creating " + threadName);
	}

public void run() {
System.out.println("Running " + threadName);
try {
Thread.sleep(50);
} catch (InterruptedException e) {
System.out.println("Thread " + threadName + " interrupted.");
}
System.out.println("Thread " + threadName + " exiting.");
}

	public void start() {
		System.out.println("Starting " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
}
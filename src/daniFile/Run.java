package daniFile;

import java.io.IOException;
import java.util.Scanner;

public class Run {

    private static final String sourceFolder = "D:\\Dir1";
    private static final String destination = "D:\\Dir2";
    
    public static void main(String[] args) throws IOException {
	
	CopyManager copyManager = new CopyManager(sourceFolder, destination);
	
	CopyProcessor copyThread = new CopyProcessor(copyManager);
	
	copyThread.start();
	
	System.out.println("Press any key to stop ...");
	
	Scanner scanner = new Scanner(System.in);
	
	scanner.nextLine();
	
	copyThread.shutdown();	
	
    }

}
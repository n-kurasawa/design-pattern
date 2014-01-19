package chapter2_adapter.practice;

import java.io.IOException;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileIO fileIO = new FileProperties();
		try {
			fileIO.readFromFile("/Users/naohiro/sample.txt");
			fileIO.setValue("year", "2004");
			fileIO.setValue("month", "4");
			fileIO.setValue("day", "21");
			fileIO.writeToFile("/Users/naohiro/newfile.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

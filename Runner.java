package sample;

import java.io.File;

public class Runner {

	public static void main(String[] args) {
		File soughtDir = new File("C:/Java 24.11.21/HomeworkHuman");
		String soughtName = "The Doors – Riders In The Storm.mp3";

		MultiFileSearcher mfs = new MultiFileSearcher();
		SearchTask st = new SearchTask(mfs, soughtDir, soughtName);

	}

}
package sample;

import java.io.File;

public class SearchTask implements Runnable {

	private MultiFileSearcher mfs;
	private Thread thr;
	private File startDir;
	private String soughtFileName;

	public SearchTask(MultiFileSearcher mfs, File startDir, String soughtFileName) {
		super();
		this.mfs = mfs;
		this.startDir = startDir;
		this.soughtFileName = soughtFileName;
		thr = new Thread(this);
		thr.start();
	}

	public Thread getThr() {
		return thr;
	}

	public void setThr(Thread thr) {
		this.thr = thr;
	}

	@Override
	public void run() {
		System.out.println("|| \n " + thr.getName() + " live.");
		mfs.fileSearcher(startDir, soughtFileName);
	}

}
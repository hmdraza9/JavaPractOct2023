package javaUtils;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.HashMap;
import java.util.Map;

public class FileDLoad {

	static String logfile = "https://public.karat.io/content/q015/urls.txt";// -> the most common URL is
	// http://www.example.com (with 1170
	// occurrences)
//	String logfile1 = "https://public.karat.io/content/q015/single_url.txt";// -> the most common URL is
	// http://www.example.com (with 1170
	// occurrences)
	public static String filePath = "/Users/hraza/Downloads/logFileNew.txt";

	public static void main(String[] args) throws IOException {

		FileDLoad obj = new FileDLoad();
		File fileObj = new File(filePath);

		if (!fileObj.exists()) {
			System.out.println("File not exist, downloading...");
//			obj.downloadUsingStream(logfile);
			obj.downloadUsingNIO(logfile);
			if (fileObj.exists()) {
				System.out.println("File downloaded, file name: " + fileObj.getName() + ", file size: "
						+ (fileObj.length() / 1024) + Level.kB);
			}
		} else
			System.out.println("File exist, file name: " + fileObj.getName() + ", file size: "
					+ (fileObj.length() / 1024) + Level.kB);

		// re-utilizing the variable irrespective of the name meaning
		logfile = obj.mostOccURL();

		System.out.println("URL: " + logfile.split("_")[0]);
		System.out.println("Occurrence: " + logfile.split("_")[1]);

	}

	public String mostOccURL() throws IOException {
		HashMap<String, Integer> urlList = new HashMap<String, Integer>();

		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		String line = reader.readLine();

		while (line != null) {
//			System.out.println(line);
			// read next line
//			System.out.println("line: " + line);

			if (urlList.containsKey(line)) {
				urlList.put(line, urlList.get(line) + 1);
			} else
				urlList.put(line, 1);

			line = reader.readLine();

		}

		int maxCount = 0;
		String maxURL = "";
		int maxURLOcc = 0;

		for (Map.Entry<String, Integer> entry : urlList.entrySet()) {

			if (maxCount < entry.getValue()) {
				maxCount = entry.getValue();
				maxURL = entry.getKey();
				maxURLOcc = entry.getValue();
			}

		}
//		System.out.println("maxURL: " + maxURL + "\nmaxURLOcc: " + maxURLOcc);
//		myReader.close();
		reader.close();

		return maxURL + "_" + maxURLOcc;
	}

	public void downloadUsingStream(String logfile) throws IOException {
		URL url = new URL(logfile);
		BufferedInputStream bis = new BufferedInputStream(url.openStream());
		FileOutputStream fos = new FileOutputStream(filePath);
		byte[] buffer = new byte[1024];
		int count = 0;

		while ((count = bis.read(buffer, 0, 1024)) != -1) {
			fos.write(buffer, 0, count);
		}
		fos.close();
		bis.close();
	}

	public void downloadUsingNIO(String logfile) throws IOException {
		URL url = new URL(logfile);
		ReadableByteChannel rbc = Channels.newChannel(url.openStream());
		FileOutputStream fos = new FileOutputStream(filePath);
		fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
		fos.close();
		rbc.close();
	}

}

enum Level {
	kB("KILOBYTES"), mB("MEGABYTES"), gB("GIGABYTES");

	private String valueOfLevel;

	Level(String valueOfLevel) {
		this.valueOfLevel = valueOfLevel;
	}

	public String getValueOFLevel() {
		return valueOfLevel;
	}
}
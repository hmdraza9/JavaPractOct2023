package my.test.pack.javaUtils;

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

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FileDownloadLoad {

	private static final Logger log = LogManager.getLogger(FileDownloadLoad.class);

	static String logfile = "https://public.karat.io/content/q015/urls.txt";// -> the most common URL is
	// http://www.example.com (with 1170
	// occurrences)
//	String logfile1 = "https://public.karat.io/content/q015/single_url.txt";// -> the most common URL is
	// http://www.example.com (with 1170
	// occurrences)
	public static String filePath = System.getProperty("user.dir") + "/src/test/resources/TestFiles/logFileTest" + "-"
			+ UtilMethods.getTime() + ".txt";

	public static void mainFileDownloadLoad() throws IOException {

		log.info(System.getProperty("user.dir"));

		FileDownloadLoad obj = new FileDownloadLoad();
		File fileObj = new File(filePath);
		fileObj.createNewFile();

		if (!fileObj.exists() || !(fileObj.length() > 0)) {
			log.info("File not exist, downloading...");
			log.info("File not exist, downloading...");
//			obj.downloadUsingStream(logfile);
			obj.downloadUsingNIO(logfile);
			if (fileObj.exists()) {
				log.info("File downloaded, file name: " + fileObj.getName() + ", file size: "
						+ (fileObj.length() / 1024) + Level.kB);
			}
		} else
			log.info("File exist, file name: " + fileObj.getName() + ", file size: " + (fileObj.length() / 1024)
					+ Level.kB);

		// re-utilizing the variable irrespective of the name meaning
		String maxURL = obj.mostOccURL();

		log.info("URL: " + logfile.split("_")[0]);
		log.info("Occurrence: " + maxURL.split("_")[1]);
		log.info("fileObj: " + fileObj.exists());

	}

	public String mostOccURL() throws IOException {
		HashMap<String, Integer> urlList = new HashMap<String, Integer>();

		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		String line = reader.readLine();

		while (line != null) {
//			log.info(line);
			// read next line
//			log.info("line: " + line);

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
//		log.info("maxURL: " + maxURL + "\nmaxURLOcc: " + maxURLOcc);
//		myReader.close();
		reader.close();

		return maxURL + "_" + maxURLOcc;
	}

	public void downloadUsingStream(String logfile) throws IOException {
		URL url = new URL(logfile);
		BufferedInputStream bis = new BufferedInputStream(url.openStream());
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(filePath);
		} catch (Exception e) {
			e.printStackTrace();
			log.info(e.getMessage());
		}
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
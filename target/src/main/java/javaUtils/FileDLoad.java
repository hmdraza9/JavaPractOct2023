package javaUtils;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class FileDLoad {

	public static void main(String[] args) throws IOException {

//		String logfile1 = "https://public.karat.io/content/q015/urls.txt";// -> the most common URL is
		// http://www.example.com (with 1170
		// occurrences)
		String logfile1 = "https://public.karat.io/content/q015/single_url.txt";// -> the most common URL is
		// http://www.example.com (with 1170
		// occurrences)
		String filePath = "/Users/hraza/Downloads/logFileNew.txt";
		URL url = new URL(logfile1);
		BufferedInputStream bis = new BufferedInputStream(url.openStream());
		FileOutputStream fos = new FileOutputStream(filePath);
		byte[] buffer = new byte[1024];
		int count = 0;

		while ((count = bis.read(buffer, 0, 1024)) != -1) {
			fos.write(buffer, 0, count);
		}
		fos.close();
		bis.close();

		HashMap<String, Integer> urlList = new HashMap<String, Integer>();

		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		String line = reader.readLine();

		while (line != null) {
			System.out.println(line);
			// read next line
			System.out.println("line: "+line);


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
		System.out.println("maxURL: " + maxURL + "\nmaxURLOcc: " + maxURLOcc);

//		myReader.close();
		reader.close();

	}

}

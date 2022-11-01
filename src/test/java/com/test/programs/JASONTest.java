package com.test.programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JASONTest {

	private static BufferedReader buff;

	public static void main(String[] args) throws IOException {

		File file = new File("Location");
		buff = new BufferedReader(new FileReader(file));

		String line;

		while ((line = buff.readLine()) != null) {
			line = line.trim().substring(38, line.length() - 3);
			Pattern p = Pattern.compile("\\{(.*?)\\}");
			Matcher m = p.matcher(line);

			int sum = 0;

			while (m.find()) {
				String[] attrib = m.group(1).trim().split(",");
				if (attrib.length == 2 && attrib[1].contains("label")) {
					if (attrib[0].contains("id")) {
						String[] ids = attrib[0].trim().split(":");
						sum = sum + Integer.parseInt(ids[1].trim());

					}

				}

			}
			System.out.println(sum);

		}
	}
}

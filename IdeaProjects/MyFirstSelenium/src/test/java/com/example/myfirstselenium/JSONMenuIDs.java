package com.example.myfirstselenium;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JSONMenuIDs {

    public static void main(String[] args) throws IOException {
        File file = new File("files/easy/test_JSONMenuIDs.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim().substring(38, line.length() - 3);
            Pattern p = Pattern.compile("\\{(.*?)\\}");
            Matcher m = p.matcher(line);
            int sum = 0;
            while (m.find()) {
                String[] attribs = m.group(1).trim().split(",");
                if (attribs.length == 2 && attribs[1].contains("label")) {
                    if (attribs[0].contains("id")) {
                        String[] ids = attribs[0].trim().split(":");
                        sum += Integer.parseInt(ids[1].trim());
                    }
                }
            }
            System.out.println(sum);
        }
    }
}


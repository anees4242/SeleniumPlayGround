package com.mytraining.selenium.training;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JASONTrail {

    public static void main(String[] args) throws IOException {
        File file = new File("");
        BufferedReader buff = new BufferedReader(new FileReader(file));
         String line;

         while((line= buff.readLine())!= null){
             line = line.substring(38 , line.length() -3);
             Pattern p = Pattern.compile("\\{(.*?)\\}");
             Matcher m = p.matcher(line);

             int sum = 0;

             while (m.find()){
                 String [] attribs = m.group(1).trim().split(",");
                 if (attribs.length == 2 && attribs[1].contains("label")) {
                     if (attribs[0].contains("id")){
                         String [] ids = attribs[0].trim().split(":");
                         sum = sum + Integer.parseInt(ids[1].trim());


                     }

                 }
             }
             System.out.println(sum);

         }

    }
}
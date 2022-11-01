

import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class RegexDemo {
        public static void main(String[]args) {
            Pattern p = Pattern.compile("is (\\d{6})");
            Matcher m = p.matcher("Your Authentication code for the transaction is 549321 If you did not initiate the transaction please call +97143214321");
            while(m.find()) {
                System.out.println(m.group(1));
            }
        }
    }


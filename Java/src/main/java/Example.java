
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import java.text.*;

public class Example {

    public static List<String> changeDateFormat(List<String> dates) throws Exception {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        for(String date : dates) {
            if (date.contains("/") || date.contains("-")) {
                date = date.replaceAll("-", "/");
            }else{
                continue;
            }
            Date newDate = formatter.parse(date);
            Format formatwanted = new SimpleDateFormat("yyyyMMdd");
            String s = formatwanted.format(newDate);
            System.out.println(s);
        }
        return dates;
    }
    public static void main(String[] args) throws Exception{
        List<String> dates = Arrays.asList("2010/03/30", "15/12/2016", "11-15-2012", "20130720");
        changeDateFormat(dates);
    }
}


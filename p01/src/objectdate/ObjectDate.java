package objectdate;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ObjectDate {
    public static void main(String[] args)throws ParseException {
        Date d = new Date();
        System.out.println(d);
        Calendar c = new GregorianCalendar();
        c.setTime(new Date( ));
        System.out.println(c.getTimeInMillis());
        String date = "1996.10.10 12:22:00";
        System.out.println(new SimpleDateFormat("YYYY/MM/dd HH:mm:ss").format(d));
        c.setTime(d);
        System.out.println(c.get(GregorianCalendar.YEAR));
    }
}

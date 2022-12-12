package th.ac.ku.KuPremiumAPI;

import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Calendar;
import java.util.Locale;

public class LocaldatetimeTest {

    @Test
    public void test() throws ParseException {
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss")));
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("E dd MM yy HH:mm:ss")));
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("EEE dd MMMM yyy HH:mm:ss").withLocale(Locale.ENGLISH)));
        DateTimeFormatter df = new DateTimeFormatterBuilder()
                // case-insensitive to parse JAN and FEB
                .parseCaseInsensitive()
                // add pattern
                .appendPattern("EEE dd-MMM-yyyy HH:mm:ss")
                // create formatter (use English Locale to parse month names)
                .toFormatter(Locale.ENGLISH);
        LocalDateTime l1 = LocalDateTime.parse(LocalDateTime.now().format(DateTimeFormatter.ofPattern("EEE dd-MMM-yyyy HH:mm:ss").withLocale(Locale.ENGLISH)),df);
        System.out.println(l1);

        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE dd/MM/yyyy HH:mm:ss",Locale.ENGLISH);
        System.out.println(dateFormat.format(Calendar.getInstance().getTime()));
//        System.out.println(dateFormat.parseObject(String.valueOf(Calendar.getInstance().getTime())),);
//        System.out.println(LocalDateTime.parse(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss"))));
    }
}

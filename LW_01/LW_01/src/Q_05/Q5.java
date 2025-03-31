package Q_05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q5 {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE,MMMM d,yyyy");
        String formattedDate = dateFormat.format(today);
        System.out.println(formattedDate);
    }
}

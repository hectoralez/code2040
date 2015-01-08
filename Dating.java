import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.sql.*;

class Dating {
   public static void main(String args[]) {
      String datestamp;
      String interval;
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter a datestamp");
      datestamp = in.nextLine();
      System.out.println("Enter an interval");
      interval = in.nextLine();

      int sec = Integer.parseInt(interval);

      Timestamp current = Timestamp.valueOf(datestamp);
      Calendar cal = Calendar.getInstance();
      cal.setTimeInMillis(current.getTime());
      cal.add(Calendar.SECOND, sec);
      Timestamp future = new Timestamp(cal.getTime().getTime());

      System.out.println(current);
      System.out.println(future);
   }
}
import java.util.*;
import java.util.Arrays;
import java.util.List;
 
class Prefix {
   public static void main(String args[]) {
      String[] list = {"407FUpYZ","407lv87w","4077lPy0","407knME1","407uixMf","407waIsy"};
      String pre;
      List<String> fixed = new LinkedList<String>();
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter a prefix");
      pre = in.nextLine();
 
      int length = list.length;
 
      for ( int i = 0 ; i <= length - 1; i++ ) {
         if (!list[i].startsWith(pre)) {
            fixed.add(list[i]);
         }
      }
      System.out.println(fixed);
   }
}
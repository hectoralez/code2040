import java.util.*;
import java.util.Arrays;
 
class Needle {
   public static void main(String args[]) {
      String[] haystack = {"MNosP","fqlyQ","EB0Rb","pZH78","EXmTN","MNXA8","o6VYf","ibyew","H6Rsu","fihO9","TNqbB","oKds8","bFsmE","byKKv","fO7v7","WJ5TH","3OT7K","9BUoB","vvFd8","xEMkW"};
      String needle;
      int index = -1;
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter a string to find");
      needle = in.nextLine();
 
      int length = haystack.length;
 
      for ( int i = 0 ; i <= length - 1; i++ ) {
         if (needle.equals(haystack[i])) {
            index = i;
            System.out.println("String is at index: "+index);
         }
      }
      if (index < 0) {
         System.out.println("String not found");
      }
   }
}
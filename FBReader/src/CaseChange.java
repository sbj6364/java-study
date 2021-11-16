import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class CaseChange {
   public static void main(String[] args) throws Exception {
      FileReader fReader = new FileReader("/Users/seobj/Desktop/DEV/java/java-study/FBReader/win.ini");
      BufferedReader bReader = new BufferedReader(fReader);

      String str = null;
      Scanner in = new Scanner(System.in);
      String input;
      String result = "";

      while ((str = bReader.readLine()) != null) {
    	 input = str;
    	 result = "";

         for (char c : input.toCharArray()) {

            if (c > 64 && c < 91) {
            	char tmp = (char) (c + 32);
            	result += tmp;
            } 
            else if (c > 96 && c <123) {
            	char tmo = (char) (c - 32);
            	result += tmo;
            }
            else {
            	result += "*";
            }
         }
         System.out.println(result);
      }

      in.close();
      bReader.close();
      fReader.close();
   }
}
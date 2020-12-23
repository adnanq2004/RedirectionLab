import java.util.Scanner;
public class MakeStars {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String lines;
    String inside;
    int Start;
    int End;
    String finalp = "";
    while(scan.hasNext()) {
      finalp = "";
      Start = 0;
      lines = scan.nextLine();
      end = lines.length();
      while (start < end) {
        inside = lines.next();
        for (int i = 0; i < inside.length();i++) {
          finalp += "*";
        }
        finalp += " ";
      }
      System.out.println(finalp);
    }
    System.out.println("");
  }

}

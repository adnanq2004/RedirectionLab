import java.util.Scanner;
public class MakeStars {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    /*String words;
    Scanner line;
    String inside;
    int Start;
    int End;
    String word;
    String finalp = "";
    while(scan.hasNext()) {
      finalp = "";
      Start = 0;
      line = new Scanner(scan.nextLine());
      
      End = .length();
      while (Start < End) {
	      word = "";
	      for (int i = Start; i < lines.length() && !word.equals(""); i++) {
		if (lines.charAt(i) == ' ') {
			word = lines.substring(Start, i);
		}
	      }
	      inside = word;
        for (int i = 0; i < inside.length();i++) {
          finalp += "*";
        }
        finalp += " ";
      }
      System.out.println(finalp);
    }
    System.out.println("");
  }*/
  	String finalp;
	while (scan.hasNext()) {
		finalp = "";
		Scanner line = new Scanner(scan.nextLine());
		while (line.hasNext()) {
			String word = line.next();
			for (int i = 0; i < word.length(); i++) {
				finalp += "*";
			}
			finalp += " ";
		}
		System.out.println(finalp);
	}
  }

}

import java.util.Scanner;
import java.util.ArrayList;
public class pigLatin{

	public static void main(String[] args) {
		ArrayList<String> pain = new ArrayList<String>();
		pain.add("bl");
		pain.add("br");
		pain.add("ch");
		pain.add("ck");
		pain.add("cl");
		pain.add("cr");
		pain.add("dr");
		pain.add("fl");
		pain.add("fr");
		pain.add("gh");
		pain.add("gl");
		pain.add("gr");
		pain.add("ng");
		pain.add("ph");
		pain.add("pl");
		pain.add("pr");
		pain.add("qu");
		pain.add("sc");
		pain.add("sh");
		pain.add("sk");
		pain.add("sl");
		pain.add("sm");
		pain.add("sn");
		pain.add("sp");
		pain.add("st");
		pain.add("sw");
		pain.add("th");
		pain.add("tr");
		pain.add("tw");
		pain.add("wh");
		pain.add("wr");
		ArrayList<String> pain2 = new ArrayList<String>();
		pain2.add("a");
		pain2.add("e");
		pain2.add("i");
		pain2.add("o");
		pain2.add("u");
		String pain4 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String pain5 = "abcdefghijklmnopqrstuvwxyz";
		String pain6 = "1234567890";
		Scanner scan = new Scanner(System.in);
		String finalp;
		String punc;
		String improv;
		String word;
		while(scan.hasNext()) {
			finalp = "";
			Scanner line = new Scanner(scan.nextLine());
			while (line.hasNext()) {
				punc = "";
				word = line.next();
				for (int i = 0; i <word.length(); i++) {
					for (int j = 0; j < pain4.length(); j++) {
						if (word.charAt(i) == pain4.charAt(j)) {
							String temp = word.substring(0,i);
							temp += pain5.substring(j,j+1);
							temp += word.substring(i+1,word.length());
							word = temp;
						}
					}
				}
				boolean letter = false;
				for (int i = 0; i < pain5.length() && !letter; i++) {
					if (word.charAt(word.length() -1) == pain5.charAt(i)) {
						letter = true;
					}
				}
				for (int i = 0; i < pain6.length() && !letter; i++) {
					if (word.charAt(word.length() -1) == pain6.charAt(i)) {
						letter = true;
					}
				}
				if (!letter) {
					punc = word.substring(word.length()-1, word.length());
					word = word.substring(0,word.length()-1);
				}
				improv = word;
				if (word.length() > 2) {
					for (int i = 0; i < pain.size(); i++) {
						if (word.substring(0,2).equals(pain.get(i))) {
							improv = word.substring(2,word.length());
							improv += pain.get(i);
							improv += "ay";
						}
					}
				}
				if (word.length() > 0) {
					for (int i = 0; i < pain2.size(); i++) {
						if (word.substring(0,1).equals(pain2.get(i))) {
							improv += "hay";
						}
					}
				}
				if (word.length() > 0) {
					boolean nonnumber = true;
					for (int i = 0; i < pain5.length() && nonnumber; i++) {
						if (word.substring(0,1).equals(pain5.substring(i,i+1))) {
							nonnumber = false;
						}
					}
					if (nonnumber) {
						finalp += improv;
						finalp += " ";
						word += " ";
					}
				}
				if (word.equals(improv)) {
					improv = word.substring(1,word.length());
					improv += word.substring(0,1);
					improv += "ay";
				}
				improv += punc;
				finalp += improv;
				finalp += " ";
			}
			System.out.println(finalp);
		}
	}

}

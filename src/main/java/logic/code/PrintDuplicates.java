package logic.code;
import java.util.ArrayList;
import java.util.List;

public class PrintDuplicates {

	public static void main(String[] args) {
		String comment = "My Name is Shubham and I am preparing myself for the interview in Capgimini";
		System.out.println("Results");
		countAndPrintDupicate(comment);
	}
	
	public static void countAndPrintDupicate(String str) {
		
		
		List<Character> charList = new ArrayList<Character>();
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) != c) {
					continue;
				}
				count++;
			}
			
			if (!charList.contains(c)) {
				if (count > 1 && c != ' ') {
					System.out.println("Character " +c +" is occured : " + count +" time.");
					charList.add(c);
				}
			}
			
			count = 0;
		}
		
	}
}

package dictionary;

import java.util.ArrayList;

public class DictionaryCommandLine {
	static String[] dung;
	static void showAllWords() {
        System.out.println("NO     |English     |Vietnamese");
        int num = 0;
        for(int i = 0; i < Dictionary.data.size(); i++)
        {
        	System.out.println(++num + "      |" + Dictionary.data.get(i).word_target + "     |" + Dictionary.data.get(i).word_explain);
        }
    }
	
	static void dictionarySearcher() {
		String search = new String();
		search = DictionaryManagement.sc.nextLine();
		ArrayList <String> temp = new ArrayList<String>();
		for(int i = 0; i < Dictionary.data.size(); i++)
        {
			String cut = Dictionary.data.get(i).word_target.substring(0, search.length());
        	if(search.equals(cut)) {
        		temp.add(Dictionary.data.get(i).word_target);
        	}
        }
		if(temp.isEmpty()) {
			System.out.println("Can't find your word");
		}
		else {
			System.out.println(temp);
		}
	}
	
	public static void dictionaryBasic() {
		DictionaryManagement ver1 = new DictionaryManagement();
		ver1.insertFromCommandline();
		showAllWords();
	}
	
	public static void dictionaryAdvance() {
		DictionaryManagement ver2 = new DictionaryManagement();
		ver2.insertFromFile();
		showAllWords();
	}
}

package dictionary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DictionaryManagement {
	public static Scanner sc = new Scanner(System.in);
	public static final String url = "F:\\projectJavaOOP\\dictionary\\javaOOP_BTL1\\src\\dictionary\\dictionaries.txt";
	void insertFromCommandline() {
        int n;
        n = sc.nextInt();
        sc.nextLine();
        while (n != 0) {
        	Word word = new Word();
            word.word_target = sc.nextLine();
            word.word_explain = sc.nextLine();
            Dictionary.data.add(word);
            n--;
        }
	}
	
	public static void insertFromFile() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(url));
            String content = br.readLine();
            while (content != null) {
                // split string with tab
                List<String> temp = new ArrayList<String>();
                String[] result = content.split("\\t");
                for (int i = 0; i < result.length; i++) {
                    temp.add(result[i].toString());
                }
                // add object to dictionary
                Word word = new Word();
                word.word_target = result[0];
                word.word_explain = result[1];
                Dictionary.data.add(word);
                content = br.readLine();
            }
		} catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
	}
	
	/**
     * write 1 word consist of meaning english and vietnamese to dictionary.
     * 
     * @param s is string from output
     */
    public static void writeToFile(String s) {
        try {
            // Creates a FileWriter
            FileWriter writer = new FileWriter(url, true); // second param(true) means append;
            // Creates a BufferedWriter
            BufferedWriter buffer = new BufferedWriter(writer);
            // Writes the string to the file
            buffer.write("\n");
            buffer.write(s);
            // Closes the writer
            buffer.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    
	/*
    public static void deleteWord(Word removeWord) {
        for(Word i : data) {
            if(i.word_explain.equals(removeWord.word_explain) == true && i.word_target.equals(removeWord.word_target) == true) {
                data.remove(removeWord);
            }
        }
    }
    */

	

	public static void main(String[] args) {       
		DictionaryCommandLine ver2 = new DictionaryCommandLine();
		ver2.dictionaryAdvance();
		ver2.dictionarySearcher();

    }
}

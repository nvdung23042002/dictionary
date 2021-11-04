package Dictionary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

public class GG_API_Translator {

	public static void excuteApiTranslate() throws IOException {
		System.out.println("Enter Text need to be translated:");
		Scanner sc = new Scanner(System.in);
		String Q = sc.nextLine();
		// Q need to be translated.
		sc.close();
		System.out.println("Translated Text:\n" + translate("en","vi",Q));
	}
	
	static String translate(String langFrom, String langTo, String text) throws IOException {
        // URL getting destination to Dung Script Google Project.
        String urlStr = "https://script.google.com/macros/s/AKfycbxZzayOQDcGkSB0lE7NrtomEXdOvvoSYnjLr5BMbfA6epSNz8lh/exec" +
                "?q=" + URLEncoder.encode(text, "UTF-8") +
                "&target=" + langTo +
                "&source=" + langFrom;
        URL url = new URL(urlStr);
        StringBuilder response = new StringBuilder();
        HttpURLConnection con = (HttpURLConnection) url.openConnection(); // gui yeu cau di + mo request
        // creating sample Browser.
        con.setRequestProperty("User-Agent", "Mozilla/5.0");
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        return response.toString();
    }
	
	public static void main(String[] args) throws IOException {
		excuteApiTranslate();
	}
}

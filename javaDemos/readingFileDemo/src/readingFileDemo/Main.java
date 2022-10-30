package readingFileDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = null;
		int total = 0;
		try {
			reader = new BufferedReader(new FileReader("C:\\javaDemos\\readingFileDemo\\src\\sayilar.txt"));
			Object line = null;
			while((line = reader.readLine()) !=null) {
				total += Integer.valueOf((int) line);
				}
			System.out.println("Toplam = " + total);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
			reader.close();
			}catch (Exception exception) {
				
			} 
		}

	}

}

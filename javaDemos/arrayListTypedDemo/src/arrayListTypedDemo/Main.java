package arrayListTypedDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> sehirler = new ArrayList<String>();
		sehirler.add("Ankara");
		sehirler.add("�zmir");
		sehirler.add("Manisa");
		sehirler.add("Adana");
		
		//sehirler.sort(null);
		Collections.sort(sehirler);
		
		for(String sehir:sehirler) {
			System.out.println(sehir);
		}
		
		
		
		
		

	}

}

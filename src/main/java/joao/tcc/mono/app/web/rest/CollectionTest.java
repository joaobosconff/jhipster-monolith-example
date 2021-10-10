package joao.tcc.mono.app.web.rest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CollectionTest {
	
	public static ArrayList<Integer> init() {
		Random r = new Random();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(list.size() != 99999) {
			list.add(r.nextInt(10000));
		}
		Collections.sort(list);
		return list;
	}

}

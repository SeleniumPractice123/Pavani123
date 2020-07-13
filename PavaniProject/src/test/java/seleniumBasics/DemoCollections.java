package seleniumBasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DemoCollections {

	public static void main(String[] args) {

		List<String> b = new ArrayList<String>();

		b.add("a");
		b.add("b");

		//System.out.println(b.get(0));

		Set<String> b1 = new HashSet<String>();

		b1.add("first");
		b1.add("last");
		b1.add("sec");
		b1.add("third");
		b1.add("four");
		b1.add("five");
		
		//System.out.println(b1);
		
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		
		map.put(114628, "Accenture");
		map.put(494396, "DBS");
		map.put(494397, "DBS");
		
		System.out.println(map);
		
		
		System.out.println(map.get(494396));
	}

}

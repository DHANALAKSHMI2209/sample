package collection_eg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hmap = new HashMap<>();
		hmap.put(1, "dhana");
	hmap.put(3, "lachu");
	hmap.put(5, "priya");
	hmap.put(4, "sindu");
	hmap.put(7, "latha");
	hmap.put(4, "sindu");
	
	
	System.out.println(hmap);
	System.out.println(hmap.get(5));
	System.out.println(hmap.containsKey(8));
	
	Iterator itr = hmap.entrySet().iterator();
	
	while(itr.hasNext())
	{
		Map.Entry mentry= (Map.Entry)itr.next();
		
		System.out.println("Key -" +mentry.getKey());
		System.out.println("Value -"+ mentry.getValue());
		
	}
	
	hmap.remove(5);
	System.out.println(hmap);
	Iterator itr2 = hmap.entrySet().iterator();
	while(itr2.hasNext())
	{
		Map.Entry mentry2 = (Map.Entry)itr2.next();
		System.out.println("Key -" +mentry2.getKey());
		System.out.println("Value -"+ mentry2.getValue());
		
	}
	}

}

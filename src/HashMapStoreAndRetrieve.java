import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapStoreAndRetrieve {
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> map = new LinkedHashMap<String, Integer>();
		
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Four", 4);
		
		// Retrieving values
		Set<Entry<String, Integer>> set = map.entrySet();
		Iterator<Entry<String,Integer>> mapEntry = set.iterator();
		while(mapEntry.hasNext()){
			Map.Entry<String, Integer> mapD = mapEntry.next();
			String key = mapD.getKey();
			Integer i = mapD.getValue();
			System.out.println(key);
			System.out.println(i);
		}
		
		// Another way
		for(Map.Entry<String,Integer> entry: map.entrySet()){
			System.out.println(entry.getKey() + entry.getValue());
		}
		
	}

}

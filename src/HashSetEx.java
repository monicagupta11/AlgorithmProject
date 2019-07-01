import java.util.HashMap;
import java.util.HashSet;


public class HashSetEx {
	
	public static void main(String[] args) {
		HashSet<String> hash = new HashSet<String>();
		
		boolean b1= hash.add("monica");
		System.out.println(b1);
		boolean b2 = hash.add("monica");
		System.out.println(b2);
		
		
		HashMap<String,String> map = new HashMap<String, String>();
		String l1 = map.put("one", "1");
		System.out.println(l1);
		String l2 = map.put("one", "10");
		System.out.println(l2);
		System.out.println(map);
		
	}

}

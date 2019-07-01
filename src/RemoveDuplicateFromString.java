import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class RemoveDuplicateFromString {
	
	public static void main(String[] args) {
		
		String str = "BetterButter";
		System.out.println("Removed dup "+removeDuplicate(str));
	}
	
	
	public static String removeDuplicate(String str){
		Set<Character> setChar = new HashSet<Character>();
		StringBuffer buff = new StringBuffer();
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		
		ArrayList list = new ArrayList();
		list.add("monica");
		list.set(0,"ashish");
		System.out.println(list);
		
		
		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
			if (!setChar.contains(c)) {
				setChar.add(c);
				buff.append(c);
				charCountMap.put(c, 1);

			} else {
				charCountMap.put(c, charCountMap.get(c) + 1);
			}

		}
		System.out.println(buff.toString());
		System.out.println(charCountMap);
		return buff.toString();
	}
}

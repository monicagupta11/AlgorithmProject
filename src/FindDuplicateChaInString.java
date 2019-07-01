import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class FindDuplicateChaInString {
	
	public static void main(String[] args) {
		
		String word= "programming";
		char[] chars = word.toCharArray();
		Map<Character , Integer> map = new HashMap<Character, Integer>();
		
		for(Character c : chars){
			
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}
			else{
				map.put(c, 1);
				
			}
		}
		
		System.out.println(map);
		Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
		for(Map.Entry<Character, Integer> entry: entrySet){
			if(entry.getValue()>1)
			System.out.printf("%s : %d %n" ,entry.getKey() ,entry.getValue());
		}
			
		
	}

}

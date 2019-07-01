import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class FindMostStringLine {
	
		
		public static void main(String[] args) {
			
			String word= "a line is line thats it";
			String[] strArray = word.split(" ");
			Map<String , Integer> map = new HashMap<String, Integer>();
			
			for(String c : strArray){
				
				if(map.containsKey(c)){
					map.put(c, map.get(c)+1);
				}
				else{
					map.put(c, 1);
					
				}
			}
			
			System.out.println(map);
			Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
			int largestCount=0;
			String returnWord="";
			for(Map.Entry<String, Integer> entry: entrySet){
				if(entry.getValue()> largestCount){
					largestCount = entry.getValue();
					returnWord = entry.getKey();
				}
				
			}
			
			System.out.println("highest count word is " + returnWord);
				
			
		}

}

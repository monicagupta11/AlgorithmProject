import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class TestListMap {
	
	public static void main(String[] args) {
		
		ArrayList<String> ls = new ArrayList<String>();
		ls.add("one");
		ls.add("one1");
		//System.out.println(ls);
		ls.remove("one");
		//System.out.println(ls);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("one", 1);
		map.put("two",2);	
		
		List<Map<String,Integer>> list = new ArrayList<Map<String,Integer>>();
		list.add(map);
		Integer i=1000;
		Integer j=1000;
		//System.out.println(i==j);
		
		Staff s1= new Staff(10);
		Staff s2= new Staff(10);
		s1=s2;
		System.out.println(s1==s2);
		
		
	
		//System.out.println(map);
		
		java.util.LinkedList<String>  ll= new LinkedList<String>();
		ll.add("one");
		ll.add("two");
		//System.out.println(ll);
		
	}

}

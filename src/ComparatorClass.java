/*import static org.unitils.reflectionassert.ReflectionComparatorFactory.createRefectionComparator;
import static org.unitils.reflectionassert.ReflectionAssert.assertReflectionEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.unitils.reflectionassert.ReflectionComparator;
import org.unitils.reflectionassert.difference.Difference;

public class ComparatorClass {
	
	public static void main(String[] args) {
		
		String s1 = "asksk";
		String s2 = "abc";
		
		List<String> list1 = new ArrayList<String>();
		list1.add("1");
		list1.add("2");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("1");
		list2.add("3");
		
		
		
		  ReflectionComparator reflectionComparator = createRefectionComparator(null);
		  Difference difference = reflectionComparator.getDifference(list1,list2);
		  System.out.println(difference);
		  
		  
		  assertReflectionEquals(s1,s2);
	
		
	}
	
	@Test
	public void test(){
		
		String s1 = "asksk";
		String s2 = "abc";
		
		  assertReflectionEquals(s1,s2);
		
		
	}

}
*/
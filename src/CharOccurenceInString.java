import java.util.HashMap;


public class CharOccurenceInString {
	
	
	    static void characterCount(String inputString)
	    {
	        //Creating a HashMap containing char as a key and occurrences as  a value
	 
	        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
	 
	        //Converting given string to char array 
	        String[] array = inputString.split(" ");
	        System.out.println("array is "+array.toString());
	        char[] strArray = inputString.toCharArray();
	        System.out.println(strArray);
	 
	        //checking each char of strArray
	 
	        for (char c : strArray)
	        {
	            if(charCountMap.containsKey(c))
	            {
	                //If char is present in charCountMap, incrementing it's count by 1
	            	System.out.println(c);
	                charCountMap.put(c, charCountMap.get(c)+1);
	            }
	            else
	            {
	                //If char is not present in charCountMap,
	                //putting this char to charCountMap with 1 as it's value
	            	System.out.println("outside"+c);
	                charCountMap.put(c, 1);
	            }
	        }
	 
	        //Printing the charCountMap
	 
	        System.out.println(charCountMap);
	    }
	 
	    public static void main(String[] args)
	    {
	       //characterCount("Java J2EE Java JSP J2EE");
	 
	       //characterCount("All Is Well");
	 
	       characterCount("BetterButter");
	    }
	

}

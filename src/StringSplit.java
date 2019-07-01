
public class StringSplit {
	
	public static void main(String[] args) {
		// Java program to demonstrate working of split(regex,
		// limit) with small limit.
		
		        String str = "geekss@for@geekss";
		        
		        String [] arrOfStr = str.split("@", 7);
		 
		        for (String a : arrOfStr)
		            System.out.println(a);
		    
		
	}

}

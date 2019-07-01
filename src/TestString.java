import com.sun.xml.internal.ws.util.StringUtils;


public class TestString {
	
	public static void main(String[] args) {

		String str = "This is a 921 message12";
		/*String[] arr = str.split(" ");
		boolean numeric = false;
		
		for (String s1 : arr) {
			numeric = s1.matches("-?\\d+(\\.\\d+)?");
			// System.out.println(s1);
			if (numeric) {
				System.out.println(s1);
			}
		}*/
		
		for(String st: str.split(" ")) {
            if(st.chars().allMatch(Character::isDigit )) {
                //System.out.println("Numeric");
                System.out.println(st);
            }else {
                //System.out.println("String");
            }
        }

		
		/*  String numbers=str.replaceAll("[^0-9]", "");
		  
		  System.out.println("Numbers are: " + numbers);
		 */

	}

}

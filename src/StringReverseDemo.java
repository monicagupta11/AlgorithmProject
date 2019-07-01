import java.util.Arrays;
import java.util.Scanner;


public class StringReverseDemo {
	
	public static void main(String[] args) {
		
		String reverse ="";
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		for(int i = input.length()-1 ; i>=0 ; i--){
			reverse = reverse + input.charAt(i);
		}
		System.out.println("Reverse of string is " + reverse);
		
		// Reverse of words in a string
		// input - my name is Monica
		String str= "My name is Monica";
		String[] array= str.split(" ");
		String s2 = "";
		for(int i=array.length-1 ; i>=0 ; i--){
			
			s2 = s2 + array[i] + " ";
			
		}
		System.out.println("Reverse of words in a string");
		System.out.print(s2);
		System.out.println("");
		
		// checking if string is palindrome or not
		// reeverse the string and check with original string
		if(input.equals(reverse)){
			System.out.println("String is palindrome");
		}else{
			System.out.println("String is not palindrome");
		}
		
		// finding second largest num in array
		int[] intArray= {67,34,98,3,90};
		System.out.println("array" + Arrays.toString(intArray));
		Arrays.sort(intArray);
		System.out.println(Arrays.toString(intArray));
		
		
		
	}
}

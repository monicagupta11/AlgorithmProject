import java.util.Arrays;


public class NumberArray {
	
	public static void main(String[] args) {
		
		
		// finding second largest num in array
				int[] intArray= {67,34,98,3,90};
				System.out.println("array" + Arrays.toString(intArray));
				Arrays.sort(intArray);
				System.out.println(Arrays.toString(intArray));
				System.out.println(intArray[intArray.length-2]);
				
		
		// Fnd missing no in array
		// sum of original aary and expected array n*(n+1)/2 n should be one more number iclusing misiing no cpunt
		int[] array = {1,2,3,5};
		int missedNo = getMissingNo(array,5);
		System.out.println(missedNo);
		
		
		
	}
	
	private static int getMissingNo(int[] array,int n){
		int actualSum=0;
		int expectedSum = n*(n+1)/2;
		
		for(int i: array){
			actualSum = actualSum + i;
		}
				
		return expectedSum-actualSum;
	}

}

import java.util.Arrays;


public class Sort0and1Array {
	
	public static void main(String[] args) {
		
		int[] array = new int[]{0,1,0,1,0,1,1};
		System.out.println("before sort "+Arrays.toString(array));
		sort(array);
		System.out.println("after sort " + Arrays.toString(array));
		
	}
	
	public static void sort(int[] array){
		
		int start = 0;
		int length = array.length-1;
		int end = length;
		
		
		System.out.println("start " + start );
		System.out.println("end " + end );
		int temp=0;
		
		while(start<end){	
			
			while(array[start]==0 && start<end){
				start++;
				System.out.println("inside start " + start );
				
			}
			while(array[end]== 1 && start<end )
			{
				end--;
				
				System.out.println("inside end " + end );
			}
			if(start<end){
				array[start] = 0;
				array[end] = 1 ;
				
				start ++;
				System.out.println("inside else start " + start );
				end--;
				
				System.out.println("inside else end " + end );
			}
		}
	}

}

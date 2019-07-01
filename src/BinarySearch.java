import java.util.ArrayList;
import java.util.Arrays;


public class BinarySearch {
	
	
	public static void main(String[] args) {
		int[] arr = {10,70,90,40,50};
		Arrays.sort(arr);
		System.out.println("Sorted arrays is " + arr);
		
		int first =0;
		int last = arr.length-1;
		int key = 40;
		int result = binarySearch(arr, first, last, key);
		if(result==-1){
			System.out.println("element not found");
		}else
		{
			System.out.println("element is found at index " + result);
		}
		
		
		ArrayList list = new ArrayList<String>();
		list.add("one");
		System.out.println(list.get(0));
		list.add("two");
		System.out.println(list.get(0));
		list.add(0, "three");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
	}
	
	public static int binarySearch(int arr[] , int first , int last , int key){
		
		if(last>=first){
			int mid = first + (last - first)/2;
			System.out.println("mid " + mid);
			if(arr[mid]== key){
				return mid;
			}
			if(arr[mid]>key){
				// key must preent in left subarray
				return binarySearch(arr, first, mid-1, key);
			}
			else{
				return binarySearch(arr, mid+1, last, key);
			}
		}
		
		return -1;
	}

}

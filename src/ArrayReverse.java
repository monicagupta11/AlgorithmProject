import java.util.Scanner;


public class ArrayReverse {
	

		public static void main (String[] args) {
			//code
			Scanner in = new Scanner(System.in);
			
			int T = in.nextInt();
			System.out.println(T);
			
			for (int i = 0; i<T; i++) {
			    int N = in.nextInt();
			    int[] arr = new int[N];
			    
			    for (int j = 0; j<N; j++) {
			        arr[j] = in.nextInt();
			    }
			    
			    for (int j = 0; j<N/2; j++) {
			        int tmp = arr[j];
			        arr[j] = arr[N-1-j];
			        arr[N-1-j] = tmp;
			    }
			    
			    for (int j = 0; j<N; j++) {
			        System.out.print(arr[j] + " ");
			    }
			    
			    System.out.println();
			}
		}

}

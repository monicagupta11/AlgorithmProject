

	
	import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

	class StringReverse {
		public static void main (String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] temp = br.readLine().split(" ");
			System.out.println("first--"+temp.toString());
			int test = Integer.parseInt(temp[0]);
			System.out.println(test);
			while(test-- > 0){
			    temp = br.readLine().split(" ");
			    System.out.println("line"+temp);
			    int len = temp[0].length();
			    int s = len-1, e = len-1, it;
			    while(e >= 0){
			        while(s >= 0 && temp[0].charAt(s) != '.'){
			            s--;
			        }
					it = s+1;
			        while(e>=it){
			            System.out.print(temp[0].charAt(it++));
			        } 
			        if(s > 0){
			            System.out.print('.');
			        }
			        
			        s--;
					e = s;
			    }
				System.out.println();
			}
		}
	

}

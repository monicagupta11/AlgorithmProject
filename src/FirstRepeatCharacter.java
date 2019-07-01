import java.util.HashSet;
import java.util.Scanner;


public class FirstRepeatCharacter {
	
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int t = s.nextInt();
	        s.nextLine();
	        while(t-->0){
	            String str = s.nextLine();
	            int n = str.length();
	            boolean found = false;
	            HashSet<Character> set = new HashSet<>();
	            for(int i=0;i<n;i++){
	                char c = str.charAt(i);
	                
	                if(set.contains(c)){
	                    System.out.println(c);
	                    found = true;
	                    break;
	                }else{
	                    set.add(c);
	                }
	            }
	            if(!found){
	                System.out.println(-1);
	            }
	        }
	}

}

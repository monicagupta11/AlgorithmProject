import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class FileWordSearch {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("input.txt");
		try {
			BufferedReader bf = new BufferedReader(new FileReader(file));
		
		String input="exception";
		int count=0;
		String s;
		while((s=bf.readLine())!=null){
			
			System.out.println(s);
			/*String[] words = s.split(" ");
			for(String s1: words){
				if(s1.equals(input)){
					count++;
				}
				
			}*/
			StringTokenizer st = new StringTokenizer(s);
			while(st.hasMoreTokens()){
				String s2=st.nextToken();
				//System.out.println(s2);
				if(s2.equals(input))
				{
					count++;
				}
			}
			
		}
		
		if(count!=0){
			System.out.println("occurence of word is " + count);
		}
			
		
	}catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}

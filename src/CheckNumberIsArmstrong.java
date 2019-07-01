// number is armstrong when sum of cube of each digit equal to number like 153
public class CheckNumberIsArmstrong {
	
	public static void main(String[] args) {
		
		int n=153;
		int copyOfno = n;
		int a=0;
		int sum=0;
		
		while(copyOfno>0){
			a = copyOfno % 10;
			sum = sum + a*a*a;
			copyOfno = copyOfno/10;
			
		}
		
		if(n== sum){
			System.out.println("yes it is armstrong");
		}
	}

}

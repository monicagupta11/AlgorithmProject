import java.util.ArrayList;


public class MissingNo {
	
	public static void main(String[] args) {
		
	
		 System.out.println("hello");
		/* getMissingNo takes array and size of array as arguments*/
		
		 
		/*program to test above function */
		
		    int a[] = {1,2,4,5,6};
		    int miss = new MissingNo().getMissingNo(a,5);
		    System.out.printf("", miss);
		    
		
	}
	
	 int getMissingNo (int a[], int n)
	{
	    int i, total;
	    total  = (n+1)*(n+2)/2;   
	    for ( i = 0; i< n; i++)
	       total -= a[i];
	    return total;
	}

}

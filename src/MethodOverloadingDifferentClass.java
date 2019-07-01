
public class MethodOverloadingDifferentClass {
	
	 public static void main(String args[]) 
	    { 
	        Base obj = new Derived(); 
	        System.out.println(obj.f(3)); 
	      
	    } 
}
	
	class Base 
	{ 
	    public int f(int i) 
	    { 
	        System.out.print("f (int): "); 
	        return i+3; 
	    } 
	} 
	class Derived extends Base 
	{ 
	    public double f(double i) 
	    { 
	        System.out.print("f (double) : "); 
	        return i + 3.3; 
	    } 
	} 
	 
	   
	



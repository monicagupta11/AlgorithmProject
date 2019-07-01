
public class NoDynamicDispathchWithDataMembers {
	
	 public static void main(String args[]) 
	    { 
	        A a = new B(); // object of type B 
	  
	        // Data member of class A will be accessed 
	        System.out.println(a.x); 
	        
	        B b = new B();
	        System.out.println(b.y);
	       
	    } 
}
	
	class A 
	{ 
	    int x = 10;
	    int y=50;
	} 
	  
	// class B 
	class B extends A 
	{ 
	    int x = 20; 
	    int z = 80;
	} 
	  
	



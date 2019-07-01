
// Java program to illustrate Asynchronous callback 
  
interface OnGeekEventListener { 
  
    // this can be any type of method 
    void onGeekEvent(); 
} 

class EventImpl implements OnGeekEventListener { 
	  
    @Override
    public void onGeekEvent() 
    { 
        System.out.println("Performing callback after Asynchronous Task"); 
        // perform some routine operation 
    } 
    // some class A methods 
} 
  
class AsynchronousExample { 
  
    private OnGeekEventListener mListener; // listener field 
  
    // setting the listener 
    public void registerOnGeekEventListener(OnGeekEventListener mListener) 
    { 
        this.mListener = mListener; 
    } 
  
    // My Asynchronous task 
    public void doGeekStuff() 
    { 
  
        // An Async task always executes in new thread 
        new Thread(new Runnable() { 
            public void run() 
            { 
  
                // perform any operation 
                System.out.println("Performing operation in Asynchronous Task"); 
  
                // check if listener is registered. 
                if (mListener != null) { 
  
                    // invoke the callback method of class A 
                    mListener.onGeekEvent(); 
                } 
            } 
        }).start(); 
    } 
  
    // Driver Program 
    public static void main(String[] args) 
    { 
  
    	AsynchronousExample obj = new AsynchronousExample(); 
        OnGeekEventListener mListener = new EventImpl(); 
        obj.registerOnGeekEventListener(mListener); 
        obj.doGeekStuff(); 
    } 
} 
  


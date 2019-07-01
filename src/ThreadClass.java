
 class ThreadInternal implements Runnable{

	@Override
	public void run() {
		int n=20;
		for(int i=0 ; i<=20 ; i++){
			System.out.println("value of i is "+ i + "thread name is " + Thread.currentThread().getName());
		}
		
	}
	
	

}

public class ThreadClass {
	public static void main(String[] args) {
		Thread thr1 = new Thread(new ThreadInternal());
		thr1.setName(" first thread");
		thr1.start();
		
	}
}

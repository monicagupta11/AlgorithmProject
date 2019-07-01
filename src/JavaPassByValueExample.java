import javafx.collections.ListChangeListener.Change;


class Test{
	int x;
	
	Test(int i){
		x=i;
	}
}
public class JavaPassByValueExample {
	
	/*public static void main(String[] args) {
		 int x=5;
		 int y = change(x);
		 System.out.println("value of x is " + y);
	}
	*/
	public static void main(String[] args) {
		Test t = new Test(3);
		change(t);
		System.out.println(t.x);
	}
	/*public static int change(int x){
		x=10;
		return x;
	}*/
	
	public static void change(Test t){
		t.x=20;
	}

}

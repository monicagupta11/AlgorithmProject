import java.util.ArrayList;


public class NewInstance {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class cls = Class.forName("Staff");
		Staff tf = (Staff) cls.newInstance();
		System.out.println(tf.name);
		
		
	}

}

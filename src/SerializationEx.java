/*import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo implements Serializable
{
	int a;
	String s;
	
	public Demo(int a,String s){
		this.a=a;
		this.s = s;
	}
}

public class SerializationEx {
	public static void main(String[] args) {
		
		Demo demo = new Demo(1,"hurray");
		String fileName = "saveState.ser";
		
		
		try {
			FileOutputStream file = new FileOutputStream(fileName);
			try {
				ObjectOutputStream obj = new ObjectOutputStream(file);
				
				obj.writeObject(demo);
				obj.close();
				file.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Deserialize
		FileInputStream in;
		try {
			in = new FileInputStream(fileName);
			try {
				ObjectInputStream inObj = new ObjectInputStream(in);
				try {
					Demo read = (Demo) inObj.readObject();
					in.close();
					inObj.close();
					System.out.println("Object des" + read.a + " " + read.s );
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
*/
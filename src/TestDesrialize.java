/*import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class TestDesrialize {
	
	public static void main(String[] args) {
        MySerializer object1 = null;

        // Deserialization
        try {
               // Reading the object from a file
               FileInputStream file = new FileInputStream("C:\\Users\\sujpanda\\test\\test\\file.ser");
               ObjectInputStream in = new ObjectInputStream(file);

               // Method for deserialization of object
               object1 = (MySerializer) in.readObject();

               in.close();
               file.close();

               System.out.println("Object has been deserialized ");
               System.out.println("a = " + object1.a);
               System.out.println("b = " + object1.b);
        }

        catch (IOException ex) {
               System.out.println("IOException is caught");
        }

        catch (ClassNotFoundException ex) {
               System.out.println("ClassNotFoundException is caught");
        }

 }



}
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RemoveSpace {

	public static void main(String[] args) {
		// code
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(
					System.in));
			int T = Integer.parseInt(bf.readLine());

			while (T != 0) {
				String str = bf.readLine();
				String str2 = "";
				for (String i : str.split(" ")) {
					System.out.println("i" + i);
					str2 += i;

				}

				System.out.print(str2);
				System.out.println("");
				T--;
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}

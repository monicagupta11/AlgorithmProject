/*import java.util.ArrayList;
import java.util.List;

import org.codehaus.groovy.vmplugin.v7.TypeTransformers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class ReadingJson {
	
	public static void main(String[] args) {
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		
		Staff staff = createDummyObj();
		
		String json = gson.toJson(staff);
		
		System.out.println(json);
		
		Staff readStaff = gson.fromJson(json, Staff.class);
		
		System.out.println(readStaff);
		
		//gson.fromJson(json, new TypeToken<List<Staff>>(){}.getType());
		
	}
	

	
	
	private static Staff createDummyObj(){
		Staff staff = new Staff();
		
		staff.setName("Ramo");
		staff.setAge(34);
		staff.setSalary(10000);
		
		List<String> skills = new ArrayList<String>();
		
		skills.add("java");
		skills.add("Python");
		
		staff.setSkills(skills);
		
		return staff;
		
	}

}
*/
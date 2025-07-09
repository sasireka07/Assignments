package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment5StudentDetails {
	
	public static void main(String[] args) {
		
		
		List<Map<String,String>>studentdetails=new ArrayList<>();
		//Student1 details
		
		Map<String, String> student1=new HashMap<>();
		student1.put("Name","John");
		student1.put("Age","Twenty");
		student1.put("Gender","Male");
		student1.put("Roll number","SBA12345");
		student1.put("Grade","A++");
		student1.put("Major","Computer Science");
		student1.put("GPA","A3.8");
		student1.put("Email","john@example.com");
		student1.put("PAN number","SDF6543210");
		student1.put("Address","23 Elm St");
		//System.out.println(student1);
		
		
		//Student2 details
		
				Map<String, String> student2=new HashMap<>();
				student2.put("Name","Jane Smith");
				student2.put("Age","Twenty One");
				student2.put("Gender","Female");
				student2.put("Roll number","SBA12346");
				student2.put("Grade","B++");
				student2.put("Major","Mathematics");
				student2.put("GPA","A3.6");
				student2.put("Email","johe@example.com");
				student2.put("PAN number","REW6543211");
				student2.put("Address","456 Oak St");
				//System.out.println(student2);
				
		//Student3 details
				
				Map<String, String> student3=new HashMap<>();
				student3.put("Name","Mike Brown");
				student3.put("Age","Twenty Two");
				student3.put("Gender","Male");
				student3.put("Roll number","SBA12347");
				student3.put("Grade","A++");
				student3.put("Major","Physics");
				student3.put("GPA","A3.9");
				student3.put("Email","mike@example.com");
				student3.put("PAN number","TYR6543212");
				student3.put("Address","789 Pine St");
				//System.out.println(student3);	
				
				studentdetails.add(student1);
				studentdetails.add(student2);
				studentdetails.add(student3);
			
				//Header
				System.out.printf("%-10s %-5s %15s %15s %10s %15s %10s %10s %10s %25s\n", "Name","Age","Gender","Roll number","Grade","Major","GPA","Email","PAN number","Address"); 
				System.out.println("========================================================================================================");
				
       for(Map<String,String> det:studentdetails) {
    	 System.out.printf("%-10s %-5s %14s %15s %10s %20s %10s %20s %10s %20s\n",  
    	   det.get("Name"),
    	   det.get("Age"),
    	   det.get("Gender"),
    	   det.get("Roll number"),
    	   det.get("Grade"),
    	   det.get("Major"),
    	   det.get("GPA"),
    	   det.get("Email"),
    	   det.get("PAN number"),
    	   det.get("Address"));
       }
		
	
	}

}
	
	

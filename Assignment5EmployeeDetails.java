package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment5EmployeeDetails {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Map<String,String>>employeedetails=new ArrayList<>();
		//employee1 details
		
		Map<String, String> employee1=new HashMap<>();
		employee1.put("Employee ID","E001");
		employee1.put("Name","Alice Green");
		employee1.put("Age","Thirty");
		employee1.put("Gender","Female");
		employee1.put("Department","Engineering");
		employee1.put("Position","Software Engineer");
		employee1.put("Salary","75K Pounds");
		employee1.put("Email","alice@example.com");
		employee1.put("PAN number","SDF6543210");
		//System.out.println(employee1);
		
		
		//Student2 details
		
		Map<String, String> employee2=new HashMap<>();
		employee2.put("Employee ID","E002");
		employee2.put("Name","Bob Johnson");
		employee2.put("Age","Thirty Eight");
		employee2.put("Gender","Female");
		employee2.put("Department","Marketing");
		employee2.put("Position","Sales Executive");
		employee2.put("Salary","85K Pounds");
		employee2.put("Email","carol@example.com");
		employee2.put("PAN number","REW6543211");
				//System.out.println(employee2);
				
		//employee3 details
				
		Map<String, String> employee3=new HashMap<>();
		employee3.put("Employee ID","E003");
		employee3.put("Name","Carol White");
		employee3.put("Age","Thirty Five");
		employee3.put("Gender","Male");
		employee3.put("Department","Sales");
		employee3.put("Position","Sales Executive");
		employee3.put("Salary","65K Pounds");
		employee3.put("Email","bob@example.com");
		employee3.put("PAN number","TYR6543212");
				//System.out.println(employee3);
				
		employeedetails.add(employee1);
		employeedetails.add(employee2);
		employeedetails.add(employee3);
			
				//Header
				System.out.printf("%-10s %-5s %15s %15s %10s %20s %10s %20s %20s\n", "Employee ID", "Name","Age","Gender","Department","Position","Salary","Email","PAN number"); 
				System.out.println("========================================================================================================");
				
       for(Map<String,String> emp:employeedetails) {
    	 System.out.printf("%-10s %-5s %14s %15s %10s %20s %10s %20s %20s\n",  
    			 emp.get("Employee ID"),
    			 emp.get("Name"),
    			 emp.get("Age"),
    			 emp.get("Gender"),
    	   emp.get("Department"),
    	   emp.get("Position"),
    	   emp.get("Salary"),
    	   emp.get("Email"),
    	   emp.get("PAN number"));

       }
		
	
	}
	
	}

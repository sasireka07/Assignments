package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Assignment5ProductDetails {
	
	public static void main(String[] args) {

		
		List<Map<String,String>>productdetails=new ArrayList<>();
		//employee1 details
		
		Map<String, String> product1=new HashMap<>();
		product1.put("Product ID","P001");
		product1.put("Name","Laptop");
		product1.put("Category","Electronics");
		product1.put("Price","12K Pounds");
		product1.put("Stock Quantity","Not Available");
		product1.put("Supplier","Tech Supplies");
		product1.put("Wranty","2 Years");
		product1.put("Rating","4.5 Stars");
		product1.put("Manufacturing","Aug 2023");
		product1.put("Expiry Date","Aug 2028");
		//System.out.println(product1);
		
		
		//product2 details
		
		Map<String, String> product2=new HashMap<>();
		product2.put("Product ID","P002");
		product2.put("Name","Desk Chair");
		product2.put("Category","Furniture");
		product2.put("Price","150K Pounds");
		product2.put("Stock Quantity","Two Office Depot");
		product2.put("Supplier","Office Depot");
		product2.put("Wranty","1 Years");
		product2.put("Rating","4 Stars");
		product2.put("Manufacturing","Sep 2024");
		product2.put("Expiry Date","N/A");
		//System.out.println(product2);
				
		//product3 details
		
				Map<String, String> product3=new HashMap<>();
				product3.put("Product ID","P003");
				product3.put("Name","Coffee Maker");
				product3.put("Category","Kitchen");
				product3.put("Price","75 Pounds");
				product3.put("Stock Quantity","Two Hundred");
				product3.put("Supplier","KitchenWorld");
				product3.put("Wranty","6months");
				product3.put("Rating","4.2 Stars");
				product3.put("Manufacturing","Jan 2025");
				product3.put("Expiry Date","Jan 2027");
				//System.out.println(product3);
				
				productdetails.add(product1);
				productdetails.add(product2);
				productdetails.add(product3);
			
				//Header
				System.out.printf("%-10s %-5s %15s %15s %10s %30s %10s %20s %20s %30s\n", "Product ID", "Name","Category","Price","Stock Quantity","Supplier Quantity","Supplier","Wranty","Rating","Manufacturing","Expiry Date"); 
				System.out.println("======================================================================================================================================");
				
       for(Map<String,String> prod:productdetails) {
    	 System.out.printf("%-10s %-5s %14s %15s %10s %30s %10s %20s %20s %30s\n",  
    			 prod.get("Product ID"),
    			 prod.get("Name"),
    			 prod.get("Category"),
    			 prod.get("Price"),
    			 prod.get("Stock Quantity"),
    			 prod.get("Supplier"),
    	   prod.get("Wranty"),
    	   prod.get("Rating"),
    	   prod.get("Manufacturing"),
    	   prod.get("Expiry Date"));
       }
	
    	 System.out.println("The Product details of 2nd column supplier name is:");
    			 System.out.println(productdetails.get(1).get("Supplier"));
    	
	}
       
	
	}
	
	

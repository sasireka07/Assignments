package assignments;

import java.util.ArrayList;
import java.util.List;

public class ListLarge5countries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> LargeCountries=new ArrayList<Integer>();
		LargeCountries.add(12093);//1.Newyork
		LargeCountries.add(8231);//2.Tokyo
		LargeCountries.add(7308);//3.Chicago
		LargeCountries.add(5083);//4.Atlanta
		LargeCountries.add(4279);//5.Philadelphia
		
		int thirdarea=LargeCountries.get(2);
		int fourtharea=LargeCountries.get(3);
		int total=thirdarea+fourtharea;
		
		System.out.println("Total area of the 3rd and 4th cities: "+total);
		
}

	}



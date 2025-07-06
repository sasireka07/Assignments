package assignments;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] studentnames= {"Suresh","Naresh","Ramesh"};
		int[ ] studentmarks ={75,80,82};
		
		int marks=studentmarks[0]+10;
		int marks1=studentmarks[1]+10;
		int marks2=studentmarks[2]+10;
		System.out.println("Updated Marks:");
		System.out.println(marks);
		System.out.println(marks1);
		System.out.println(marks2);
		int average=(marks+marks1+marks2)/3;
		System.out.println("Average Marks: "+average);
	}
	}



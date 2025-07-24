package assignments;

public class Assignment15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "Java programming is fun and challenging";

		String result="";
		String a[]=sentence.split(" ");
		
		for (int i =0;i <a.length; i++) {
			System.out.println(a[i]+ " ");

		}
		System.out.println("");
		
	for (int i =a.length-1;i>=0; i--) {
		result=result+a[i]+" ";
		
		
	}
		System.out.println("The reverse word is :"+result);
	}



}
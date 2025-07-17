package assignments;

public class Assignment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		//11,12,34,36,87,93,98
int arr[]= {12 ,34,11,36,87,98,93};
int first=arr[0];
int second=Integer.MIN_VALUE;;
int third=Integer.MIN_VALUE;
 for(int i=1;i<arr.length-1;i++)
 {
	 int number=arr[i];
		 
	 if(number<arr[0])
	 {
		third=second;
		second=first;
		first=number;
		
	 }else if(number>second && number!=first) {
		 third=second;
		 second=number;
	
	 }else if( number>third && number!=first && number!=second) {
		 third=number;
		
	 }
	
 }
 System.out.println("Second Largest: " + second);
 System.out.println("Third Largest: " + third);
 
	}
}

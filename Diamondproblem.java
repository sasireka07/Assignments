package assignments;

public class Diamondproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		
		//upper triangle
		
		/*i=1,space=4 number=1 n=5
		 *i=2,space=3 number=2 n=4
		 * i=3,space=2 number=3 n=3
		 * i=4,space=1 number=4 n=2
		 * i=5,space=5 number=5 n=1
		 */
for(int i=1;i<=n;i++)
{

for(int j=1;j<=n-i;j++)
	{
		System.out.print(" ");
	}
for(int j=1;j<=i;j++) {
System.out.print(j+ " ");
	}
System.out.println();
}

//lower pyramid
/*i=4 number=4 number=n-i 
 * i=3 number=3
 * i=2 number=2
 * i=1 number=1
 */
 
for(int i=1;i<=n-1;i++)
{

for(int j=1;j<=i;j++)
{
	System.out.print(" ");
}
	for(int j = 1; j <= n - i; j++) {
        System.out.print(j + " ");
    }

System.out.println();
}
}
	}

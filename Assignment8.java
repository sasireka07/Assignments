package assignments;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class Assignment8 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int transaction;
//int Amount ;

Map<String, Integer> details=new LinkedHashMap<>();
details.put("1",50000);
details.put("2",-20000);
details.put("3",3000);
details.put("4",-15000);
details.put("5",-200);
details.put("6",-300);
details.put("7",4000);
details.put("8",-3000);

int creditcnt=0;
int debitcnt=0;
int totalcreditamount=0;
int totaldebitamount=0;
int suspuicioucntcnt=0;

//credit amount
System.out.println("Credit transactions completed" );
for (Entry<String, Integer> credit : details.entrySet()) {
	if(credit.getValue()>0)
	{
    System.out.println(credit.getKey()+ "." +credit.getValue());
    creditcnt++;
    totalcreditamount += credit.getValue();
}
}
	System.out.println("Debit transactions completed" );
	for (Entry<String, Integer> debit1: details.entrySet()) {
		if(debit1.getValue() < 0)
		{
	    System.out.println(debit1.getKey()+ "." +debit1.getValue());
	    debitcnt++;
	    totaldebitamount += debit1.getValue();
		}
	
	}
	
	System.out.println("Suspicious Transaction above +10000 or below -10000" );
	for (Entry<String, Integer> suspicious: details.entrySet()) {
		int amount =suspicious.getValue();
		if(amount>10000||amount<-10000)
		{
	    System.out.println(suspicious.getKey()+":" +amount);
	    suspuicioucntcnt++;
	    
		}
	
	}
	int remaingbalance=totalcreditamount+totaldebitamount;
	System.out.println("Total amount credited in account:"+totalcreditamount);
	System.out.println("Total amount debited in account:"+totaldebitamount);
	System.out.println("Remaining balance in account:"+remaingbalance);
	
	}
}


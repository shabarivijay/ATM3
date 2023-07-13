package atmMachine3;

import java.util.Scanner;


public class BalanceEnquery extends PinAccBAl
{
	void balanceEnquery()
	{
		
		Scanner scn=new Scanner(System.in);
		
		if(pin==verifyPin())
		{
			System.out.println("welcome "+name);
			System.out.println("your account balance ="+accBal);
			System.out.println("do u want reciept\n-yes\n-no");
			String reciept=scn.next();
			if("yes".equals(reciept)) 
			{
				System.out.println("wait.........\n");
				for(int i=0;i<2;i++)
				{
					System.out.println(" ");
				}
				System.out.println("collect the reciept");
			}
			else if("no".equals(reciept))
			{
				System.out.println("okay");
			}
			
		}
		else
		{
			System.out.println("\nincorrect password");
		}
		
	}

}

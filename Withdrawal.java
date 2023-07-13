package atmMachine3;

import java.util.Scanner;



public class Withdrawal extends PinAccBAl
{
	void withdrawal()
	{
		Scanner scn=new Scanner(System.in);
		
				if(pin==verifyPin())
				{
					System.out.println("welcome "+name);
					System.out.println("\nplz enter the amount to be withdrawn");
					double withdrawalAmt=scn.nextDouble();
					if(withdrawalAmt<accBal)
					{
						System.out.println("transaction successful");
						accBal=accBal-withdrawalAmt;
						System.out.println("your accBal is="+accBal);
					}
					else
					{
						System.out.println("insufficient funds");
					}
				}
				else
				{
					System.out.println("\nincorrect password");
				}
		
		
	}

}

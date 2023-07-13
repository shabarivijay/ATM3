package atmMachine3;



public class MiniStatement extends PinAccBAl
{
	void miniStatement()
	{
		
	
		
		if(pin==verifyPin())
		{
			System.out.println("\nwelcome "+name);
			System.out.println("\n(12-05-2018)your transaction=4500rs\n(15-05-2018)your transaction=8000rs\n(18-05-2018)your transaction=7900rs\n(29-05-2018)your transaction=10000rs\n(10-06-2018)your transaction=5000rs\n(15-06-2018)your transaction=10000rs\n");
			System.out.println("\n            your accountBalance ="+accBal);
		}
		else
		{
			System.out.println("\nincorrect password");
		}
	}

}

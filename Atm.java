package atmMachine3;

import java.util.Scanner;


public class Atm 
{

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		Withdrawal Withdrawal=new Withdrawal ();
		BalanceEnquery BalanceEnquery=new BalanceEnquery();
		MiniStatement MiniStatement=new MiniStatement();

		
		System.out.println("welcome to ATM");
		System.out.println("english\nkannada\nhindi");
		String language=scn.next();
		if("english".equals(language))
		{
			System.out.println("current");
			System.out.println("savings");
			String opt=scn.next();
			if("savings".equals(opt))
			{
				System.out.println("withdrawal\nbalanceEnquery\nminiStatement");
			
	     String enter=scn.next();
	     switch(enter)
	     {
	     case  "withdrawal":
	    	 Withdrawal.withdrawal();
	    	 break;
	    	 
	     case "balanceEnquery":
	    	 BalanceEnquery.balanceEnquery();
	    	 break;
	    	 
	     case "miniStatement":
	    	 MiniStatement.miniStatement();
	    	 break;
	      }
	    	}
			else if ("current".equals(opt))
			{
				System.out.println("current page");
			}
			

}
		else if("kannada".equals(language))
		{
			System.out.println("current");
			System.out.println("savings");
			String opt=scn.next();
			if("savings".equals(opt))
			{
				System.out.println("withdrawal\nbalanceEnquery\nminiStatement");
			
	     String enter=scn.next();
	     switch(enter)
	     {
	     case  "withdrawal":
	    	 Withdrawal.withdrawal();
	    	 break;
	    	 
	     case "balanceEnquery":
	    	 BalanceEnquery.balanceEnquery();
	    	 break;
	    	 
	     case "miniStatement":
	    	 MiniStatement.miniStatement();
	    	 break;
	      }
	    	}
			else if ("current".equals(opt))
			{
				System.out.println("current page");
			}
			

}
		
		if("hindi".equals(language))
		{
			System.out.println("current");
			System.out.println("savings");
			String opt=scn.next();
			if("savings".equals(opt))
			{
				System.out.println("withdrawal\nbalanceEnquery\nminiStatement");
			
	     String enter=scn.next();
	     switch(enter)
	     {
	     case  "withdrawal":
	    	 Withdrawal.withdrawal();
	    	 break;
	    	 
	     case "balanceEnquery":
	    	 BalanceEnquery.balanceEnquery();
	    	 break;
	    	 
	     case "miniStatement":
	    	 MiniStatement.miniStatement();
	    	 break;
	      }
	    	}
			else if ("current".equals(opt))
			{
				System.out.println("current page");
			}
			

}
	}

}

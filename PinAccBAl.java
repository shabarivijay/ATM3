package atmMachine3;

import java.util.Scanner;

public class PinAccBAl
{
	double accBal=80000;
	String name="shabariVijay";
	int pin=1234;
	
	  int verifyPin()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("plz enter the pin");
		int pin =scn.nextInt();
		return pin;
	}

}

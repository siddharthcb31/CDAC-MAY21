//8.Write a program to find the simple interest. Take the principle amount, rate of interest and time from user using Scanner class.

import java.util.*;

class Intrest
{
	public static void main(String []args)

	{


		Scanner sc = new scanner(System.in);
		System.out.println("Enter principle amount")
		int p = sc.nextInt();
		System.out.println("Enter rate of intrest")
        int r = sc.nextInt();
        System.out.println("Enter time period")
        int t = sc.nextInt();
        int SI = (p*t*r)/100;

        System.out.println("simple interest:"+SI);

    }
}

        
        
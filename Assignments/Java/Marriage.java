/*15.Accept person’s gender (character m for male and f for female), age (integer), as input and then check whether person is eligible for marriage or not.*/


import java.util.*;

class Marriage
{
	public static void main(String []args)

	{

         Scanner sc = new Scanner(System.in);
         System.out.println("Check whether you are eligible for Marriage or not");
         System.out.print("Enter your gender: m/f:"+" ");
         char gender=sc.next().charAt(0);
         System.out.print("Enter your age:");
         int age=sc.nextInt();

         if(gender=='m')
           { 
         	if (age >= 21)
               System.out.print("congratulations you can marry now");
               else 
               System.out.print("bad luck go and study first");
           }   
          else if(gender=='f') 
           {
            if (age>=18)
             System.out.print("congratulations you can marry now");
          else
            System.out.print("bad luck go and study first");
           }


    }       

}		
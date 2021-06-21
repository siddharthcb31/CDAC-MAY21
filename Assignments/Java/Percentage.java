/*7.Write a program to calculate sum of 5 subject’s marks & find percentage. Take the obtained marks from user using Scanner class. Output should be in this format [ percentage marks = 99 % ]. Use concatenation operator here.*/



import java.util.*;

class Percentage
{
	public static void main(String []args)

	{
        
        int m1,m2,m3,m4,m5;

        float percentage;

       Scanner sc = new Scanner (System.in);

       m1=sc.nextInt();
       m2=sc.nextInt();
       m3=sc.nextInt();
       m4=sc.nextInt();
       m5=sc.nextInt();

       int total = m1+m2+m3+m4+m5;

       percentage=(total/500)*100;

       System.out.println("percentage is:"+total+"%");

   }
}





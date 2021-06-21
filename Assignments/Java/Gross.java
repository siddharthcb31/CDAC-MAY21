/*In a company an employee is paid as under: If his basic salary is less than Rs. 10000, then HRA = 10% of basic salary and DA = 90% of basic salary. If his salary is either equal to or above Rs. 10000, then HRA = Rs. 2000 and DA = 98% of basic salary. If the employee's salary is input by the user write a program to find his gross salary. [ formula : GS= Basic + DA + HRA ] */



import java.util.*;

class Gross
{
	public static void main(String []args)

	{
       float salary,hra,da,gs;
         
     Scanner sc = new Scanner (System.in);
     System.out.println("Enter salary:"); 
     salary=sc.nextInt();
     
     if(salary<10000)
     {
   
        da=salary*10/100;
        hra=salary*90/100;
     } 

     else{
         
        da=2000;
        hra=salary*98/100;
     }

     gs=salary+da+hra;

     System.out.println("Gross salary:"+gs);


 }}
/*9.Write a program to read the days (eg. 670 days) as integer value using Scanner class. Now convert the entered days into complete years, months and days and print them.*/



import java.util.*;

class Day{
	public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int day=sc.nextInt();
    int year=(day/365);
    int months=(day%365)/30;
    int days=(day%365)%30;

    System.out.println(year+" "+months+" "+days);
}
}
/*10.Write a program to convert temperature from Fahrenheit to Celsius. Take Fahrenheit as input using Scanner class. [ formula : C= 5*(f-32)/9 ] */


import java.util.*;

class ConverterFC{
	public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Tempreture in fahrenheit:");
    int fah =sc.nextInt();


    float C= 5*(fah-32)/9;

    System.out.println("Tempreture in celsius:"+C);

}
}


    
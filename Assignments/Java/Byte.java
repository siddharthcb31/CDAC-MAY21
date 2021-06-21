//Write a program that initializes 2 byte type of variables. Add the values of these variables and store in a byte type of variable. [Note: primitive down casting is required in this program ]

import java.util.*;

class Byte
{
	public static void main(String []args)

	{

         Scanner sc = new Scanner(System.in);
         byte x= sc.nextByte();
         byte y= sc.nextByte();
         byte z;
         z = (byte)(x+y);

         System.out.print(z);

    }     
 }   
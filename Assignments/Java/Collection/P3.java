//3.Write a Java program to insert an element into the array list at the first position.

import java.util.*;

public class P3{

	public static void main(String[]args){

		ArrayList<String>list=new ArrayList<String>();

       list.add("yellow");
       list.add("white");
       list.add("green");
       list.add("pink");
       list.add("brown");

       System.out.print(list);
       list.add(0, "green");

       System.out.print(list);



	}

}
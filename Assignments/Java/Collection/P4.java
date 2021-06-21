//4. Write a Java program to retrieve an element (at a specified index) from a given array list.

import java.util.*;

public class P4{

	public static void main(String[]args){

		ArrayList<String>list=new ArrayList<String>();

       list.add("yellow");
       list.add("white");
       list.add("green");
       list.add("pink");
       list.add("brown");

       System.out.println(list);
       
       String retrieve = list.get(0);

       System.out.println("element:"+retrieve);

       retrieve = list.get(3);

       System.out.println("element:"+retrieve);




	}

}
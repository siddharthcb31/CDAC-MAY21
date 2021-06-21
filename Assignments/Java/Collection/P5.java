//5. Write a Java program to update specific array elements by a given element. 

import java.util.*;

public class P5{

	public static void main(String[]args){

		ArrayList<String>list=new ArrayList<String>();

       list.add("yellow");
       list.add("white");
       list.add("green");
       list.add("pink");
       list.add("brown");

       System.out.println("before update" +list);
       
       list.set(2, "Black");

       System.out.print("after update" +list);



	}

}
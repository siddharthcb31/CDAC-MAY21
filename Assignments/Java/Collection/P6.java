//6. Write a Java program to remove the third element from an array list. 


import java.util.*;

public class P6{

	public static void main(String[]args){

		ArrayList<String>list=new ArrayList<String>();

       list.add("yellow");
       list.add("white");
       list.add("green");
       list.add("pink");
       list.add("brown");

       System.out.println("before remove" +list);
       
       list.remove(2);

       System.out.print("after update" +list);



	}

}
//1. Write a Java program to create a new array list, add some colors (string) and print out the collection


import java.util.*;

public class P1{
	public static void main(String[]args){
ArrayList<String>list=new ArrayList<String>();
list.add("Yellow");
list.add("black");
list.add("green");
list.add("blue");
list.add("green");

for(String e: list){
	System.out.println(e);

}
	}
}

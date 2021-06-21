//2. Write a Java program to iterate through all elements in an array list. 



import java.util.*;

public class P1{
	public static void main(String[]args){
ArrayList<String>list=new ArrayList<String>();
list.add("Yellow");
list.add("black");
list.add("green");
list.add("blue");
list.add("green");

iterator<String>itr=list.iterator();
while(itr.hasNext()){
String i=itr.next();
System.out.println(i);

}
}
	}




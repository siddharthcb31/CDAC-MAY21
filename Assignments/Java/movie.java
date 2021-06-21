import java.util.*;
class info{
String movie_name;
float rating;
String movie_hero ;
Scanner sc= new Scanner (System.in);

void movie_info()
{
System.out.println("enter the movie name");
movie_name= sc.next();

System.out.println("enter the movie rating");
rating= sc.nextInt ();

System.out.println("enter the movie hero");
 movie_hero= sc.next ();
}
void display()
{
System.out.print(movie_name + " "+ movie_hero+" "+ rating+" ");
System.out.println();

}
}

class movie{
public static void main (String [] args ){
info s1= new info();
s1.movie_info();
s1.display();

info s2= new info();
s2.movie_info();
s2.display();

}}















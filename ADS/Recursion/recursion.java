
class recursion
{   
	static int i=0;
	static void show()
	{
		 i++;
		 if(i<=5)
		 {	
          System.out.println("hii");
          show();
         
          }         
	}

public static void main(String[] args) 
	{
		System.out.println("hi....");
         show();

	}

}

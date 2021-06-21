//factorial

class recursion1
{
	static int fact(int n)
	 {    //basse condition
          if(n<=1)
          	return 1;
          //recursion
          else
          	return n*fact(n-1);

	 }

public static void main(String[] args) 
	{
       System.out.println(fact(3));

    }

}

/* 5*fact(4)
           4*fact(3)
                3*fact(2)
                    2*fact(1) */


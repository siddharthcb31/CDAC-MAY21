class BinaryS{
	public static void main(String []args){

       int[]a={1,2,4,5,7,9,44,55,66,77};
       int x=55;
       int l=0;
       int h = a.length-1;
       int m= (l+h)/2;

        while(l<=h)
        {

        	if(a[m]==x)
        	{

        		System.out.println("element is at " + m + " position");
        		break;
        	}
        	else if(a[m]<x)
        	{

                l=m+1;
            }
            else
            {
        	   l=m-1;
            } 
            m=(l+h)/2;
        }
       
        if(l>h){
     	System.out.println("element not found");
     }
    }

}
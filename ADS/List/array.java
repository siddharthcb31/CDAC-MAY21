class array
{
 public static void main(String[]args) 
	{

	int a1[];
	a1=new int[100];
	int n=0;
	int j;

      a1[0]=22;
      a1[1]=21;
      a1[2]=32;
      a1[3]=43;
      a1[4]=44;
      a1[5]=4;
      a1[6]=44;
      a1[7]=11;
      a1[8]=56;
      a1[9]=55; 
      
      n=10;
      //display
      for(j=0;j<n;j++)
      {
      	System.out.print(a1[j]+" ");
      }        
         //search
       System.out.println("****************************************");             
       int key=55;
       for(j=0;j<n;j++)
       {
            
             if(a1[j]==key)
             	break;
        }
        if (a1[j]==n)
        	System.out.println(" not found");
        else
        	System.out.println("found");

        //delete
         System.out.println();
         key=55;
         for(j=0;j<n;j++)
         {
                 
               if(a1[j]==key)
               	break;
         }
         for (int k=j;k<n;k++)
         {
         	a1[k]=a1[k+1];
         }
         n--;
         for(j=0;j<n;j++)
      {
      	System.out.print(a1[j]+" ");
      }        
      }        

      }        


    

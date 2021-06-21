class Q1{
private int size;
private int []Q1;
private int front;
private int rear;
private int n;

public Q1(int s)
{
	size=s;
	Q1 = new int[size];
	front = 0;
	rear = -1;
	n=0; // number of elements
}

public void enqueue(int j)
  {
       // overflow condition
  	if(rear == size-1)
  		rear = -1;
  	Q1[++rear] = j;
  	n++;
   }
  public int dequeue ()
  { 
    // underflow condition 
  	int t = Q1[front++];

  	if(front == size)
  		front = 0;
  	n--;
    
    return t;

  }

   public int peakFront()
   {
   	return Q1[front];
   }

 public boolean isEmpty()
   {
    return(rear==-1);
   }

 public boolean isFull()
   {
 	return (rear == size-1);
   }

public int count()
{
	return n;
}

}
class Queue{
	public static void main(String []args){

    Q1 q = new Q1(7);

    q.enqueue(10);
     q.enqueue(11);
      q.enqueue(12);
       q.enqueue(13);

    q.dequeue();
    
    while(!q.isEmpty())
    {
    	int n = q.dequeue();
    	System.out.println(n);
    }    


	}
}
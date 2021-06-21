public class Q
{
	int front;
	int rear;
	int size;
	int arr[];
	int n;

public Q(int s)
{
	fornt = 0;
	rear = 0;
    Q=new int[size];
	s= size;
	n=0;
}

public boolean isEmpty()
{
	return rear == -1;
}
public boolean isFull()
{
	return front == size-1;
}

public void enqueue(int data){
	if(isFull()){
		System.out.println("queue is full");
        System.exit(0); 		
	}
	System.out.println(data);
	rear=rear+1;
	arr[rear]=data;      
}
public void dequeue(){
	if(isEmpty()){
		System.out.println("queue is empty");
        System.exit(0); 		
	}
	System.out.println(data);
	front=front+1;
	return arr[front];      
}

}


class QueueArray3
{
	public static void main(String []args)
	{
                Q qa = new Q(5);	
       System.out.println("------------enqueue the data--------");
       qa.enqueue(10); 
       qa.enqueue(32); 
       qa.enqueue(14); 
       qa.enqueue(68); 
           
       System.out.println("-------------dequeue the data-----------");
       qa.dequeue(); 
       qa.dequeue(); 
	}
}
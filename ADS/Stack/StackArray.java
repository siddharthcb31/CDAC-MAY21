public class StackArray{
  int top;
  int arr[];
  int cap;

  public StackArray(int size){
  	top=-1;
  	arr=new int[size];
  	cap= size;
}

public boolean isEmpty(){
	return top == -1;
}
public boolean isFull(){
	return top == cap-1;
}

public void push(int data){
	if(isFull()){
		System.out.println("Stack is full");
        System.exit(0); 		
	}
	System.out.println(data);
	arr[++top]=data;                        
}

 public int pop(){
 	if(isEmpty()){
 		System.out.println("Stack is Empty");
        System.exit(0); 
       }
       System.out.println(arr[top]);
	   return arr[top--];  
	}

public static void main(String[] args) 
	{
	StackArray sa = new StackArray(4);	
       System.out.println("------------push the data--------");
       sa.push(10);
       sa.push(5);
       sa.push(17);
       System.out.println("-------------pop the data-----------");
       sa.pop();
       sa.pop();
       
    }
}
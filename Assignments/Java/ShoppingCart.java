import java.util.*;
class cartItem
{
	int itemId;
	String itemName;
	float amount;
	int quantity;
	float totalAmount;

	cartItem(int itemId, String itemName, float amount, int quantity, float totalAmount)
	{
	 this.itemId = itemId;
	 this.itemName = itemName;
	 this.amount = amount;
	 this.quantity = quantity;
	 this.totalAmount = totalAmount;
	}
}

class cartoperation{

	Scanner sc = new Scanner(System.in);
	ArrayList<cartItem> cartList = new ArrayList<cartItem>();

	void addItem(){

	System.out.println("Add Item Info:---->");
	System.out.println("Enter item Id : ");
    int id = sc.nextInt();

    System.out.println("Add Item name : ");
    String name = sc.next();

    System.out.println("Add Amount (for Single item): ");
    float amount = sc.nextFloat();

    System.out.println("Enter Quantity : ");
    int quantity = sc.nextInt();

    float totalAmount = (float)(amount*quantity);

    cartItem i = new cartItem(id, name, amount, quantity, totalAmount);
    cartList.add(i);
    }

    void removeItem(){

    System.out.println("Enter Item Name");
    String searchName = sc.next();

    ListIterator point = cartList.listIterator();
    boolean flag = false;

    while (point.hasNext())
    {
     cartItem i1 = (cartItem)point.next();
     if(i1.itemName.equals(searchName))
     {
      point.remove();
      flag=true;
     }
    }
      if(flag==false){ 

      	System.out.println("****************************");
        System.out.println("Item is not present in List");
     }
       }

     void displayItem(){

     if(cartList.isEmpty())
     {
      System.out.println("List is Empty");
     }
      else{
      System.out.println("-----------------------LIST ITEMS--------------------");
      for(cartItem x : cartList)
      { 
        System.out.println("-------------------------------------------");
        System.out.println("item Id --> "+x.itemId);
        System.out.println("item Name --> "+x.itemName);
        System.out.println("item ammount per each --> "+x.amount);
        System.out.println("item total Quantity --> "+x.quantity);
        System.out.println("item total Amount --> "+x.totalAmount);
        System.out.println("-------------------------------------------");
        }
		 }
		 }
		 void checkout()
		 {
		  ListIterator checkoutpointer = cartList.listIterator();
		  System.out.println("----------------Checkout Bill------------------------");
		  for(cartItem x : cartList)
		  {
		   System.out.println("-------------------------------------------");
		   System.out.print("\titem Id --> "+x.itemId);
           System.out.print("\titem Name --> "+x.itemName+"\n");
           System.out.println("\titem Total ammount --> "+x.totalAmount+" => "+x.amount +" x "+x.quantity);
           System.out.println("-------------------------------------------");
           }

           float sum = 0.00f;
           while (checkoutpointer.hasNext())
           {
            cartItem i1 = (cartItem)checkoutpointer.next();
            sum += i1.totalAmount;
            }
            System.out.println("------------------TOTAL CART AMOUNT -----------------");
            System.out.println("\ttotal amount to pay : " +sum);
            System.exit(0);
            }
            void emptyCart(){
            cartList.clear();
            System.out.println("All items has been Removed Succefully from the cart!!!!! \n \t \t Visit Again!!!");}
            }

            class Menu{
            Scanner sc1 = new Scanner(System.in);
            void MenuList(){
            cartoperation op = new cartoperation();
            int ch = 0;
            do{
            System.out.println("_______________________________________________");
            System.out.println("--------------------Menu-----------------------");
            System.out.println("_______________________________________________");
            System.out.println("\n1 add an item to your cart \n2 remove an item from your cart \n3 view the items in your cart \n4 end shopping and go to checkout \n5 empty your cart \n6 exit the program.");
            System.out.println("_______________________________________________");
            System.out.println("Enter your choice: ");
            ch = sc1.nextInt();
            switch(ch)
            {
case 1 :
op.addItem();
 break;
 case 2 :
 op.removeItem();
break;
case 3 :
op.displayItem();
break;
 case 4 :
op.checkout();
break;
case 5 :
 op.emptyCart();
 break;
 case 6:
System.exit(0);
break;

 }


System.out.println("Do You Want To continue?? \n press 1. continue \n press 2. exit");
 ch=sc1.nextInt();
}
 while(ch==1);
 }
} //driver class
public class ShoppingCart
 {
 public static void main(String args[])
 {

 Menu m1 = new Menu();
 m1.MenuList(); }}



 







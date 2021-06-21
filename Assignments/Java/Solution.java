import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Bank
{
    String acc_no;
    String holder_name;
    
    Scanner sc = new Scanner(System.in);
    
    void openaccount()
    {
        
        System.out.println("Enter Account number: ");
        acc_no = sc.nextLine();
        System.out.println("Enter Holder name: ");
        holder_name = sc.nextLine();
    }
    
    void showinfo()
    {
        System.out.println("Account number" +acc_no);
        System.out.println("Holder namr" +holder_name);
    }
    void deposit()
    {
        long amt;
        long balance = 0;
        System.out.println("Enter amount for deposit");
        amt = sc.nextLong();
        balance=balance + amt;
        System.out.println("Balance: "+balance);
    }
    void withdraw()
    {
        long amt=0;
        long balance=0;
        if(balance>=amt)
        {
            System.out.println("Enter withdrawal amount");
            amt = sc.nextLong();
            balance = balance - amt;
            System.out.println("Balance" +balance);
        }
    }
    
    boolean search(String acn) {
        if (acc_no.equals(acn)) {
            showinfo();
            return (true);
        }
        return (false);
    }
        
}

public class Solution {
    
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        
        Scanner KB = new Scanner(System.in);

        //create initial accounts
        System.out.print("How Many Customer U Want to Input : ");
        int n = KB.nextInt();
        Bank C[] = new Bank[n];
        for (int i = 0; i < C.length; i++) {
            C[i] = new Bank();
            C[i].openaccount();
        }

        //run loop until menu 5 is not pressed
        int ch;
        do {
            System.out.println("Main Menu\n1. Display All\n 2. Search By Account\n 3. Deposit\n 4. Withdrawal\n 5.Exit ");
                System.out.println("Ur Choice :"); ch = KB.nextInt();
                switch (ch) {
                    case 1:
                        for (int i = 0; i < C.length; i++) {
                            C[i].showinfo();
                        }
                        break;

                    case 2:
                        System.out.print("Enter Account No U Want to Search...: ");
                        String acn = KB.next();
                        boolean found = false;
                        for (int i = 0; i < C.length; i++) {
                            found = C[i].search(acn);
                            if (found) {
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Search Failed..Account Not Exist..");
                        }
                        break;

                    case 3:
                        System.out.print("Enter Account No : ");
                        acn = KB.next();
                        found = false;
                        for (int i = 0; i < C.length; i++) {
                            found = C[i].search(acn);
                            if (found) {
                                C[i].deposit();
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Search Failed..Account Not Exist..");
                        }
                        break;

                    case 4:
                        System.out.print("Enter Account No : ");
                        acn = KB.next();
                        found = false;
                        for (int i = 0; i < C.length; i++) {
                            found = C[i].search(acn);
                            if (found) {
                                C[i].withdraw();
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Search Failed..Account Not Exist..");
                        }
                        break;

                    case 5:
                        System.out.println("Good Bye..");
                        break;
                }
            }
            while (ch != 5);
        }
    }

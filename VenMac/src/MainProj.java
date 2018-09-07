import java.util.Scanner;
import java.lang.*;
import java.io.*;
public class MainProj {
	 
	public static int Quantity()
	{  Scanner s=new Scanner(System.in);
	     int n,price1=0;
		System.out.println("1.100ml \t\t\t\t Price:20Rs");
		System.out.println("2.200ml \t\t\t\t Price:30Rs");
		System.out.println("3.450ml \t\t\t\t Price:50RS");
		n=s.nextInt();
		if(n==1)
			price1=20;
		if(n==2)
			price1=30;
		if(n==3)
			price1=50;
		return price1;
	}
	public static void main(String[] args) {
		 int c,count,bill=0,bill1=0,bill2=0,bill3=0,bill4=0,price,amount,extra,quantity=0;
		  Scanner s=new Scanner(System.in);
		System.out.println("*********menu*********");
		System.out.println("1.Coke");
		System.out.println("2.Sprite");
		System.out.println("3.Milkshake");
		System.out.println("4.Water ");
		System.out.println("5.Exit");
		System.out.println("6.Pay bill");
		
		while(true){
		System.out.println("enter your choice");
		
		c=s.nextInt();
       switch(c)
       {
       case 1: System.out.println("Enter the quantity");
                price=Quantity();
                System.out.println("Enter no.of bottles");
                 count=s.nextInt();
                 bill1+=count*price;
				 break;
		case 2:	System.out.println("Enter the quantity");
                price=Quantity();
                System.out.println("Enter no.of bottles");
                 count=s.nextInt();
                 bill2+=count*price;
				 break;
        case 3:System.out.println("Enter the quantity");
                price=Quantity();
                System.out.println("Enter no.of bottles");
                 count=s.nextInt();
                 bill3+=count*price;
				 break;
	    case 4:System.out.println("Enter the quantity");
                price=Quantity();
                System.out.println("Enter no.of bottles");
                 count=s.nextInt();
                 bill4+=count*price;
				 break;
		case 5: System.exit(0);
		case 6:System.out.println("Insert the Amount ");
		        amount=s.nextInt();
				while(amount<bill)
				{
					System.out.println("insert exttra  "+(bill-amount)+"Rs");
				    extra=s.nextInt();
					amount=amount+extra;
				}
				 if(amount==bill)
					 System.out.println("ThankYou! VisitAgain!");
				if(amount>bill)
					System.out.println("Please Collect "+(amount-bill)+"Rs");
				System.exit(0);
       }
	   bill=bill1+bill2+bill3+bill4;
	   System.out.println("Bill:"+bill);	}
	}

}

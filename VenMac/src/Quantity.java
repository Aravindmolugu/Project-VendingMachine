import java.util.Scanner;

public class Quantity {
	   int ch,count,bill,bill1=0,bill2=0,bill3=0;
	public void menu(){
	
		System.out.println("List of Quantities available");
		System.out.println("1.100ml \t\t\t\t 20");
		System.out.println("2.200ml \t\t\t\t 30");
		System.out.println("3.450ml \t\t\t\t 50");
		
		
		Scanner s=new Scanner(System.in);
		ch=s.nextInt();
		if(ch==1) {
			
			System.out.println("enter no.of items ");
			count=s.nextInt();
			bill1=count*20;
		}
			if(ch==2) {
				
				System.out.println("enter no.of items ");
				count=s.nextInt();
				bill2=count*30;}
				if(ch==3) {
					
					System.out.println("enter no.of items ");
					count=s.nextInt();
					bill3=count*50;}
			bill=bill1+bill2+bill3;	
			System.out.println("Total Bill:"+bill);
		}
}

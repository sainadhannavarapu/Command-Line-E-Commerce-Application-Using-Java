package Ecommerce_Categories;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
interface example
{
	public void brand();
	public void range();
	public void display();
}
public class Appliances implements example
{
	Scanner input=new Scanner(System.in);
	int ch,min,max,price;
	String brand,range;
	String model;

	public void brand()
	{
		System.out.println("1-Televisions\n2-Refrigerators\n3-WashingMachines");
	    System.out.println("Enter your Choice:");
	    ch=input.nextInt();
		if(ch==1)
	    {
	    	brand="Televisions";
	    }
	    else if(ch==2)
	    {
		    brand="Refrigerators";
	    }
	    else if(ch==3)
	    {
		    brand="WashingMachines";
	    }
	    else
	    {
		    System.out.println("Invalid Brand!");
	    }
	}
    public void range()
    {
    	System.out.println("1)15000-29999\n2)30000-44999\n3)45000-64999");
	    System.out.println("Enter your Choice:");
	    ch=input.nextInt();
		if(ch==1)
	    {
	    	range="X";
	    	min=15000;
	    	max=29999;
	    	price=(int)(Math.random()*(max-min+1)+min);
	    	System.out.println("Price:"+price);
	    }
	    else if(ch==2)
	    {
		    range="Y";
		    min=30000;
	    	max=44999;
	    	price=(int)(Math.random()*(max-min+1)+min);
	    	System.out.println("Price:"+price);
	    }
	    else if(ch==3)
	    {
		    range="Z";
		    min=45000;
	    	max=64999;
	    	price=(int)(Math.random()*(max-min+1)+min);
	    	System.out.println("Price:"+price);
	    }
	    else
	    {
		    System.out.println("Invalid Brand!");
	    }
	}
	public void display()
	{
	    model=brand.concat(range);
	    System.out.println(model);
	    System.out.println("Do you want to buy it?\nEnter 1-Yes\tAny other key-No");
	    int c=input.nextInt();
	    if(c==1)
	    {
	        try
	        {
	        	BufferedWriter br = new BufferedWriter( new FileWriter("D:\\501\\Order.txt", true));
	        	br.write(model+" ordered successfully!");
	        	br.append('\n');
	        	br.write("Total Price:"+price);
	        	br.append('\n');
	        	br.write("Order will be dispatched in 3-4 Working days!");
	        	br.append('\n');
	        	br.close();
	        	System.out.println("Order confirmation is sent to Order.txt");
	        	System.out.println("Thank You!!!");
	        }
                         catch(Exception e)
                         {
                                   System.out.println("file not found");
                                   java.lang.System.exit(0);
                          }
	}
        }
	
}

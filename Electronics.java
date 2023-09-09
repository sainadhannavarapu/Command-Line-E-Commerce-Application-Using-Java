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
public class Electronics implements example
{
	Scanner input=new Scanner(System.in);
	int ch,min,max,price;
	String brand,range;
	String model;

	public void brand()
	{
		System.out.println("1-Laptops\n2-SmartWatches\n3-Cameras");
	    System.out.println("Enter your Choice:");
	    ch=input.nextInt();
		if(ch==1)
	    {
	    	brand="Laptops";
	    }
	    else if(ch==2)
	    {
		    brand="SmartWatches";
	    }
	    else if(ch==3)
	    {
		    brand="Cameras";
	    }
	    else
	    {
		    System.out.println("Invalid Brand!");
	    }
	}
    public void range()
    {
    	System.out.println("1)25000-49999\n2)50000-99999\n3)100000-299999");
	    System.out.println("Enter your Choice:");
	    ch=input.nextInt();
		if(ch==1)
	    {
	    	range="X";
	    	min=25000;
	    	max=49999;
	    	price=(int)(Math.random()*(max-min+1)+min);
	    	System.out.println("Price:"+price);
	    }
	    else if(ch==2)
	    {
		    range="Y";
		    min=50000;
	    	max=99999;
	    	price=(int)(Math.random()*(max-min+1)+min);
	    	System.out.println("Price:"+price);
	    }
	    else if(ch==3)
	    {
		    range="Z";
		    min=100000;
	    	max=299999;
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

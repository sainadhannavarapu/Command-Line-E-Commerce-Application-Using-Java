import Ecommerce_Categories.*;
import java.util.Scanner;
class Ecommerce extends User1
{
    public static void main(String[] args)
    {
        Mobiles obj1=new Mobiles();
        Electronics obj2=new Electronics();
        Appliances obj3=new Appliances();
        int ch;
        Scanner input = new Scanner(System.in);
        boolean a = true;
        User u[] = new User[50];
        int i =0;
        while(a)
        {
           System.out.println("Welcome to Ecommerce Application!");
           System.out.println("Enter");
           System.out.println("1 to new user");
           System.out.println("2 to Already have an account");
           System.out.println("3 to exit");
           ch = input.nextInt();
           switch(ch)
           {
                case 1:
                    u[i] = new User();
                    getdata(u[i],i,input);
                    i++;
                    break;
                case 2:
                    System.out.println("enter your id number:");
                    int idn = input.nextInt();
                    System.out.println("enter your password:");
                    int passwd = input.nextInt();
                    try
                    {
                        System.out.println("Checking password....");
                        Thread.sleep(5000);
                    }
                    catch(Exception e)
                    {
                        System.out.println("Interrupted Exception");
                    }
                    if(u[idn].password!=passwd)
                    {
                        System.out.println("enter password correctly");
                        break;
                    } 
                    else
                    {
                        System.out.println("Correct Password");
                        boolean z = true;
                        while(z)
                        {
                            System.out.println("Choose your Catgory:");
                            System.out.println("1 to Mobile");
                            System.out.println("2 to Electronics");
                            System.out.println("3 to Appliances");
                            System.out.println("4 to quit");
                            int c = input.nextInt();
                            switch(c)
                            {
                            case 1:
                                System.out.println("Mobile");
                                obj1.brand();
                                obj1.range();
                                obj1.display();
                                break;
                            case 2:
                                System.out.println("Electronics");
                                obj2.brand();
                                obj2.range();
                                obj2.display();
                                break;
                            case 3:
                                System.out.println("Appliances");
                                obj3.brand();
                                obj3.range();
                                obj3.display();
                                break;
                            case 4:
                                z= false;
                                break;
                            }
                        }
                    }
                    break;
                case 3:
                    a = false;
                    break;
                default:
                    System.out.println("enter proper option");
            }
        }
        input.close();
    }
}

class User
{
    String uname;
    int password;
    int id;
}

class User1 extends User
{
    static void getdata(User k, int i, Scanner input)
    {
        User k1=k;
        System.out.println("enter your username:");
        String uname1= input.next();
        k.uname = uname1;
        System.out.println("enter your password:");
        int password1= input.nextInt();
        k.password = password1;
        k.id=i;
        User1 u1 = new User1();
        System.out.println("your username :" + k.uname);
        System.out.println("your password :" + k.password);
        System.out.println("your id :" + k.id);
    }
}

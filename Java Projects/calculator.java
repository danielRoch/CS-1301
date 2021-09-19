import java.util.*;

public class calculator 
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Operation :");
        String op = in.nextLine().trim();

        boolean cont = true;
        int num;
        int total = 0;

        while(cont)
        {
            switch(op)
            {
                case "+": //addition case
                total = 0;
                while(cont)
                {
                    System.out.println("Enter number:");
                    String exit = in.nextLine().trim();
                    if(exit.equalsIgnoreCase("exit") == true)
                    {
                    cont = false;
                    } else {
                    num = Integer.parseInt(exit);
                    total = (num + total);
                    }
                }
                    break;

                case "-": //subraction case
                total = 0;
                while(cont)
                {
                    System.out.println("Enter number:");
                    String exit = in.nextLine().trim();
                    if(exit.equalsIgnoreCase("exit") == true)
                    {
                    cont = false;
                    } else {
                    num = Integer.parseInt(exit);
                    total = num; //the first number entered get input into the total
                    
                    while(cont)
                    {
                        System.out.println("Enter number:"); //this handles any other numbers, this way it starts subtraction from the first number and not 0
                        exit = in.nextLine().trim();
                        if(exit.equalsIgnoreCase("exit") == true)
                        {
                        cont = false;
                        } else {
                        num = Integer.parseInt(exit);
                        total = (total - num);
                        }
                    }
                    }
                }
                    break;
                    
                case "*": //multiplication case
                total = 1;
                while(cont)
                {
                    System.out.println("Enter number:");
                    String exit = in.nextLine().trim();
                    if(exit.equalsIgnoreCase("exit") == true)
                    {
                    cont = false;
                    } else {
                    num = Integer.parseInt(exit);
                    total = (num * total);
                    }
                }
                    break;

                case "/": //division case
                total = 0;
                while(cont)
                {
                    System.out.println("Enter number:");
                    String exit = in.nextLine().trim();
                    if(exit.equalsIgnoreCase("exit") == true)
                    {
                    cont = false;
                    } else {
                    num = Integer.parseInt(exit);
                    total = num; //the first number entered get input into the total

                    while(cont)
                    {
                        System.out.println("Enter number:"); //this handles any other numbers, this way it starts division from the first number and not 0
                        exit = in.nextLine().trim();
                        if(exit.equalsIgnoreCase("exit") == true)
                        {
                        cont = false;
                        } else {
                        num = Integer.parseInt(exit);
                        total = (total / num);
                        }
                    }
                    }
                }
                    break;

                case "Average": //average case
                total = 0;
                int count = 0;
                while(cont)
                {
                    System.out.println("Enter number:");
                    String exit = in.nextLine().trim();
                    if(exit.equalsIgnoreCase("exit") == true)
                    {
                    cont = false;
                    } else {
                    num = Integer.parseInt(exit);
                    total = (num + total);
                    count++;
                    }
                }
                total = (total / count); //this is taking the total of the numbers and dividing it by the number of numbers
                    break;

                default:
                    System.out.println("");    
                    System.out.println("That was not a valid operation. The valid operations are: \n+ \n- \n* \n/ \nAverage");
                    System.out.println(""); 
                    op = in.nextLine().trim();  
                    break;
            }
        }
        
        System.out.println("Final Result : " + total);

        in.close();
    }
}
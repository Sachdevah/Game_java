import java.util.*;
public class Intro 
{
    public Intro()                      //for interacting with user
    {
        boolean test=true;
        
        while(test)
        {
            try
            {
                System.out.println("Enter your name:");
                Scanner s=new Scanner(System.in);
                String name=s.nextLine();
                System.out.println("Hello "+name+",Welcome to the game..");
                test=false;
            }
            catch(Exception e)              //catching the exception if present.
            {
                System.out.println("wrong input type");
                test=true;
            }
        }
    }
    
}

import java.util.Scanner;

public class RSVPMenu
{
    public static void main(String[] args)
    {
      // Pseudocode for Task #3
      // class RSVPMenu
        //    main()
        //        declare variables
        //        String mealChoice = "";
        //        output "Enter your meal choice. Choose C for chicken, F for fish, or V for vegetarian: "
        //        input mealChoice
        //        Process
        //        if mealChoice == "C" then
        //          OUTPUT "You get the Chicken Parmesan."
        //        else if mealChoice == "F" then
        //          OUTPUT "You get the Roast Salmon."
        //        else if mealChoice == "V" then
        //          OUTPUT "You get the Butternut Squash."
        //        else
        //          OUTPUT "Invalid meal choice."
        //        end if
        //    return
        // endClass

        // Java Code for Task #3
        {
            Scanner in = new Scanner(System.in);
            String mealChoice = "";
            String menu = "C - Chicken\t F - Fish\t V - Vegetarian\nEnter your meal choice: ";

            System.out.println(menu);
            mealChoice = in.nextLine();
            if (mealChoice.equalsIgnoreCase("C"))
            {
                System.out.println("You get the Chicken Parmesan.");
            }
            else if (mealChoice.equalsIgnoreCase("F"))
            {
                System.out.println("You get the Roast Salmon.");
            }
            else if (mealChoice.equalsIgnoreCase("V"))
            {
                System.out.println("You get the Butternut Squash.");
            }
            else
            {
                System.out.println("Invalid meal choice.");
            }
        }
    }
}




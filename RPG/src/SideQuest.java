import java.util.Scanner;

/**
 * Created by al1280 on 4/29/2021.
 */
public class SideQuest {
    Scanner choice = new Scanner(System.in);
    String decision = choice.nextLine();
    if(decision.equalsIgnoreCase("Right"))
        System.out.println("");
        System.out.println("Ah! An adventurer enters the realm! Taking the right prong, you find a turtle!");
        System.out.println("Do you wish to befriend, fight, examine, or pass this creature?");
        if(decision.equalsIgnoreCase("Befriend"))
            System.out.println("");
            System.out.println("You decide to engage in diplomatic relations with the turtle and have agreed in alliance.");
            System.out.println("Congrats! A turtle has joined your party. Enjoy it");
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Welcome to the world of Dam!");
	System.out.println("You are a man. A man on a mission!");
	System.out.println("This mission is to have the biggest numbers that ever numbered!");
	System.out.println("To complete this mission; you will kill things, read words like an English Major, and play the ultimate game of pretend!");
	System.out.println("");
	System.out.println("Your journey begins on the road, and the first decision comes to you on a fork. Do you go left, or right?");
		Scanner choice = new Scanner(System.in);
		String decision = choice.nextLine();
		if(decision.equalsIgnoreCase("Look Around")){
			System.out.println("");
			System.out.println("Looking around, you awe at the majesty of a sign. This sign holds knowledge of the paths set before you.");
			System.out.println("Examining the sign, you read that the right prong is only labeled as 'ADVENTURE!', and the left reads 'To Chamell");
			System.out.println("Now that you are blessed by the knowledge of the sign, do you go right, or left?");
		}decision = choice.nextLine();
		if(decision.equalsIgnoreCase("Right")){
			System.out.println("");
			System.out.println("Ah! An adventurer enters the realm! Taking the right prong, you find a turtle!");
			System.out.println("Do you wish to befriend, fight, or pass this majestic creature?");
			decision = choice.nextLine();
			if(decision.equalsIgnoreCase("Befriend")){
				System.out.println("");
				System.out.println("You decide to engage in diplomatic relations with the turtle and have agreed in alliance.");
				System.out.println("Congrats! A turtle has joined your party. Enjoy it");
			}else if(decision.equalsIgnoreCase("Fight")){
				System.out.println("");
				System.out.println("You engage in combat with a turtle! Not sure why... But DEATH TO THE SOUP MIX!");
			}else if(decision.equalsIgnoreCase())
		}
		}


    }


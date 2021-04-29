/**
 * Created by al1280 on 4/27/2021.
 */
public class Player {
private double health;
private double defense;
private double attack;
private int level;
private double PlayerXP;
private int potions;
private int gold;

public Player(){
    this.level = 1;
    health = 25;
    defense = 8;
    attack = 15;
    potions = 3;
    gold = 0;
    PlayerXP = 0;
}
private double getHealth(){return health;}
private double getDefense(){return defense;}
private double getAttack(){return attack;}
private int getLevel(){return level;}
private double getPlayerXP(){return PlayerXP;}
private int getPotions(){return potions;}
private int getGold(){return gold;}




}
/**public void menu(Enemy enemy){
 * Scanner console = new Scanner(System.in);
 * while (true) {
 *     System.out.println("What will you do? Fight, heal, or stat check?")
 *
 *     String answer = console.nextLine();
 *     if(answer.equalsIgnoreCase("heal")
 *     heal(); Side note: there will be a heal function
 *     else if (answer.equalsIgnoreCase("attack")
 * }
 */
 }

//Subclass of Items, contains functions to create ingredients of Meth production
package projectName;
import java.util.Random;

public class MethIngredients extends Items{
    
String Name;
double Price;
int Rarity;
int Count;

//random object required for random number operations
Random rand = new Random();

// Constructor with no parameters
public MethIngredients(){
    super();
}
// Constructor with parameters     
public  MethIngredients(String newName, double newPrice, int newRarity, int newCount){
    super(newName, newPrice, newRarity, newCount);
}

    // Boosters can be: Fentanyl, Phosphorus, Methylsulfonylmethane, 

    // Function to set values for a level 1 ingredient with parameters for which rarity
public void Level1Ingredient(int Rarity){
    if(Rarity == 1){
        Price = rand.nextInt(4);
        Price = Price + 3;
        Name = "Drain Cleaner";
    } else if (Rarity == 2){
        Price = rand.nextInt(4);
        Price = Price + 8;
        Name = "Antifreeze";
    } else if (Rarity == 3){
        Price = rand.nextInt(4);
        Price = Price + 13;
        Name = "Battery Acid";
    } else {
        return;
    }
}

    // Function to set values for a level 2 ingredient with parameters for which rarity
public void Level2Ingredient(int Rarity){
    if(Rarity == 1){
        Price = rand.nextInt(10);
        Price = Price + 5;
        Name = "Fulminated Mercury";
    } else if (Rarity == 2){
        Price = rand.nextInt(10);
        Price = Price + 15;
        Name = "Phenylacetic Acid";
    } else if (Rarity == 3){
        Price = rand.nextInt(10);
        Price = Price + 25;
        Name = "Ephedrine";
    } else {
        return;
    }
}

    // Function to set values for a level 3 ingredient with parameters for which rarity
public void Level3Ingredient(int Rarity){
    if(Rarity == 1){
        Price = rand.nextInt(20);
        Price = Price + 40;
        Name = "Diethyl Ether";
    } else if (Rarity == 2){
        Price = rand.nextInt(20);
        Price = Price + 90;
        Name = "Methylamine";
    } else if (Rarity == 3){
        Price = rand.nextInt(20);
        Price = Price + 140;
        Name = "Pseudoephedrine";
    } else {
        return;
    }
}









}
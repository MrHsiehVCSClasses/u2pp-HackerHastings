//Daddy class that supers over all of the items in the game
package projectName;
import java.util.Random;

public class Items{

    //could have bought for: selling for: numbers
String Name;
double Price;
int Rarity; 
int Count;

//random object required for random number operations
Random rand = new Random();

// Constructor with no parameters
public Items(){
    Name = "";
    Price = 0.0;
    Rarity = 0;
    Count = 0;
}
// Constructor with parameters
public Items(String newName, double newPrice, int newRarity, int newCount){
    Name = newName;
    Price = newPrice;
    Rarity = newRarity;
    Count = newCount;
}
// Creates a random item with random variable values
public void RandomItem(int Rarity){
    Price = rand.nextInt(350);
    Rarity = rand.nextInt(3);
    Count = 1;
}

public double getPrice() {
    return Price;
}
public void setPrice(double price) {
    Price = price;
}

public int getRarity() {
    return Rarity;
}
public void setRarity(int rarity) {
    Rarity = rarity;
}

public int getCount() {
    return Count;
}
public void setCount(int count) {
    Count = count;
}








}
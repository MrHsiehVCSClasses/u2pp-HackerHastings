//Subclass of Items, contains functions to create grams of Meth
package projectName;
import java.util.Random;

public class MethGram extends Items{
    
//3 = Blue, 2 = Green, 1 = Clear
String Name;
double Price;
double Purity;
int Count;

//random object required for random number operations
Random rand = new Random();

// Constructor with no parameters
public MethGram(){
    super();
}
// Constructor with parameters
public  MethGram(String newName, double newPrice, double newPurity, int newCount){
    super(newName, newPrice, 0, newCount);
    Purity = newPurity;
}


// Makes an item with inputted rarity, 
// generates a random purity within that rarity bracket, and sets the price according to the purity.

public void RandomItem(int Rarity, int Count){
if(Rarity > 3 || Rarity < 1){
    System.out.println("That's not a valid option bitch");
    return;
}
for (int i=0; i < Count; i++){
    if (Rarity == 3){
        Purity = rand.nextInt(9) + 90;
        String x=Purity+""; 
        char a = x.charAt(1);
        int b = a;
        b = b - 48;
        Price = 250 + (b*10);
        Name = "Blue Meth";
    } else if (Rarity == 2){
        Purity = rand.nextInt(9) + 80;
        String x=Purity+""; 
        char a = x.charAt(1);
        int b = a;
        b = b - 48;
        Price = 50 + (b * 2);
        Name = "Green Meth";
    } else if (Rarity == 1){
        Purity = rand.nextInt(9) + 70;
        String x=Purity+""; 
        char a = x.charAt(1);
        int b = a;
        b = b - 48;
        Price = 20 + (b * 2);
        Name = "Orange Meth";
    }
  }  
 }

 public double getPrice() {
    return Price;
}

public void setPrice(double price) {
    Price = price;
}

public double getPurity() {
    return Purity;
}

public void setPurity(double purity) {
    Purity = purity;
}

public int getCount() {
    return Count;
}

public void setCount(int count) {
    Count = count;
}





}

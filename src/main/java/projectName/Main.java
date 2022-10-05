package projectName;
import java.util.*;

public class Main 
{
    public static void main(String[] args) {
        
        boolean wihle = true;
        int i = 0;
        Scanner input = new Scanner(System.in);

        // Big function that runs forever
        while(wihle){
            
            //checks if it's the first time the code ran to return different sentences
        if(i==0){
            System.out.println("Yo Mr. White, do you want Orange, Green, or Blue Meth today? gimme a number: 1, 2, or 3.");
            System.out.println("If you looking for ingredients, gimme a 4.");
            System.out.println("If you lookin to leave, gimme a 0.");
        } else {
            System.out.println("Alright yo, what else you want? Gimme a number: 1, 2, or 3 for Meth, 4 for Ingredients, 0 to peace out.");
        }

        int answer = input.nextInt();

        if(answer < 1 || answer > 4){
            wihle = false;
            input.close();
        }

        // Checks if user asks for Meth or for ingredients, and makes a Meth Gram object if requested,
        // and runs its variable-setting function with requested parameters
        if(answer == 1 || answer == 2 || answer == 3){
            MethGram myMethGram = new MethGram();
            myMethGram.RandomItem(answer, 1);
            System.out.println("Alright yo, here's the stuff: " + "\n" + "Name: " + myMethGram.Name + "\n" + "Purity: " + myMethGram.Purity + "\n" + "Price : " + myMethGram.Price);
        
        }
        // If user asks for ingredients, it asks questions for what level and rarity of ingredient,
        // then creates an ingredient object and runs its variable-setting function with requested parameters
        if(answer == 4){
            MethIngredients myMethIngredient = new MethIngredients();
            System.out.println("Okay bitch, u want risky ingredients, average ingredients, or god-tier ingredients? Gimme a number: 1, 2, or 3.");
            int answerLevel = input.nextInt();
            if(answerLevel < 1 || answerLevel > 4){
                wihle = false;
                input.close();
            }
            if(answerLevel == 1){
                System.out.println("Alright yo, what level of Ingredient you want? Cheap, average, or expensive? Gimme a number: 1, 2, or 3.");
                int answerRarity = input.nextInt();
                if(answerRarity < 1 || answerRarity > 4){
                    wihle = false;
                    input.close();
                }
                if(answerRarity == 1 || answerRarity == 2 || answerRarity == 3){
                myMethIngredient.Level1Ingredient(answerRarity);
                System.out.println("Alright yo, here's the stuff: " + "\n" + "Name: " + myMethIngredient.Name + "\n" + "Price : " + myMethIngredient.Price);
                }
            } else if (answerLevel == 2){
                System.out.println("Alright yo, what level of Ingredient you want? Cheap, average, or expensive? Gimme a number: 1, 2, or 3.");
                int answerRarity = input.nextInt();
                if(answerRarity < 1 || answerRarity > 4){
                    wihle = false;
                    input.close();
                }
                if(answerRarity == 1 || answerRarity == 2 || answerRarity == 3){
                myMethIngredient.Level2Ingredient(answerRarity);
                System.out.println("Alright yo, here's the stuff: " + "\n" + "Name: " + myMethIngredient.Name + "\n" + "Price : " + myMethIngredient.Price);
                }
            } else if (answerLevel == 3){
                System.out.println("Alright yo, what level of Ingredient you want? Cheap, average, or expensive? Gimme a number: 1, 2, or 3.");
                int answerRarity = input.nextInt();
                if(answerRarity < 1 || answerRarity > 4){
                    wihle = false;
                    input.close();
                }
                if(answerRarity == 1 || answerRarity == 2 || answerRarity == 3){
                myMethIngredient.Level3Ingredient(answerRarity);
                System.out.println("Alright yo, here's the stuff: " + "\n" + "Name: " + myMethIngredient.Name + "\n" + "Price : " + myMethIngredient.Price);
                }
            } else {
                
            }
            
        }

        i++;

        }


    
    
    }
}

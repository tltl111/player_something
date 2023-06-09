package Day20;

import Functions.askForInput;

public class Main {
    public static void main(String[] args) {
        System.out.println("What kind of food would you like to make?");
        String foodType = askForInput.askForString("soup, stew or gumbo? ");
        String foodIngredient = askForInput.askForString("mushrooms, chicken, carrots or potatoes? ");
        String foodSeasoning = askForInput.askForString("spicy, salty or sweet? ");

        Seasoning resultingSeasoning = Seasoning.valueOf(foodSeasoning);
        Ingredient resultingIngredient = Ingredient.valueOf(foodIngredient);
        Food resultingFood = Food.valueOf(foodType);

        String resultingSoup = "Your soup is " + resultingSeasoning + 
                               " " + resultingIngredient + " " + resultingFood;

        System.out.println(resultingSoup);
    }

}

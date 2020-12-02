import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {
    
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        ArrayList<Recipe> recipeList = fileReader(file);

        System.out.println("\nCommands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient\n");

        boolean quit = false;
        while (!quit) {
            System.out.print("Enter command: ");
            String input = scanner.nextLine();
            switch (input) {
                case "list":
                    listRecipes(recipeList);
                    break;
                case "stop":
                    quit = true;
                    break;
                case "find name":
                    searchByName(recipeList);
                    break;                  
                case "find cooking time":
                    searchByTime(recipeList);
                    break;   
                case "find ingredient":
                    searchByIngredient(recipeList);
                    break;
                default:
                    System.out.println();
                    break;
            }
        }
    }
    
    private static ArrayList<Recipe> fileReader(String fileName) {
        ArrayList<Recipe> recipeList = new ArrayList<>();
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String recipeName = fileScanner.nextLine();
                int cookingTime  = Integer.valueOf(fileScanner.nextLine());
                ArrayList<String> ingredientList = new ArrayList<>();
                while(fileScanner.hasNextLine()){
                    String ingredient = fileScanner.nextLine();
                    if(ingredient.isEmpty()){
                        break;
                    }
                    ingredientList.add(ingredient);
                }
                Recipe recipe = new Recipe(recipeName, cookingTime, ingredientList);
                recipeList.add(recipe);                
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + fileName + " failed.");
            return null;
        }
        return recipeList;
    }

    private static void listRecipes(ArrayList<Recipe> recipeList) {
        System.out.println("Recipes:");
        for (int i = 0; i < recipeList.size(); i++) {
            System.out.println(recipeList.get(i));
        }
        System.out.println();
    }
    
    private static void searchByName(ArrayList<Recipe> recipeList){
        System.out.print("Searched word: ");
        String input = scanner.next();
        System.out.println();
        System.out.println("Recipes:");
        for(int i = 0; i < recipeList.size(); i++){
            if(recipeList.get(i).getName().contains(input)){
                System.out.println(recipeList.get(i));
            }
        }
        System.out.println();
    }
    
    private static void searchByTime(ArrayList<Recipe> recipeList){
        System.out.print("Max cooking time: ");
        int input = Integer.valueOf(scanner.next());
        System.out.println();
        System.out.println("Recipes:");
        for(int i = 0; i < recipeList.size(); i++){
            if(recipeList.get(i).getCookingTime() <= input){
                System.out.println(recipeList.get(i));
            }
        }
        System.out.println();
    }
    
    private static void searchByIngredient(ArrayList<Recipe> recipeList){
        System.out.print("Ingredient: ");
        String input = scanner.next();
        System.out.println();
        System.out.println("Recipes:");
        for(int i = 0; i < recipeList.size(); i++){
            if(recipeList.get(i).containsIngredient(input)){
                System.out.println(recipeList.get(i));
            }
        }
        System.out.println();
    }
}
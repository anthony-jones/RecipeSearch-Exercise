import java.util.ArrayList;

public class Recipe {
    private final String name;
    private final int cookingTime;
    private final ArrayList<String> ingredientList;

    public Recipe(String name, int cookingTime, ArrayList<String> ingredientList) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredientList = ingredientList;
    }

    public String getName() {
        return name;
    }

    public int getCookingTime() {
        return cookingTime;
    }
    
    public boolean containsIngredient(String ingredient){
        return this.ingredientList.contains(ingredient);
    }
    
    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime;
    }
}

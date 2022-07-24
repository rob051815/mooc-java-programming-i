import java.util.ArrayList;

public class RecipeList {
  private ArrayList<Recipe> recipes;

  public RecipeList() {
    this.recipes = new ArrayList<>();
  }

  public void addRecipe(Recipe recipe) {
    this.recipes.add(recipe);
  }

  @Override
  public String toString() {
    if(recipes.size() == 0) {
      return "";
    }
    StringBuilder output = new StringBuilder("Recipes:\n");
    for (Recipe recipe : recipes) {
      output.append(recipe).append("\n");
    }
    return output.toString();
  }

  public RecipeList getRecipesByName(String name) {
    RecipeList output = new RecipeList();
    for(Recipe recipe: this.recipes) {
      if(recipe.getName().contains(name)) {
        output.addRecipe(recipe);
      }
    }
    return output;
  }

  public RecipeList getRecipesByMaxCookingTime(int cookingTime) {
    RecipeList output = new RecipeList();
    for(Recipe recipe: this.recipes) {
      if(recipe.getCookingTime() <= cookingTime) {
        output.addRecipe(recipe);
      }
    }
    return output;
  }

  public RecipeList getRecipesByIngredient(String ingredient) {
    RecipeList output = new RecipeList();
    for(Recipe recipe: this.recipes) {
      for(String ingr: recipe.getIngredients())  {
        if(ingr.equals(ingredient)) {
          output.addRecipe(recipe);
        }
      }
    }
    return output;
  }
}
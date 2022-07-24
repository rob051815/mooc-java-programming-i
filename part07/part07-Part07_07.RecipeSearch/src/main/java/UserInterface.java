import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
  private RecipeList list;
  private Scanner scan;

  public UserInterface(Scanner scan) {
    this.scan = scan;
  }

  public void start() {
    list = getRecipes();
    while(true) {
      System.out.println("Commands:\nlist - lists the recipes\nstop - stops the program\nfind name - searches recipes by name\nfind cooking time - searches recipes by cooking time\nfind ingredient - searches recipes by ingredient\n");

      System.out.println("Enter command: ");
      String command = scan.nextLine();
      if(command.equals("stop")) {
        break;
      }
      if(command.equals("list")) {
        System.out.println(list);
        continue;
      }
      if(command.length() < 4) {
        continue;
      }
      String commandP1 = command.substring(0, 4);
      String commandP2 = command.substring(5);

      if(!commandP1.equals("find")) {
        continue;
      }
      if(commandP2.equals("name")) {
        System.out.print("Searched word: ");
        String name = scan.nextLine();
        System.out.println(list.getRecipesByName(name));
        continue;
      }
      if(commandP2.equals("cooking time")) {
        System.out.print("Max cooking time: ");
        int max = Integer.parseInt(scan.nextLine());
        System.out.println(list.getRecipesByMaxCookingTime(max));
        continue;
      }
      if(commandP2.equals("ingredient")) {
        System.out.print("Ingredient: ");
        String ing = scan.nextLine();
        System.out.println(list.getRecipesByIngredient(ing));
      }
    }

  }

  public RecipeList getRecipes() {
    System.out.println("File to be read: ");
    RecipeList output = new RecipeList();
    try {
      Scanner file = new Scanner(Paths.get(this.scan.nextLine()));
      while (file.hasNextLine()) {
        // Get name and cooking time in the first 2 lines
        String name = file.nextLine();
        int cookingTime = Integer.parseInt(file.nextLine());
        // Get the ingredients in the remaining lines
        ArrayList<String> ingredients = new ArrayList<>();
        while (file.hasNextLine()) {
          String line = file.nextLine();
          // Stop adding ingredients if line is empty and start adding a new recipe
          if (line.isEmpty()) {
            break;
          }
          ingredients.add(line);
        }
        // Add recipe to the list
        output.addRecipe(new Recipe(name, cookingTime, ingredients));
      }
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
    return output;
  }
}

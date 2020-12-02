# RecipeSearch-Exercise

Create a program that allows for searching for recipes based on their name, cooking time, or the name of an ingredient. The program should read the recipes from a file that the user provides.

Each recipe consists of three or more rows in a recipe file. The first row is for the name of the recipe, the second the cooking time (an integer), and the third and possibly following rows list the ingredients used in the recipe. An empty row follows the last ingredient row. There can be many recipes in a single file.

  Part 1: Reading and listing recipes
  - First create the functionality to read and list recipes. The user interface of the program is described below. You may assume that the user only enters files that exist.
 
  Part 2: Finding Recipes by name
  - Make it possible to find recipes by their names. Finding by name is done with the command find name, after which the user is asked for the name that is used to search. The search should print all the recipes whose names contain the string given by the user.
 
  Part 3: Searching for recipes by cooking time
  - Next, implement the possibility to find recipes based on their cooking time. This is done with the command find cooking time, after which the user is asked for the longest acceptable cooking time. The program should react by printing all the recipes whose cooking times don't exceed the cooking time given by the user.
 
  Part 4: Finding recipes based on their ingredients
  - Finally, add the functionality to search for recipes based on their ingredients. This is done by choosing the command find ingredient, after which the user is asked for a string. The program should then print all the recipes that contain the specified string.
 
    - From MOOC.fi
  


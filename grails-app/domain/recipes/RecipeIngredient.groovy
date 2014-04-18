package recipes

class RecipeIngredient {

    Integer quantity

    static belongsTo = [recipe: Recipe, ingredient: Ingredient]

    static constraints = {
    }

    String toString() { "${quantity} ${ingredient}" }
}

package recipes

class Recipe {

    String name

    static hasMany = [ingredients: RecipeIngredient]

    static constraints = {
    }

    String toString() { name }
}

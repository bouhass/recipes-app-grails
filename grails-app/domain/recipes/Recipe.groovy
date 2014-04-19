package recipes

class Recipe {

    String name

    static hasMany = [ingredients: RecipeIngredient]
    static belongsTo = [source: Source]

    static constraints = {
        name unique:true
        source nullable:true
    }

    String toString() { name }
}

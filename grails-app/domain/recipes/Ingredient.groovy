package recipes

class Ingredient {

    String name

    static constraints = {
        name unique:true
    }

    String toString() { name }
}

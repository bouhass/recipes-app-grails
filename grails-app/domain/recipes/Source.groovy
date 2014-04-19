package recipes

class Source {

    String name

    static hasMany = [recipes: Recipe]

    static constraints = {
        name unique:true
    }

    String toString() { name }
}

import recipes.Ingredient
import recipes.Recipe
import recipes.Source

class BootStrap {

    def init = { servletContext ->

        if (Ingredient.list().isEmpty()) {
            new Ingredient(name: 'ambergris').save()
            new Ingredient(name: 'bay').save()
            new Ingredient(name: 'benzoin').save()
            new Ingredient(name: 'bergamot').save()
            new Ingredient(name: 'black pepper').save()
            new Ingredient(name: 'cedarwood').save()
            new Ingredient(name: 'cinnamon').save()
            new Ingredient(name: 'cinnamon leaf').save()
            new Ingredient(name: 'citronella').save()
            new Ingredient(name: 'clary sage').save()
            new Ingredient(name: 'coriander').save()
            new Ingredient(name: 'cypress').save()
            new Ingredient(name: 'fennel').save()
            new Ingredient(name: 'frankincence').save()
            new Ingredient(name: 'geranium').save()
            new Ingredient(name: 'grapefruit').save()
            new Ingredient(name: 'hyacinth').save()
            new Ingredient(name: 'jasmin').save()
            new Ingredient(name: 'juniper berry').save()
            new Ingredient(name: 'lavender').save()
            new Ingredient(name: 'lemon').save()
            new Ingredient(name: 'lemon verbena').save()
            new Ingredient(name: 'lemongrass').save()
            new Ingredient(name: 'lime').save()
            new Ingredient(name: 'mandarin').save()
            new Ingredient(name: 'marjoram').save()
            new Ingredient(name: 'musk').save()
            new Ingredient(name: 'myrrh').save()
            new Ingredient(name: 'myrtle').save()
            new Ingredient(name: 'neroli').save()
            new Ingredient(name: 'nutmeg').save()
            new Ingredient(name: 'orange').save()
            new Ingredient(name: 'oud').save()
            new Ingredient(name: 'parsley seed').save()
            new Ingredient(name: 'patchouli').save()
            new Ingredient(name: 'petitgrain').save()
            new Ingredient(name: 'pine').save()
            new Ingredient(name: 'rose').save()
            new Ingredient(name: 'rosemary').save()
            new Ingredient(name: 'rosewood').save()
            new Ingredient(name: 'saffron').save()
            new Ingredient(name: 'sandalwood').save()
            new Ingredient(name: 'tangerine').save()
            new Ingredient(name: 'vanilla').save()
            new Ingredient(name: 'vetiver').save()
            new Ingredient(name: 'violet leaf').save()
            new Ingredient(name: 'ylang ylang').save()
        }

        if (Recipe.list().isEmpty()) {
            new Recipe(name: 'hungary water')
                    .addToIngredients([ingredient: Ingredient.findByName('lavender'), quantity: 1]).save()
        }

        if (Source.list().isEmpty()) {
            new Source(name: 'white lotus aromatics').save()
            new Source(name: 'a practical guide for the perfumer').save()
        }
    }
    def destroy = {
    }
}

<%@ page import="recipes.Ingredient; recipes.Recipe" %>
<div class="row">

    <div class="col-sm-8">
        <h1>Ingredients</h1>

        <ul>
            <g:each in="${Ingredient.list()}" var="ingredient">
                <li>
                    <g:link controller="ingredient" action="show" id="${ingredient.id}">${ingredient}</g:link>
                </li>
            </g:each>
        </ul>
    </div>

    <div class="col-sm-4">
        <h1>Recipes</h1>

        <ul>
            <g:each in="${Recipe.list()}" var="recipe">
                <li>
                    <g:link controller="recipe" action="show" id="${recipe.id}">${recipe}</g:link>
                </li>
            </g:each>
        </ul>
    </div>

</div>
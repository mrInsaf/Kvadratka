package dish_lesson

fun main()
{
    val dish_1 = Dish(
        id = 1,
        name = "Borsch",
        category = "Soup",
        ingredients = listOf("voda", "svekla"),
    )

    println(dish_1.name)
    dish_1.add_to_favorites()
    dish_1.add_to_favorites()
}
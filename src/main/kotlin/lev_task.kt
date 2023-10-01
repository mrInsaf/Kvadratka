import kotlin.math.sqrt

fun main()
{
    var a = 0.0f
    var b= 0.0f
    var c= 0.0f

    while(true)
    {
        var dolboeb_flag = true
        while (dolboeb_flag)
        {
            println("Введите коэффициенты уравнения a, b и c через пробел\n")
            val input = readln()
            val values = input.split(" ")
            try
            {
                a = values[0].toFloat()
                b = values[1].toFloat()
                c = values[2].toFloat()
                dolboeb_flag = false
            }
            catch (e: Exception)
            {
                println("Давай мозга не еби а")

            }
        }

        println("Вы ввели:\n a = $a, b = $b, c = $c")

        val (x1, x2) = (calculate_reshenie(a, b, c))
        if (x1 == null && x2 == null)
            println("Корней нет")
        else
            println("Корни: x1 = $x1, x2 = $x2")

        when(continue_test())
        {
            true -> continue
            false -> break
        }
    }


}

fun calculate_discr(a: Float, b: Float, c: Float): Float
{
    return (b * b) - (4 * a * c)
}

fun calculate_reshenie(a: Float, b: Float, c: Float): Pair<Float?, Float?>
{
    val discr = calculate_discr(a, b, c)
    var x1: Float?
    var x2: Float?

    if (a == 0f)
    {
        val solution = -c / b
        x1 = solution
        x2 = solution
    }
    else if (discr > 0)
    {
        x1 = (-b + sqrt(discr)) / (2 * a)
        x2 = (-b - sqrt(discr)) / (2 * a)
    }
    else if (discr == 0f)
    {
        val solution = -b / (2 * a)
        x1 = solution
        x2 = solution
    }
    else
    {
        x1 = null
        x2 = null
    }
    return Pair(x1, x2)
}

fun continue_test(): Boolean
{
    while(true)
    {
        println("Введите 0 чтобы завершить или 1 чтобы продолжить")
        val flag = readln()
        when(flag)
        {
            "0" -> return false
            "1" -> return true
            else -> println("Ты ёбус?")
        }
    }
}
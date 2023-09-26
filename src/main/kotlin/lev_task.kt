import kotlin.math.sqrt

fun main()
{
    var a: Float = 0.0f
    var b: Float = 0.0f
    var c: Float = 0.0f

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

        val discr = calculate_discr(a, b, c)

        if (discr > 0)
        {
            val x1 = (-b + sqrt(discr)) / (2 * a)
            val x2 = (-b - sqrt(discr)) / (2 * a)
            println("Корни:\n x1 = $x1, x2 = $x2")
        }
        else if (discr == 0f)
            println("Корень x1 = x2 = ${-b / 2}")
        else
            println("Корней нет")

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
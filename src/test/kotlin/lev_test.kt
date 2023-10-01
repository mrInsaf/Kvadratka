import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import org.junit.jupiter.api.Assertions.assertEquals


class HelloJunit5Test {

    @Test
    fun calculate_discr_test() {
        assertEquals(calculate_discr(3f, 4f, -5f), 76f)
    }

    @Test
    fun calculate_reshenie_test() {
        assertEquals(calculate_reshenie(2f, -5f, 3f), Pair(1.5f, 1f))
        assertEquals(calculate_reshenie(0f, -5f, 3f), Pair(0.6f, 0.6f))
        assertEquals(calculate_reshenie(1f, 2f, 30f), Pair(null, null))
    }
}
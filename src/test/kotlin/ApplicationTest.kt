import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ApplicationTest {

    @DisplayName("Первый тест")
    @Test
    fun firstTest() {
        assertEquals(3, 1 + 2)
    }
}
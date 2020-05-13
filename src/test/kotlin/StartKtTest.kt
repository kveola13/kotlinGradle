import com.kveola13.intro.start
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class StartKtTest {

    @Test
    fun startTest() {
        assertEquals("Hello world", start())
    }
}
import com.kveola13.intro.start
import com.kveola13.intro.startWithLineSeparation
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Test

internal class StartKtTest {

    @Test
    fun startTest() {
        assertEquals("Hello world", start())
    }

    @Test
    fun startFails(){
        assertNotEquals("Helloworld", start())
    }
    @Test
    fun testLineSeparation(){
        assertEquals("Hello,\nKotlin!", startWithLineSeparation())
    }
}
package file

import online.koymatt.domain.FileDomain
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.function.Executable
import java.io.File


class FileDomainTest {

    @Test
    fun givenAValidParams_WhenCallNewFileDomain_thenInstanceFileDomain(){
        val expectedArchive = "arquivo_text.csv"
        val aFile = FileDomain(expectedArchive)
        Assertions.assertNotNull(aFile)
        Assertions.assertNotNull(aFile.filaName)
    }

    @Test
    fun givenAValidParams_WhenCallNewFileDomain_thenInstanceFileDomainReceveidError(){
        val expectedArchive = "arquivo_text.bat"
        assertThrows<Exception> {
            FileDomain(expectedArchive)
        }
    }

    @Test
    fun givenAInvalidFileName_whenCallNewFileDomamin_thenSholdReceviedError() {
        val expectedArchive = "arquivo_text.bat"
        val aFile = FileDomain(expectedArchive)
        Assertions.assertNotNull(aFile)
        Assertions.assertNotNull(aFile.filaName)
        val actualExeption = Assertions.assertThrows(Exception::class.java, Executable {
            aFile.validadate()
        })
        Assertions.assertEquals(actualExeption::class.java, Exception::class.java)
    }
    @Test
    fun givenAInvalidFileName_whenCallNewFileDomamin_thenNotReceivedError() {
        val expectedArchive = "arquivo_text.csv"
        val aFile = FileDomain(expectedArchive)
        Assertions.assertNotNull(aFile)
        Assertions.assertNotNull(aFile.filaName)
        Assertions.assertDoesNotThrow{
            aFile.validadate()
        }
    }
}
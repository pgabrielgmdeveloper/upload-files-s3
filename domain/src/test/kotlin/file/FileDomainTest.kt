package file

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import kotlin.math.exp


class FileDomainTest {

    @Test
    fun givenAValidParams_WhenCallNewFileDomain_thenInstanceFileDomain(){
        val expectedArchive = "arquivo_text.csv"
        val aFile = FileDomain(expectedArchive)
        Assertions.assertNotNull(aFile)
        Assertions.assertNotNull(aFile.name)
    }
}
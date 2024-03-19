package online.koymatt.domain

class FileDomain(val filaName: String) {
    companion object {
        val VALIDATE_EXTENSIONS = listOf("csv","txt", "xlsx", "png", "jpeg")
    }
    init {
        validadate()
    }

    fun validadate() {
        if  (!(VALIDATE_EXTENSIONS.any { filaName.endsWith(it, ignoreCase = true) })) {
            throw Exception("File extensions is not valid")
        }
    }
}
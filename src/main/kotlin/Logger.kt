import org.slf4j.LoggerFactory

class Logger {
    private val logger = LoggerFactory.getLogger("Logger")

    fun log(type: String, message: String) {
        when (type) {
            "info" -> logger.info(message)
            "warn" -> logger.warn(message)
            "error" -> logger.error(message)
        }
    }
}
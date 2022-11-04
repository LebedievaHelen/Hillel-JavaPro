import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.MessageFormat;
import java.util.Date;

public class FileLoggerConfiguration {

    Path currentRelativePath = Paths.get("");
    String s = currentRelativePath.toAbsolutePath().toString();
    private static final String fileName = "src/logger.txt";
    File file = new File(fileName);

    LoggingLevel currentLoggingLevel = LoggingLevel.DEBUG;
    long fileMaxSize = 1048576;

    public static String message(LoggingLevel argument) {
        String message = null;
        switch (argument) {
            case INFO:
                message = "Some message";
                break;
            case DEBUG:
                message = "Program debugging";
                break;
        }
        return message;
    }

    public String messageFormat(String message) {
        return MessageFormat.format("[{0, time, medium}] [{1}] Message:[{2}]", new Date(), currentLoggingLevel, message);
    }
}

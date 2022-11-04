import java.io.*;

public class FileLogger {

    FileLoggerConfiguration fileLoggerConfiguration = new FileLoggerConfiguration();

    public void debug(String messageDebug) {
        write(messageDebug);
    }

    public void info(String messageInfo) {
        write(messageInfo);
    }

    public void write(String message) {
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileLoggerConfiguration.file, true)))) {
            String lineSeparator = System.getProperty("line.separator");
            writer.write(fileLoggerConfiguration.messageFormat(message) + lineSeparator);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

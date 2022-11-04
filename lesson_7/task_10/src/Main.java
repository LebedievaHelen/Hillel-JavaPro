public class Main {

    public static void main(String[] args) throws FileMaxSizeReachedException {
        FileLogger fileLogger = new FileLogger();
        FileLoggerConfiguration fileLoggerConfiguration = new FileLoggerConfiguration();

        if (isFileSizeExceeded(fileLoggerConfiguration.file.length(), fileLoggerConfiguration.fileMaxSize)) {
            throw new FileMaxSizeReachedException("Max size of file = " + fileLoggerConfiguration.fileMaxSize +
                    ". Current size of file = " + fileLoggerConfiguration.file.length() + " File: " +
                    fileLoggerConfiguration.file);
        }

        try {
            fileLogger.debug(FileLoggerConfiguration.message(LoggingLevel.DEBUG));
            fileLogger.info(FileLoggerConfiguration.message(LoggingLevel.INFO));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean isFileSizeExceeded(long fileLength, long fileMaxSize) {
        return fileLength > fileMaxSize;
    }
}

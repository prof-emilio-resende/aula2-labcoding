package fit;

import java.time.LocalDateTime;
import java.util.function.Function;

public class Functions {

    private static String log(String prefix, String separator, String text) {
        var textToLog = String.format("%s %s %s", prefix, separator, text);
        System.out.println(textToLog);
        return textToLog;
    }

    private static Function<String, String> loggerBuilder(String prefix, String separator) {
        var currentTime = LocalDateTime.now();
        var newPrefix = currentTime.toString() + prefix;

        return inputText -> {
            var textToLog = String.format("%s %s %s", newPrefix, separator, inputText);
            System.out.println(textToLog);
            return textToLog;
        };
    }

    public static void testar() {
        log("[prefix]", "->", "Olá");
        log("[prefix", "-<", "Adeus");

        var logger = loggerBuilder("|prefix|", ":");
        logger.apply("Olá");
        logger.apply("Adeus");
    }

}

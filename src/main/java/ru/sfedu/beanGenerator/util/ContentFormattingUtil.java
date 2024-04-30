package ru.sfedu.beanGenerator.util;

public class ContentFormattingUtil {

    public static String removeLineFeeds(String content) {
        String feedsRegexp = "[\\t\\n\\r]";

        return content.replaceAll(feedsRegexp, "");
    }

    public static String formatActivityKey(String content) {
        return content != null
               ? content.replaceFirst(":", "")
                .replaceAll("[()]", "")
               : "";
    }

    public static String formatCondition(String content) {
        String conditionRegexp = "[()\"]";

        return content.replaceAll(conditionRegexp, "");
    }
}

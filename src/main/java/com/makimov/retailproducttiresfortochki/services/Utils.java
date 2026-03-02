package com.makimov.retailproducttiresfortochki.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utils {
    // синглтон
    private Utils() {}

    public static String formatDateTime(LocalDateTime now) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        return now.format(formatter);
    }

    public static String formatCurrentDateTime() {
        return formatDateTime(LocalDateTime.now());
    }
}

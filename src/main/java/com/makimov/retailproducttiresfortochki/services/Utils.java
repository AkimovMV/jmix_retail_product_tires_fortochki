package com.makimov.retailproducttiresfortochki.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public static <T> List<T[]> splitArray(T[] array, int chunkSize) {
        if (chunkSize <= 0) {
            throw new IllegalArgumentException("Размер порции должен быть положительным");
        }

        List<T[]> chunks = new ArrayList<>();
        int length = array.length;

        for (int i = 0; i < length; i += chunkSize) {
            T[] chunk = Arrays.copyOfRange(array, i, Math.min(i + chunkSize, length));
            chunks.add(chunk);
        }
        return chunks;
    }

}

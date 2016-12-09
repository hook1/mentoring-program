package com.sluka.taras.buisness.util;

import java.time.LocalDate;

/**
 * Created by taras on 09.12.2016.
 */
public class MyDate {
    public static LocalDate getDateForString(int year, int month, int day) {
        LocalDate date = LocalDate.of(year, month, day);
        return date;
    }
}

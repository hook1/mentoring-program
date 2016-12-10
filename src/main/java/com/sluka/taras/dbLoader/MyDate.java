package com.sluka.taras.dbLoader;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by taras on 09.12.2016.
 */
public class MyDate {
    public static Date getDateForString(String s) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        return (Date) formatter.parse(s);
    }
}

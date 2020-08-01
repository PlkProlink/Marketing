package br.com.tiagods.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static final String SDF = "dd/MM/yyyy";
    public static final String SDFH = "dd/MM/yyyy HH:mm";

    public static String parse(Date date, String pattern) {
        return new SimpleDateFormat(pattern).format(date);
    }
}

package com.gastos.back.utils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

import lombok.extern.slf4j.Slf4j;

/**
 * The Class DateUtils.
 */
@Slf4j
public class DateUtils {

    public static final String DIA_JUICIO_FINAL = "31DEC9999:23:59:59";

    /**
     * Devuelve la marca de tiempo del d�a del juicion final
     *
     * @return Marca de tiempo del d�a del juicio final
     */
    public static Timestamp getDiaJuicioFinal() {
        return new Timestamp(Long.MAX_VALUE);
    }

    /**
     * Instantiates a new date utils.
     */
    private DateUtils() {
        // empty constructor
    }

    /**
     * Convert date to string.
     *
     * @param date
     *            the date
     * @return the string
     */
    public static String convertDateToString(Date date) {
        SimpleDateFormat formatter =
                new SimpleDateFormat(Constants.LOCALDATE_PATTERN_JSON_TIME);
        return formatter.format(date);
    }

    /**
     * Convert date to string.
     *
     * @param date
     *            the date
     * @param pattern
     *            the pattern
     * @return the string
     */
    public static String convertDateToString(Date date, String pattern) {
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        return formatter.format(date);
    }

    /**
     * Convert date to string.
     *
     * @param date
     *            the date
     * @param format
     *            the format
     * @return the string
     */
    public static String convertDateToFormatString(Date date, String format) {
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        return formatter.format(date);
    }

    /**
     * Convert string to date.
     *
     * @param date
     *            the date
     * @return the date
     */
    public static Date convertStringToDate(String date) {

        Date result = new Date();
        SimpleDateFormat formatter =
                new SimpleDateFormat(Constants.LOCALDATE_PATTERN_JSON_TIME);

        try {
            result = formatter.parse(date);
        } catch (ParseException e) {
            log.error("Error parsing date ", e);
        }
        return result;
    }

    /**
     * Convert string to date.
     *
     * @return the date
     */
    public static Date generateDownDate() {

        Date result = new Date();
        SimpleDateFormat formatter =
                new SimpleDateFormat(Constants.LOCALDATE_PATTERN_JSON_TIME);

        try {
            result = formatter.parse(Constants.DOWN_DATE_FORMATTED);
        } catch (ParseException e) {
            log.error("Error parsing date ", e);
        }
        return result;
    }
    
    /**
     * Generate down timestamp.
     *
     * @return the timestamp
     */
    public static Timestamp generateDownTimestamp() {
    	Timestamp result = new Timestamp(0);
        SimpleDateFormat formatter =
                new SimpleDateFormat(Constants.LOCALDATE_PATTERN_JSON_TIME);

        try {
            Date date = formatter.parse(Constants.DOWN_DATE_FORMATTED);
            result = new Timestamp(date.getTime());
            
        } catch (ParseException e) {
            log.error("Error parsing date ", e);
        }
		return result;
    }

    /**
     * Generate current date.
     *
     * @return the date
     */
    public static Date generateCurrentDate() {
        Date resultDate = new Date();
        try {
            LocalDateTime dateL = LocalDateTime.now();

            resultDate =
                    new SimpleDateFormat(Constants.LOCALDATE_PATTERN_JSON_TIME)
                            .parse(dateL.toString());

        } catch (ParseException e) {
            log.error("Error generating the current date: ", e);
        }

        return resultDate;

    }

    /**
     * Generate current date.
     *
     * @return the date
     */
    public static Date generateCurrentDateSimpleFormat() {
        Date resultDate = new Date();
        try {
            LocalDateTime dateL = LocalDateTime.now();
            resultDate = new SimpleDateFormat(Constants.FORMAT_YYYY_MM_DD)
                    .parse(dateL.toString());
        } catch (ParseException e) {
            log.error("Error generating the current date: ", e);
        }

        return resultDate;
    }

}

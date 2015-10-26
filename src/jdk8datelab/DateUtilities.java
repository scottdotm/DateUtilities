package jdk8datelab;

/**
 * Date Utilities for use in JDK8 Date Lab
 * @author Scott
 * @version 1.0
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class DateUtilities {
    
    private static final String CANNOTBENULL = "cannot be null";
    /**
     * Returns a String of a LocalDate object.
     * 
     * @param d = date
     * @param f = format
     * @return date string
     * @throws IllegalArgumentException
     */
    public String toString(LocalDate d, DateTimeFormatter f) throws IllegalArgumentException{
        if(d == null || f == null){
            throw new IllegalArgumentException("Date " + CANNOTBENULL);
        }
        String fDate = null;
        try {
        fDate = d.format(f);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        return fDate;
    }
    
    /**
     * Returns a String of a LocalDate object.
     * @param d
     * @return date string
     * @throws IllegalArgumentException
     */
    public String toString(LocalDate d) throws IllegalArgumentException{
        if(d == null){
            throw new IllegalArgumentException("Date " + CANNOTBENULL);
        }
        String fDate = null;
        try{
        fDate = d.format(DateTimeFormatter.ISO_LOCAL_DATE);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        return fDate;
    }
    
    /**
     * Returns the LocalDate of a string.
     * 
     * @param d = date string to be changed to a LocalDate
     * @return LocalDate
     * @throws IllegalArgumentException
     */
    public LocalDate toDate(String d) throws IllegalArgumentException {
        if (d == null || d.isEmpty()) {
            throw new IllegalArgumentException("String to local Date " + CANNOTBENULL + " or empty.");
        }
        LocalDate parseDate = null;
        try {
            parseDate = LocalDate.parse(d);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return parseDate;
    }
    
    /**
     * Returns the LocalDateTime of a string.
     * 
     * @param d = date string to be changed into a LocalDateTime
     * @return LocalDateTime
     * @throws IllegalArgumentException
     */
    public LocalDateTime toDateTime(String d) throws IllegalArgumentException {
        if (d == null || d.isEmpty()) {
            throw new IllegalArgumentException("String to local Date " + CANNOTBENULL + " or empty.");
        }
        LocalDateTime parseDate = null;
        try {
            parseDate = LocalDateTime.parse(d);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return parseDate;
    }
    
    /** dateDiff() is the difference between two dates using LocalDate and a
     * TemporalUnit. Only for LocalDate. TemporalUnit is used
     * to specify what kind of unit you want the difference back in (e.g. Days,
     * Months, etc.) Anything less than a day for TemporalUnit will not be
     * accepted and will throw and exception.
     * 
     * @param differance between firstDate and secondDate temporalUnit
     * @param firstDate
     * @param secondDate
     * @return
     * @throws IllegalArgumentException
     */
    public long dateDiff(TemporalUnit temporalUnit, LocalDate firstDate, LocalDate secondDate) throws IllegalArgumentException {
        if (firstDate == null) {
            throw new IllegalArgumentException("First date " + CANNOTBENULL);
        } else if (secondDate == null) {
            throw new IllegalArgumentException("Second date " + CANNOTBENULL);
        } else if (temporalUnit == null || temporalUnit == ChronoUnit.HOURS || temporalUnit == ChronoUnit.MINUTES || temporalUnit == ChronoUnit.SECONDS || temporalUnit == ChronoUnit.MILLIS || temporalUnit == ChronoUnit.MICROS || temporalUnit == ChronoUnit.NANOS) {
            throw new IllegalArgumentException("TemporalUnit is null or has a unit of time less than a day");
        }
        LocalDate startDate = firstDate;
        LocalDate endDate = secondDate;

        long diff = 0;
        try {
            diff = temporalUnit.between(startDate, endDate);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        return diff;
    }
    
    
}


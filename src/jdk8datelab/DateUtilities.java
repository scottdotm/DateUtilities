package jdk8datelab;

/**
 * Date Utilities for use in JDK8 Date Lab
 * @author Scott
 * @version 1.0
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
        fDate = d.format(f);
        
        return fDate;
    }
    
    /**
     * Returns a String of a LocalDate object. ISO_LOCAL_DATE format.
     * 
     * @param d
     * @return date string
     * @throws IllegalArgumentException
     */
    public String toString(LocalDate d) throws IllegalArgumentException{
        if(d == null){
            throw new IllegalArgumentException("Date " + CANNOTBENULL);
        }
        String fDate = null;
        fDate = d.format(DateTimeFormatter.ISO_LOCAL_DATE);
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
        parseDate = LocalDate.parse(d);
 
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
        parseDate = LocalDateTime.parse(d);
        return parseDate;
    }
    
    /**
     * Add days onto a certain date
     * 
     * @param d = LocalDate
     * @param daysToAdd = days to add on
     * @return d + daysToAdd
     */
    public LocalDate addDays(LocalDate d,long daysToAdd){
       return d.plusDays(daysToAdd);
   }
    
    
}
//singleton design pattern
//factory pattern


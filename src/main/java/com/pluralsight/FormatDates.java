package com.pluralsight;

import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class FormatDates {

    public static void main(String[] args) {

        DateTimeFormatter justDate =  DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter dayWithDate =  DateTimeFormatter.ofPattern("EEEE, L/dd, yyyy");
        DateTimeFormatter dayWithDateTime = DateTimeFormatter.ofPattern("EEEE, L/dd, yyyy hh:mm,");
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, L/dd, yyyy hh:mm z");
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date date = new Date();

        LocalDate now = LocalDate.now();
        LocalDateTime nowDateTime = LocalDateTime.now();

        System.out.println(now.format(justDate));
        System.out.println(now);
        System.out.println(dayWithDate.format(now));
        System.out.println(dayWithDateTime.format(nowDateTime));
        System.out.println(dateFormat.format(date));


    }



}

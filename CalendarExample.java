package com.college;

import java.util.Calendar;
import java.text.SimpleDateFormat;

public class CalendarExample {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please enter date, month, and year as command line arguments.");
            return;
        }

        int day = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]) - 1; 
        int year = Integer.parseInt(args[2]);

        Calendar cal = Calendar.getInstance();
        cal.set(year, month, day);

        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        String dayOfWeek = sdf.format(cal.getTime());

        System.out.println("Day of the week: " + dayOfWeek);
    }
}

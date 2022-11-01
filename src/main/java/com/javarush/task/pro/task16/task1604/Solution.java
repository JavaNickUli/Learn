package com.javarush.task.pro.task16.task1604;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Solution {

    static Calendar birthDate = new GregorianCalendar(2000, Calendar.DECEMBER, 14);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        switch (calendar.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.MONDAY:
                return "понедельник";
            case Calendar.TUESDAY:
                return "вторник";
            case Calendar.WEDNESDAY:
                return "среда";
            case Calendar.THURSDAY:
                return "четверг";
            case Calendar.FRIDAY:
                return "пятница";
            case Calendar.SATURDAY:
                return "суббота";
            case Calendar.SUNDAY:
                return "воскресенье";
            default:
                return null;
        }
    }
}

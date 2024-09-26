package com.pluralsight;

public class Demo1 {

    public static void main(String[] args){
        System.out.println("Hello World!");

        char status = 'l';
        int identifier = 1;
        String name = "Lexx";


        String greeting = "Hello " + name;
        //String greeting = "Hello " + Lexx;
          //String greeting = "Hello Lexx";

        int numberOfDaysPerWeekWatchesTV = 5;
        int minutesPerDayOnDayWatchedOnAverage = 120;

        int minutesPerWeek = numberOfDaysPerWeekWatchesTV * minutesPerDayOnDayWatchedOnAverage;
        int minutesPerYear = minutesPerWeek * 52;

        int hoursPerYear = minutesPerYear / 60;

        int hoursInWorkWeek = 40;

        int workWeeksPerYearWatchingTV = hoursPerYear / hoursInWorkWeek;

        System.out.println("If " + name + " did not watch TV, it would be like a " + workWeeksPerYearWatchingTV + " week vacation every year.");


        System.out.println(greeting);
    }
}

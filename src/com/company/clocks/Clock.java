package com.company.clocks;

import java.time.LocalTime;

// TODO : Anamaria do not allow Clock to be instantiated
public class Clock {
    // TODO Alin M create private fields for day, year, month, hour, minute seconds

    private int day;
    private int year;
    private int month;

    private int hour;
    private int minutes;
    private int seconds;

    public Clock(int day, int year, int month, int hour, int minutes, int seconds) {
        this.day = day;
        this.year = year;
        this.month = month;
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    //TODO Petruta Create a constructor with a LocalTime and a LocalDate parameter. Assign the private fields from above
    protected Clock() {

    }

    //TODO : Alin I . Update the clock with a LocalTime parameter. Link with the corresponding private fileds
    protected void updateClock(LocalTime lt) {
        this.hour = getHour();
        this.minutes = getMinutes();
        this.seconds = getSeconds();

    }

    //TODO : Stefan . Update the clock with a LocalDate parameter. Link with the corresponding private fileds
    protected void updateDate() {

    }

}

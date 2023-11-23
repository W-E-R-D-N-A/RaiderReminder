package com.example.raiderreminder;
import java.text.SimpleDateFormat;
import java.util.*;
public class eventClass {
    // private data
    private String eventName = ""; // event name
    private int year = 0;
    private int month = 0;
    private int day = 0;
    private int hour = 0; // military time
    private int minute = 0;
    private int second = 0;
    private String location = "None";
    // description maybe?
    Calendar task = Calendar.getInstance();
    // create a timezone

    // public methods

    // creates a sets the time for a calendar object
    public void createCalEvent(){
        task.set(year,month -1,day,hour,minute,second);
    }

    // change the name and get the name
    public void setName(String eventName){this.eventName = eventName;}
    public String getName(){return eventName;}

    // change the year or get the year
    public void setYear(int year){
        this.year = year;
        createCalEvent(); // reset the calendar
    }
    public int getYear(){return year;}

    // change the month or get the month
    public void setMonth(int month){
        this.month = month;
        createCalEvent(); // reset the calendar
    }
    public int getMonth(){return month;}

    // change the day or get the day
    public void setDay(int day){
        this.day = day;
        createCalEvent(); // reset the calendar
    }
    public int getDay(){return day;}

    // get the hour or change the hour
    public void setHour(int hour){
        this.hour = hour;
        createCalEvent(); // reset the calendar
    }
    public int getHour(){return hour;}

    // get the minute or change the minute

    public void setMinute(int minute){
        this.minute = minute;
        createCalEvent(); // reset the calendar
    }
    public int getMinute(){return minute;}

    public void setLocation(String location) {
        this.location = location;
        createCalEvent(); // rest the calendar event
    }
    public String getLocation(){return location;}


    public String getDateAndTime() {
        // Format the date and time as a string
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        return sdf.format(task.getTime());
    }

}

package com.cps.calender;

public class CheckDayWeekendOrWeekDay {

    public static String checkDay(String day){
        String result = "";
        if(!day.equalsIgnoreCase("Sunday") || !day.equalsIgnoreCase("Saturday")){
            result = "WeekDay";
        }else{
            result = "WeekEnd";
        }
        return result;
    }
}

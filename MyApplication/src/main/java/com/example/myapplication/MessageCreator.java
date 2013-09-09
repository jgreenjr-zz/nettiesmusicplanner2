package com.example.myapplication;

/**
 * Created by greenja01 on 9/9/13.
 */
public class MessageCreator {
    public String CreateMessage(String foodStatus, String waterStatus, String sleepStatus, String exerciseStatus){
        String returnValue ="";
        returnValue += singleStatusJoin("Food", foodStatus);
        returnValue += singleStatusJoin("Water", waterStatus);
        returnValue += singleStatusJoin("Sleep", sleepStatus);
        returnValue += singleStatusJoin("Exercise", exerciseStatus);

        return returnValue;
    }

    public String singleStatusJoin(String category, String status){
        return category + ": " + status+ "\n";
    }

}

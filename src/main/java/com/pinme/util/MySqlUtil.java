package com.pinme.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * To change this template use File | Settings | File Templates.
 */
public class MySqlUtil {
    public static String getMySqlDateTimeStr(String eventDate, String eventTime, int stepDays) {
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            java.util.Date mySqlDate = sdf.parse(eventDate + " " + eventTime);
            Calendar cal = Calendar.getInstance();
            cal.setTime(mySqlDate);
            cal.add(Calendar.DATE, stepDays);
            String mySqlDateStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(cal.getTime());
            return mySqlDateStr;
        }  catch(Exception e){
            e.printStackTrace();
        }
        return null;

    }

    public static java.util.Date getLocalDate(String mySqlDate){
        if(mySqlDate != null){
            try{
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                java.util.Date sqlDate = sdf.parse(mySqlDate);
                return sqlDate;
            }  catch(Exception e){
                e.printStackTrace();
            }
        }
        return null;
    }

    public static String getDate(String mySqlDate){
        if(mySqlDate != null){
            try{
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                java.util.Date sqlDate = sdf.parse(mySqlDate);
                String mySqlDateStr = new SimpleDateFormat("MM/dd/yyyy").format(sqlDate);
                return mySqlDateStr;
            }  catch(Exception e){
                e.printStackTrace();
            }
        }
        return null;
    }

    public static String getDisplayDate(String mySqlDate){
        if(mySqlDate != null){
            try{
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                java.util.Date sqlDate = sdf.parse(mySqlDate);
                String mySqlDateStr = new SimpleDateFormat("yyyy-MM-dd").format(sqlDate);
                return mySqlDateStr;
            }  catch(Exception e){
                e.printStackTrace();
            }
        }
        return null;
    }

    public static String getTime(String mySqlDate){
        if(mySqlDate != null){
            try{
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                java.util.Date sqlDate = sdf.parse(mySqlDate);
                String mySqlDateStr = new SimpleDateFormat("HH:mm").format(sqlDate);
                return mySqlDateStr;
            }  catch(Exception e){
                e.printStackTrace();
            }
        }
        return null;
    }
}

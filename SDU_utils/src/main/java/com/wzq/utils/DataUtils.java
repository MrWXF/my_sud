package com.wzq.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期转换为字符串的工具类
 *
 */
public class DataUtils {

    //日期转换为字符串
    public static String date2String(Date date, String patt){
       SimpleDateFormat sdf = new SimpleDateFormat(patt);
       String formt = sdf.format(date);
       return formt;

   }
   //字符串转换为日期
   public static Date string2Date(String str,String patt) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(patt);
       Date date = sdf.parse(str);
       return date;
   }


}

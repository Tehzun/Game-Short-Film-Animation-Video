package com.hinduja.asterix.project2;
import java.util.*;

public class DateWorker
{
	public static String convertToStandard(String date)
	{
		String[] dateArray=date.split("-");
		String dt=dateArray[2]+"-"+dateArray[1]+"-"+dateArray[0];
		return dt;
	}
	public static String convertToSQL(String date)
	{
		String[] dateArray=date.split("-");
		String dt=dateArray[2]+"-"+dateArray[1]+"-"+dateArray[0];
		return dt;
	}
	public static String getCurrentDate()
	{
		GregorianCalendar cal=new GregorianCalendar();
		int dt=cal.get(Calendar.DATE);
		int month=cal.get(Calendar.MONTH)+1;
		int year=cal.get(Calendar.YEAR);
		String date=year+"-"+month+"-"+dt;
		return date;
	}
}  

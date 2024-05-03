package com.mynt.delivarycostcalculator.utils;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public final class DateUtils {
	public static Boolean checkExpiration(String date) {
		
        ZonedDateTime expirationDate = ZonedDateTime.parse(date, DateTimeFormatter.ISO_DATE_TIME);

        ZonedDateTime currentDate = ZonedDateTime.now();

        if (expirationDate.isAfter(currentDate)) {
            return false;
        } 
        return true;
		
	}
}

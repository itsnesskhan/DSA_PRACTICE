package com.java.advance;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
public class LocalDateEx{
	
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(1998,10,15);
		LocalDate now = LocalDate.now();
//		System.out.println(date);
//		System.out.println(now);
//		System.out.println(now.getDayOfMonth());
//		System.out.println(now.getDayOfYear());
//		System.out.println(now.getDayOfWeek());
//		
//		System.out.println(now.getMonthValue());
		
		int dayOfMonth = now.getDayOfMonth();
		Month month = now.getMonth();
//		System.out.println(month.getValue());
		int year = now.getYear();
		
		Period between = Period.between(date, now);
//		System.out.printf("%d-%d-%d", now.getDayOfMonth(),now.getMonthValue(),now.getYear());
		System.out.println();
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		DateTimeFormatter ofPattern3 = DateTimeFormatter.ofPattern(" E MM yyyy");
//		System.out.println(now.format(DateTimeFormatter.of));
//		System.out.println(now.format(ofPattern3));
//		System.out.println(date.format(ofPattern));
//		LocalTime now2 = LocalTime.now();
//		LocalTime of = LocalTime.of(15, 45, 00);
//		System.out.println(of);
//		
//		System.out.println(now2);
//		
//		
////		LocalDateTime now2 = LocalDateTime.now();
////		System.out.println(now2);
//		DateTimeFormatter ofPattern2 = DateTimeFormatter.ofPattern("hh:mm a");
//		System.out.println(now2.format(ofPattern2));
//		System.out.println(of.format(ofPattern2));
		String dateString = "1998-10-15";
		LocalDate parse = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
//		LocalDate parse2 = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("yyyy/MM/dd")); exeption
		System.out.println(parse);
//		System.out.println(parse2);
		DateTimeFormatter simpleDateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(parse.format(simpleDateFormat));
		
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
		
		
	}
}
package ey_10;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class LocalDateTimeClassConcepts {
	public static void main(String[] args) {
		
		LocalDate today= LocalDate.now();
		System.out.println("Current system date is"+today);
		
		LocalDate indiaDate = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		
		System.out.println("Current India date is"+indiaDate);
		
		LocalDate usDate = LocalDate.now(ZoneId.of("US/Central"));
		System.out.println("Current India date is"+usDate);
		
		LocalDate firstDate2023=LocalDate.of(2023, Month.JANUARY, 1);
		System.out.println("First Day of 2023 is"+firstDate2023);
		
		LocalDate epochDay = LocalDate.ofEpochDay(1000);
		
		System.out.println("1000th Day of Epoch Date is"+epochDay);
		
		LocalDate hundredth_Day_Of_2020=LocalDate.ofYearDay(2020, 100);
		System.out.println("100th Day from ephoc date is"+hundredth_Day_Of_2020);
	}

}

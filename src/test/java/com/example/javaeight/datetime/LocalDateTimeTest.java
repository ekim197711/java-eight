package com.example.javaeight.datetime;

import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest {

    @Test
    void testLocalDateTime(){
        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime ldtTomorrow = ldt.plusDays(1);

        String format = ldtTomorrow.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(format);
        System.out.println("Year: " + ldtTomorrow.getYear());

        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);
        ZonedDateTime zdt2 = ZonedDateTime.now(ZoneId.of(ZoneId.SHORT_IDS.get("PST")));
        System.out.println(zdt2);

        LocalDate ld = LocalDate.now();
        System.out.println("Local date: " + ld);

        LocalTime lt = LocalTime.now();
        System.out.println("Local time: " + lt);
    }
}

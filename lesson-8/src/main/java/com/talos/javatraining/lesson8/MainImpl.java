package com.talos.javatraining.lesson8;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;


public class MainImpl implements Main {

    @Override
    public Instant getInstant(String dateTime) {
        return LocalDateTime.parse(dateTime)
                .atZone(ZoneId.of("GMT-5"))
                .plusSeconds(1).minusMinutes(10).toInstant();
    }

    @Override
    public Duration getDuration(Instant a, Instant b) {
        return Duration.between(a, b).plusDays(1).minusHours(4);
    }

    @Override
    public String getHumanReadableDate(LocalDateTime localDateTime) {
        localDateTime = localDateTime.plusHours(3).with(Month.JULY);
        localDateTime = localDateTime.getYear() % 2 != 1 ? localDateTime.plusYears(1) : localDateTime;

        return localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    @Override
    public LocalDateTime getLocalDateTime(String dateTime) {
        LocalDateTime date = LocalDateTime.parse(dateTime, DateTimeFormatter.ofPattern("ssmmHHddMMyyyy"));
        date = date.getMonthValue() % 2 != 0 ? date.plusMonths(1) : date;

        int seconds = date.getSecond() * 2;

        if (Math.ceil(seconds / 59.0) > 1) {
            date = date.plusMinutes(1)
                    .withSecond((seconds - 60));
        } else {
            date = date.withSecond(seconds);
        }

        return date;
    }

    @Override
    public Period calculateNewPeriod(Period period) {
        return period.plusMonths(5).plusDays(6).minusDays(2 * 7);
    }

    @Override
    public LocalDate toLocalDate(Year year, MonthDay monthDay) {
        return monthDay.atYear(year.getValue())
                .plusYears(3)
                .with(date -> {
                    LocalDate result = (LocalDate) date;
                    double days = Math.floor(result.getDayOfMonth() / 5.0);

                    return (int)days * 5 == 0.0 ? result.withDayOfMonth(1) : result.withDayOfMonth((int)days * 5);
                });
    }

    @Override
    public LocalDateTime toLocalDateTime(YearMonth yearMonth, int dayOfMonth, LocalTime time) {
        return LocalDateTime.of(yearMonth.getYear(),
                yearMonth.getMonthValue(),
                dayOfMonth,
                time.getHour(),
                time.getMinute(),
                time.getSecond())
            .withSecond(0)
            .minusMinutes(37)
            .plusDays(3);
    }

    @Override
    public TemporalAdjuster createTemporalAdjusterNextMonday() {
        return TemporalAdjusters.next(DayOfWeek.MONDAY);
    }

    @Override
    public TemporalAdjuster createTemporalAdjusterNextFebruaryFirst() {
        return  date -> {
            LocalDate result = (LocalDate) date;
            return result.getMonthValue() >= 2 ?
                    result.plusYears(1).withMonth(Month.FEBRUARY.getValue()).withDayOfMonth(1) :
                    result.withMonth(Month.FEBRUARY.getValue()).withDayOfMonth(1);
        };
    }

    @Override
    public String adjustDateTime(String localDateTime, TemporalAdjuster adjuster) {
        return LocalDateTime
                .parse(localDateTime, DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                .with(adjuster).toString();
    }

    @Override
    public String processZonedDateTime(String zonedDateTime) {
        return ZonedDateTime
                .parse(zonedDateTime, DateTimeFormatter.ISO_OFFSET_DATE_TIME)
                .plusHours(1)
                .withZoneSameInstant(ZoneId.of("UTC"))
                .with(date -> {
                    ZonedDateTime result = (ZonedDateTime) date;
                    double minutes = result.getMinute() / 15.0;
                    while (minutes - (int)minutes != 0.0) {
                        result = result.minusMinutes(1);
                        minutes = result.getMinute() / 15.0;
                    }
                    return result;
                })
                .format(DateTimeFormatter.RFC_1123_DATE_TIME);
    }
}

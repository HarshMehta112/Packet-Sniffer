package com.packet.sniffer;


import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DataHandler {

    public String timestampFormatter(Instant instant) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)
                .withLocale(Locale.ENGLISH)
                .withZone(ZoneId.systemDefault());
        return dateTimeFormatter.format(instant);
    }
}

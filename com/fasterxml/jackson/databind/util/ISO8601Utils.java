package com.fasterxml.jackson.databind.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class ISO8601Utils {
    private static final String GMT_ID = "GMT";
    private static final TimeZone TIMEZONE_GMT = TimeZone.getTimeZone(GMT_ID);

    private static void checkOffset(String str, int i, char c) {
        char charAt = str.charAt(i);
        if (charAt != c) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected '");
            stringBuilder.append(c);
            stringBuilder.append("' character but found '");
            stringBuilder.append(charAt);
            stringBuilder.append("'");
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
    }

    public static String format(Date date) {
        return format(date, false, TIMEZONE_GMT);
    }

    public static String format(Date date, boolean z) {
        return format(date, z, TIMEZONE_GMT);
    }

    public static String format(Date date, boolean z, TimeZone timeZone) {
        Calendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder stringBuilder = new StringBuilder((19 + (z ? 4 : 0)) + (timeZone.getRawOffset() == 0 ? "Z" : "+hh:mm").length());
        padInt(stringBuilder, gregorianCalendar.get(1), 4);
        date = 45;
        stringBuilder.append('-');
        padInt(stringBuilder, gregorianCalendar.get(2) + 1, 2);
        stringBuilder.append('-');
        padInt(stringBuilder, gregorianCalendar.get(5), 2);
        stringBuilder.append('T');
        padInt(stringBuilder, gregorianCalendar.get(11), 2);
        stringBuilder.append(':');
        padInt(stringBuilder, gregorianCalendar.get(12), 2);
        stringBuilder.append(':');
        padInt(stringBuilder, gregorianCalendar.get(13), 2);
        if (z) {
            stringBuilder.append('.');
            padInt(stringBuilder, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i = offset / 60000;
            int abs = Math.abs(i / 60);
            i = Math.abs(i % 60);
            if (offset >= 0) {
                date = 43;
            }
            stringBuilder.append(date);
            padInt(stringBuilder, abs, 2);
            stringBuilder.append(':');
            padInt(stringBuilder, i, 2);
        } else {
            stringBuilder.append('Z');
        }
        return stringBuilder.toString();
    }

    private static void padInt(StringBuilder stringBuilder, int i, int i2) {
        String num = Integer.toString(i);
        for (i2 -= num.length(); i2 > 0; i2--) {
            stringBuilder.append('0');
        }
        stringBuilder.append(num);
    }

    public static Date parse(String str) {
        StringBuilder stringBuilder;
        try {
            int parseInt;
            String str2;
            TimeZone timeZone;
            IndexOutOfBoundsException indexOutOfBoundsException;
            Calendar gregorianCalendar;
            int parseInt2 = parseInt(str, 0, 4);
            checkOffset(str, 4, '-');
            int parseInt3 = parseInt(str, 5, 7);
            checkOffset(str, 7, '-');
            int parseInt4 = parseInt(str, 8, 10);
            checkOffset(str, 10, 'T');
            int parseInt5 = parseInt(str, 11, 13);
            checkOffset(str, 13, ':');
            int parseInt6 = parseInt(str, 14, 16);
            checkOffset(str, 16, ':');
            int i = 19;
            int parseInt7 = parseInt(str, 17, 19);
            if (str.charAt(19) == '.') {
                checkOffset(str, 19, '.');
                parseInt = parseInt(str, 20, 23);
                i = 23;
            } else {
                parseInt = 0;
            }
            char charAt = str.charAt(i);
            if (charAt != '+') {
                if (charAt != '-') {
                    if (charAt == 'Z') {
                        str2 = GMT_ID;
                        timeZone = TimeZone.getTimeZone(str2);
                        if (timeZone.getID().equals(str2)) {
                            indexOutOfBoundsException = new IndexOutOfBoundsException();
                            throw indexOutOfBoundsException;
                        }
                        gregorianCalendar = new GregorianCalendar(timeZone);
                        gregorianCalendar.setLenient(false);
                        gregorianCalendar.set(1, parseInt2);
                        gregorianCalendar.set(2, parseInt3 - 1);
                        gregorianCalendar.set(5, parseInt4);
                        gregorianCalendar.set(11, parseInt5);
                        gregorianCalendar.set(12, parseInt6);
                        gregorianCalendar.set(13, parseInt7);
                        gregorianCalendar.set(14, parseInt);
                        return gregorianCalendar.getTime();
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Invalid time zone indicator ");
                    stringBuilder.append(charAt);
                    indexOutOfBoundsException = new IndexOutOfBoundsException(stringBuilder.toString());
                    throw indexOutOfBoundsException;
                }
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(GMT_ID);
            stringBuilder.append(str.substring(i));
            str2 = stringBuilder.toString();
            timeZone = TimeZone.getTimeZone(str2);
            if (timeZone.getID().equals(str2)) {
                indexOutOfBoundsException = new IndexOutOfBoundsException();
                throw indexOutOfBoundsException;
            }
            gregorianCalendar = new GregorianCalendar(timeZone);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, parseInt2);
            gregorianCalendar.set(2, parseInt3 - 1);
            gregorianCalendar.set(5, parseInt4);
            gregorianCalendar.set(11, parseInt5);
            gregorianCalendar.set(12, parseInt6);
            gregorianCalendar.set(13, parseInt7);
            gregorianCalendar.set(14, parseInt);
            return gregorianCalendar.getTime();
        } catch (Throwable e) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to parse date ");
            stringBuilder.append(str);
            throw new IllegalArgumentException(stringBuilder.toString(), e);
        } catch (Throwable e2) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to parse date ");
            stringBuilder.append(str);
            throw new IllegalArgumentException(stringBuilder.toString(), e2);
        } catch (Throwable e22) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to parse date ");
            stringBuilder.append(str);
            throw new IllegalArgumentException(stringBuilder.toString(), e22);
        }
    }

    private static int parseInt(String str, int i, int i2) {
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        int i3;
        int digit;
        int i4 = 0;
        if (i < i2) {
            i3 = i + 1;
            digit = Character.digit(str.charAt(i), 10);
            if (digit >= 0) {
                i4 = -digit;
                i = i3;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid number: ");
            stringBuilder.append(str);
            throw new NumberFormatException(stringBuilder.toString());
        }
        while (i < i2) {
            i3 = i + 1;
            digit = Character.digit(str.charAt(i), 10);
            if (digit >= 0) {
                i4 = (i4 * 10) - digit;
                i = i3;
            } else {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Invalid number: ");
                stringBuilder2.append(str);
                throw new NumberFormatException(stringBuilder2.toString());
            }
        }
        return -i4;
    }

    public static TimeZone timeZoneGMT() {
        return TIMEZONE_GMT;
    }
}

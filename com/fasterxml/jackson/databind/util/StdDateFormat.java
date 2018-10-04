package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.io.NumberInput;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class StdDateFormat extends DateFormat {
    public static final String[] ALL_FORMATS = new String[]{DATE_FORMAT_STR_ISO8601, DATE_FORMAT_STR_ISO8601_Z, DATE_FORMAT_STR_RFC1123, DATE_FORMAT_STR_PLAIN};
    public static final DateFormat DATE_FORMAT_ISO8601;
    public static final DateFormat DATE_FORMAT_ISO8601_Z;
    public static final DateFormat DATE_FORMAT_PLAIN;
    public static final DateFormat DATE_FORMAT_RFC1123;
    public static final String DATE_FORMAT_STR_ISO8601 = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
    public static final String DATE_FORMAT_STR_ISO8601_Z = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    public static final String DATE_FORMAT_STR_PLAIN = "yyyy-MM-dd";
    public static final String DATE_FORMAT_STR_RFC1123 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    private static final TimeZone DEFAULT_TIMEZONE = TimeZone.getTimeZone("GMT");
    public static final StdDateFormat instance = new StdDateFormat();
    public transient DateFormat _formatISO8601;
    public transient DateFormat _formatISO8601_z;
    public transient DateFormat _formatPlain;
    public transient DateFormat _formatRFC1123;
    public transient TimeZone _timezone;

    static {
        DateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT_STR_RFC1123, Locale.US);
        DATE_FORMAT_RFC1123 = simpleDateFormat;
        simpleDateFormat.setTimeZone(DEFAULT_TIMEZONE);
        DateFormat simpleDateFormat2 = new SimpleDateFormat(DATE_FORMAT_STR_ISO8601);
        DATE_FORMAT_ISO8601 = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(DEFAULT_TIMEZONE);
        simpleDateFormat2 = new SimpleDateFormat(DATE_FORMAT_STR_ISO8601_Z);
        DATE_FORMAT_ISO8601_Z = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(DEFAULT_TIMEZONE);
        simpleDateFormat2 = new SimpleDateFormat(DATE_FORMAT_STR_PLAIN);
        DATE_FORMAT_PLAIN = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(DEFAULT_TIMEZONE);
    }

    public StdDateFormat(TimeZone timeZone) {
        this._timezone = timeZone;
    }

    private final DateFormat _cloneFormat(DateFormat dateFormat) {
        return _cloneFormat(dateFormat, this._timezone);
    }

    private static final DateFormat _cloneFormat(DateFormat dateFormat, TimeZone timeZone) {
        dateFormat = (DateFormat) dateFormat.clone();
        if (timeZone != null) {
            dateFormat.setTimeZone(timeZone);
        }
        return dateFormat;
    }

    public StdDateFormat clone() {
        return new StdDateFormat();
    }

    public StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        if (this._formatISO8601 == null) {
            this._formatISO8601 = _cloneFormat(DATE_FORMAT_ISO8601);
        }
        return this._formatISO8601.format(date, stringBuffer, fieldPosition);
    }

    public static DateFormat getBlueprintISO8601Format() {
        return DATE_FORMAT_ISO8601;
    }

    public static DateFormat getBlueprintRFC1123Format() {
        return DATE_FORMAT_RFC1123;
    }

    public static TimeZone getDefaultTimeZone() {
        return DEFAULT_TIMEZONE;
    }

    public static DateFormat getISO8601Format(TimeZone timeZone) {
        return _cloneFormat(DATE_FORMAT_ISO8601, timeZone);
    }

    public static DateFormat getRFC1123Format(TimeZone timeZone) {
        return _cloneFormat(DATE_FORMAT_RFC1123, timeZone);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final boolean hasTimeZone(java.lang.String r5) {
        /*
        r4 = r5.length();
        r0 = 6;
        if (r4 < r0) goto L_0x002d;
    L_0x0007:
        r0 = r4 + -6;
        r0 = r5.charAt(r0);
        r3 = 1;
        r2 = 43;
        if (r0 == r2) goto L_0x002c;
    L_0x0012:
        r1 = 45;
        if (r0 != r1) goto L_0x0017;
    L_0x0016:
        goto L_0x002c;
    L_0x0017:
        r0 = r4 + -5;
        r0 = r5.charAt(r0);
        if (r0 == r2) goto L_0x002c;
    L_0x001f:
        if (r0 != r1) goto L_0x0022;
    L_0x0021:
        goto L_0x002c;
    L_0x0022:
        r0 = r4 + -3;
        r0 = r5.charAt(r0);
        if (r0 == r2) goto L_0x002c;
    L_0x002a:
        if (r0 != r1) goto L_0x002d;
    L_0x002c:
        return r3;
    L_0x002d:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.util.StdDateFormat.hasTimeZone(java.lang.String):boolean");
    }

    public boolean looksLikeISO8601(String str) {
        if (str.length() >= 5 && Character.isDigit(str.charAt(0)) && Character.isDigit(str.charAt(3)) && str.charAt(4) == '-') {
            return true;
        }
        return false;
    }

    public Date parse(String str) {
        String trim = str.trim();
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = parse(trim, parsePosition);
        if (parse != null) {
            return parse;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String str2 : ALL_FORMATS) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append("\", \"");
            } else {
                stringBuilder.append('\"');
            }
            stringBuilder.append(str2);
        }
        stringBuilder.append('\"');
        throw new ParseException(String.format("Can not parse date \"%s\": not compatible with any of standard forms (%s)", new Object[]{trim, stringBuilder.toString()}), parsePosition.getErrorIndex());
    }

    public Date parse(String str, ParsePosition parsePosition) {
        if (looksLikeISO8601(str)) {
            return parseAsISO8601(str, parsePosition);
        }
        int length = str.length();
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            char charAt = str.charAt(length);
            if ((charAt < '0' || charAt > '9') && (length > 0 || charAt != '-')) {
                break;
            }
        }
        if (length >= 0 || !NumberInput.inLongRange(str, false)) {
            return parseAsRFC1123(str, parsePosition);
        }
        return new Date(Long.parseLong(str));
    }

    public Date parseAsISO8601(String str, ParsePosition parsePosition) {
        DateFormat dateFormat;
        int length = str.length();
        int i = length - 1;
        char charAt = str.charAt(i);
        if (length <= 10 && Character.isDigit(charAt)) {
            dateFormat = this._formatPlain;
            if (dateFormat == null) {
                dateFormat = _cloneFormat(DATE_FORMAT_PLAIN);
                this._formatPlain = dateFormat;
            }
        } else if (charAt == 'Z') {
            dateFormat = this._formatISO8601_z;
            if (dateFormat == null) {
                dateFormat = _cloneFormat(DATE_FORMAT_ISO8601_Z);
                this._formatISO8601_z = dateFormat;
            }
            if (str.charAt(length - 4) == ':') {
                r1 = new StringBuilder(str);
                r1.insert(i, ".000");
                str = r1.toString();
            }
        } else if (hasTimeZone(str)) {
            int i2 = length - 3;
            charAt = str.charAt(i2);
            if (charAt == ':') {
                r1 = new StringBuilder(str);
                r1.delete(i2, length - 2);
                str = r1.toString();
            } else if (charAt == '+' || charAt == '-') {
                r1 = new StringBuilder();
                r1.append(str);
                r1.append("00");
                str = r1.toString();
            }
            int length2 = str.length();
            if (Character.isDigit(str.charAt(length2 - 9))) {
                r2 = new StringBuilder(str);
                r2.insert(length2 - 5, ".000");
                str = r2.toString();
            }
            dateFormat = this._formatISO8601;
            if (dateFormat == null) {
                dateFormat = _cloneFormat(DATE_FORMAT_ISO8601);
                this._formatISO8601 = dateFormat;
            }
        } else {
            r2 = new StringBuilder(str);
            if ((length - str.lastIndexOf(84)) - 1 <= 8) {
                r2.append(".000");
            }
            r2.append('Z');
            str = r2.toString();
            dateFormat = this._formatISO8601_z;
            if (dateFormat == null) {
                dateFormat = _cloneFormat(DATE_FORMAT_ISO8601_Z);
                this._formatISO8601_z = dateFormat;
            }
        }
        return dateFormat.parse(str, parsePosition);
    }

    public Date parseAsRFC1123(String str, ParsePosition parsePosition) {
        if (this._formatRFC1123 == null) {
            this._formatRFC1123 = _cloneFormat(DATE_FORMAT_RFC1123);
        }
        return this._formatRFC1123.parse(str, parsePosition);
    }

    public void setTimeZone(TimeZone timeZone) {
        if (timeZone != this._timezone) {
            this._formatRFC1123 = null;
            this._formatISO8601 = null;
            this._formatISO8601_z = null;
            this._formatPlain = null;
            this._timezone = timeZone;
        }
    }

    public StdDateFormat withTimeZone(TimeZone timeZone) {
        if (timeZone == null) {
            timeZone = DEFAULT_TIMEZONE;
        }
        return new StdDateFormat(timeZone);
    }
}

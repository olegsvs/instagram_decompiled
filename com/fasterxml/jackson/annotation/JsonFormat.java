package com.fasterxml.jackson.annotation;

import java.util.Locale;
import java.util.TimeZone;

@JacksonAnnotation
public @interface JsonFormat {
    public static final String DEFAULT_LOCALE = "##default";
    public static final String DEFAULT_TIMEZONE = "##default";

    public enum Shape {
        ANY,
        SCALAR,
        ARRAY,
        OBJECT,
        NUMBER,
        NUMBER_FLOAT,
        NUMBER_INT,
        STRING,
        BOOLEAN;

        public boolean isNumeric() {
            if (!(this == NUMBER || this == NUMBER_INT)) {
                if (this != NUMBER_FLOAT) {
                    return false;
                }
            }
            return true;
        }

        public boolean isStructured() {
            if (this != OBJECT) {
                if (this != ARRAY) {
                    return false;
                }
            }
            return true;
        }
    }

    public class Value {
        private final Locale locale;
        private final String pattern;
        private final Shape shape;
        private final TimeZone timezone;

        public Value() {
            String str = JsonProperty.USE_DEFAULT_NAME;
            this(str, Shape.ANY, str, str);
        }

        public Value(JsonFormat jsonFormat) {
            this(jsonFormat.pattern(), jsonFormat.shape(), jsonFormat.locale(), jsonFormat.timezone());
        }

        public Value(String str, Shape shape, String str2, String str3) {
            Locale locale;
            TimeZone timeZone = null;
            if (!(str2 == null || str2.length() == 0)) {
                if (!"##default".equals(str2)) {
                    locale = new Locale(str2);
                    if (!(str3 == null || str3.length() == 0)) {
                        if ("##default".equals(str3)) {
                            timeZone = TimeZone.getTimeZone(str3);
                        }
                    }
                    this(str, shape, locale, timeZone);
                }
            }
            locale = null;
            if ("##default".equals(str3)) {
                timeZone = TimeZone.getTimeZone(str3);
            }
            this(str, shape, locale, timeZone);
        }

        public Value(String str, Shape shape, Locale locale, TimeZone timeZone) {
            this.pattern = str;
            this.shape = shape;
            this.locale = locale;
            this.timezone = timeZone;
        }

        public Locale getLocale() {
            return this.locale;
        }

        public String getPattern() {
            return this.pattern;
        }

        public Shape getShape() {
            return this.shape;
        }

        public TimeZone getTimeZone() {
            return this.timezone;
        }

        public Value withLocale(Locale locale) {
            return new Value(this.pattern, this.shape, locale, this.timezone);
        }

        public Value withPattern(String str) {
            return new Value(str, this.shape, this.locale, this.timezone);
        }

        public Value withShape(Shape shape) {
            return new Value(this.pattern, shape, this.locale, this.timezone);
        }

        public Value withTimeZone(TimeZone timeZone) {
            return new Value(this.pattern, this.shape, this.locale, timeZone);
        }
    }

    String locale() default "##default";

    String pattern() default "";

    Shape shape() default Shape.ANY;

    String timezone() default "##default";
}

package com.fasterxml.jackson.annotation;

@JacksonAnnotation
public @interface JsonTypeInfo {

    public enum As {
        PROPERTY,
        WRAPPER_OBJECT,
        WRAPPER_ARRAY,
        EXTERNAL_PROPERTY
    }

    public enum Id {
        NONE(null),
        CLASS("@class"),
        MINIMAL_CLASS("@c"),
        NAME("@type"),
        CUSTOM(null);
        
        private final String _defaultPropertyName;

        private Id(String str) {
            this._defaultPropertyName = str;
        }

        public String getDefaultPropertyName() {
            return this._defaultPropertyName;
        }
    }

    public abstract class None {
    }

    Class defaultImpl() default None.class;

    As include() default As.PROPERTY;

    String property() default "";

    Id use();

    boolean visible() default false;
}

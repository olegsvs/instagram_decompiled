package com.facebook.react.module.annotations;

public @interface ReactModule {
    boolean canOverrideExistingModule() default false;

    boolean hasConstants() default true;

    String name();

    boolean needsEagerInit() default false;
}

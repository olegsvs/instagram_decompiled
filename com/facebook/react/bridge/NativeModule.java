package com.facebook.react.bridge;

public interface NativeModule {

    public interface NativeMethod {
        void invoke(JSInstance jSInstance, ReadableArray readableArray);
    }

    boolean canOverrideExistingModule();

    String getName();

    void initialize();

    void onCatalystInstanceDestroy();
}

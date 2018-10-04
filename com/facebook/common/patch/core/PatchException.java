package com.facebook.common.patch.core;

public class PatchException extends Exception {
    public PatchException(String str, Throwable th) {
        super(str, th);
    }
}

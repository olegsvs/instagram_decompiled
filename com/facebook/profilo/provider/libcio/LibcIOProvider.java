package com.facebook.profilo.provider.libcio;

import X.AnonymousClass0CJ;
import com.facebook.profilo.core.ProvidersRegistry;

public final class LibcIOProvider extends AnonymousClass0CJ {
    public static final int PROVIDER_LIBC_IO = ProvidersRegistry.m1051C("libc_io");

    public native void nativeCleanup();

    public native void nativeInitialize();

    public native boolean nativeIsTracingEnabled();

    public LibcIOProvider() {
        super("profilo_libcio");
    }

    public final void disable() {
        nativeCleanup();
    }

    public final void enable() {
        nativeInitialize();
    }

    public final int getSupportedProviders() {
        return PROVIDER_LIBC_IO;
    }

    public final int getTracingProviders() {
        return nativeIsTracingEnabled() ? PROVIDER_LIBC_IO : 0;
    }
}

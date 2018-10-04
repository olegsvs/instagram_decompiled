package com.facebook.react.bridge;

import android.content.Context;

public final class ReactApplicationContext extends ReactContext {
    public ReactApplicationContext(Context context) {
        super(context.getApplicationContext());
    }
}

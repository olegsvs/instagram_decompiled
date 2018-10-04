package com.facebook.react.bridge;

import android.os.AsyncTask;

public abstract class GuardedAsyncTask extends AsyncTask {
    private final ReactContext mReactContext;

    public abstract void doInBackgroundGuarded(Object... objArr);

    public GuardedAsyncTask(ReactContext reactContext) {
        this.mReactContext = reactContext;
    }

    public final Void doInBackground(Object... objArr) {
        try {
            doInBackgroundGuarded(objArr);
        } catch (Object[] objArr2) {
            this.mReactContext.handleException(objArr2);
        }
        return null;
    }
}

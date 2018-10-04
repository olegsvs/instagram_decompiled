package com.facebook.react.devsupport;

import X.AnonymousClass0OR;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;

public final class DoubleTapReloadRecognizer {
    private boolean mDoRefresh = false;

    /* renamed from: com.facebook.react.devsupport.DoubleTapReloadRecognizer$1 */
    public final class C00941 implements Runnable {
        public final void run() {
            DoubleTapReloadRecognizer.this.mDoRefresh = false;
        }
    }

    public final boolean didDoubleTapR(int i, View view) {
        if (i == 46 && !(view instanceof EditText)) {
            if (this.mDoRefresh) {
                this.mDoRefresh = false;
                return true;
            }
            this.mDoRefresh = true;
            AnonymousClass0OR.F(new Handler(), new C00941(), 200, -1542820521);
        }
        return false;
    }
}

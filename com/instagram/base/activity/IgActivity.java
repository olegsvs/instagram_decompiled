package com.instagram.base.activity;

import X.AnonymousClass0EH;
import X.AnonymousClass0FC;
import X.AnonymousClass0Gi;
import X.AnonymousClass0cQ;
import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;

public abstract class IgActivity extends Activity {
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AnonymousClass0FC.B().cKA(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public void onCreate(Bundle bundle) {
        int B = AnonymousClass0cQ.B(this, -1215114548);
        AnonymousClass0EH.J(getResources());
        super.onCreate(bundle);
        AnonymousClass0Gi.f2408B.A(this);
        AnonymousClass0cQ.C(this, 1531119685, B);
    }

    public final void onDestroy() {
        int B = AnonymousClass0cQ.B(this, -1544405360);
        super.onDestroy();
        AnonymousClass0Gi.f2408B.B(this);
        AnonymousClass0cQ.C(this, 1886719446, B);
    }

    public final void onPause() {
        int B = AnonymousClass0cQ.B(this, -1267059465);
        super.onPause();
        AnonymousClass0Gi.f2408B.C(this);
        AnonymousClass0cQ.C(this, 625802624, B);
    }

    public final void onResume() {
        int B = AnonymousClass0cQ.B(this, 1098597612);
        super.onResume();
        AnonymousClass0Gi.f2408B.D(this);
        AnonymousClass0cQ.C(this, -1000650145, B);
    }
}

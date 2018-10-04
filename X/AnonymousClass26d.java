package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.concurrent.Callable;

/* renamed from: X.26d */
public final class AnonymousClass26d implements OnPreDrawListener {
    /* renamed from: B */
    public final /* synthetic */ Callable f26039B;
    /* renamed from: C */
    public final /* synthetic */ View f26040C;
    /* renamed from: D */
    public final /* synthetic */ ViewTreeObserver f26041D;

    public AnonymousClass26d(ViewTreeObserver viewTreeObserver, View view, Callable callable) {
        this.f26041D = viewTreeObserver;
        this.f26040C = view;
        this.f26039B = callable;
    }

    public final boolean onPreDraw() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = r1.f26041D;
        r0 = r0.isAlive();
        if (r0 == 0) goto L_0x000e;
    L_0x0008:
        r0 = r1.f26041D;
        r0.removeOnPreDrawListener(r1);
        goto L_0x0017;
    L_0x000e:
        r0 = r1.f26040C;
        r0 = r0.getViewTreeObserver();
        r0.removeOnPreDrawListener(r1);
    L_0x0017:
        r0 = r1.f26039B;	 Catch:{ Exception -> 0x0024 }
        r0 = r0.call();	 Catch:{ Exception -> 0x0024 }
        r0 = (java.lang.Boolean) r0;	 Catch:{ Exception -> 0x0024 }
        r0 = r0.booleanValue();	 Catch:{ Exception -> 0x0024 }
        return r0;	 Catch:{ Exception -> 0x0024 }
    L_0x0024:
        r0 = 1;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.26d.onPreDraw():boolean");
    }
}

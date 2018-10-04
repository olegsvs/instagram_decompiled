package com.google.android.play.core.splitinstall.p002a;

import X.AnonymousClass0cQ;
import X.AnonymousClass1yZ;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p001a.C0052a;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.a.c */
public final class C0059c extends C0052a implements C0054a {
    public C0059c(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        AnonymousClass0cQ.H(this, -1847551554, AnonymousClass0cQ.I(this, -1581785774));
    }

    public final void MB(String str, int i, Bundle bundle, C0055d c0055d) {
        int I = AnonymousClass0cQ.I(this, 188713346);
        Parcel A = m13966A();
        A.writeString(str);
        A.writeInt(i);
        AnonymousClass1yZ.m13971D(A, bundle);
        AnonymousClass1yZ.m13970C(A, c0055d);
        m13967B(3, A);
        AnonymousClass0cQ.H(this, -1198689403, I);
    }

    public final void NB(String str, C0055d c0055d) {
        int I = AnonymousClass0cQ.I(this, -696939767);
        Parcel A = m13966A();
        A.writeString(str);
        AnonymousClass1yZ.m13970C(A, c0055d);
        m13967B(6, A);
        AnonymousClass0cQ.H(this, 769100197, I);
    }

    public final void OB(String str, List list, Bundle bundle, C0055d c0055d) {
        int I = AnonymousClass0cQ.I(this, -681290000);
        Parcel A = m13966A();
        A.writeString(str);
        A.writeTypedList(list);
        AnonymousClass1yZ.m13971D(A, bundle);
        AnonymousClass1yZ.m13970C(A, c0055d);
        m13967B(2, A);
        AnonymousClass0cQ.H(this, 167343096, I);
    }
}

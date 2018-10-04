package com.instagram.contentprovider;

import X.AnonymousClass0CC;
import X.AnonymousClass0Cc;
import X.AnonymousClass0Cd;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Cf;
import X.AnonymousClass0Ci;
import X.AnonymousClass0Cn;
import X.AnonymousClass0Dc;
import X.AnonymousClass0N2;
import X.AnonymousClass0a2;
import X.AnonymousClass1P1;
import X.AnonymousClass2kS;
import X.AnonymousClass3C0;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.instagram.service.session.ShouldInitUserSession;

@ShouldInitUserSession
public class FamilyAppsUserValuesProvider extends ContentProvider {
    /* renamed from: B */
    private static final String[] f1684B = new String[]{"COL_USERNAME", "COL_FULL_NAME", "COL_SESSION_ID", "COL_PROFILE_PHOTO_URL", "COL_IS_BUSINESS", "COL_LINKED_FBID", "COL_DEVICE_FAMILY_APP_ID"};
    /* renamed from: C */
    public static final Class f1685C = FamilyAppsUserValuesProvider.class;

    public final boolean onCreate() {
        return true;
    }

    /* renamed from: B */
    private Cursor m922B() {
        AnonymousClass0Cc.f1696C.m943A();
        if (AnonymousClass0Cd.f1698B.m970N()) {
            AnonymousClass0Cn H = AnonymousClass0Ce.m951H(this);
            if (H != null) {
                AnonymousClass0Ci B = H.m1037B();
                if (B != null) {
                    String I;
                    String str;
                    String uT = B.uT();
                    String str2 = B.f1757z;
                    String valueOf = String.valueOf(B.m1018i());
                    String DQ = B.DQ();
                    String F = AnonymousClass0Cf.m976F(H);
                    if (((Boolean) AnonymousClass0CC.bZ.m914G()).booleanValue()) {
                        I = AnonymousClass0a2.m5424I(H);
                        str = AnonymousClass0N2.m3261B().m3264A() != null ? AnonymousClass0N2.m3261B().m3264A().f7512B : null;
                    } else {
                        I = null;
                        str = null;
                    }
                    if (F != null) {
                        String[] strArr = new String[]{uT, str2, F, DQ, valueOf, I, str};
                        Cursor matrixCursor = new MatrixCursor(f1684B);
                        matrixCursor.addRow(strArr);
                        return matrixCursor;
                    }
                }
            }
        }
        AnonymousClass0Dc.m1249L(f1685C, "User info not available");
        return null;
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        AnonymousClass0Dc.m1239B(f1685C, "Unsupported Operation");
        throw new UnsupportedOperationException();
    }

    public final String getType(Uri uri) {
        AnonymousClass0Dc.m1239B(f1685C, "Unsupported Operation");
        throw new UnsupportedOperationException();
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        AnonymousClass0Dc.m1239B(f1685C, "Unsupported Operation");
        throw new UnsupportedOperationException();
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (!((Boolean) AnonymousClass0CC.cZ.m914G()).booleanValue()) {
            AnonymousClass0Dc.m1249L(f1685C, "Unsupported Operation");
            throw new UnsupportedOperationException();
        } else if (AnonymousClass3C0.C(getContext()) || AnonymousClass3C0.E(getContext(), AnonymousClass2kS.f33251B, AnonymousClass1P1.f18101B) || AnonymousClass3C0.D(getContext())) {
            return m922B();
        } else {
            String str3 = "Component access not allowed.";
            AnonymousClass0Dc.m1239B(f1685C, str3);
            throw new SecurityException(str3);
        }
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        AnonymousClass0Dc.m1239B(f1685C, "Unsupported Operation");
        throw new UnsupportedOperationException();
    }
}

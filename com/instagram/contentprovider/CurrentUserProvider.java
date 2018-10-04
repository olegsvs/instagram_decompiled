package com.instagram.contentprovider;

import X.AnonymousClass0Cc;
import X.AnonymousClass0Cd;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Ci;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Binder;
import android.os.CancellationSignal;
import com.instagram.service.session.ShouldInitUserSession;

@ShouldInitUserSession
public class CurrentUserProvider extends ContentProvider {
    /* renamed from: B */
    private static final String[] f1686B = new String[]{"COL_FULL_NAME", "COL_PROFILE_PHOTO_URL"};

    public final boolean onCreate() {
        return true;
    }

    /* renamed from: A */
    public final void m923A() {
        int callingUid = Binder.getCallingUid();
        int i = getContext().getApplicationInfo().uid;
        if (callingUid == i) {
            return;
        }
        if (getContext().getPackageManager().checkSignatures(i, callingUid) != 0) {
            throw new SecurityException("Access to user information denied");
        }
    }

    /* renamed from: B */
    public final Cursor m924B() {
        AnonymousClass0Cc.f1696C.m943A();
        if (!AnonymousClass0Cd.f1698B.m970N()) {
            return null;
        }
        AnonymousClass0Ci B = AnonymousClass0Ce.m951H(this).m1037B();
        String str = B.f1757z;
        String DQ = B.DQ();
        String[] strArr = new String[]{str, DQ};
        Cursor matrixCursor = new MatrixCursor(f1686B);
        matrixCursor.addRow(strArr);
        return matrixCursor;
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public final String getType(Uri uri) {
        throw new UnsupportedOperationException();
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        m923A();
        return m924B();
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        m923A();
        return m924B();
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}

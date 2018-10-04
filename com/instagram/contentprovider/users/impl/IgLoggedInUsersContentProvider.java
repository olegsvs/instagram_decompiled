package com.instagram.contentprovider.users.impl;

import X.AnonymousClass0Cb;
import X.AnonymousClass0Cc;
import X.AnonymousClass0Cd;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Cf;
import X.AnonymousClass0Cg;
import X.AnonymousClass0Ci;
import X.AnonymousClass0Co;
import X.AnonymousClass0G7;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import com.instagram.service.session.ShouldInitUserSession;
import java.net.CookieManager;
import java.net.HttpCookie;
import java.util.List;

@ShouldInitUserSession
public final class IgLoggedInUsersContentProvider extends ContentProvider {
    /* renamed from: B */
    private static final String[] f1695B = new String[]{MemoryDumpUploadJob.EXTRA_USER_ID, "session_id", "username", "profile_pic_url", "is_active_user"};

    public final boolean onCreate() {
        return true;
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
        if (!AnonymousClass0Cb.m942B(getContext())) {
            return null;
        }
        AnonymousClass0Cc.f1696C.m943A();
        List E = AnonymousClass0Cd.f1698B.m961E();
        Cursor matrixCursor = new MatrixCursor(f1695B);
        int size = E.size();
        for (int i = 0; i < size; i++) {
            HttpCookie httpCookie;
            String str3;
            String str4;
            String str5 = (String) E.get(i);
            String str6 = "sessionid";
            CookieManager F = AnonymousClass0G7.m1739F(str5);
            if (F == null) {
                httpCookie = null;
            } else {
                httpCookie = AnonymousClass0Cf.m974D(F, str6);
            }
            if (httpCookie == null) {
                str3 = null;
            } else {
                str3 = httpCookie.getValue();
            }
            AnonymousClass0Ci B = AnonymousClass0Cg.f1704B.m978B(str5);
            boolean D = AnonymousClass0Co.m1044D(AnonymousClass0Ce.m951H(this), B);
            if (B == null) {
                str4 = null;
                str6 = null;
            } else {
                str6 = B.uT();
                str4 = B.DQ();
            }
            matrixCursor.addRow(new String[]{str5, str3, str6, str4, Boolean.toString(D)});
        }
        return matrixCursor;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}

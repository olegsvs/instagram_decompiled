package com.instagram.contentprovider;

import X.AnonymousClass0Cb;
import X.AnonymousClass0Cc;
import X.AnonymousClass0Cd;
import X.AnonymousClass38R;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import java.util.List;

public class IgFaceEffectsProvider extends ContentProvider {
    /* renamed from: B */
    private static final String[] f1763B = new String[]{MemoryDumpUploadJob.EXTRA_USER_ID, "badge_state_map"};

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
        Cursor matrixCursor = new MatrixCursor(f1763B);
        int size = E.size();
        for (int i = 0; i < size; i++) {
            String E2 = AnonymousClass38R.E(getContext(), (String) E.get(i));
            matrixCursor.addRow(new String[]{r3, E2});
        }
        return matrixCursor;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}

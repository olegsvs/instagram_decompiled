package X;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Process;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0CX */
public abstract class AnonymousClass0CX extends ContentProvider {
    /* renamed from: A */
    public abstract void mo205A();

    /* renamed from: B */
    public abstract AnonymousClass0dl mo206B(Context context);

    /* renamed from: C */
    public abstract AnonymousClass1w2 mo207C(Context context);

    /* renamed from: D */
    public abstract AnonymousClass0CY mo208D();

    public final boolean onCreate() {
        return true;
    }

    /* renamed from: B */
    private Cursor m929B() {
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        AnonymousClass0dl B = mo206B(getContext());
        if (B != null) {
            getContext();
            arrayList.add("COL_PHONE_ID");
            arrayList.add("COL_TIMESTAMP");
            arrayList.add("COL_ORIGIN");
            arrayList2.add(B.f7512B);
            arrayList2.add(Long.toString(B.f7514D));
            arrayList2.add(B.f7513C);
        }
        AnonymousClass1w2 C = mo207C(getContext());
        if (C != null) {
            getContext();
            arrayList.add("COL_SFDID");
            arrayList.add("COL_SFDID_CREATION_TS");
            arrayList.add("COL_SFDID_GP");
            arrayList.add("COL_SFDID_GA");
            arrayList2.add(C.f24325E);
            arrayList2.add(Long.toString(C.f24322B));
            arrayList2.add(C.f24324D);
            arrayList2.add(C.f24323C);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        Cursor matrixCursor = new MatrixCursor((String[]) arrayList.toArray(new String[arrayList.size()]));
        matrixCursor.addRow(arrayList2.toArray(new String[arrayList2.size()]));
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
        mo205A();
        try {
            SecurityException illegalStateException;
            Context context = getContext();
            AnonymousClass0L4 anonymousClass0L4 = AnonymousClass1vx.f24303B;
            if (Binder.getCallingPid() == Process.myPid()) {
                illegalStateException = new IllegalStateException("This method should be called on behalf of an IPC transaction from binder thread.");
            } else if (anonymousClass0L4.m2898A(Binder.getCallingUid(), context).f17077B) {
                return m929B();
            } else {
                illegalStateException = new SecurityException("Access denied.");
            }
            throw illegalStateException;
        } catch (Throwable e) {
            if (mo208D() != null) {
                mo208D().HKA("AbstractPhoneIdProvider", e.getMessage(), e);
            }
            return null;
        }
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}

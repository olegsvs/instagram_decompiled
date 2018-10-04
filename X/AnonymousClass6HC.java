package X;

import android.database.Cursor;
import java.io.Closeable;

/* renamed from: X.6HC */
public final class AnonymousClass6HC extends AnonymousClass6CE implements Closeable {
    /* renamed from: B */
    public final Cursor f73949B;

    public AnonymousClass6HC(Cursor cursor) {
        this.f73949B = cursor;
    }

    /* renamed from: A */
    public final /* bridge */ /* synthetic */ Object mo6780A() {
        return mo6781B();
    }

    /* renamed from: B */
    public final AnonymousClass5e3 mo6781B() {
        if (this.f73949B.isBeforeFirst()) {
            this.f73949B.moveToNext();
        }
        AnonymousClass6HC.m29880D(this);
        if (!this.f73949B.isAfterLast()) {
            return AnonymousClass6HC.m29879C(this);
        }
        this.f72879B = AnonymousClass5e5.DONE;
        return (AnonymousClass5e3) null;
    }

    /* renamed from: B */
    public static String m29878B(AnonymousClass6HC anonymousClass6HC, String str) {
        anonymousClass6HC = anonymousClass6HC.f73949B;
        return anonymousClass6HC.getString(anonymousClass6HC.getColumnIndexOrThrow(str));
    }

    /* renamed from: C */
    private static AnonymousClass5e3 m29879C(AnonymousClass6HC anonymousClass6HC) {
        int columnIndexOrThrow = anonymousClass6HC.f73949B.getColumnIndexOrThrow("contact_id");
        String valueOf = String.valueOf(anonymousClass6HC.f73949B.getLong(columnIndexOrThrow));
        AnonymousClass5e3 anonymousClass5e3 = new AnonymousClass5e3(valueOf);
        do {
            AnonymousClass6HC.m29880D(anonymousClass6HC);
            if (!anonymousClass6HC.f73949B.isAfterLast()) {
                if (!String.valueOf(anonymousClass6HC.f73949B.getLong(columnIndexOrThrow)).equals(valueOf)) {
                    break;
                }
                Cursor cursor = anonymousClass6HC.f73949B;
                String string = cursor.getString(cursor.getColumnIndexOrThrow("mimetype"));
                if ("vnd.android.cursor.item/phone_v2".equals(string)) {
                    String B = AnonymousClass6HC.m29878B(anonymousClass6HC, "data1");
                    cursor = anonymousClass6HC.f73949B;
                    int i = cursor.getInt(cursor.getColumnIndexOrThrow("data2"));
                    if (!(B == null || B.isEmpty() || anonymousClass5e3.f67756I.contains(B))) {
                        anonymousClass5e3.f67756I.add(B);
                        anonymousClass5e3.f67755H.add(new AnonymousClass5e2(B, i));
                    }
                } else if ("vnd.android.cursor.item/email_v2".equals(string)) {
                    string = AnonymousClass6HC.m29878B(anonymousClass6HC, "data1");
                    if (!(string == null || string.isEmpty())) {
                        anonymousClass5e3.f67751D.add(string);
                    }
                } else if ("vnd.android.cursor.item/name".equals(string)) {
                    anonymousClass5e3.f67750C = AnonymousClass6HC.m29878B(anonymousClass6HC, "data1");
                    anonymousClass5e3.f67752E = AnonymousClass6HC.m29878B(anonymousClass6HC, "data2");
                    anonymousClass5e3.f67753F = AnonymousClass6HC.m29878B(anonymousClass6HC, "data3");
                }
            } else {
                break;
            }
        } while (anonymousClass6HC.f73949B.moveToNext());
        return anonymousClass5e3;
    }

    /* renamed from: D */
    private static int m29880D(AnonymousClass6HC anonymousClass6HC) {
        int i = 0;
        while (anonymousClass6HC.m29881E()) {
            i++;
        }
        return i;
    }

    /* renamed from: E */
    private boolean m29881E() {
        if (this.f73949B.isAfterLast()) {
            return false;
        }
        Cursor cursor = this.f73949B;
        int i = cursor.getInt(cursor.getColumnIndexOrThrow("deleted"));
        if (i != 0) {
            this.f73949B.moveToNext();
        }
        if (i != 0) {
            return true;
        }
        return false;
    }

    public final void close() {
        this.f73949B.close();
    }
}

package X;

import android.view.View;
import com.fasterxml.jackson.databind.JsonMappingException;

/* renamed from: X.4S7 */
public final class AnonymousClass4S7 {
    /* renamed from: C */
    public static int m24258C(int i, int i2) {
        return (int) ((1000.0f / ((float) i2)) * ((float) i));
    }

    /* renamed from: B */
    public static int m24257B(int i) {
        return i > 0 ? (i / JsonMappingException.MAX_REFS_TO_LIST) + 1 : 0;
    }

    /* renamed from: D */
    public static int m24259D(int i, int i2) {
        i = (double) (i - i2);
        Double.isNaN(i);
        return (int) Math.ceil(i / 2.0d);
    }

    /* renamed from: E */
    public static boolean m24260E(int i, int i2, View view) {
        i = AnonymousClass4S7.m24259D(i, i2);
        return i <= view.getLeft() && view.getRight() <= i2 + i;
    }
}

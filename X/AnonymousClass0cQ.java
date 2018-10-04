package X;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.facebook.profilo.logger.Logger;

/* renamed from: X.0cQ */
public final class AnonymousClass0cQ {
    /* renamed from: B */
    public static int m5852B(Activity activity, int i) {
        return Logger.writeEntryWithoutMatch(AnonymousClass0CI.f1516F, 34, i);
    }

    /* renamed from: C */
    public static void m5853C(Activity activity, int i, int i2) {
        Logger.writeEntry(AnonymousClass0CI.f1516F, 35, i, i2);
    }

    /* renamed from: D */
    public static int m5854D(BroadcastReceiver broadcastReceiver, int i) {
        return Logger.writeEntryWithoutMatch(AnonymousClass0CI.f1516F, 38, i);
    }

    /* renamed from: E */
    public static void m5855E(BroadcastReceiver broadcastReceiver, Context context, Intent intent, int i, int i2) {
        AnonymousClass0cQ.m5866P(intent, AnonymousClass0CI.f1516F, 39, i, i2);
    }

    /* renamed from: F */
    public static int m5856F(AnonymousClass0IL anonymousClass0IL, int i) {
        return Logger.writeEntryWithoutMatch(AnonymousClass0CI.f1516F, 42, i);
    }

    /* renamed from: G */
    public static void m5857G(AnonymousClass0IL anonymousClass0IL, int i, int i2) {
        Logger.writeEntry(AnonymousClass0CI.f1516F, 43, i, i2);
    }

    /* renamed from: H */
    public static void m5858H(Object obj, int i, int i2) {
        Logger.writeEntry(AnonymousClass0CI.f1519I, 31, i, i2);
    }

    /* renamed from: I */
    public static int m5859I(Object obj, int i) {
        return Logger.writeEntryWithoutMatch(AnonymousClass0CI.f1519I, 30, i);
    }

    /* renamed from: J */
    public static int m5860J(Service service, int i) {
        return Logger.writeEntryWithoutMatch(AnonymousClass0CI.f1516F, 36, i);
    }

    /* renamed from: K */
    public static void m5861K(Service service, int i, int i2) {
        Logger.writeEntry(AnonymousClass0CI.f1516F, 37, i, i2);
    }

    /* renamed from: L */
    public static void m5862L(Object obj, int i, int i2) {
        Logger.writeEntry(AnonymousClass0CI.f1516F, 2, i, i2);
    }

    /* renamed from: M */
    public static int m5863M(Object obj, int i) {
        return Logger.writeEntryWithoutMatch(AnonymousClass0CI.f1516F, 1, i);
    }

    /* renamed from: N */
    public static int m5864N(View view, int i) {
        return Logger.writeEntryWithoutMatch(AnonymousClass0CI.f1516F, 44, i);
    }

    /* renamed from: O */
    public static void m5865O(View view, int i, int i2) {
        Logger.writeEntry(AnonymousClass0CI.f1516F, 45, i, i2);
    }

    /* renamed from: P */
    public static void m5866P(Intent intent, int i, int i2, int i3, int i4) {
        intent = intent != null ? intent.getAction() : null;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        if (intent == null) {
            Logger.writeEntry(i, i2, i3, i4);
        } else {
            Logger.writeEntryWithString(i5, i6, i7, i8, 0, "Intent action", intent);
        }
    }
}

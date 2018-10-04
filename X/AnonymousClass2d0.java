package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;

/* renamed from: X.2d0 */
public class AnonymousClass2d0 extends AnonymousClass2OB {
    public Notification CD(AnonymousClass0RT anonymousClass0RT, AnonymousClass1le anonymousClass1le) {
        AnonymousClass0RT anonymousClass0RT2 = anonymousClass0RT;
        Context context = anonymousClass0RT2.f4685O;
        Notification notification = anonymousClass0RT2.f4694X;
        CharSequence charSequence = anonymousClass0RT2.f4683M;
        CharSequence charSequence2 = anonymousClass0RT2.f4682L;
        CharSequence charSequence3 = anonymousClass0RT2.f4680J;
        RemoteViews remoteViews = anonymousClass0RT2.f4708l;
        int i = anonymousClass0RT2.f4695Y;
        PendingIntent pendingIntent = anonymousClass0RT2.f4681K;
        PendingIntent pendingIntent2 = anonymousClass0RT2.f4687Q;
        Bitmap bitmap = anonymousClass0RT2.f4692V;
        int i2 = anonymousClass0RT2.f4700d;
        int i3 = anonymousClass0RT2.f4698b;
        boolean z = anonymousClass0RT2.f4699c;
        boolean z2 = anonymousClass0RT2.f4710n;
        RemoteViews remoteViews2 = remoteViews;
        int i4 = i;
        PendingIntent pendingIntent3 = pendingIntent;
        PendingIntent pendingIntent4 = pendingIntent2;
        Bitmap bitmap2 = bitmap;
        int i5 = i2;
        int i6 = i3;
        boolean z3 = z;
        boolean z4 = z2;
        Context context2 = context;
        Notification notification2 = notification;
        CharSequence charSequence4 = charSequence;
        CharSequence charSequence5 = charSequence2;
        AnonymousClass1lc anonymousClass2OG = new AnonymousClass2OG(context2, notification2, charSequence4, charSequence5, charSequence3, remoteViews2, i4, pendingIntent3, pendingIntent4, bitmap2, i5, i6, z3, z4, anonymousClass0RT2.f4697a, anonymousClass0RT2.f4707k, anonymousClass0RT2.f4693W, anonymousClass0RT2.f4686P, anonymousClass0RT2.f4689S, anonymousClass0RT2.f4690T, anonymousClass0RT2.f4705i, anonymousClass0RT2.f4684N, anonymousClass0RT2.f4674D);
        AnonymousClass0Rd.B(anonymousClass2OG, anonymousClass0RT2.f4672B);
        if (anonymousClass0RT2.f4706j != null) {
            anonymousClass0RT2.f4706j.A(anonymousClass2OG);
        }
        Notification B = AnonymousClass1le.m12941B(anonymousClass0RT2, anonymousClass2OG);
        if (anonymousClass0RT2.f4706j != null) {
            Bundle C = AnonymousClass0Rd.C(B);
        }
        return B;
    }
}

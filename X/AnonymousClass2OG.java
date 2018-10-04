package X;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2OG */
public final class AnonymousClass2OG implements AnonymousClass1lc, AnonymousClass1lb {
    /* renamed from: B */
    private Builder f29906B;
    /* renamed from: C */
    private List f29907C = new ArrayList();
    /* renamed from: D */
    private RemoteViews f29908D;
    /* renamed from: E */
    private RemoteViews f29909E;
    /* renamed from: F */
    private final Bundle f29910F;

    public AnonymousClass2OG(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, int i4, CharSequence charSequence4, boolean z3, Bundle bundle, String str, boolean z4, String str2, RemoteViews remoteViews2, RemoteViews remoteViews3) {
        boolean z5 = false;
        Builder deleteIntent = new Builder(context).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent);
        if ((notification.flags & 128) != 0) {
            z5 = true;
        }
        this.f29906B = deleteIntent.setFullScreenIntent(pendingIntent2, z5).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z2).setPriority(i4).setProgress(i2, i3, z);
        this.f29910F = new Bundle();
        Bundle bundle2 = bundle;
        if (bundle != null) {
            this.f29910F.putAll(bundle2);
        }
        if (z3) {
            this.f29910F.putBoolean("android.support.localOnly", true);
        }
        String str3 = str;
        if (str != null) {
            this.f29910F.putString("android.support.groupKey", str3);
            if (z4) {
                this.f29910F.putBoolean("android.support.isGroupSummary", true);
            } else {
                this.f29910F.putBoolean("android.support.useSideChannel", true);
            }
        }
        String str4 = str2;
        if (str2 != null) {
            this.f29910F.putString("android.support.sortKey", str4);
        }
        this.f29909E = remoteViews2;
        this.f29908D = remoteViews3;
    }

    public final Notification BD() {
        Notification build = this.f29906B.build();
        Bundle C = AnonymousClass1lk.m12945C(build);
        Bundle bundle = new Bundle(this.f29910F);
        for (String str : this.f29910F.keySet()) {
            if (C.containsKey(str)) {
                bundle.remove(str);
            }
        }
        C.putAll(bundle);
        SparseArray B = AnonymousClass1lk.m12944B(this.f29907C);
        if (B != null) {
            AnonymousClass1lk.m12945C(build).putSparseParcelableArray("android.support.actionExtras", B);
        }
        RemoteViews remoteViews = this.f29909E;
        if (remoteViews != null) {
            build.contentView = remoteViews;
        }
        remoteViews = this.f29908D;
        if (remoteViews != null) {
            build.bigContentView = remoteViews;
        }
        return build;
    }

    public final Builder PJ() {
        return this.f29906B;
    }

    public final void WB(AnonymousClass0RV anonymousClass0RV) {
        this.f29907C.add(AnonymousClass1lk.m12946D(this.f29906B, anonymousClass0RV));
    }
}

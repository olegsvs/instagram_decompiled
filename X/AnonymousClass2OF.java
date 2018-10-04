package X;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

/* renamed from: X.2OF */
public final class AnonymousClass2OF implements AnonymousClass1lc, AnonymousClass1lb {
    /* renamed from: B */
    private Builder f29905B;

    public AnonymousClass2OF(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, CharSequence charSequence4, boolean z4, String str, ArrayList arrayList, Bundle bundle, int i5, int i6, Notification notification2, String str2, boolean z5, String str3, CharSequence[] charSequenceArr, RemoteViews remoteViews2, RemoteViews remoteViews3, RemoteViews remoteViews4, String str4, int i7, String str5, long j, boolean z6, boolean z7, int i8) {
        String str6 = str4;
        Builder lights = new Builder(context, str6).setWhen(notification.when).setShowWhen(z2).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        boolean z8 = true;
        lights = lights.setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent);
        if ((notification.flags & 128) == 0) {
            z8 = false;
        }
        this.f29905B = lights.setFullScreenIntent(pendingIntent2, z8).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z3).setPriority(i4).setProgress(i2, i3, z).setLocalOnly(z4).setExtras(bundle).setGroup(str2).setGroupSummary(z5).setSortKey(str3).setCategory(str).setColor(i5).setVisibility(i6).setPublicVersion(notification2).setRemoteInputHistory(charSequenceArr).setChannelId(str6).setBadgeIconType(i7).setShortcutId(str5).setTimeoutAfter(j).setGroupAlertBehavior(i8);
        if (z7) {
            this.f29905B.setColorized(z6);
        }
        RemoteViews remoteViews5 = remoteViews2;
        if (remoteViews2 != null) {
            this.f29905B.setCustomContentView(remoteViews5);
        }
        remoteViews5 = remoteViews3;
        if (remoteViews3 != null) {
            this.f29905B.setCustomBigContentView(remoteViews5);
        }
        remoteViews5 = remoteViews4;
        if (remoteViews4 != null) {
            this.f29905B.setCustomHeadsUpContentView(remoteViews5);
        }
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.f29905B.addPerson((String) arrayList2.get(i9));
        }
    }

    public final Notification BD() {
        return this.f29905B.build();
    }

    public final Builder PJ() {
        return this.f29905B;
    }

    public final void WB(AnonymousClass0RV anonymousClass0RV) {
        AnonymousClass1li.m12943B(this.f29905B, anonymousClass0RV);
    }
}

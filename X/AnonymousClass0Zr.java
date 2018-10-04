package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.0Zr */
public final class AnonymousClass0Zr extends AnonymousClass0Zm {
    /* renamed from: A */
    public final boolean mo1381A(Context context, String str) {
        return str.equals("com.sonyericsson.home");
    }

    /* renamed from: B */
    public final void mo1382B(int i, Context context) {
        try {
            Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
            intent.setFlags(16);
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", AnonymousClass0Zm.m5382B(context).getClassName());
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", i != 0);
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i));
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", context.getPackageName());
            context.sendBroadcast(intent);
        } catch (Throwable e) {
            AnonymousClass0Gn.m1878E(getClass().getName(), "unexpected exception", e);
        }
    }
}

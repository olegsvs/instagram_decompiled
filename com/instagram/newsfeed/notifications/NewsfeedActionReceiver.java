package com.instagram.newsfeed.notifications;

import X.AnonymousClass0Cd;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Cn;
import X.AnonymousClass0Dc;
import X.AnonymousClass0EE;
import X.AnonymousClass0GA;
import X.AnonymousClass0Gn;
import X.AnonymousClass0IE;
import X.AnonymousClass0Ix;
import X.AnonymousClass0NN;
import X.AnonymousClass0Pt;
import X.AnonymousClass0Pu;
import X.AnonymousClass0Pv;
import X.AnonymousClass0Vs;
import X.AnonymousClass0Vu;
import X.AnonymousClass0cQ;
import X.AnonymousClass0xt;
import X.AnonymousClass1TZ;
import X.AnonymousClass55H;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

public class NewsfeedActionReceiver extends AnonymousClass0Vs {
    /* renamed from: B */
    public final AnonymousClass0EE f6863B = new AnonymousClass55H(this);

    /* renamed from: D */
    public static Intent m5626D(String str, Context context, String str2, String str3, String str4, String str5) {
        Intent intent = new Intent(context, NewsfeedActionReceiver.class);
        intent.setAction(str);
        intent.putExtra("notification_uuid", str2);
        intent.putExtra("media_id", str3);
        intent.putExtra("comment_id", str4);
        intent.putExtra("IgSessionManager.USER_ID", str5);
        return intent;
    }

    /* renamed from: E */
    private static CharSequence m5627E(Intent intent) {
        intent = AnonymousClass0Vu.f5792H.vQ(intent);
        return intent != null ? intent.getCharSequence("NewsfeedNotification.ACTION_REPLY") : null;
    }

    /* renamed from: F */
    private void m5628F(String str, Intent intent) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("instagram_notification_action_");
        stringBuilder.append(str);
        AnonymousClass0NN.m3291B(stringBuilder.toString(), this.f6863B).m3298F("uuid", intent.getStringExtra("notification_uuid")).m3298F("c_pk", intent.getStringExtra("comment_id")).m3298F("m_pk", intent.getStringExtra("media_id")).m3310R();
    }

    public final void onReceive(Context context, Intent intent) {
        int D = AnonymousClass0cQ.m5854D(this, -1269847661);
        if (AnonymousClass0Cd.f1698B.m970N()) {
            AnonymousClass0Cn G = AnonymousClass0Ce.m950G(intent.getExtras());
            intent.getAction();
            AnonymousClass0GA B;
            if ("com.instagram.newsfeed.notifications.ACTION_LIKE".equals(intent.getAction())) {
                B = AnonymousClass0xt.m8590B(G, intent.getStringExtra("comment_id"));
                B.f2849B = new AnonymousClass1TZ(this, intent);
                AnonymousClass0Ix.m2384D(B);
                m5628F("newsfeed_like", intent);
            } else if ("com.instagram.newsfeed.notifications.ACTION_COMMENT".equals(intent.getAction())) {
                CharSequence E = m5627E(intent);
                if (TextUtils.isEmpty(E)) {
                    AnonymousClass0cQ.m5855E(this, context, intent, -1123414077, D);
                    return;
                }
                AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(G);
                anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
                anonymousClass0Pt.f4229M = AnonymousClass0IE.m2137E("media/%s/comment/", intent.getStringExtra("media_id"));
                B = anonymousClass0Pt.m3935D("comment_text", E.toString()).m3935D("idempotence_token", intent.getStringExtra("notification_uuid")).m3935D("containermodule", this.f6863B.getModuleName()).m3935D("replied_to_comment_id", intent.getStringExtra("comment_id")).m3944M(AnonymousClass0Pv.class).m3945N().m3939H();
                B.f2849B = new AnonymousClass1TZ(this, intent);
                AnonymousClass0Ix.m2384D(B);
                m5628F("newsfeed_comment", intent);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown action: ");
                stringBuilder.append(intent.getAction());
                AnonymousClass0Gn.m1876C("NewsfeedActionReceiver", stringBuilder.toString());
            }
            AnonymousClass0cQ.m5855E(this, context, intent, -1016570122, D);
            return;
        }
        AnonymousClass0Dc.m1253P("NewsfeedActionReceiver", "Received notification action but not logged in");
        AnonymousClass0cQ.m5855E(this, context, intent, -1028457827, D);
    }
}

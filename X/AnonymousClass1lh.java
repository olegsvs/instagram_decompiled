package X;

import android.app.Notification.Action;
import android.app.Notification.Builder;
import android.app.RemoteInput;
import android.os.Bundle;

/* renamed from: X.1lh */
public final class AnonymousClass1lh {
    /* renamed from: B */
    public static void m12942B(Builder builder, AnonymousClass0RV anonymousClass0RV) {
        Bundle bundle;
        Action.Builder builder2 = new Action.Builder(anonymousClass0RV.E(), anonymousClass0RV.G(), anonymousClass0RV.A());
        if (anonymousClass0RV.F() != null) {
            for (RemoteInput addRemoteInput : AnonymousClass1lo.m12947B(anonymousClass0RV.F())) {
                builder2.addRemoteInput(addRemoteInput);
            }
        }
        if (anonymousClass0RV.D() != null) {
            bundle = new Bundle(anonymousClass0RV.D());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", anonymousClass0RV.B());
        builder2.addExtras(bundle);
        builder.addAction(builder2.build());
    }
}

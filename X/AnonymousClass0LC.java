package X;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;

/* renamed from: X.0LC */
public final class AnonymousClass0LC extends AnonymousClass0LD {
    /* renamed from: B */
    public String f3199B = null;
    /* renamed from: C */
    public final AnonymousClass0L1 f3200C;

    public AnonymousClass0LC(AnonymousClass0L1 anonymousClass0L1) {
        this.f3200C = anonymousClass0L1;
    }

    /* renamed from: A */
    public final boolean m2910A(Intent intent, Context context) {
        Intent A = this.f3200C.mo702A(intent, context, this.f3199B);
        this.f3199B = null;
        if (A == null) {
            return false;
        }
        context.startActivity(A);
        return true;
    }

    /* renamed from: B */
    public final boolean m2911B(Intent intent, Bundle bundle, Context context) {
        Intent A = this.f3200C.mo702A(intent, context, this.f3199B);
        this.f3199B = null;
        if (A == null) {
            return false;
        }
        if ((VERSION.SDK_INT >= 16 ? 1 : null) == null && bundle != null) {
            this.f3200C.f3164B.GKA("Warning: launching intents with a bundle on API < 16 will crash the app.");
        }
        if (VERSION.SDK_INT >= 16) {
            context.startActivity(A, bundle);
        } else {
            context.startActivity(A);
        }
        return true;
    }

    /* renamed from: C */
    public final boolean m2912C(Intent intent, int i, Activity activity) {
        Intent A = this.f3200C.mo702A(intent, activity, this.f3199B);
        this.f3199B = null;
        if (A == null) {
            return false;
        }
        activity.startActivityForResult(A, i);
        return true;
    }

    /* renamed from: D */
    public final boolean m2913D(Intent intent, int i, Bundle bundle, Activity activity) {
        Intent A = this.f3200C.mo702A(intent, activity, this.f3199B);
        this.f3199B = null;
        if (A == null) {
            return false;
        }
        if ((VERSION.SDK_INT >= 16 ? 1 : null) == null && bundle != null) {
            this.f3200C.f3164B.GKA("Warning: launching intents with a bundle on API < 16 will crash the app.");
        }
        AnonymousClass1lF.J(activity, A, i, bundle);
        return true;
    }

    /* renamed from: E */
    public final boolean m2914E(Intent intent, int i, AnonymousClass0IL anonymousClass0IL) {
        Intent A = this.f3200C.mo702A(intent, anonymousClass0IL.getContext(), this.f3199B);
        this.f3199B = null;
        if (A == null) {
            return false;
        }
        anonymousClass0IL.startActivityForResult(A, i);
        return true;
    }

    /* renamed from: F */
    public final ComponentName m2915F(Intent intent, Context context) {
        Intent B = this.f3200C.mo703B(intent, context, this.f3199B);
        this.f3199B = null;
        if (B == null) {
            return null;
        }
        if ((VERSION.SDK_INT >= 26 ? 1 : null) != null) {
            return AnonymousClass1wl.B(context, intent);
        }
        return context.startService(intent);
    }

    /* renamed from: G */
    public final boolean m2916G(Intent intent, Context context) {
        Intent A = this.f3200C.mo702A(intent, context, this.f3199B);
        this.f3199B = null;
        if (A == null) {
            return false;
        }
        if (A.hasExtra("_ci_")) {
            A.removeExtra("_ci_");
        }
        context.startActivity(A);
        return true;
    }

    /* renamed from: H */
    public final ComponentName m2917H(Intent intent, Context context) {
        Intent B = this.f3200C.mo703B(intent, context, this.f3199B);
        this.f3199B = null;
        if (B == null) {
            return null;
        }
        return context.startService(B);
    }

    /* renamed from: I */
    public final boolean m2918I(Intent intent, Context context) {
        Intent B = this.f3200C.mo703B(intent, context, this.f3199B);
        this.f3199B = null;
        if (B == null) {
            return false;
        }
        return context.stopService(B);
    }
}

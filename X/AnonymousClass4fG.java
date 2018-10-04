package X;

import android.content.Context;
import android.widget.TextView;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;

/* renamed from: X.4fG */
public final class AnonymousClass4fG {
    /* renamed from: B */
    public AnonymousClass5JA f56105B;
    /* renamed from: C */
    public final Context f56106C;
    /* renamed from: D */
    public final AnonymousClass0ct f56107D;
    /* renamed from: E */
    public final int f56108E;
    /* renamed from: F */
    private final AnonymousClass0Cm f56109F;

    public AnonymousClass4fG(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0ct anonymousClass0ct) {
        this.f56106C = context;
        this.f56109F = anonymousClass0Cm;
        this.f56107D = anonymousClass0ct;
        this.f56108E = context.getResources().getDimensionPixelOffset(C0164R.dimen.direct_expiration_timer_drawable_radius);
    }

    /* renamed from: A */
    public final void m24690A(AnonymousClass0W7 anonymousClass0W7, boolean z) {
        Object obj = (AnonymousClass4fH.m24692C(anonymousClass0W7, this.f56109F) && AnonymousClass4fH.m24691B(anonymousClass0W7)) ? 1 : null;
        if (obj != null) {
            this.f56107D.D(8);
            return;
        }
        long Y;
        if (anonymousClass0W7.f5915s == AnonymousClass0V0.STORY_SHARE) {
            Y = ((AnonymousClass0YV) anonymousClass0W7.f5876F).f6270D.Y() - System.currentTimeMillis();
        } else {
            Y = (anonymousClass0W7.J() / 1000) - System.currentTimeMillis();
        }
        double d = (double) (((float) Y) / 3600000.0f);
        int B = (int) AnonymousClass1m8.m12978B(Math.floor(d), StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 23.0d);
        if (this.f56105B == null) {
            this.f56105B = new AnonymousClass5JA(this.f56106C, this.f56108E);
        }
        int max = 360 - (Math.max(B, 1) * 15);
        AnonymousClass5JA anonymousClass5JA = this.f56105B;
        int i = max - 90;
        max = 360 - max;
        anonymousClass5JA.f61993B = i;
        anonymousClass5JA.f61994C = max;
        anonymousClass5JA.invalidateSelf();
        ((TextView) this.f56107D.A()).setCompoundDrawablesRelative(z ? null : this.f56105B, null, z ? this.f56105B : null, null);
        int min;
        if (d >= 1.0d) {
            min = (int) Math.min(Math.round(d), 24);
            ((TextView) this.f56107D.A()).setText(this.f56106C.getResources().getString(C0164R.string.hours_abbreviation_with_placeholder, new Object[]{Integer.valueOf(min)}));
        } else {
            min = (int) (Y / 60000);
            ((TextView) this.f56107D.A()).setText(this.f56106C.getResources().getString(C0164R.string.minutes_abbreviation_with_placeholder, new Object[]{Integer.valueOf(Math.max(min, 1))}));
        }
        this.f56107D.D(0);
    }
}

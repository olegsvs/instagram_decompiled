package X;

import android.content.Context;
import android.widget.LinearLayout.LayoutParams;
import com.facebook.C0164R;

/* renamed from: X.64X */
public final class AnonymousClass64X implements AnonymousClass0QH {
    /* renamed from: B */
    public final /* synthetic */ Context f71494B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass6FR f71495C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass64b f71496D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass0Ci f71497E;
    /* renamed from: F */
    public final /* synthetic */ AnonymousClass0Cm f71498F;

    public final void fm(AnonymousClass0Ci anonymousClass0Ci) {
    }

    public final void gm(AnonymousClass0Ci anonymousClass0Ci) {
    }

    public AnonymousClass64X(AnonymousClass6FR anonymousClass6FR, AnonymousClass64b anonymousClass64b, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Ci anonymousClass0Ci, Context context) {
        this.f71495C = anonymousClass6FR;
        this.f71496D = anonymousClass64b;
        this.f71498F = anonymousClass0Cm;
        this.f71497E = anonymousClass0Ci;
        this.f71494B = context;
    }

    public final void zf(AnonymousClass0Ci anonymousClass0Ci) {
        this.f71496D.f71504B.setFollowButtonSize(AnonymousClass64c.m28875B(this.f71498F, this.f71497E) ? AnonymousClass19U.CONDENSED : AnonymousClass19U.FULL);
        LayoutParams layoutParams = (LayoutParams) this.f71496D.f71504B.getLayoutParams();
        if (AnonymousClass64c.m28875B(this.f71498F, this.f71497E)) {
            layoutParams.width = this.f71494B.getResources().getDimensionPixelSize(C0164R.dimen.follow_button_condensed_width);
            layoutParams.weight = 0.0f;
        } else {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        }
        AnonymousClass64b anonymousClass64b = this.f71496D;
        AnonymousClass0Cm anonymousClass0Cm = this.f71498F;
        AnonymousClass0Ci anonymousClass0Ci2 = this.f71497E;
        AnonymousClass6FR anonymousClass6FR = this.f71495C;
        if (AnonymousClass64c.m28875B(anonymousClass0Cm, anonymousClass0Ci2)) {
            anonymousClass64b.m28874A().setVisibility(0);
            anonymousClass64b.m28874A().setOnClickListener(new AnonymousClass64Z(anonymousClass6FR, anonymousClass0Ci2));
        } else {
            AnonymousClass0Nm.O(anonymousClass64b.f71506D);
        }
        this.f71496D.f71504B.setLayoutParams(layoutParams);
    }
}

package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.1gy */
public final class AnonymousClass1gy {
    /* renamed from: B */
    public final AnonymousClass0gm f21449B;
    /* renamed from: C */
    private final Context f21450C;

    public AnonymousClass1gy(Context context, AnonymousClass0gm anonymousClass0gm) {
        this.f21450C = context;
        this.f21449B = anonymousClass0gm;
    }

    /* renamed from: A */
    public final void m12554A(AnonymousClass1gz anonymousClass1gz, AnonymousClass0P7 anonymousClass0P7, AnonymousClass1bL anonymousClass1bL, AnonymousClass0vs anonymousClass0vs) {
        AnonymousClass0vq C;
        AnonymousClass0P7 S = anonymousClass0P7.kA() ? anonymousClass0P7.m3763S(anonymousClass1bL.f20436B) : anonymousClass0P7;
        OnClickListener anonymousClass1Ub = new AnonymousClass1Ub(this, anonymousClass0P7, anonymousClass1bL, anonymousClass1gz);
        anonymousClass1gz.f21451B.setText(AnonymousClass0Gk.m1855G(this.f21450C, anonymousClass0P7, anonymousClass1bL.f20436B));
        anonymousClass1gz.f21451B.getPaint().setFakeBoldText(true);
        anonymousClass1gz.f21451B.setOnClickListener(anonymousClass1Ub);
        if (S.YA()) {
            anonymousClass1gz.f21452C.setUrl(S.mB.toString());
        } else {
            anonymousClass1gz.f21452C.setUrl(S.m3793w(this.f21450C.getResources().getDimensionPixelSize(C0164R.dimen.profile_cta_icon_size)));
        }
        if (anonymousClass0vs.m8373A()) {
            C = AnonymousClass0vv.m8375C(anonymousClass0P7.m3791u(), this.f21450C);
        } else {
            C = AnonymousClass0vv.m8374B(anonymousClass0P7, anonymousClass1bL.f20436B, this.f21450C);
        }
        if ((C == null || AnonymousClass0Gk.m1860L(C)) && !AnonymousClass0Gk.m1861M(anonymousClass0P7)) {
            anonymousClass1gz.f21453D.setVisibility(8);
            return;
        }
        anonymousClass1gz.f21453D.setVisibility(0);
        anonymousClass1gz.f21453D.setText(S.f4006G);
        anonymousClass1gz.f21453D.setOnClickListener(anonymousClass1Ub);
        if (AnonymousClass0Gk.m1861M(anonymousClass0P7)) {
            anonymousClass1gz.f21451B.setTextColor(AnonymousClass0Ca.m937C(this.f21450C, C0164R.color.grey_9));
        } else {
            anonymousClass1gz.f21451B.setTextColor(AnonymousClass0Ca.m937C(this.f21450C, C0164R.color.blue_5));
        }
    }

    /* renamed from: B */
    public static View m12553B(Context context, ViewGroup viewGroup) {
        viewGroup = LayoutInflater.from(context).inflate(C0164R.layout.layout_cta_banner, viewGroup, false);
        viewGroup.setTag(new AnonymousClass1gz((IgImageView) viewGroup.findViewById(C0164R.id.profile_cta_icon), (TextView) viewGroup.findViewById(C0164R.id.profile_cta_text), (TextView) viewGroup.findViewById(C0164R.id.profile_cta_subtitle)));
        return viewGroup;
    }
}

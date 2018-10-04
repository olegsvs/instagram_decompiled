package X;

import android.text.SpannableString;
import android.view.View;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.4fc */
public class AnonymousClass4fc extends AnonymousClass1TD {
    /* renamed from: B */
    private final AnonymousClass4gT f56162B;
    /* renamed from: C */
    private final AnonymousClass0Cm f56163C;

    public AnonymousClass4fc(View view, AnonymousClass4gT anonymousClass4gT, AnonymousClass5bQ anonymousClass5bQ, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0EE anonymousClass0EE) {
        super(view, anonymousClass4gT, anonymousClass5bQ, anonymousClass0Cm, anonymousClass0EE);
        this.f56163C = anonymousClass0Cm;
        this.f56162B = anonymousClass4gT;
        this.f18888C.setEnableProgressBar(false);
    }

    public final boolean Fj(AnonymousClass5WQ anonymousClass5WQ) {
        AnonymousClass2E4.m14766C(AnonymousClass0V0.LIVE_VIDEO_SHARE, this.f56163C, false);
        return super.Fj(anonymousClass5WQ);
    }

    /* renamed from: e */
    public final void m24709e(AnonymousClass5WQ anonymousClass5WQ) {
        Object obj;
        f(anonymousClass5WQ);
        AnonymousClass0YQ anonymousClass0YQ = (AnonymousClass0YQ) anonymousClass5WQ.f65618B.f5876F;
        AnonymousClass0Pm anonymousClass0Pm = anonymousClass0YQ.f6265B;
        if (anonymousClass0Pm != null) {
            if (!anonymousClass0Pm.L()) {
                obj = null;
                if (obj != null) {
                    if (anonymousClass0Pm.G() == null) {
                        this.f18888C.setUrl(anonymousClass0Pm.G());
                    } else {
                        this.f18888C.D();
                        this.f18888C.setBackgroundColor(AnonymousClass0Ca.C(m24726V(), C0164R.color.white));
                    }
                    this.f18888C.setVisibility(0);
                    this.f18889D.setVisibility(0);
                } else {
                    this.f18888C.setVisibility(8);
                    this.f18889D.setVisibility(8);
                }
                if (anonymousClass0YQ.f6266C.isEmpty()) {
                    this.f18890E.setBackground(AnonymousClass4et.m24677B(this.f56162B, anonymousClass5WQ.f65618B, this.f56163C.B()));
                    this.f18890E.setTextColor(AnonymousClass4et.m24679D(this.f56162B, anonymousClass5WQ.f65618B, this.f56163C.B()));
                    AnonymousClass4fr.m24715C(m24726V(), this.f18890E, anonymousClass0YQ.f6266C, false);
                    this.f18890E.setVisibility(0);
                } else {
                    this.f18890E.setVisibility(8);
                }
                if (anonymousClass0YQ.f6266C.isEmpty() || obj == null) {
                    this.f18896K.setMinHeight(0);
                } else {
                    this.f18896K.setMinHeight(m24726V().getResources().getDimensionPixelOffset(C0164R.dimen.avatar_size_small));
                }
                this.f18896K.setText(m24710i());
                if (a()) {
                    AnonymousClass1dU.E(this.f18893H, anonymousClass5WQ, this.f56163C.B(), false, anonymousClass5WQ.f65619C);
                }
            }
        }
        obj = 1;
        if (obj != null) {
            this.f18888C.setVisibility(8);
            this.f18889D.setVisibility(8);
        } else {
            if (anonymousClass0Pm.G() == null) {
                this.f18888C.D();
                this.f18888C.setBackgroundColor(AnonymousClass0Ca.C(m24726V(), C0164R.color.white));
            } else {
                this.f18888C.setUrl(anonymousClass0Pm.G());
            }
            this.f18888C.setVisibility(0);
            this.f18889D.setVisibility(0);
        }
        if (anonymousClass0YQ.f6266C.isEmpty()) {
            this.f18890E.setVisibility(8);
        } else {
            this.f18890E.setBackground(AnonymousClass4et.m24677B(this.f56162B, anonymousClass5WQ.f65618B, this.f56163C.B()));
            this.f18890E.setTextColor(AnonymousClass4et.m24679D(this.f56162B, anonymousClass5WQ.f65618B, this.f56163C.B()));
            AnonymousClass4fr.m24715C(m24726V(), this.f18890E, anonymousClass0YQ.f6266C, false);
            this.f18890E.setVisibility(0);
        }
        if (anonymousClass0YQ.f6266C.isEmpty()) {
        }
        this.f18896K.setMinHeight(0);
        this.f18896K.setText(m24710i());
        if (a()) {
            AnonymousClass1dU.E(this.f18893H, anonymousClass5WQ, this.f56163C.B(), false, anonymousClass5WQ.f65619C);
        }
    }

    /* renamed from: i */
    public SpannableString m24710i() {
        return new SpannableString(m24726V().getResources().getString(C0164R.string.direct_live_video_reply_recipient_info));
    }

    public final boolean xr(AnonymousClass5WQ anonymousClass5WQ) {
        if (AnonymousClass1aH.C(anonymousClass5WQ, this.f56219B)) {
            return true;
        }
        AnonymousClass0Pm anonymousClass0Pm = ((AnonymousClass0YQ) anonymousClass5WQ.f65618B.f5876F).f6265B;
        if (anonymousClass0Pm == null || anonymousClass0Pm.L()) {
            return false;
        }
        AnonymousClass5bQ anonymousClass5bQ = this.f56219B;
        AnonymousClass0YQ anonymousClass0YQ = (AnonymousClass0YQ) anonymousClass5WQ.f65618B.f5876F;
        AnonymousClass0Pm anonymousClass0Pm2 = anonymousClass0YQ.f6265B;
        List arrayList = new ArrayList();
        arrayList.add(anonymousClass0Pm2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(anonymousClass0Pm2.f4148B);
        stringBuilder.append(AnonymousClass0Qf.DIRECT);
        AnonymousClass0MI I = AnonymousClass0Jd.f2931B.M(anonymousClass5bQ.f66939B.f65382o).I(new AnonymousClass19j(stringBuilder.toString(), anonymousClass0Pm2.f4174b, arrayList));
        anonymousClass5WQ = new HashMap();
        anonymousClass5WQ.put(anonymousClass0YQ.f6265B.f4148B, Integer.valueOf(anonymousClass0YQ.f6267D));
        AnonymousClass5Op.B(anonymousClass5bQ.f66939B.getActivity(), I, Collections.singletonList(I), AnonymousClass0Qf.DIRECT, anonymousClass5bQ.f66939B.f65382o, 0, anonymousClass5WQ);
        return true;
    }
}

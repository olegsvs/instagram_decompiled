package X;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.4g3 */
public class AnonymousClass4g3 extends AnonymousClass1TD {
    /* renamed from: B */
    public final AnonymousClass0ct f56200B;
    /* renamed from: C */
    public final AnonymousClass0ct f56201C;
    /* renamed from: D */
    private String f56202D;
    /* renamed from: E */
    private final AnonymousClass4gT f56203E;
    /* renamed from: F */
    private final AnonymousClass0Cm f56204F;

    public AnonymousClass4g3(View view, AnonymousClass4gT anonymousClass4gT, AnonymousClass5bQ anonymousClass5bQ, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0EE anonymousClass0EE) {
        super(view, anonymousClass4gT, anonymousClass5bQ, anonymousClass0Cm, anonymousClass0EE);
        this.f56204F = anonymousClass0Cm;
        this.f56203E = anonymousClass4gT;
        this.f56201C = new AnonymousClass0ct((ViewStub) view.findViewById(C0164R.id.placeholder_title_stub));
        this.f56200B = new AnonymousClass0ct((ViewStub) view.findViewById(C0164R.id.placeholder_message_stub));
    }

    public final boolean Fj(AnonymousClass5WQ anonymousClass5WQ) {
        AnonymousClass2E4.m14766C(AnonymousClass0V0.STORY_SHARE, this.f56204F, false);
        return super.Fj(anonymousClass5WQ);
    }

    /* renamed from: b */
    public int m24720b() {
        return C0164R.layout.message_content_reel_response;
    }

    /* renamed from: e */
    public void m24721e(AnonymousClass5WQ anonymousClass5WQ) {
        this.f18896K.setVisibility(8);
        this.f18888C.setVisibility(8);
        this.f18889D.setVisibility(8);
        this.f56201C.D(8);
        this.f56200B.D(8);
        this.f18890E.setVisibility(8);
        this.f56202D = null;
        f(anonymousClass5WQ);
        AnonymousClass0YV anonymousClass0YV = (AnonymousClass0YV) anonymousClass5WQ.f65618B.f5876F;
        AnonymousClass0P7 anonymousClass0P7 = anonymousClass0YV.f6270D;
        int i = 0;
        if (anonymousClass0P7 == null) {
            TextView textView = (TextView) this.f56201C.A();
            TextView textView2 = (TextView) this.f56200B.A();
            if (anonymousClass0YV.f6272F != null) {
                textView.setText(new AnonymousClass0ps(new SpannableStringBuilder(anonymousClass0YV.f6272F)).B(this.f56219B).A());
                textView.setVisibility(0);
            }
            if (anonymousClass0YV.f6271E != null) {
                textView2.setText(new AnonymousClass0ps(new SpannableStringBuilder(anonymousClass0YV.f6271E)).B(this.f56219B).A());
                textView2.setVisibility(0);
            }
            String B = AnonymousClass4fr.m24714B(textView.getText().toString());
            this.f56202D = B;
            if (B == null) {
                this.f56202D = AnonymousClass4fr.m24714B(textView2.getText().toString());
            }
        } else {
            this.f18896K.setText(m24722i(anonymousClass0YV));
            this.f18896K.setVisibility(0);
            if (!anonymousClass0P7.oA() || anonymousClass0YV.f6274H == AnonymousClass0Zg.HIGHLIGHT || anonymousClass0YV.f6269C) {
                this.f18888C.setUrl(anonymousClass0P7.x(m24726V()));
                this.f18888C.setVisibility(0);
                this.f18889D.setVisibility(0);
            }
        }
        if (!TextUtils.isEmpty(anonymousClass0YV.f6275I)) {
            this.f18890E.setBackground(AnonymousClass4et.m24677B(this.f56203E, anonymousClass5WQ.f65618B, this.f56204F.B()));
            this.f18890E.setTextColor(AnonymousClass4et.m24679D(this.f56203E, anonymousClass5WQ.f65618B, this.f56204F.B()));
            AnonymousClass4fr.m24715C(m24726V(), this.f18890E, anonymousClass0YV.f6275I, false);
            this.f18890E.setVisibility(0);
        }
        if (a()) {
            AnonymousClass1dU.E(this.f18893H, anonymousClass5WQ, this.f56204F.B(), false, anonymousClass5WQ.f65619C);
        }
        Object obj = (!anonymousClass0YV.f6269C || anonymousClass0YV.f6274H == AnonymousClass0Zg.HIGHLIGHT) ? null : 1;
        AnonymousClass0ct anonymousClass0ct = this.f18892G;
        if (obj == null) {
            i = 8;
        }
        anonymousClass0ct.D(i);
        if (this.f18891F != null) {
            this.f18891F.setOnClickListener(new AnonymousClass4g2(this));
        }
    }

    /* renamed from: i */
    public SpannableString m24722i(AnonymousClass0YV anonymousClass0YV) {
        if (anonymousClass0YV.f6270D != null && !anonymousClass0YV.f6270D.oA()) {
            return new SpannableString(m24726V().getResources().getString(C0164R.string.direct_story_share_recipient_info, new Object[]{AnonymousClass0Gk.E(anonymousClass0YV.f6270D)}));
        } else if (anonymousClass0YV.f6270D == null || anonymousClass0YV.f6274H != AnonymousClass0Zg.HIGHLIGHT) {
            return new SpannableString(m24726V().getResources().getString(C0164R.string.direct_story_share_recipient_info_no_author_name));
        } else {
            return new SpannableString(m24726V().getResources().getString(C0164R.string.direct_story_highlight_share_recipient_info, new Object[]{anonymousClass0YV.f6270D.MA().uT()}));
        }
    }

    public final boolean xr(AnonymousClass5WQ anonymousClass5WQ) {
        if (AnonymousClass1aH.C(anonymousClass5WQ, this.f56219B)) {
            return true;
        }
        if (TextUtils.isEmpty(this.f56202D)) {
            AnonymousClass0YV anonymousClass0YV = (AnonymousClass0YV) anonymousClass5WQ.f65618B.f5876F;
            return h(anonymousClass0YV.f6270D, anonymousClass0YV.f6274H, anonymousClass0YV.f6273G, anonymousClass0YV.f6269C);
        }
        this.f56219B.Lg(this.f56202D, null, null);
        return true;
    }
}

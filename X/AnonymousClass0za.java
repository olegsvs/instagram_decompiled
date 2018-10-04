package X;

import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;

/* renamed from: X.0za */
public final class AnonymousClass0za implements AnonymousClass0vJ, AnonymousClass0je {
    /* renamed from: B */
    public ViewGroup f13068B;
    /* renamed from: C */
    public TextView f13069C;
    /* renamed from: D */
    public ViewStub f13070D;
    /* renamed from: E */
    public AnonymousClass0jw f13071E;
    /* renamed from: F */
    public int f13072F;
    /* renamed from: G */
    public SlideInAndOutIconView f13073G;
    /* renamed from: H */
    public AnonymousClass0m3 f13074H;
    /* renamed from: I */
    private ViewStub f13075I;

    public final void IBA(AnonymousClass0zg anonymousClass0zg) {
    }

    public final void gAA(AnonymousClass0vK anonymousClass0vK) {
    }

    public final void iAA(AnonymousClass0vK anonymousClass0vK) {
    }

    public final void kAA(AnonymousClass0vK anonymousClass0vK, float f) {
    }

    public AnonymousClass0za(ViewStub viewStub, ViewStub viewStub2, boolean z) {
        this.f13075I = viewStub;
        if (!z) {
            this.f13073G = m8697A();
        }
        this.f13070D = viewStub2;
    }

    /* renamed from: A */
    public final SlideInAndOutIconView m8697A() {
        if (this.f13073G == null) {
            this.f13073G = (SlideInAndOutIconView) this.f13075I.inflate().findViewById(C0164R.id.feed_album_count_text_indicator);
        }
        return this.f13073G;
    }

    public final void Tl() {
        m8697A().setAlpha(1.0f);
    }

    public final void Ul() {
        m8697A().setAlpha(0.0f);
    }

    public final void Vl(float f) {
        m8697A().setAlpha(f);
    }

    public final void Wl() {
        m8697A().setAlpha(0.0f);
        this.f13074H.f9685T = false;
    }

    public final void Xl() {
        m8697A().setAlpha(1.0f);
    }

    public final void Yl(float f) {
        m8697A().setAlpha(f);
    }

    public final void cr(AnonymousClass0m3 anonymousClass0m3, int i) {
        if (i == 4) {
            this.f13069C.setText(AnonymousClass0zd.m8700B(anonymousClass0m3.f9672G, this.f13072F));
            this.f13074H.m7469V(this.f13069C.getContext());
        } else if (i == 10 && anonymousClass0m3.f9698g) {
            m8697A().m8309A();
        }
    }
}

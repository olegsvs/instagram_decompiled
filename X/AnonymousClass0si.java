package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.C0164R;
import com.instagram.model.fbfriend.FbFriend;
import java.util.HashSet;

/* renamed from: X.0si */
public final class AnonymousClass0si extends AnonymousClass0nJ {
    /* renamed from: B */
    public final Runnable f11481B;
    /* renamed from: C */
    public final Context f11482C;
    /* renamed from: D */
    public final AnonymousClass0j2 f11483D;
    /* renamed from: E */
    public AnonymousClass0rB f11484E;
    /* renamed from: F */
    public AnonymousClass0Cm f11485F;

    public AnonymousClass0si(Context context, AnonymousClass0j2 anonymousClass0j2, int i, Runnable runnable, AnonymousClass0Cm anonymousClass0Cm) {
        this.f11482C = context;
        this.f11483D = anonymousClass0j2;
        this.f11481B = runnable;
        this.f11485F = anonymousClass0Cm;
    }

    /* renamed from: B */
    public final int mo1813B() {
        return this.f11484E.f11147D.size();
    }

    /* renamed from: B */
    public static void m8120B(AnonymousClass0si anonymousClass0si, int i) {
        anonymousClass0si.f11484E.f11147D.remove(i);
        if (anonymousClass0si.mo1813B() == 0) {
            AnonymousClass0F4.f2058E.m1505B(new AnonymousClass0l0());
        } else {
            anonymousClass0si.m7639G(i);
        }
    }

    /* renamed from: I */
    public final /* bridge */ /* synthetic */ void mo1814I(AnonymousClass0oo anonymousClass0oo, int i) {
        AnonymousClass1X8 anonymousClass1X8 = (AnonymousClass1X8) anonymousClass0oo;
        FbFriend fbFriend = (FbFriend) this.f11484E.f11147D.get(i);
        anonymousClass1X8.f19683B.setUrl(fbFriend.f9871E);
        anonymousClass1X8.f19686E.setText(fbFriend.f9869C);
        anonymousClass1X8.f19686E.getPaint().setFakeBoldText(true);
        anonymousClass1X8.f19685D.setVisibility(0);
        anonymousClass1X8.f19685D.A(fbFriend, new AnonymousClass5lQ(this, anonymousClass1X8, fbFriend));
        if (((Boolean) AnonymousClass0CC.Ge.m846H(this.f11485F)).booleanValue()) {
            anonymousClass1X8.f19684C.setOnClickListener(new AnonymousClass5lR(this, anonymousClass1X8, fbFriend));
        } else {
            anonymousClass1X8.f19684C.setVisibility(8);
        }
    }

    /* renamed from: J */
    public final /* bridge */ /* synthetic */ AnonymousClass0oo mo1815J(ViewGroup viewGroup, int i) {
        return new AnonymousClass1X8(LayoutInflater.from(this.f11482C).inflate(C0164R.layout.suggested_invite_card, viewGroup, false));
    }

    /* renamed from: K */
    public final /* bridge */ /* synthetic */ void mo1816K(AnonymousClass0oo anonymousClass0oo) {
        AnonymousClass1X8 anonymousClass1X8 = (AnonymousClass1X8) anonymousClass0oo;
        super.mo1816K(anonymousClass1X8);
        int E = anonymousClass1X8.m7713E();
        AnonymousClass0j2 anonymousClass0j2 = this.f11483D;
        FbFriend fbFriend = (FbFriend) this.f11484E.f11147D.get(E);
        if (anonymousClass0j2.f9018D == null) {
            anonymousClass0j2.f9018D = new HashSet();
        }
        if (anonymousClass0j2.f9018D.add(fbFriend.getId())) {
            AnonymousClass0j2.m7061B(anonymousClass0j2, AnonymousClass0mb.IMPRESSION, E, fbFriend);
        }
    }
}

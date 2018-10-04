package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.C0164R;

/* renamed from: X.4gM */
public final class AnonymousClass4gM extends AnonymousClass0nJ {
    /* renamed from: B */
    public AnonymousClass5WM f56237B;
    /* renamed from: C */
    public AnonymousClass5WN f56238C;
    /* renamed from: D */
    public final AnonymousClass26Y f56239D = new AnonymousClass26Y(AnonymousClass4gP.class, new AnonymousClass4gJ(this));

    public AnonymousClass4gM(Context context) {
    }

    /* renamed from: B */
    public final int m24750B() {
        return this.f56239D.f26034D;
    }

    /* renamed from: B */
    public static int m24746B(AnonymousClass4gM anonymousClass4gM, String str) {
        int i = anonymousClass4gM.f56239D.f26034D;
        for (int i2 = 0; i2 < i; i2++) {
            AnonymousClass4gP anonymousClass4gP = (AnonymousClass4gP) anonymousClass4gM.f56239D.m14452D(i2);
            if (anonymousClass4gP.bT() == 0 && ((AnonymousClass5WL) anonymousClass4gP).f65611C.getId().equals(str)) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: C */
    public static void m24747C(AnonymousClass4gM anonymousClass4gM) {
        if (anonymousClass4gM.B() != 0) {
            anonymousClass4gM.f56237B = new AnonymousClass5WM(((AnonymousClass5WL) anonymousClass4gM.f56239D.m14452D(0)).f65610B);
            anonymousClass4gM.f56239D.m14449A(anonymousClass4gM.f56237B);
        }
    }

    /* renamed from: D */
    public static void m24748D(AnonymousClass4gM anonymousClass4gM) {
        if (anonymousClass4gM.f56238C != null) {
            int B = anonymousClass4gM.B();
            if (B == 0) {
                anonymousClass4gM.f56239D.m14449A(anonymousClass4gM.f56238C);
            } else if (B == 1 && ((AnonymousClass4gP) anonymousClass4gM.f56239D.m14452D(0)).bT() == 2) {
                anonymousClass4gM.f56239D.m14454F(0, anonymousClass4gM.f56238C);
            } else {
                AnonymousClass4gM.m24749E(anonymousClass4gM);
            }
        }
    }

    /* renamed from: E */
    public static void m24749E(AnonymousClass4gM anonymousClass4gM) {
        AnonymousClass5WN anonymousClass5WN = anonymousClass4gM.f56238C;
        if (anonymousClass5WN != null) {
            anonymousClass4gM.f56239D.m14453E(anonymousClass5WN);
        }
    }

    /* renamed from: I */
    public final void m24751I(AnonymousClass0oo anonymousClass0oo, int i) {
        AnonymousClass4gP anonymousClass4gP = (AnonymousClass4gP) this.f56239D.m14452D(i);
        AnonymousClass4gK anonymousClass4gK;
        switch (anonymousClass4gP.bT()) {
            case 0:
                AnonymousClass4gL anonymousClass4gL = (AnonymousClass4gL) anonymousClass0oo;
                AnonymousClass5WL anonymousClass5WL = (AnonymousClass5WL) anonymousClass4gP;
                anonymousClass4gL.f56236B.setUrl(anonymousClass5WL.f65611C.DQ());
                if (anonymousClass5WL.f65610B == 3) {
                    anonymousClass4gL.f56236B.setBackground(null);
                    return;
                }
                Drawable background = anonymousClass4gL.f56236B.getBackground();
                if (background == null) {
                    background = new AnonymousClass4lH(anonymousClass4gL.f56236B.getContext());
                    anonymousClass4gL.f56236B.setBackground(background);
                }
                background.setVisible(true, false);
                return;
            case 1:
                anonymousClass4gK = (AnonymousClass4gK) anonymousClass0oo;
                anonymousClass4gK.f56235B.setText(anonymousClass4gK.f10370B.getContext().getString(AnonymousClass4gF.m24736B(((AnonymousClass5WM) anonymousClass4gP).f65612B)));
                return;
            case 2:
                anonymousClass4gK = (AnonymousClass4gK) anonymousClass0oo;
                AnonymousClass5WN anonymousClass5WN = (AnonymousClass5WN) anonymousClass4gP;
                anonymousClass4gK.f56235B.setText(AnonymousClass4gO.m24754C(anonymousClass4gK.f10370B.getContext(), anonymousClass5WN.f65614C, anonymousClass5WN.f65613B));
                return;
            default:
                return;
        }
    }

    /* renamed from: J */
    public final AnonymousClass0oo m24752J(ViewGroup viewGroup, int i) {
        switch (i) {
            case 0:
                return new AnonymousClass4gL(LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.thread_message_activity_indicator_avatar, viewGroup, false));
            case 1:
            case 2:
                return new AnonymousClass4gK(LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.thread_message_activity_indicator_footer_label, viewGroup, false));
            default:
                throw new IllegalArgumentException("invalid view type");
        }
    }

    public final int getItemViewType(int i) {
        return ((AnonymousClass4gP) this.f56239D.m14452D(i)).bT();
    }
}

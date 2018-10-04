package X;

import android.view.View;

/* renamed from: X.5OU */
public final class AnonymousClass5OU {
    /* renamed from: B */
    public AnonymousClass36h f62952B;
    /* renamed from: C */
    public final AnonymousClass5OS f62953C;
    /* renamed from: D */
    public AnonymousClass5aq f62954D;
    /* renamed from: E */
    public final AnonymousClass0Uw f62955E;

    public AnonymousClass5OU(View view, AnonymousClass38H anonymousClass38H, AnonymousClass3FY anonymousClass3FY, String str, boolean z, AnonymousClass5aq anonymousClass5aq, AnonymousClass0eK anonymousClass0eK, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0IJ anonymousClass0IJ) {
        this.f62954D = anonymousClass5aq;
        AnonymousClass0Uw anonymousClass0Uw = new AnonymousClass0Uw("IgLiveFaceFilterController", AnonymousClass3AM.HIDDEN);
        this.f62955E = anonymousClass0Uw;
        anonymousClass0Uw.B(AnonymousClass3AM.HIDDEN, AnonymousClass3Dz.class, AnonymousClass3AM.CAPTURE);
        Class cls = AnonymousClass3Dt.class;
        this.f62955E.B(AnonymousClass3AM.CAPTURE, cls, AnonymousClass3AM.SELECT_FACE_EFFECT);
        this.f62955E.B(AnonymousClass3AM.SELECT_FACE_EFFECT, cls, AnonymousClass3AM.CAPTURE);
        AnonymousClass0eH anonymousClass5OS = new AnonymousClass5OS(this.f62955E, view, anonymousClass38H, new AnonymousClass5OT(this), z, anonymousClass0eK, anonymousClass0Cm, anonymousClass0IJ);
        this.f62953C = anonymousClass5OS;
        anonymousClass5OS.H(anonymousClass3FY);
        this.f62955E.C(new AnonymousClass3Dz());
        AnonymousClass0eH anonymousClass0eH = this.f62953C;
        AnonymousClass0eH.E(anonymousClass0eH);
        AnonymousClass0eH.D(anonymousClass0eH, false);
        if (str != null) {
            AnonymousClass0eH.H(anonymousClass0eH, str);
        }
    }
}

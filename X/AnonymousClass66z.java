package X;

import com.instagram.video.common.events.IgVideoRealtimeEventPayload$Type;
import java.util.Collections;
import java.util.List;

/* renamed from: X.66z */
public final class AnonymousClass66z extends AnonymousClass5Y5 {
    /* renamed from: B */
    public final List f71893B = Collections.singletonList(IgVideoRealtimeEventPayload$Type.SERVER_MEDIA_UPDATE);
    /* renamed from: C */
    public AnonymousClass1jB f71894C;

    public AnonymousClass66z(String str, AnonymousClass4u3 anonymousClass4u3, AnonymousClass66w anonymousClass66w, AnonymousClass5jI anonymousClass5jI, AnonymousClass4u1 anonymousClass4u1) {
        super(str, anonymousClass4u3, anonymousClass66w, anonymousClass5jI, anonymousClass4u1);
    }

    /* renamed from: B */
    public final void mo6245B() {
        AnonymousClass0F4.f2058E.D(AnonymousClass1HU.class, this.f71894C);
        super.mo6245B();
    }

    /* renamed from: H */
    public final void mo6246H(String str, AnonymousClass4u2 anonymousClass4u2, int i) {
        AnonymousClass0F4.f2058E.B(new AnonymousClass1jA(str, AnonymousClass5Y5.m27418C(anonymousClass4u2.f58322D), i, AnonymousClass1hy.ADDED));
    }

    /* renamed from: I */
    public final void mo6247I(String str, String str2, int i) {
        AnonymousClass0F4.f2058E.B(new AnonymousClass1jA(str, AnonymousClass5Y5.m27418C(str2), i, AnonymousClass1hy.FRAME_AVAILABLE));
    }

    /* renamed from: J */
    public final void mo6248J(String str, AnonymousClass4u2 anonymousClass4u2, int i) {
        AnonymousClass0F4.f2058E.B(new AnonymousClass1jA(str, AnonymousClass5Y5.m27418C(anonymousClass4u2.f58322D), i, AnonymousClass1hy.REMOVED));
    }

    /* renamed from: K */
    public final void mo6249K(String str, String str2, long j) {
        AnonymousClass0F4.f2058E.B(new AnonymousClass5N0(str, AnonymousClass5Y5.m27418C(str2), j, AnonymousClass5Mz.ACTIVE));
    }

    /* renamed from: L */
    public final void mo6250L(String str, String str2, long j) {
        AnonymousClass0F4.f2058E.B(new AnonymousClass5N0(str, AnonymousClass5Y5.m27418C(str2), j, AnonymousClass5Mz.STALLED));
    }

    /* renamed from: O */
    public final void mo6251O() {
        super.mo6251O();
        AnonymousClass0F4 anonymousClass0F4 = AnonymousClass0F4.f2058E;
        Class cls = AnonymousClass1HU.class;
        if (this.f71894C == null) {
            AnonymousClass0LH.E(this.f66015M);
            this.f71894C = new AnonymousClass66x(this, this.f66015M);
        }
        anonymousClass0F4.A(cls, this.f71894C);
    }
}

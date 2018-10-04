package X;

import com.instagram.video.common.events.IgVideoRealtimeEventPayload$Type;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6AS */
public final class AnonymousClass6AS extends AnonymousClass5Y5 {
    /* renamed from: B */
    public final List f72521B = Collections.singletonList(IgVideoRealtimeEventPayload$Type.SERVER_MEDIA_UPDATE);
    /* renamed from: C */
    public final AnonymousClass6Gc f72522C;
    /* renamed from: D */
    public AnonymousClass1hQ f72523D;
    /* renamed from: E */
    public AnonymousClass1hQ f72524E;

    public AnonymousClass6AS(String str, AnonymousClass6Gc anonymousClass6Gc, AnonymousClass5cI anonymousClass5cI, AnonymousClass5jI anonymousClass5jI, AnonymousClass4u1 anonymousClass4u1) {
        super(str, anonymousClass6Gc, anonymousClass5cI, anonymousClass5jI, anonymousClass4u1);
        this.f72522C = anonymousClass6Gc;
    }

    /* renamed from: B */
    public final void mo6245B() {
        m29266F();
        super.mo6245B();
    }

    /* renamed from: F */
    private void m29266F() {
        AnonymousClass0F4 anonymousClass0F4 = AnonymousClass0F4.f2058E;
        AnonymousClass0F8 anonymousClass0F8 = this.f72524E;
        if (anonymousClass0F8 != null) {
            anonymousClass0F4.D(AnonymousClass1Hf.class, anonymousClass0F8);
        }
        anonymousClass0F8 = this.f72523D;
        if (anonymousClass0F8 != null) {
            anonymousClass0F4.D(AnonymousClass1He.class, anonymousClass0F8);
        }
    }

    /* renamed from: N */
    public final void mo6304N(String str) {
        super.mo6304N(str);
        if (str != null) {
            AnonymousClass0F4 anonymousClass0F4 = AnonymousClass0F4.f2058E;
            Class cls = AnonymousClass1Hf.class;
            if (this.f72524E == null) {
                this.f72524E = new AnonymousClass6AO(this, this.f66015M);
            }
            anonymousClass0F4.A(cls, this.f72524E);
            cls = AnonymousClass1He.class;
            if (this.f72523D == null) {
                this.f72523D = new AnonymousClass6AQ(this, this.f66015M);
            }
            anonymousClass0F4.A(cls, this.f72523D);
            return;
        }
        m29266F();
    }
}

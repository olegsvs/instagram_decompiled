package X;

import java.util.Map;

/* renamed from: X.4Xc */
public final class AnonymousClass4Xc implements AnonymousClass0TV {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4Xd f54993B;

    public AnonymousClass4Xc(AnonymousClass4Xd anonymousClass4Xd) {
        this.f54993B = anonymousClass4Xd;
    }

    public final void Zt(Map map) {
        if (((AnonymousClass1Bb) map.get("android.permission.WRITE_EXTERNAL_STORAGE")) != AnonymousClass1Bb.GRANTED) {
            this.f54993B.f54994B.f65012J.m14818D(map);
        }
    }
}

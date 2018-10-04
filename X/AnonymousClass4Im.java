package X;

import java.util.Map;

/* renamed from: X.4Im */
public final class AnonymousClass4Im implements AnonymousClass0TV {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4In f52530B;

    public AnonymousClass4Im(AnonymousClass4In anonymousClass4In) {
        this.f52530B = anonymousClass4In;
    }

    public final void Zt(Map map) {
        if (((AnonymousClass1Bb) map.get("android.permission.WRITE_EXTERNAL_STORAGE")) != AnonymousClass1Bb.GRANTED) {
            this.f52530B.f52531B.f52540F.m14818D(map);
        }
    }
}

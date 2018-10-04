package X;

import android.view.View;
import android.widget.BaseAdapter;
import com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi;

/* renamed from: X.1a1 */
public final class AnonymousClass1a1 implements AnonymousClass0QQ {
    /* renamed from: B */
    private final BaseAdapter f20296B;

    public final void At(int i) {
    }

    public final void Bt(int i) {
    }

    public final void Kt(int i, int i2) {
    }

    public final void RGA(View view) {
    }

    public final void ly(float f, float f2, AnonymousClass1Iw anonymousClass1Iw) {
    }

    public final void uy(AnonymousClass1Iw anonymousClass1Iw, AnonymousClass1Iw anonymousClass1Iw2) {
    }

    public final void ys(int i, int i2) {
    }

    public AnonymousClass1a1(BaseAdapter baseAdapter) {
        this.f20296B = baseAdapter;
    }

    public final void eCA(int i, int i2) {
        if (i2 > i && i >= 0 && i < this.f20296B.getCount() - 1) {
            AnonymousClass14t anonymousClass14t = (AnonymousClass14t) this.f20296B.getItem(i);
            if (!anonymousClass14t.m9251N()) {
                if (!anonymousClass14t.f14102G) {
                    i = anonymousClass14t.f14107L;
                    while (true) {
                        i++;
                        if (i < anonymousClass14t.m9253P()) {
                            AnonymousClass0Pj F = anonymousClass14t.m9243F(i);
                            if (F.m3888l() && F.m3893q()) {
                                String id = F.getId();
                                AnonymousClass17a anonymousClass17a = AnonymousClass17X.f14756W.f14766K;
                                HeroPlayerServiceApi A = anonymousClass17a.f14804B.m9487A();
                                if (A != null) {
                                    try {
                                        if (anonymousClass17a.f14807E) {
                                            anonymousClass17a.f14805C.m9488A(id);
                                        }
                                        A.EE(id);
                                    } catch (Throwable e) {
                                        AnonymousClass1Gl.m10574D("PrefetchClient", e, "RemoteException when cancelPrefetchForVideo", new Object[0]);
                                    }
                                }
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }
}

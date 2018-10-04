package X;

import android.content.Context;
import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.3xO */
public final class AnonymousClass3xO extends AnonymousClass370 {
    /* renamed from: B */
    public final Set f47393B = new HashSet();
    /* renamed from: C */
    private final AnonymousClass376 f47394C = new AnonymousClass3xM(this);
    /* renamed from: D */
    private AnonymousClass3C4 f47395D;

    /* renamed from: A */
    public final String mo4716A() {
        return "fe";
    }

    /* renamed from: D */
    public final String mo4717D() {
        return "FaceEffectAssetManager";
    }

    public AnonymousClass3xO(Context context, AnonymousClass36n anonymousClass36n) {
        super(context, anonymousClass36n, new AnonymousClass3xP(anonymousClass36n, context));
    }

    /* renamed from: B */
    public static void m21698B(List list, File file, AnonymousClass36h anonymousClass36h, boolean z) {
        if (anonymousClass36h != null) {
            list.add(new File(file, anonymousClass36h.f37881K));
            list.add(AnonymousClass37G.m18612E(file, anonymousClass36h, false));
            if (z) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(anonymousClass36h.f37881K);
                stringBuilder.append(".temp");
                list.add(new File(file, stringBuilder.toString()));
            }
        }
    }

    /* renamed from: C */
    private static boolean m21699C(AnonymousClass3xO anonymousClass3xO, AnonymousClass36h anonymousClass36h, boolean z) {
        if (anonymousClass36h != null) {
            if (anonymousClass3xO.f47393B.contains(anonymousClass36h)) {
                if (z) {
                    if (((Boolean) AnonymousClass0CC.iY.G()).booleanValue()) {
                    }
                }
            }
            File E = AnonymousClass37G.m18612E(anonymousClass3xO.f37967C, anonymousClass36h, false);
            if (E.exists()) {
                anonymousClass36h.f37896Z = E.getAbsolutePath();
                return false;
            } else if (!new File(anonymousClass3xO.f37967C, anonymousClass36h.f37881K).exists()) {
                return true;
            } else {
                anonymousClass3xO.f47393B.add(anonymousClass36h);
                new AnonymousClass374(anonymousClass3xO).B(new AnonymousClass36h[]{anonymousClass36h});
                return false;
            }
        }
        return false;
    }

    /* renamed from: J */
    public final void m21702J(AnonymousClass36h anonymousClass36h, List list) {
        AnonymousClass370 anonymousClass370 = this;
        if (AnonymousClass3xO.m21699C(this, anonymousClass36h, true)) {
            if (m18575F(list, 0, new AnonymousClass3xN(this, anonymousClass36h), anonymousClass36h.f37882L, anonymousClass36h.f37872B, anonymousClass36h.f37881K, anonymousClass36h.f37894X, this.f37967C)) {
                anonymousClass370.f47393B.add(anonymousClass36h);
            }
        }
    }

    /* renamed from: K */
    public final boolean m21703K(AnonymousClass36h anonymousClass36h) {
        AnonymousClass370 anonymousClass370 = this;
        if (!AnonymousClass3xO.m21699C(this, anonymousClass36h, false)) {
            return false;
        }
        this.f47393B.add(anonymousClass36h);
        if (this.f47395D == null) {
            this.f47395D = new AnonymousClass3C4();
        }
        File file = new File(this.f37967C, anonymousClass36h.f37881K);
        AnonymousClass3C5 G = m18576G(anonymousClass36h.f37882L, anonymousClass36h.f37894X, anonymousClass36h.f37872B, anonymousClass36h.f37881K, 0);
        G.m18952C(file);
        G.f38915B = new AnonymousClass3xN(anonymousClass370, anonymousClass36h);
        AnonymousClass3C4 anonymousClass3C4 = anonymousClass370.f47395D;
        synchronized (anonymousClass3C4) {
            if (G != null) {
                if (anonymousClass3C4.f38914B == null) {
                    anonymousClass3C4.f38914B = new AnonymousClass3C6();
                    anonymousClass3C4.f38914B.m18957B();
                }
                anonymousClass3C4.f38914B.m18956A(G);
            } else {
                throw new IllegalArgumentException("DownloadRequest cannot be null");
            }
        }
        return true;
    }
}

package X;

import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashSet;

/* renamed from: X.0uv */
public final class AnonymousClass0uv {
    /* renamed from: B */
    public static final HashSet f11943B = new HashSet();

    /* renamed from: B */
    public static void m8293B(View view, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0i5 anonymousClass0i5, AnonymousClass0tZ anonymousClass0tZ, String str, int i) {
        AnonymousClass0Sy.m4434C();
        AnonymousClass0i5 anonymousClass0i52 = anonymousClass0i5;
        String str2 = str;
        int i2 = i;
        if (((Boolean) AnonymousClass0CC.Am.m846H(anonymousClass0Cm)).booleanValue()) {
            if (((Boolean) AnonymousClass0CC.Bm.m846H(anonymousClass0Cm)).booleanValue()) {
                AnonymousClass0a1.m5415I(anonymousClass0i52, null, -1, -1, str2, AnonymousClass0cW.m5889L(anonymousClass0Cm), i2);
            } else {
                AnonymousClass0uv.m8295D(view, anonymousClass0Cm, anonymousClass0i5, str, i);
            }
        } else if (anonymousClass0tZ == null) {
            AnonymousClass0a1.m5414H(anonymousClass0i52, null, -1, -1, str2, AnonymousClass0cW.m5889L(anonymousClass0Cm), i2);
        } else {
            AnonymousClass0uv.m8294C(anonymousClass0Cm, anonymousClass0i5, anonymousClass0tZ, str, i);
        }
    }

    /* renamed from: C */
    public static void m8294C(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0i5 anonymousClass0i5, AnonymousClass0tZ anonymousClass0tZ, String str, int i) {
        AnonymousClass0tZ anonymousClass0tZ2 = anonymousClass0tZ;
        AnonymousClass1c1 C = AnonymousClass1c1.m12065C(anonymousClass0tZ);
        AnonymousClass0i5 anonymousClass0i52 = anonymousClass0i5;
        if (C == null || !anonymousClass0i5.f8557G.equals(C.f20558C)) {
            AnonymousClass0i5 anonymousClass0i53 = anonymousClass0Cm;
            String str2 = str;
            AnonymousClass1c1 B = AnonymousClass1c1.m12064B(anonymousClass0tZ, new AnonymousClass3po(anonymousClass0i52, anonymousClass0tZ2, str2, anonymousClass0i53, i), AnonymousClass15o.FILL, anonymousClass0i53, anonymousClass0i52, str);
            ((ViewGroup) anonymousClass0tZ2).removeAllViews();
            anonymousClass0tZ2.addView(B.mo2627C(), 0);
            B.f20558C = anonymousClass0i52.f8557G;
            if (B.mo2628D()) {
                Surface B2 = B.mo2626B();
                Integer.valueOf(anonymousClass0tZ2.hashCode());
                AnonymousClass0a1.m5414H(anonymousClass0i52, B2, B.mo2627C().getWidth(), B.mo2627C().getHeight(), str2, AnonymousClass0cW.m5889L(anonymousClass0i53), i);
            }
        }
    }

    /* renamed from: D */
    private static void m8295D(View view, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0i5 anonymousClass0i5, String str, int i) {
        AnonymousClass0i5 anonymousClass0i52 = anonymousClass0i5;
        if (!f11943B.contains(anonymousClass0i5.f8557G)) {
            Object obj;
            ViewGroup viewGroup;
            View textureView;
            AnonymousClass17X anonymousClass17X = AnonymousClass17X.f14756W;
            String str2 = anonymousClass0i5.f8557G;
            if (anonymousClass17X.f14771P != null) {
                if ((anonymousClass17X.f14771P.f24656C.get(str2) != null ? 1 : null) != null) {
                    obj = 1;
                    if (obj != null) {
                        f11943B.add(anonymousClass0i5.f8557G);
                        viewGroup = (ViewGroup) view.getRootView();
                        textureView = new TextureView(view.getContext());
                        textureView.setSurfaceTextureListener(new AnonymousClass3pn(textureView, viewGroup, anonymousClass0i52, str, anonymousClass0Cm, i));
                        viewGroup.addView(textureView, 0, 0);
                    }
                }
            }
            obj = null;
            if (obj != null) {
                f11943B.add(anonymousClass0i5.f8557G);
                viewGroup = (ViewGroup) view.getRootView();
                textureView = new TextureView(view.getContext());
                textureView.setSurfaceTextureListener(new AnonymousClass3pn(textureView, viewGroup, anonymousClass0i52, str, anonymousClass0Cm, i));
                viewGroup.addView(textureView, 0, 0);
            }
        }
    }
}

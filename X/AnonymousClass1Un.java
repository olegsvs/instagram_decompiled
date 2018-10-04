package X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Un */
public final class AnonymousClass1Un implements AnonymousClass0G2 {
    /* renamed from: B */
    public static final Map f19165B = new HashMap();

    /* renamed from: B */
    public static void m11612B(Context context, AnonymousClass0Fz anonymousClass0Fz, AnonymousClass0Cm anonymousClass0Cm, String str, String str2, AnonymousClass4w9 anonymousClass4w9) {
        String str3 = (String) f19165B.get(str);
        if (TextUtils.isEmpty(str3) || anonymousClass4w9 == null) {
            AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt((AnonymousClass0Cn) anonymousClass0Cm);
            anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
            anonymousClass0Pt.f4229M = "linkshim/fetch_lynx_url/";
            AnonymousClass0GA H = anonymousClass0Pt.m3935D(IgReactNavigatorModule.URL, str).m3935D("callsite", str2).m3944M(AnonymousClass2Zl.class).m3939H();
            H.f2849B = new AnonymousClass2Cx(str, anonymousClass4w9);
            AnonymousClass0Px.m3949B(context, anonymousClass0Fz, H);
            return;
        }
        anonymousClass4w9.A(str3);
    }
}

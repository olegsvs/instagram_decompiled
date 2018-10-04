package X;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.39K */
public final class AnonymousClass39K {
    /* renamed from: B */
    public static String m18759B(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new JSONObject(str).getString("pid");
    }

    /* renamed from: C */
    public static int m18760C(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (!str.startsWith("#")) {
            StringBuilder stringBuilder = new StringBuilder("#");
            stringBuilder.append(str);
            str = stringBuilder.toString();
        }
        return Color.parseColor(str);
    }

    /* renamed from: D */
    public static AnonymousClass0X2 m18761D(AnonymousClass2XG anonymousClass2XG) {
        if (anonymousClass2XG == null) {
            return null;
        }
        List arrayList = new ArrayList();
        AnonymousClass0Ls anonymousClass0Ls = new AnonymousClass0Ls();
        anonymousClass0Ls.f3295F = ((AnonymousClass2XF) anonymousClass2XG.f31166B.get(0)).f31164C;
        anonymousClass0Ls.f3292C = ((AnonymousClass2XF) anonymousClass2XG.f31166B.get(0)).f31163B;
        anonymousClass0Ls.f3296G = ((AnonymousClass2XF) anonymousClass2XG.f31166B.get(0)).f31165D;
        arrayList.add(anonymousClass0Ls);
        AnonymousClass0X2 anonymousClass0X2 = new AnonymousClass0X2();
        anonymousClass0X2.f6093B = arrayList;
        return anonymousClass0X2;
    }

    /* renamed from: E */
    public static List m18762E(List list) {
        List arrayList = new ArrayList();
        if (!(list == null || list.isEmpty())) {
            for (AnonymousClass2X8 anonymousClass2X8 : list) {
                arrayList.add(new AnonymousClass0vq(anonymousClass2X8.f31141C, anonymousClass2X8.f31140B, anonymousClass2X8.f31143E, anonymousClass2X8.f31142D));
            }
        }
        return arrayList;
    }

    /* renamed from: F */
    public static boolean m18763F(AnonymousClass2XD anonymousClass2XD, AnonymousClass2Br anonymousClass2Br) {
        boolean z = false;
        if (!AnonymousClass26g.m14458B(anonymousClass2XD.f31155B.f31153C.f31151B)) {
            for (AnonymousClass2XA anonymousClass2XA : anonymousClass2XD.f31155B.f31153C.f31151B) {
                if (anonymousClass2XA.f31150B.f32037F == anonymousClass2Br) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: G */
    public static boolean m18764G(AnonymousClass2XD anonymousClass2XD) {
        if (!AnonymousClass26g.m14458B(anonymousClass2XD.f31155B.f31154D)) {
            for (AnonymousClass2Bs equals : anonymousClass2XD.f31155B.f31154D) {
                if (AnonymousClass2Bs.ENABLE_SWIPE_TO_OPEN.equals(equals)) {
                    return true;
                }
            }
        }
        return false;
    }
}

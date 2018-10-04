package X;

import android.content.Context;
import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.38j */
public final class AnonymousClass38j {
    /* renamed from: B */
    public final Context f38260B;
    /* renamed from: C */
    public final AnonymousClass0EE f38261C;
    /* renamed from: D */
    public final Map f38262D = new HashMap();
    /* renamed from: E */
    public final AnonymousClass0Cm f38263E;
    /* renamed from: F */
    private final AnonymousClass38i f38264F;

    public AnonymousClass38j(Context context, AnonymousClass0EE anonymousClass0EE, AnonymousClass0Cm anonymousClass0Cm) {
        this.f38260B = context;
        this.f38261C = anonymousClass0EE;
        this.f38264F = new AnonymousClass38i(this);
        this.f38263E = anonymousClass0Cm;
    }

    /* renamed from: B */
    public static String m18735B(String str) {
        int lastIndexOf = str.lastIndexOf(".jpg");
        if (lastIndexOf == -1) {
            lastIndexOf = str.lastIndexOf(".png");
        }
        if (lastIndexOf == -1) {
            lastIndexOf = 30;
        }
        return str.substring(Math.max(0, lastIndexOf - 30), lastIndexOf);
    }

    /* renamed from: C */
    public static void m18736C(AnonymousClass38j anonymousClass38j, String str) {
        if (!anonymousClass38j.f38262D.containsKey(str)) {
            AnonymousClass0RJ D = AnonymousClass0Gs.f2431j.D(str);
            D.f4635F = true;
            D.f4645P = anonymousClass38j.f38261C.getModuleName();
            AnonymousClass0aa A = D.C(anonymousClass38j.f38264F).A();
            anonymousClass38j.f38262D.put(str, A);
            DLogTag dLogTag = DLogTag.CANVAS;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Enqueue ");
            stringBuilder.append(AnonymousClass38j.m18735B(str));
            DLog.d(dLogTag, stringBuilder.toString(), new Object[0]);
            A.G();
        }
    }
}

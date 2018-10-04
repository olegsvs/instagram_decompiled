package X;

import com.instagram.realtimeclient.RealtimeProtocol;
import org.json.JSONObject;

/* renamed from: X.0Uh */
public final class AnonymousClass0Uh implements AnonymousClass0Ui, AnonymousClass0MP, AnonymousClass0G2 {
    /* renamed from: B */
    public final AnonymousClass0Cm f5536B;
    /* renamed from: C */
    private final boolean f5537C;
    /* renamed from: D */
    private final AnonymousClass0W1 f5538D = new AnonymousClass0W1(10);

    public final String sL() {
        return "direct_badge_count";
    }

    public final String tL() {
        return ".json";
    }

    private AnonymousClass0Uh(AnonymousClass0Cm anonymousClass0Cm) {
        this.f5536B = anonymousClass0Cm;
        AnonymousClass0Ul.m4764B(anonymousClass0Cm.f1759C).f5554B.add(this);
        this.f5537C = ((Boolean) AnonymousClass0CC.mG.m846H(this.f5536B)).booleanValue();
    }

    /* renamed from: B */
    public static AnonymousClass0Uh m4756B(AnonymousClass0Cm anonymousClass0Cm) {
        Class cls = AnonymousClass0Uh.class;
        AnonymousClass0Uh anonymousClass0Uh = (AnonymousClass0Uh) anonymousClass0Cm.m1036A(cls);
        if (anonymousClass0Uh != null) {
            return anonymousClass0Uh;
        }
        Object anonymousClass0Uh2 = new AnonymousClass0Uh(anonymousClass0Cm);
        anonymousClass0Cm.m1039D(cls, anonymousClass0Uh2);
        return anonymousClass0Uh2;
    }

    public final String HK() {
        try {
            JSONObject jSONObject = new JSONObject();
            int i = 0;
            while (i < this.f5538D.m4987A()) {
                AnonymousClass0W1 anonymousClass0W1 = this.f5538D;
                if (i < 0 || i >= anonymousClass0W1.m4987A()) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                AnonymousClass0W2 anonymousClass0W2 = (AnonymousClass0W2) anonymousClass0W1.f5855C[anonymousClass0W1.f5854B & (anonymousClass0W1.f5856D + i)];
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("trigger", anonymousClass0W2.f5859C);
                jSONObject2.put(RealtimeProtocol.DIRECT_V2_UNSEEN_COUNT, anonymousClass0W2.f5860D);
                jSONObject2.put("computation_info", anonymousClass0W2.f5858B);
                jSONObject.put(Integer.toString(i), jSONObject2);
                i++;
            }
            return jSONObject.toString();
        } catch (Throwable e) {
            AnonymousClass0Dc.m1244G("DirectBadgeCountDebugger", "Unable to create log", e);
            return null;
        }
    }

    public final void Je(AnonymousClass0VO anonymousClass0VO) {
        if (this.f5538D.m4987A() >= 10) {
            AnonymousClass0W1 anonymousClass0W1 = this.f5538D;
            int i = anonymousClass0W1.f5856D;
            if (i != anonymousClass0W1.f5857E) {
                anonymousClass0W1.f5855C[i] = null;
                anonymousClass0W1.f5856D = (i + 1) & anonymousClass0W1.f5854B;
            } else {
                throw new ArrayIndexOutOfBoundsException();
            }
        }
        String A = this.f5537C ? anonymousClass0VO.m4879A() : "Unknown";
        AnonymousClass0W1 anonymousClass0W12 = this.f5538D;
        AnonymousClass0W2 anonymousClass0W2 = new AnonymousClass0W2(anonymousClass0VO.f5724B, anonymousClass0VO.f5725C, A);
        Object[] objArr = anonymousClass0W12.f5855C;
        int i2 = anonymousClass0W12.f5857E;
        objArr[i2] = anonymousClass0W2;
        int i3 = anonymousClass0W12.f5854B & (i2 + 1);
        anonymousClass0W12.f5857E = i3;
        if (i3 == anonymousClass0W12.f5856D) {
            Object obj = anonymousClass0W12.f5855C;
            int length = obj.length;
            i2 = anonymousClass0W12.f5856D;
            int i4 = length - i2;
            int i5 = length << 1;
            if (i5 >= 0) {
                Object obj2 = new Object[i5];
                System.arraycopy(obj, i2, obj2, 0, i4);
                System.arraycopy(anonymousClass0W12.f5855C, 0, obj2, i4, anonymousClass0W12.f5856D);
                anonymousClass0W12.f5855C = (Object[]) obj2;
                anonymousClass0W12.f5856D = 0;
                anonymousClass0W12.f5857E = length;
                anonymousClass0W12.f5854B = i5 - 1;
            } else {
                throw new RuntimeException("Max array capacity exceeded");
            }
        }
        Integer.valueOf(anonymousClass0VO.f5725C);
    }

    public final void onUserSessionWillEnd(boolean z) {
        AnonymousClass0Sy.m4437F(new AnonymousClass0W3(this));
    }
}

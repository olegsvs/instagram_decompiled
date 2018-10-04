package X;

import android.os.Handler;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3r1 */
public final class AnonymousClass3r1 {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3r4 f45328B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass3rL f45329C;
    /* renamed from: D */
    public final /* synthetic */ Handler f45330D;
    /* renamed from: E */
    public final /* synthetic */ boolean f45331E;
    /* renamed from: F */
    public final /* synthetic */ AnonymousClass2hJ f45332F;
    /* renamed from: G */
    public final /* synthetic */ String f45333G;
    /* renamed from: H */
    public final /* synthetic */ List f45334H;
    /* renamed from: I */
    public final /* synthetic */ AnonymousClass2gn f45335I;

    public AnonymousClass3r1(AnonymousClass3r4 anonymousClass3r4, List list, AnonymousClass2gn anonymousClass2gn, Handler handler, String str, boolean z, AnonymousClass2hJ anonymousClass2hJ, AnonymousClass3rL anonymousClass3rL) {
        this.f45328B = anonymousClass3r4;
        this.f45334H = list;
        this.f45335I = anonymousClass2gn;
        this.f45330D = handler;
        this.f45333G = str;
        this.f45331E = z;
        this.f45332F = anonymousClass2hJ;
        this.f45329C = anonymousClass3rL;
    }

    /* renamed from: A */
    public final void m20903A(AnonymousClass2h0 anonymousClass2h0, Exception exception) {
        Exception exception2 = exception;
        if (exception != null) {
            AnonymousClass3r4.m20905B(this.f45328B, this.f45334H, this.f45335I, this.f45330D, this.f45333G, this.f45331E, exception2);
            return;
        }
        AnonymousClass2hJ anonymousClass2hJ = this.f45332F;
        Map hashMap = new HashMap();
        Map hashMap2 = new HashMap();
        Map hashMap3 = new HashMap();
        Map hashMap4 = new HashMap();
        Map hashMap5 = new HashMap();
        Map hashMap6 = new HashMap();
        AnonymousClass2h6 anonymousClass2h6 = anonymousClass2h0.f32471C;
        if (anonymousClass2h6 != null) {
            hashMap = anonymousClass2h6.f32501B;
        }
        anonymousClass2h6 = anonymousClass2h0.f32472D;
        if (anonymousClass2h6 != null) {
            hashMap4 = anonymousClass2h6.f32501B;
        }
        anonymousClass2h6 = anonymousClass2h0.f32473E;
        if (anonymousClass2h6 != null) {
            hashMap3 = anonymousClass2h6.f32501B;
        }
        anonymousClass2h6 = anonymousClass2h0.f32470B;
        if (anonymousClass2h6 != null) {
            hashMap5 = anonymousClass2h6.f32501B;
        }
        anonymousClass2h6 = anonymousClass2h0.f32474F;
        if (anonymousClass2h6 != null) {
            hashMap2 = anonymousClass2h6.f32501B;
        }
        anonymousClass2h6 = anonymousClass2h0.f32475G;
        if (anonymousClass2h6 != null) {
            hashMap6 = anonymousClass2h6.f32501B;
        }
        if (anonymousClass2hJ.m16922A(new AnonymousClass2h8(hashMap, hashMap2, hashMap3, hashMap4, hashMap5, hashMap6), false)) {
            AnonymousClass2h7 anonymousClass2h7;
            AnonymousClass3r4 anonymousClass3r4 = this.f45328B;
            List list = this.f45334H;
            AnonymousClass3rL anonymousClass3rL = this.f45329C;
            AnonymousClass2gn anonymousClass2gn = this.f45335I;
            Handler handler = this.f45330D;
            String str = this.f45333G;
            boolean z = this.f45331E;
            anonymousClass2hJ = this.f45332F;
            synchronized (anonymousClass2hJ) {
                anonymousClass2h7 = anonymousClass2hJ.f32543B;
            }
            AnonymousClass3r4.m20906C(anonymousClass3r4, list, anonymousClass3rL, anonymousClass2gn, handler, str, z, anonymousClass2h7 != null, this.f45332F);
        }
    }
}

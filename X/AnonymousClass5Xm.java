package X;

import android.text.TextUtils;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.5Xm */
public final class AnonymousClass5Xm implements AnonymousClass4o9, AnonymousClass4my {
    /* renamed from: B */
    public AnonymousClass0db f65974B;
    /* renamed from: C */
    public final AnonymousClass3Ix f65975C;
    /* renamed from: D */
    private final AnonymousClass0EE f65976D;
    /* renamed from: E */
    private final String f65977E;

    public AnonymousClass5Xm(AnonymousClass0EE anonymousClass0EE, AnonymousClass3Ix anonymousClass3Ix, AnonymousClass0db anonymousClass0db, String str) {
        this.f65976D = anonymousClass0EE;
        this.f65975C = anonymousClass3Ix;
        this.f65974B = anonymousClass0db;
        this.f65977E = str;
    }

    /* renamed from: A */
    public final void m27408A(AnonymousClass0mf anonymousClass0mf, int i, int i2, int i3, int i4, String str) {
        int i5 = i4;
        String str2 = str;
        AnonymousClass0NN B = AnonymousClass3Iu.B(this.f65976D, "account_recs_profile_impression", this.f65974B, this.f65977E, i5, str2, i, i2, this.f65975C.LR(anonymousClass0mf));
        AnonymousClass0uC.F(B, anonymousClass0mf, this.f65975C);
        B.B("profile_position", i3);
        B.F(MemoryDumpUploadJob.EXTRA_USER_ID, anonymousClass0mf.f9880J.getId());
        String str3 = "media_list";
        List<AnonymousClass0P7> list = anonymousClass0mf.f9876F;
        List arrayList = new ArrayList();
        if (list != null) {
            for (AnonymousClass0P7 anonymousClass0P7 : list) {
                if (anonymousClass0P7 != null) {
                    arrayList.add(anonymousClass0P7.NO());
                }
            }
        }
        B.G(str3, arrayList);
        B.R();
    }

    /* renamed from: B */
    public static void m27407B(AnonymousClass5Xm anonymousClass5Xm, int i, int i2, int i3, AnonymousClass3J2 anonymousClass3J2, int i4, int i5, String str) {
        AnonymousClass0NN B = AnonymousClass3Iu.B(anonymousClass5Xm.f65976D, "account_recs_unit_impression", anonymousClass5Xm.f65974B, anonymousClass5Xm.f65977E, i5, str, i, i2, i3);
        AnonymousClass0uC.E(B, anonymousClass3J2, i4);
        B.R();
    }

    public final void mCA(AnonymousClass3J1 anonymousClass3J1, AnonymousClass3J2 anonymousClass3J2) {
        AnonymousClass0EE anonymousClass0EE = this.f65976D;
        AnonymousClass0db anonymousClass0db = this.f65974B;
        Object obj = this.f65977E;
        AnonymousClass0NN B = AnonymousClass0NN.B("instagram_tab_bar_impression", anonymousClass0EE);
        String str = "tabs";
        List<AnonymousClass3J0> list = anonymousClass3J1.f39985C;
        JSONArray jSONArray = new JSONArray();
        for (AnonymousClass3J0 anonymousClass3J0 : list) {
            jSONArray.put(anonymousClass3J0.f39982D.toString());
        }
        AnonymousClass0NN F = B.F(str, jSONArray.toString()).F("tab_selected", anonymousClass3J2.toString());
        if (!TextUtils.isEmpty(obj)) {
            F.F("session_id", obj);
        }
        if (anonymousClass0db != null) {
            F.O(anonymousClass0db);
        }
        F.R();
    }

    public final void uo(AnonymousClass3Iq anonymousClass3Iq, int i, int i2) {
        AnonymousClass5Xm.m27407B(this, i, i2, this.f65975C.LR(anonymousClass3Iq), this.f65975C.iS(anonymousClass3Iq), this.f65975C.jS(anonymousClass3Iq), AnonymousClass1dy.ACCOUNT_RECS.A(), AnonymousClass3Is.f39976B);
    }

    public final void vo(AnonymousClass1e0 anonymousClass1e0, int i, int i2) {
        AnonymousClass0NN D = AnonymousClass3Iu.D(this.f65976D, "instagram_thumbnail_impression", anonymousClass1e0, this.f65974B, this.f65977E, i, i2, this.f65975C.LR(anonymousClass1e0));
        AnonymousClass0uC.F(D, anonymousClass1e0, this.f65975C);
        D.R();
    }

    public final void wo(AnonymousClass3Jh anonymousClass3Jh, int i, int i2) {
        AnonymousClass3Iu.C("instagram_spotlight_impression", this.f65976D, anonymousClass3Jh, this.f65974B, this.f65977E, i, i2).R();
    }

    public final void xo(AnonymousClass0P7 anonymousClass0P7, int i, int i2) {
        AnonymousClass0NN E = AnonymousClass3Iu.E(this.f65976D, "instagram_thumbnail_impression", anonymousClass0P7, this.f65974B, this.f65977E, i, i2, this.f65975C.LR(anonymousClass0P7));
        AnonymousClass0uC.F(E, anonymousClass0P7, this.f65975C);
        E.R();
    }
}

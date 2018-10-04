package com.instagram.business.insights.controller;

import X.AnonymousClass0Cm;
import X.AnonymousClass0Iu;
import X.AnonymousClass0Jd;
import X.AnonymousClass0MI;
import X.AnonymousClass0Pt;
import X.AnonymousClass0Pu;
import X.AnonymousClass0Qf;
import X.AnonymousClass0RR;
import X.AnonymousClass0VA;
import X.AnonymousClass0lG;
import X.AnonymousClass11j;
import X.AnonymousClass3Uq;
import X.AnonymousClass3bG;
import X.AnonymousClass3x5;
import X.AnonymousClass41T;
import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.support.v4.app.FragmentActivity;
import java.util.ArrayList;
import java.util.List;

public class InsightsStoryViewerController extends AnonymousClass0VA implements AnonymousClass3bG {
    /* renamed from: B */
    public Context f47321B;
    public AnonymousClass41T mHideAnimationCoordinator;

    public final void Iw(AnonymousClass0MI anonymousClass0MI) {
    }

    public final void Mm(AnonymousClass3Uq anonymousClass3Uq) {
    }

    public final void kv(AnonymousClass0MI anonymousClass0MI) {
    }

    public InsightsStoryViewerController(Context context) {
        this.f47321B = context;
    }

    /* renamed from: A */
    public final void m21676A(AnonymousClass0MI anonymousClass0MI, int i, RectF rectF, FragmentActivity fragmentActivity, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Qf anonymousClass0Qf) {
        AnonymousClass0MI anonymousClass0MI2 = anonymousClass0MI;
        if (anonymousClass0MI != null) {
            Activity activity = fragmentActivity;
            AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
            AnonymousClass0lG O = AnonymousClass0Jd.f2931B.O(activity, anonymousClass0Cm2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(anonymousClass0MI.getId());
            if (O != null) {
                AnonymousClass0Qf anonymousClass0Qf2 = anonymousClass0Qf;
                O.E(anonymousClass0MI2, i, null, rectF, new AnonymousClass3x5(this, anonymousClass0MI2, anonymousClass0Cm2, arrayList, anonymousClass0Qf2, i, O, activity, rectF), null, anonymousClass0Qf2);
            }
        }
    }

    /* renamed from: B */
    public static AnonymousClass0Iu m21675B(List list, AnonymousClass0Cm anonymousClass0Cm) {
        list = AnonymousClass0RR.B(',').A(list);
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cm);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
        anonymousClass0Pt.f4229M = "media/infos/";
        list = "true";
        return anonymousClass0Pt.D("media_ids", list).D("ranked_content", list).D("include_inactive_reel", list).M(AnonymousClass11j.class).H();
    }
}

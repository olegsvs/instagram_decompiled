package com.instagram.igtv.feed;

import X.AnonymousClass0Cm;
import X.AnonymousClass0Fz;
import X.AnonymousClass0Ie;
import X.AnonymousClass0PZ;
import X.AnonymousClass0TA;
import X.AnonymousClass0TK;
import X.AnonymousClass0VA;
import X.AnonymousClass0n8;
import X.AnonymousClass0rr;
import X.AnonymousClass2CN;
import X.AnonymousClass2CQ;
import X.AnonymousClass2CT;
import X.AnonymousClass2CW;
import X.AnonymousClass3gP;
import X.AnonymousClass4uP;
import X.AnonymousClass4uW;
import X.AnonymousClass4wv;
import X.AnonymousClass4wx;
import X.AnonymousClass4wz;
import X.AnonymousClass5YV;
import X.AnonymousClass5YW;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.common.ui.widget.recyclerview.HorizontalRefreshableRecyclerViewLayout;
import java.util.List;
import java.util.UUID;

public class IGTVFeedTrayControllerImpl extends AnonymousClass0VA implements AnonymousClass0TK, AnonymousClass4wz {
    /* renamed from: B */
    public AnonymousClass0n8 f66045B;
    /* renamed from: C */
    public final AnonymousClass2CW f66046C;
    /* renamed from: D */
    public AnonymousClass4wv f66047D;
    /* renamed from: E */
    public AnonymousClass0rr f66048E;
    /* renamed from: F */
    public AnonymousClass4uW f66049F;
    /* renamed from: G */
    public AnonymousClass4wx f66050G;
    /* renamed from: H */
    public boolean f66051H;
    /* renamed from: I */
    public final AnonymousClass0Ie f66052I;
    /* renamed from: J */
    public final AnonymousClass2CQ f66053J;
    /* renamed from: K */
    public final AnonymousClass0Fz f66054K;
    /* renamed from: L */
    public final AnonymousClass0Cm f66055L;
    /* renamed from: M */
    private List f66056M;
    /* renamed from: N */
    private String f66057N = UUID.randomUUID().toString();
    /* renamed from: O */
    private final AnonymousClass2CN f66058O;
    public View mBottomDividerView;
    public LinearLayout mContainerView;
    public View mPlayButton;
    public HorizontalRefreshableRecyclerViewLayout mRecyclerView;
    public View mTopDividerView;
    public TextView mTrayTitleTextView;

    public IGTVFeedTrayControllerImpl(AnonymousClass0Ie anonymousClass0Ie, AnonymousClass0PZ anonymousClass0PZ, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Fz anonymousClass0Fz, AnonymousClass2CQ anonymousClass2CQ, AnonymousClass2CW anonymousClass2CW, AnonymousClass2CN anonymousClass2CN) {
        this.f66052I = anonymousClass0Ie;
        this.f66054K = anonymousClass0Fz;
        this.f66055L = anonymousClass0Cm;
        this.f66046C = anonymousClass2CW;
        this.f66049F = new AnonymousClass4uW(new AnonymousClass5YV(), this.f66052I, anonymousClass0PZ, this.f66055L, this.f66057N);
        this.f66050G = new AnonymousClass4wx();
        this.f66058O = anonymousClass2CN;
        this.f66053J = anonymousClass2CQ;
    }

    /* renamed from: A */
    public final void m27445A(Context context, List list) {
        if (list != this.f66056M || this.f66047D.f58735C.isEmpty()) {
            this.f66056M = list;
            this.f66046C.G(list);
            this.f66045B = (AnonymousClass0n8) this.f66046C.f27430E.get(0);
            this.f66047D.m25472Q(this.f66045B);
        }
    }

    /* renamed from: B */
    public final AnonymousClass0TA m27446B() {
        return new AnonymousClass4uP(this.f66052I.getContext(), this);
    }

    public final void St() {
        AnonymousClass3gP.B(this.f66055L).Q();
    }

    public final boolean Vf(AnonymousClass2CT anonymousClass2CT, AnonymousClass5YW anonymousClass5YW, RectF rectF) {
        this.f66058O.yn(anonymousClass2CT.C(), anonymousClass2CT.G(), rectF, this.f66046C);
        return true;
    }

    public final void gi() {
        IGTVFeedTrayControllerImplLifecycleUtil.cleanupReferences(this);
    }
}

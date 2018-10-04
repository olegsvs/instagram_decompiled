package com.instagram.creation.capture.quickcapture.music.search;

import X.AnonymousClass0Cm;
import X.AnonymousClass0IJ;
import X.AnonymousClass0IL;
import X.AnonymousClass0Ro;
import X.AnonymousClass0VA;
import X.AnonymousClass0nJ;
import X.AnonymousClass0rr;
import X.AnonymousClass10n;
import X.AnonymousClass10o;
import X.AnonymousClass1VV;
import X.AnonymousClass1d2;
import X.AnonymousClass27y;
import X.AnonymousClass2Fv;
import X.AnonymousClass2G1;
import X.AnonymousClass2G2;
import X.AnonymousClass2MP;
import X.AnonymousClass3Lk;
import X.AnonymousClass4SC;
import X.AnonymousClass4SD;
import X.AnonymousClass4SE;
import X.AnonymousClass4SK;
import X.AnonymousClass53X;
import X.AnonymousClass5U2;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.facebook.C0164R;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MusicOverlayResultsListController extends AnonymousClass0VA implements AnonymousClass1d2 {
    /* renamed from: B */
    public final AnonymousClass4SE f66879B;
    /* renamed from: C */
    public final int f66880C;
    /* renamed from: D */
    public final AnonymousClass27y f66881D;
    /* renamed from: E */
    public final AnonymousClass0IL f66882E;
    /* renamed from: F */
    public final boolean f66883F;
    /* renamed from: G */
    public final AnonymousClass2Fv f66884G;
    /* renamed from: H */
    public final AnonymousClass53X f66885H;
    /* renamed from: I */
    public AnonymousClass5U2 f66886I;
    /* renamed from: J */
    public int f66887J;
    /* renamed from: K */
    public int f66888K;
    /* renamed from: L */
    public final Set f66889L = new HashSet();
    /* renamed from: M */
    public final AnonymousClass0Cm f66890M;
    /* renamed from: N */
    private final AnonymousClass3Lk f66891N;
    /* renamed from: O */
    private final AnonymousClass10o f66892O;
    public AnonymousClass0rr mLayoutManager;
    public View mParentView;
    public RecyclerView mRecyclerView;

    public final void om(AnonymousClass0IL anonymousClass0IL) {
    }

    public MusicOverlayResultsListController(AnonymousClass0IJ anonymousClass0IJ, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass2Fv anonymousClass2Fv, AnonymousClass27y anonymousClass27y, AnonymousClass53X anonymousClass53X, AnonymousClass3Lk anonymousClass3Lk, AnonymousClass0Ro anonymousClass0Ro, boolean z, int i) {
        this.f66882E = anonymousClass0IJ;
        this.f66890M = anonymousClass0Cm;
        this.f66884G = anonymousClass2Fv;
        this.f66881D = anonymousClass27y;
        this.f66885H = anonymousClass53X;
        this.f66891N = anonymousClass3Lk;
        this.f66883F = z;
        this.f66880C = i;
        AnonymousClass0nJ anonymousClass4SE = new AnonymousClass4SE(anonymousClass53X, this, anonymousClass0Ro);
        this.f66879B = anonymousClass4SE;
        anonymousClass4SE.O(true);
        AnonymousClass10o anonymousClass10n = new AnonymousClass10n();
        this.f66892O = anonymousClass10n;
        anonymousClass10n.f13322B = false;
    }

    /* renamed from: A */
    public final boolean m27827A() {
        return this.f66879B.f54223E.size() > 0;
    }

    /* renamed from: B */
    public static int m27825B(MusicOverlayResultsListController musicOverlayResultsListController, AnonymousClass2G1 anonymousClass2G1) {
        for (int aA = musicOverlayResultsListController.mLayoutManager.aA(); aA <= musicOverlayResultsListController.mLayoutManager.cA(); aA++) {
            AnonymousClass4SD anonymousClass4SD = (AnonymousClass4SD) musicOverlayResultsListController.f66879B.f54224F.get(aA);
            if (anonymousClass4SD.f54219C == AnonymousClass4SC.SEARCH_ITEM && anonymousClass2G1.equals(anonymousClass4SD.f54218B)) {
                return aA;
            }
        }
        return -1;
    }

    /* renamed from: B */
    public final boolean m27828B() {
        AnonymousClass0rr anonymousClass0rr = this.mLayoutManager;
        return anonymousClass0rr != null ? AnonymousClass2MP.B(anonymousClass0rr) : true;
    }

    /* renamed from: C */
    public static void m27826C(MusicOverlayResultsListController musicOverlayResultsListController) {
        Object obj = musicOverlayResultsListController.f66885H.f59627C;
        if (!TextUtils.isEmpty(obj)) {
            Object obj2;
            for (int aA = musicOverlayResultsListController.mLayoutManager.aA(); aA <= musicOverlayResultsListController.mLayoutManager.cA(); aA++) {
                AnonymousClass4SD anonymousClass4SD = (AnonymousClass4SD) musicOverlayResultsListController.f66879B.f54224F.get(aA);
                if (anonymousClass4SD.f54219C == AnonymousClass4SC.SEARCH_ITEM) {
                    AnonymousClass2G1 anonymousClass2G1 = anonymousClass4SD.f54218B;
                    if (anonymousClass2G1.f28180E.equals(AnonymousClass2G2.TRACK) && obj.equals(anonymousClass2G1.f28179D.f28197L)) {
                        obj2 = null;
                        break;
                    }
                }
            }
            obj2 = 1;
            if (obj2 != null) {
                musicOverlayResultsListController.f66885H.m25652G();
            }
        }
    }

    /* renamed from: C */
    public final boolean m27829C() {
        AnonymousClass0rr anonymousClass0rr = this.mLayoutManager;
        return anonymousClass0rr != null ? AnonymousClass2MP.C(anonymousClass0rr) : true;
    }

    /* renamed from: D */
    public final void m27830D(List list, boolean z) {
        if (z) {
            AnonymousClass4SE anonymousClass4SE = this.f66879B;
            anonymousClass4SE.f54223E.clear();
            anonymousClass4SE.f54223E.addAll(list);
            AnonymousClass4SE.B(anonymousClass4SE);
            return;
        }
        anonymousClass4SE = this.f66879B;
        anonymousClass4SE.f54223E.addAll(list);
        AnonymousClass4SE.B(anonymousClass4SE);
    }

    /* renamed from: E */
    public final void m27831E() {
        Toast.makeText(this.f66882E.getContext(), C0164R.string.something_went_wrong, 0).show();
        this.f66879B.notifyDataSetChanged();
    }

    /* renamed from: F */
    public final void m27832F() {
        this.f66879B.notifyDataSetChanged();
    }

    public final void PGA(View view, Bundle bundle) {
        this.mParentView = view;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C0164R.id.music_list);
        this.mRecyclerView = recyclerView;
        recyclerView.setAdapter(this.f66879B);
        this.mLayoutManager = new AnonymousClass0rr(this.mRecyclerView.getContext());
        this.mRecyclerView.setLayoutManager(this.mLayoutManager);
        this.mRecyclerView.D(new AnonymousClass4SK(this));
        this.mRecyclerView.D(new AnonymousClass1VV(this.f66891N, this.mLayoutManager, 10));
        this.mRecyclerView.setItemAnimator(this.f66892O);
        RecyclerView recyclerView2 = this.mRecyclerView;
        recyclerView2.setPadding(recyclerView2.getPaddingLeft(), this.mRecyclerView.getPaddingTop(), this.mRecyclerView.getPaddingRight(), this.f66880C);
    }

    public final void St() {
        this.f66885H.m25651F();
    }

    public final void gi() {
        List list = this.mRecyclerView.f8836h;
        if (list != null) {
            list.clear();
        }
        MusicOverlayResultsListControllerLifecycleUtil.cleanupReferences(this);
    }

    public final void nm(AnonymousClass0IL anonymousClass0IL) {
        this.f66885H.m25651F();
    }
}

package X;

/* renamed from: X.1ME */
public final class AnonymousClass1ME extends AnonymousClass1mu {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1MC f17551B;

    public AnonymousClass1ME(AnonymousClass1MC anonymousClass1MC) {
        this.f17551B = anonymousClass1MC;
    }

    public final void onPageScrollStateChanged(int i) {
        if (i == 1) {
            AnonymousClass0iW.m6906B(this.f17551B.f17534I, true);
        }
    }

    public final void onPageSelected(int i) {
        if (((Boolean) AnonymousClass0E6.m1318D(AnonymousClass0CC.jK, this.f17551B.f17542Q)).booleanValue()) {
            AnonymousClass0HV.m2008D(this.f17551B.f17542Q).f2646B.edit().putBoolean("explore_topical_should_show_topic_nux", false).apply();
        }
        AnonymousClass1MC.m10945C(this.f17551B, i, AnonymousClass1MG.H_SCROLL);
    }
}

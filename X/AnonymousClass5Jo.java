package X;

import com.instagram.base.activity.BaseFragmentActivity;

/* renamed from: X.5Jo */
public final class AnonymousClass5Jo implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Jp f62180B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass5Ju f62181C;

    public AnonymousClass5Jo(AnonymousClass5Jp anonymousClass5Jp, AnonymousClass5Ju anonymousClass5Ju) {
        this.f62180B = anonymousClass5Jp;
        this.f62181C = anonymousClass5Ju;
    }

    public final void run() {
        BaseFragmentActivity baseFragmentActivity = (BaseFragmentActivity) this.f62180B.f62182B.getActivity();
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this.f62180B.f62182B.getActivity());
        anonymousClass0IZ.f2754D = AnonymousClass0Jj.f2938B.B().D(AnonymousClass0bx.C(this.f62180B.f62182B.f62188G, this.f62181C.f62203D, "short_url_to_profile").A());
        anonymousClass0IZ.C().B();
        baseFragmentActivity.P();
    }
}

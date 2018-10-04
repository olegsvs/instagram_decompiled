package X;

import com.instagram.base.activity.BaseFragmentActivity;

/* renamed from: X.5Jr */
public final class AnonymousClass5Jr implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Jt f62194B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0IL f62195C;

    public AnonymousClass5Jr(AnonymousClass5Jt anonymousClass5Jt, AnonymousClass0IL anonymousClass0IL) {
        this.f62194B = anonymousClass5Jt;
        this.f62195C = anonymousClass0IL;
    }

    public final void run() {
        BaseFragmentActivity baseFragmentActivity = (BaseFragmentActivity) this.f62194B.f62198C.getActivity();
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this.f62194B.f62198C.getActivity());
        anonymousClass0IZ.f2754D = this.f62195C;
        anonymousClass0IZ.C().B();
        baseFragmentActivity.P();
    }
}

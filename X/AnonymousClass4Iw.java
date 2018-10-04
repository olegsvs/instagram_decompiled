package X;

import com.facebook.C0164R;

/* renamed from: X.4Iw */
public enum AnonymousClass4Iw {
    HIDE,
    MANAGE,
    SEE_ALL,
    SEE_FEWER;
    
    /* renamed from: B */
    private int f52570B;

    static {
        r1.f52570B = C0164R.string.edit_drafts;
        SEE_ALL.f52570B = C0164R.string.see_all_drafts;
        r2.f52570B = C0164R.string.see_fewer_drafts;
    }

    /* renamed from: A */
    public final int m23798A() {
        return this.f52570B;
    }

    /* renamed from: B */
    public final boolean m23799B() {
        return this != HIDE;
    }
}

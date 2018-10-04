package X;

import android.app.Activity;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/* renamed from: X.5Hm */
public final class AnonymousClass5Hm implements OnCheckedChangeListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Ho f61791B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass5Hn f61792C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0HV f61793D;

    public AnonymousClass5Hm(AnonymousClass5Ho anonymousClass5Ho, AnonymousClass5Hn anonymousClass5Hn, AnonymousClass0HV anonymousClass0HV) {
        this.f61791B = anonymousClass5Ho;
        this.f61792C = anonymousClass5Hn;
        this.f61793D = anonymousClass0HV;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Activity rootActivity = this.f61791B.getRootActivity();
        boolean E = AnonymousClass1Ba.E(rootActivity, "android.permission.WRITE_EXTERNAL_STORAGE");
        if (z) {
            AnonymousClass1Ba.H(rootActivity, new AnonymousClass5Hl(this, E, rootActivity), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"});
            return;
        }
        switch (this.f61792C.ordinal()) {
            case 0:
                AnonymousClass2Go.B("save_original_photos_switched_off");
                this.f61793D.UA(false);
                break;
            case 1:
                this.f61793D.VA(false);
                break;
            case 2:
                AnonymousClass5Ho.m26155C(this.f61791B, false);
                break;
            default:
                break;
        }
    }
}

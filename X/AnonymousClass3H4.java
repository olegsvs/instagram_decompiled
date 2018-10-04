package X;

import com.instagram.creation.photo.edit.filter.BlurredLumAdjustFilter;
import com.instagram.creation.photo.edit.luxfilter.LuxFilter;
import com.instagram.filterkit.filter.IgFilterGroup;

/* renamed from: X.3H4 */
public final class AnonymousClass3H4 implements AnonymousClass0G4 {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3zH f39748B;
    /* renamed from: C */
    public final /* synthetic */ IgFilterGroup f39749C;

    public AnonymousClass3H4(AnonymousClass3zH anonymousClass3zH, IgFilterGroup igFilterGroup) {
        this.f39748B = anonymousClass3zH;
        this.f39749C = igFilterGroup;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        Object obj;
        IgFilterGroup igFilterGroup;
        AnonymousClass3GU.m19204H(this.f39749C, this.f39748B.f47896H);
        boolean z = true;
        if (AnonymousClass0ci.B(this.f39748B.f47892D.f48235F).f7233D) {
            if ((((LuxFilter) this.f39749C.m22013B(9)).f50068C > 0 ? 1 : null) != null && this.f39748B.f47890B.f39675F.get()) {
                obj = 1;
                if (this.f39748B.f47896H == null || !this.f39748B.f47896H.f39693E.get()) {
                    if (obj != null) {
                        z = false;
                    }
                }
                igFilterGroup = this.f39749C;
                if (AnonymousClass0ci.B(igFilterGroup.f48235F).f7232C) {
                    igFilterGroup.m22018G(1, false);
                    igFilterGroup.m22018G(2, z);
                    ((BlurredLumAdjustFilter) igFilterGroup.m22013B(12)).f49523B = false;
                    igFilterGroup.m22018G(19, false);
                }
                return AnonymousClass3zH.m21861C(this.f39748B);
            }
        }
        obj = null;
        if (obj != null) {
            z = false;
        }
        igFilterGroup = this.f39749C;
        if (AnonymousClass0ci.B(igFilterGroup.f48235F).f7232C) {
            igFilterGroup.m22018G(1, false);
            igFilterGroup.m22018G(2, z);
            ((BlurredLumAdjustFilter) igFilterGroup.m22013B(12)).f49523B = false;
            igFilterGroup.m22018G(19, false);
        }
        return AnonymousClass3zH.m21861C(this.f39748B);
    }
}

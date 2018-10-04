package com.instagram.filterkit.filter.resize;

import X.AnonymousClass28h;
import X.AnonymousClass28k;
import X.AnonymousClass2Vh;
import X.AnonymousClass2Vi;
import X.AnonymousClass3Ou;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.filterkit.filter.BaseSimpleFilter;
import com.instagram.util.creation.ShaderBridge;

public class IdentityFilter extends BaseSimpleFilter {
    public static final Creator CREATOR = new AnonymousClass3Ou();

    public IdentityFilter(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: B */
    public final AnonymousClass28h mo5433B(AnonymousClass28k anonymousClass28k) {
        anonymousClass28k = ShaderBridge.compileProgram("Identity");
        if (anonymousClass28k == null) {
            return null;
        }
        return new AnonymousClass28h(anonymousClass28k);
    }

    /* renamed from: E */
    public final void mo5436E(AnonymousClass28h anonymousClass28h, AnonymousClass28k anonymousClass28k, AnonymousClass2Vh anonymousClass2Vh, AnonymousClass2Vi anonymousClass2Vi) {
        anonymousClass28h.m14576F("image", anonymousClass2Vh.getTextureId());
    }
}

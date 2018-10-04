package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.model.shopping.Product;

/* renamed from: X.3fm */
public final class AnonymousClass3fm {
    /* renamed from: B */
    public String f43201B;
    /* renamed from: C */
    public String f43202C;
    /* renamed from: D */
    public String f43203D;
    /* renamed from: E */
    public String f43204E;
    /* renamed from: F */
    public Product f43205F;
    /* renamed from: G */
    public String f43206G;

    /* renamed from: A */
    public final Bundle m20380A() {
        AnonymousClass1mY.m13012C(this.f43201B);
        AnonymousClass1mY.m13012C(this.f43202C);
        AnonymousClass1mY.m13012C(this.f43204E);
        int i = 1;
        int i2 = this.f43205F != null ? 1 : 0;
        if (this.f43206G == null) {
            i = 0;
        }
        AnonymousClass1mY.m13011B(i2 ^ i);
        Bundle bundle = new Bundle();
        bundle.putString("displayed_user_id", this.f43201B);
        bundle.putString("displayed_username", this.f43202C);
        bundle.putString("prior_module_name", this.f43204E);
        String str = this.f43203D;
        if (str != null) {
            bundle.putString("media_id", str);
        }
        Parcelable parcelable = this.f43205F;
        if (parcelable != null) {
            bundle.putParcelable("product", parcelable);
        } else {
            str = this.f43206G;
            if (str != null) {
                bundle.putString("product_id", str);
            }
        }
        return bundle;
    }

    /* renamed from: B */
    public final AnonymousClass3fm m20381B(String str, String str2) {
        this.f43201B = (String) AnonymousClass1mY.m13012C(str);
        this.f43202C = (String) AnonymousClass1mY.m13012C(str2);
        return this;
    }

    /* renamed from: C */
    public final AnonymousClass3fm m20382C(AnonymousClass0P7 anonymousClass0P7) {
        this.f43203D = anonymousClass0P7 == null ? null : anonymousClass0P7.getId();
        return this;
    }

    /* renamed from: D */
    public final AnonymousClass3fm m20383D(AnonymousClass0EE anonymousClass0EE) {
        this.f43204E = (String) AnonymousClass1mY.m13012C(anonymousClass0EE.getModuleName());
        return this;
    }
}

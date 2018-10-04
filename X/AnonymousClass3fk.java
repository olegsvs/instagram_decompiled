package X;

import com.facebook.C0164R;

/* renamed from: X.3fk */
public enum AnonymousClass3fk {
    DESCRIPTION(C0164R.string.shopping_viewer_description_title),
    SHIPPING_AND_RETURNS(C0164R.string.shopping_viewer_shipping_and_returns_title);
    
    /* renamed from: B */
    private int f43196B;

    private AnonymousClass3fk(int i) {
        this.f43196B = i;
    }

    /* renamed from: A */
    public final int m20379A() {
        return this.f43196B;
    }

    public final String toString() {
        return name().toLowerCase();
    }
}

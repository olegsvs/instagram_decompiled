package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.16W */
public final class AnonymousClass16W extends AnonymousClass0oo {
    /* renamed from: B */
    public final String f14550B;
    /* renamed from: C */
    public final AnonymousClass0ct f14551C;
    /* renamed from: D */
    public final TextView f14552D;
    /* renamed from: E */
    public final int f14553E;
    /* renamed from: F */
    public final TextView f14554F;
    /* renamed from: G */
    public final TextView f14555G;
    /* renamed from: H */
    public final int f14556H;

    public AnonymousClass16W(View view) {
        super(view);
        this.f14550B = view.getResources().getString(C0164R.string.my_reel_your_story);
        this.f14553E = AnonymousClass0Ca.m937C(view.getContext(), C0164R.color.grey_5);
        this.f14556H = AnonymousClass0Ca.m937C(view.getContext(), C0164R.color.black);
        this.f14555G = (TextView) view.findViewById(C0164R.id.username);
        this.f14554F = (TextView) view.findViewById(C0164R.id.subtitle);
        this.f14552D = (TextView) view.findViewById(C0164R.id.plus_one);
        this.f14551C = new AnonymousClass0ct((ViewStub) view.findViewById(C0164R.id.notification));
    }
}

package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.3Ql */
public final class AnonymousClass3Ql extends AnonymousClass0TA {
    /* renamed from: B */
    public final Context f41167B;
    /* renamed from: C */
    public final boolean f41168C;

    public final boolean KX(int i, Object obj, Object obj2) {
        return true;
    }

    public final int getViewTypeCount() {
        return 2;
    }

    public AnonymousClass3Ql(Context context, boolean z) {
        this.f41167B = context;
        this.f41168C = z;
    }

    /* renamed from: B */
    private static View m19620B(Context context, int i, ViewGroup viewGroup) {
        switch (i) {
            case 0:
                i = LayoutInflater.from(context).inflate(C0164R.layout.row_autocomplete_hashtag, viewGroup, false);
                context = new AnonymousClass3Qk();
                context.f41166C = (TextView) i.findViewById(C0164R.id.row_hashtag_textview_tag_name);
                context.f41165B = (TextView) i.findViewById(C0164R.id.row_hashtag_textview_media_count);
                i.setTag(context);
                return i;
            case 1:
                return AnonymousClass3eA.m20291C(context, viewGroup);
            default:
                throw new UnsupportedOperationException("Unhandled view type");
        }
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        Object obj3 = obj;
        int I = AnonymousClass0cQ.I(this, 34258545);
        int i2 = i;
        if (view == null) {
            view = AnonymousClass3Ql.m19620B(r2.f41167B, i2, viewGroup);
        }
        Hashtag hashtag = (Hashtag) obj3;
        int I2 = AnonymousClass0cQ.I(r2, -1296400035);
        switch (i) {
            case 0:
                Context context = r2.f41167B;
                AnonymousClass3Qk anonymousClass3Qk = (AnonymousClass3Qk) view.getTag();
                anonymousClass3Qk.f41166C.setText(AnonymousClass0IE.E("#%s", new Object[]{hashtag.f2793M}));
                if (hashtag.f2787G) {
                    anonymousClass3Qk.f41165B.setText(context.getResources().getString(C0164R.string.recent).toLowerCase());
                } else {
                    anonymousClass3Qk.f41165B.setText(AnonymousClass19B.D(context.getResources(), hashtag.f2789I));
                }
                anonymousClass3Qk.f41165B.setVisibility(0);
                break;
            case 1:
                AnonymousClass3eA.m20290B((AnonymousClass3e9) view.getTag(), hashtag, r2.f41167B, 0, null, true, true, false, 0);
                break;
            default:
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("View type unhandled");
                AnonymousClass0cQ.H(r2, 870476219, I2);
                throw unsupportedOperationException;
        }
        AnonymousClass0cQ.H(r2, -529641284, I2);
        AnonymousClass0cQ.H(r2, -1416080654, I);
        return view;
    }

    public final /* bridge */ /* synthetic */ void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        Hashtag hashtag = (Hashtag) obj;
        Void voidR = (Void) obj2;
        if (this.f41168C) {
            anonymousClass0p9.A(1);
        } else {
            anonymousClass0p9.A(0);
        }
    }
}

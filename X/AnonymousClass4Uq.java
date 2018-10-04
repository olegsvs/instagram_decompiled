package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import com.facebook.C0164R;

/* renamed from: X.4Uq */
public final class AnonymousClass4Uq extends AnonymousClass0TA {
    /* renamed from: B */
    private final Context f54664B;
    /* renamed from: C */
    private final AnonymousClass5UU f54665C;
    /* renamed from: D */
    private final AnonymousClass0Cm f54666D;

    public final boolean KX(int i, Object obj, Object obj2) {
        return true;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass4Uq(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass5UU anonymousClass5UU) {
        this.f54664B = context;
        this.f54666D = anonymousClass0Cm;
        this.f54665C = anonymousClass5UU;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int I = AnonymousClass0cQ.I(this, -1726572168);
        if (view == null) {
            LayoutInflater from = LayoutInflater.from(this.f54664B);
            AnonymousClass4Uo anonymousClass4Uo = new AnonymousClass4Uo();
            View inflate = from.inflate(C0164R.layout.layout_filter_list_item, viewGroup, false);
            anonymousClass4Uo.f54659B = inflate;
            anonymousClass4Uo.f54661D = inflate.findViewById(C0164R.id.filter_handle);
            anonymousClass4Uo.f54662E = (ImageView) anonymousClass4Uo.f54659B.findViewById(C0164R.id.filter_image);
            anonymousClass4Uo.f54663F = (CheckedTextView) anonymousClass4Uo.f54659B.findViewById(C0164R.id.filter_name);
            anonymousClass4Uo.f54659B.setTag(anonymousClass4Uo);
            view = anonymousClass4Uo.f54659B;
        }
        AnonymousClass4Up.m24370B((AnonymousClass4Uo) view.getTag(), this.f54666D, (AnonymousClass3Cj) obj, this.f54665C);
        AnonymousClass0cQ.H(this, 295765706, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass3Cj anonymousClass3Cj = (AnonymousClass3Cj) obj;
        Void voidR = (Void) obj2;
        anonymousClass0p9.A(0);
    }
}

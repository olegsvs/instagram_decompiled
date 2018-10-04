package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;

/* renamed from: X.33w */
public final class AnonymousClass33w extends AnonymousClass0TA {
    /* renamed from: B */
    private final Context f37476B;
    /* renamed from: C */
    private final AnonymousClass33y f37477C;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass33w(Context context, AnonymousClass33y anonymousClass33y) {
        this.f37476B = context;
        this.f37477C = anonymousClass33y;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int I = AnonymousClass0cQ.I(this, 611388344);
        if (view == null) {
            Context context = this.f37476B;
            view = (ViewGroup) LayoutInflater.from(context).inflate(C0164R.layout.create_page_row, viewGroup, false);
            view.setOnClickListener(new AnonymousClass33x(this.f37477C));
        }
        AnonymousClass0cQ.H(this, -1372452845, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        Void voidR = (Void) obj;
        Void voidR2 = (Void) obj2;
        anonymousClass0p9.A(0);
    }
}

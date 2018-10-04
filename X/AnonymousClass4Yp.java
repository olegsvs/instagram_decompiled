package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;

/* renamed from: X.4Yp */
public final class AnonymousClass4Yp extends AnonymousClass0TA {
    /* renamed from: B */
    public final AnonymousClass5Up f55222B;
    /* renamed from: C */
    private final Context f55223C;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass4Yp(Context context, AnonymousClass5Up anonymousClass5Up) {
        this.f55223C = context;
        this.f55222B = anonymousClass5Up;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int I = AnonymousClass0cQ.I(this, 30343649);
        if (view == null) {
            view = LayoutInflater.from(this.f55223C).inflate(C0164R.layout.direct_empty_inbox_header, viewGroup, false);
        }
        view.findViewById(C0164R.id.send_message_button).setOnClickListener(new AnonymousClass4Yo(this));
        AnonymousClass0cQ.H(this, 1180629839, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Void voidR = (Void) obj2;
        anonymousClass0p9.A(0);
    }
}

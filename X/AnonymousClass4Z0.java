package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.4Z0 */
public final class AnonymousClass4Z0 extends AnonymousClass0TA {
    /* renamed from: B */
    private final Context f55259B;
    /* renamed from: C */
    private final AnonymousClass0V9 f55260C;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass4Z0(Context context, AnonymousClass0V9 anonymousClass0V9) {
        this.f55259B = context;
        this.f55260C = anonymousClass0V9;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int I = AnonymousClass0cQ.I(this, -1036716081);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.layout_metadata_header, viewGroup, false);
            AnonymousClass4Yz anonymousClass4Yz = new AnonymousClass4Yz();
            anonymousClass4Yz.f55257B = (TextView) view.findViewById(C0164R.id.header_text);
            anonymousClass4Yz.f55258C = (TextView) view.findViewById(C0164R.id.header_action_button);
            view.setTag(anonymousClass4Yz);
        }
        AnonymousClass4Z1 anonymousClass4Z1 = (AnonymousClass4Z1) obj2;
        Context context = this.f55259B;
        AnonymousClass4Yz anonymousClass4Yz2 = (AnonymousClass4Yz) view.getTag();
        String str = (String) obj;
        boolean z = anonymousClass4Z1.f55262C;
        boolean z2 = anonymousClass4Z1.f55261B;
        AnonymousClass0V9 anonymousClass0V9 = this.f55260C;
        anonymousClass4Yz2.f55257B.setText(str);
        if (z2) {
            Object string = context.getString(C0164R.string.see_all);
            if (z) {
                anonymousClass4Yz2.f55258C.setText(string);
            } else {
                anonymousClass4Yz2.f55258C.setText(C0164R.string.directshare_hide);
            }
            anonymousClass4Yz2.f55258C.setOnClickListener(new AnonymousClass4Yy(string, anonymousClass4Yz2, anonymousClass0V9));
            anonymousClass4Yz2.f55258C.setVisibility(0);
        } else {
            anonymousClass4Yz2.f55258C.setVisibility(8);
        }
        AnonymousClass0cQ.H(this, -1033178185, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        String str = (String) obj;
        AnonymousClass4Z1 anonymousClass4Z1 = (AnonymousClass4Z1) obj2;
        anonymousClass0p9.A(0);
    }
}

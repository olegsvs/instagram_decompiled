package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.0tM */
public final class AnonymousClass0tM {
    /* renamed from: B */
    public static void m8164B(AnonymousClass0tN anonymousClass0tN, AnonymousClass0r0 anonymousClass0r0, AnonymousClass0qy anonymousClass0qy, AnonymousClass0iB anonymousClass0iB) {
        int i = 0;
        switch (AnonymousClass1Ur.f19200B[anonymousClass0r0.f11073F.ordinal()]) {
            case 1:
                anonymousClass0tN.f11643D.setBackgroundColor(AnonymousClass0Ca.m937C(anonymousClass0tN.f11643D.getContext(), C0164R.color.grey_0));
                AnonymousClass0Nm.m3436O(anonymousClass0tN.f11644E);
                AnonymousClass0Nm.m3436O(anonymousClass0tN.f11641B);
                break;
            case 2:
                anonymousClass0tN.f11643D.setBackgroundColor(AnonymousClass0Ca.m937C(anonymousClass0tN.f11643D.getContext(), C0164R.color.white));
                anonymousClass0tN.f11644E.setVisibility(0);
                anonymousClass0tN.f11644E.setText(anonymousClass0r0.f11074G);
                AnonymousClass0Nm.m3436O(anonymousClass0tN.f11641B);
                break;
            case 3:
                anonymousClass0tN.f11643D.setBackgroundColor(AnonymousClass0Ca.m937C(anonymousClass0tN.f11643D.getContext(), C0164R.color.white));
                anonymousClass0tN.f11644E.setVisibility(0);
                anonymousClass0tN.f11644E.setText(anonymousClass0r0.f11074G);
                if (anonymousClass0tN.f11641B == null) {
                    anonymousClass0tN.f11641B = anonymousClass0tN.f11642C.inflate();
                }
                anonymousClass0tN.f11641B.setVisibility(0);
                anonymousClass0tN.f11641B.setOnClickListener(new AnonymousClass5lg(anonymousClass0r0, anonymousClass0iB));
                break;
            default:
                break;
        }
        View view = anonymousClass0tN.f11645F;
        if (anonymousClass0qy.f11063B) {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: C */
    public static View m8165C(Context context, ViewGroup viewGroup) {
        viewGroup = LayoutInflater.from(context).inflate(C0164R.layout.layout_separator_header, viewGroup, false);
        viewGroup.setTag(new AnonymousClass0tN((ViewGroup) viewGroup.findViewById(C0164R.id.separator), viewGroup.findViewById(C0164R.id.separator_top_divider), (TextView) viewGroup.findViewById(C0164R.id.separator_text), (ViewStub) viewGroup.findViewById(C0164R.id.separator_more_button_stub)));
        return viewGroup;
    }
}

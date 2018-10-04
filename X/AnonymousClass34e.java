package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.business.insights.ui.InsightsEducationView;
import com.instagram.ui.widget.wheelview.WheelView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.34e */
public final class AnonymousClass34e extends AnonymousClass1Pn {
    /* renamed from: Q */
    public static final String f37572Q;
    /* renamed from: R */
    public static final String f37573R;
    /* renamed from: B */
    public AnonymousClass5ss f37574B;
    /* renamed from: C */
    public AnonymousClass34o f37575C;
    /* renamed from: D */
    public AnonymousClass2E1 f37576D;
    /* renamed from: E */
    public final List f37577E = new ArrayList();
    /* renamed from: F */
    public int f37578F;
    /* renamed from: G */
    public WheelView f37579G;
    /* renamed from: H */
    public String[][] f37580H;
    /* renamed from: I */
    public final List f37581I = new ArrayList();
    /* renamed from: J */
    public int f37582J;
    /* renamed from: K */
    public WheelView f37583K;
    /* renamed from: L */
    public final List f37584L = new ArrayList();
    /* renamed from: M */
    public WheelView f37585M;
    /* renamed from: N */
    private InsightsEducationView f37586N;
    /* renamed from: O */
    private String[][] f37587O;
    /* renamed from: P */
    private int f37588P;

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(AnonymousClass34e.class.getName());
        stringBuilder.append(".EXTRA_QUERY");
        f37573R = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(AnonymousClass34e.class.getName());
        stringBuilder.append(".EXTRA_FILTER_TYPE");
        f37572Q = stringBuilder.toString();
    }

    /* renamed from: B */
    public static void m18436B(AnonymousClass34e anonymousClass34e) {
        Object obj = null;
        for (int i = 0; i < AnonymousClass34n.f37610G.length; i++) {
            if (AnonymousClass34n.f37611H[i].equals(anonymousClass34e.f37576D.f27757E)) {
                anonymousClass34e.f37588P = i;
                obj = 1;
            }
            anonymousClass34e.f37584L.add(AnonymousClass34n.m18443D(AnonymousClass34n.f37610G[i], anonymousClass34e.getResources()));
            anonymousClass34e.f37577E.add(new ArrayList());
            int i2 = 0;
            while (true) {
                String[][] strArr = anonymousClass34e.f37587O;
                if (i2 >= strArr[i].length) {
                    break;
                }
                ((List) anonymousClass34e.f37577E.get(i)).add(AnonymousClass34n.m18441B(strArr[i][i2], anonymousClass34e.getResources()));
                if (obj != null) {
                    if (anonymousClass34e.f37580H[i][i2].equals(anonymousClass34e.f37576D.f27756D)) {
                        anonymousClass34e.f37578F = i2;
                    }
                }
                i2++;
            }
        }
        for (int i3 = 0; i3 < AnonymousClass34n.f37608E.length; i3++) {
            anonymousClass34e.f37581I.add(AnonymousClass34n.m18444E(AnonymousClass34n.f37608E[i3], anonymousClass34e.getResources()));
            if (obj != null) {
                if (AnonymousClass34n.f37609F[i3].equals(anonymousClass34e.f37576D.f27758F)) {
                    anonymousClass34e.f37582J = i3;
                }
            }
        }
    }

    /* renamed from: C */
    public static boolean m18437C(WheelView wheelView, List list, int i) {
        if (list.size() <= 1) {
            return false;
        }
        wheelView.setVisibility(0);
        wheelView.setOffset(2);
        wheelView.setItems(list);
        if (i >= list.size()) {
            i = list.size() - 1;
        }
        wheelView.setSelection(i);
        return true;
    }

    /* renamed from: D */
    private void m18438D(View view) {
        OnClickListener anonymousClass34b;
        int i;
        switch (this.f37575C.ordinal()) {
            case 0:
                this.f37577E.add(new ArrayList());
                for (i = 0; i < AnonymousClass34n.f37605B.length; i++) {
                    this.f37581I.add(AnonymousClass34n.m18442C(AnonymousClass34n.f37605B[i], getResources()));
                    if (AnonymousClass34n.f37605B[i].equals(this.f37576D.f27758F)) {
                        this.f37582J = i;
                    }
                }
                break;
            case 2:
                i = 0;
                this.f37584L.add(AnonymousClass34n.f37616M[0]);
                this.f37577E.add(new ArrayList());
                for (int i2 = 0; i2 < AnonymousClass34n.f37612I.length; i2++) {
                    ((List) this.f37577E.get(0)).add(AnonymousClass34n.m18441B(AnonymousClass34n.f37612I[i2], getResources()));
                    if (AnonymousClass34n.f37613J[i2].equals(this.f37576D.f27756D)) {
                        this.f37578F = i2;
                    }
                }
                while (i < AnonymousClass34n.f37614K.length) {
                    this.f37581I.add(AnonymousClass34n.m18444E(AnonymousClass34n.f37614K[i], getResources()));
                    if (AnonymousClass34n.f37615L[i].equals(this.f37576D.f27758F)) {
                        this.f37582J = i;
                    }
                    i++;
                }
                break;
            default:
                AnonymousClass34e.m18436B(this);
                break;
        }
        this.f37585M = (WheelView) view.findViewById(C0164R.id.type);
        this.f37579G = (WheelView) view.findViewById(C0164R.id.metric);
        this.f37583K = (WheelView) view.findViewById(C0164R.id.time);
        int C = (AnonymousClass34e.m18437C(this.f37585M, this.f37584L, this.f37588P) + 0) + AnonymousClass34e.m18437C(this.f37579G, (List) this.f37577E.get(this.f37588P), this.f37578F);
        boolean C2 = AnonymousClass34e.m18437C(this.f37583K, this.f37581I, this.f37582J);
        if (C + C2 == 2) {
            view.findViewById(C2 ? C0164R.id.space_holder_right : C0164R.id.space_holder_left).setVisibility(0);
        }
        this.f37585M.setOnWheelViewListener(new AnonymousClass3x7(this));
        TextView textView = (TextView) view.findViewById(C0164R.id.apply_button);
        if (this.f37575C == AnonymousClass34o.STORY) {
            anonymousClass34b = new AnonymousClass34b(this);
        } else if (this.f37575C == AnonymousClass34o.ACTIVITY_TAB) {
            anonymousClass34b = new AnonymousClass34c(this);
        } else {
            anonymousClass34b = new AnonymousClass34d(this);
        }
        textView.setOnClickListener(anonymousClass34b);
        if (this.f37575C != AnonymousClass34o.ACTIVITY_TAB) {
            if (this.f37575C == AnonymousClass34o.STORY) {
                this.f37586N.setupStoriesEducationView(getContext());
            } else {
                this.f37586N.setupTopPostsEducationView(getContext(), this.f37576D.f27757E);
            }
            this.f37586N.setupEducationButton(view);
        }
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -669389404);
        super.onCreate(bundle);
        this.f37575C = AnonymousClass0Iy.B(getArguments().getString(f37572Q));
        Bundle arguments = getArguments();
        String str = f37573R;
        if (arguments.containsKey(str)) {
            try {
                this.f37576D = AnonymousClass2ad.parseFromJson(getArguments().getString(str));
            } catch (IOException e) {
                e.printStackTrace();
                throw new IllegalArgumentException("exception on parsing insights new api query from json");
            }
        }
        String[] strArr = AnonymousClass34n.f37606C;
        int length = strArr.length;
        int i = length + 1;
        ((String[]) Arrays.copyOf(strArr, i))[length] = "Views";
        String[] strArr2 = (String[]) Arrays.copyOf(AnonymousClass34n.f37606C, length + 2);
        strArr2[length] = "Outbound Clicks";
        strArr2[i] = "Product Opens";
        this.f37587O = new String[][]{r1, r1, r5, r1, strArr2};
        strArr = AnonymousClass34n.f37607D;
        length = strArr.length;
        i = length + 1;
        ((String[]) Arrays.copyOf(strArr, i))[length] = "VIDEO_VIEW_COUNT";
        strArr2 = (String[]) Arrays.copyOf(AnonymousClass34n.f37607D, length + 2);
        strArr2[length] = "SHOPPING_OUTBOUND_CLICK_COUNT";
        strArr2[i] = "SHOPPING_PRODUCT_CLICK_COUNT";
        this.f37580H = new String[][]{r1, r1, r5, r1, strArr2};
        AnonymousClass0cQ.G(this, -934159039, F);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(getContext());
        View inflate = LayoutInflater.from(getContext()).inflate(C0164R.layout.business_insights_filter, null, false);
        InsightsEducationView insightsEducationView = (InsightsEducationView) inflate.findViewById(C0164R.id.business_education_unit_view);
        this.f37586N = insightsEducationView;
        if (insightsEducationView != null && AnonymousClass34o.ACTIVITY_TAB == this.f37575C) {
            this.f37586N.setVisibility(8);
        }
        dialog.setContentView(inflate);
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        inflate.setOnClickListener(new AnonymousClass34a(this));
        inflate.findViewById(C0164R.id.filter).setOnClickListener(null);
        m18438D(inflate);
        return dialog;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1178385165);
        this.f15926D.getWindow().setGravity(80);
        LayoutParams attributes = this.f15926D.getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        this.f37585M.setSelection(this.f37588P);
        this.f37579G.setSelection(this.f37578F);
        this.f37583K.setSelection(this.f37582J);
        AnonymousClass0cQ.G(this, -1177174328, F);
        return null;
    }
}

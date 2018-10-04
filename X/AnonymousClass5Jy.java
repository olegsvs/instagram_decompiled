package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5Jy */
public final class AnonymousClass5Jy extends AnonymousClass0TA {
    /* renamed from: B */
    private final int f62212B;
    /* renamed from: C */
    private final Context f62213C;
    /* renamed from: D */
    private final AnonymousClass5K3 f62214D;
    /* renamed from: E */
    private final AnonymousClass0Cm f62215E;

    public final int getViewTypeCount() {
        return 2;
    }

    public AnonymousClass5Jy(Context context, AnonymousClass0Cm anonymousClass0Cm, int i, AnonymousClass5K3 anonymousClass5K3) {
        this.f62213C = context;
        this.f62215E = anonymousClass0Cm;
        this.f62212B = i;
        this.f62214D = anonymousClass5K3;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        View view2 = view;
        Object obj3 = obj;
        int I = AnonymousClass0cQ.I(this, -1074952431);
        AnonymousClass5Jz anonymousClass5Jz = (AnonymousClass5Jz) obj3;
        int i2;
        switch (i) {
            case 0:
                if (view == null) {
                    ViewGroup viewGroup2 = viewGroup;
                    view2 = LayoutInflater.from(viewGroup2.getContext()).inflate(C0164R.layout.find_people_activation_cards_progress_row, viewGroup2, false);
                    view2.setTag(new AnonymousClass5K0((TextView) view2.findViewById(C0164R.id.title), (TextView) view2.findViewById(C0164R.id.progress)));
                    view2.setBackgroundResource(r5.f62212B);
                }
                Context context = r5.f62213C;
                AnonymousClass0Cm anonymousClass0Cm = r5.f62215E;
                CharSequence charSequence = anonymousClass5Jz.f62218D;
                List<AnonymousClass5Jv> list = anonymousClass5Jz.f62217C;
                AnonymousClass5K0 anonymousClass5K0 = (AnonymousClass5K0) view2.getTag();
                anonymousClass5K0.f62222C.setText(charSequence);
                int i3 = 0;
                i2 = 0;
                for (AnonymousClass5Jv vW : list) {
                    i2 += vW.vW(anonymousClass0Cm);
                }
                String string = context.getString(C0164R.string.activation_card_progress_count, new Object[]{Integer.valueOf(i2), Integer.valueOf(list.size())});
                String string2 = context.getString(C0164R.string.activation_card_progress_complete);
                Object string3 = context.getString(C0164R.string.activation_card_progress, new Object[]{string, string2});
                CharSequence spannableString = new SpannableString(string3);
                int indexOf = string3.indexOf(string);
                if (i2 >= list.size() / 2) {
                    i3 = 1;
                }
                spannableString.setSpan(new ForegroundColorSpan(AnonymousClass0Ca.C(context, i3 != 0 ? C0164R.color.activator_card_progress_good : C0164R.color.activator_card_progress_bad)), indexOf, string.length() + indexOf, 17);
                anonymousClass5K0.f62221B.setText(spannableString);
                AnonymousClass0cQ.H(r5, -1996397437, I);
                return view2;
            case 1:
                if (view == null) {
                    Context context2 = r5.f62213C;
                    int size = anonymousClass5Jz.f62217C.size();
                    int i4 = 0;
                    view2 = LayoutInflater.from(context2).inflate(C0164R.layout.find_people_activation_cards_row, null, false);
                    AnonymousClass5K4 anonymousClass5K4 = new AnonymousClass5K4();
                    view2.setTag(anonymousClass5K4);
                    LinearLayout linearLayout = (LinearLayout) view2.findViewById(C0164R.id.find_people_horizontal_layout);
                    AnonymousClass1jJ anonymousClass1jJ = new AnonymousClass1jJ();
                    while (i4 < size) {
                        View anonymousClass5Jx = new AnonymousClass5Jx(context2);
                        anonymousClass1jJ.E(anonymousClass5Jx);
                        linearLayout.addView(anonymousClass5Jx);
                        i4++;
                    }
                    anonymousClass5K4.f62231B = anonymousClass1jJ.H();
                    view2.setBackgroundResource(r5.f62212B);
                }
                Context context3 = r5.f62213C;
                AnonymousClass0Cm anonymousClass0Cm2 = r5.f62215E;
                List<AnonymousClass5Jv> list2 = anonymousClass5Jz.f62217C;
                boolean z = anonymousClass5Jz.f62219E;
                AnonymousClass0EE anonymousClass0EE = anonymousClass5Jz.f62216B;
                AnonymousClass5K3 anonymousClass5K3 = r5.f62214D;
                AnonymousClass5K4 anonymousClass5K42 = (AnonymousClass5K4) view2.getTag();
                List arrayList = new ArrayList();
                for (AnonymousClass5Jv anonymousClass5Jv : list2) {
                    if (!anonymousClass5Jv.vW(anonymousClass0Cm2)) {
                        arrayList.add(anonymousClass5Jv);
                    }
                }
                for (AnonymousClass5Jv anonymousClass5Jv2 : list2) {
                    if (anonymousClass5Jv2.vW(anonymousClass0Cm2)) {
                        arrayList.add(anonymousClass5Jv2);
                    }
                }
                int i5 = 0;
                int i6 = 0;
                i2 = 0;
                while (i6 < arrayList.size()) {
                    AnonymousClass5Jv anonymousClass5Jv3 = (AnonymousClass5Jv) arrayList.get(i6);
                    AnonymousClass5Jx anonymousClass5Jx2 = (AnonymousClass5Jx) anonymousClass5K42.f62231B.get(i6);
                    if (anonymousClass5Jv3.fTA(context3, anonymousClass0Cm2)) {
                        anonymousClass5Jx2.setVisibility(i5);
                        anonymousClass5Jx2.f62207D.setImageDrawable(AnonymousClass0Ca.E(anonymousClass5Jx2.getContext(), anonymousClass5Jv3.nM()));
                        anonymousClass5Jx2.f62210G.setText(anonymousClass5Jv3.DT());
                        anonymousClass5Jx2.f62209F.setText(anonymousClass5Jv3.US());
                        anonymousClass5Jx2.f62205B.setText(anonymousClass5Jv3.RJ());
                        anonymousClass5Jx2.f62208E.setText(anonymousClass5Jv3.wJ());
                        if (anonymousClass5Jv3.vW(anonymousClass0Cm2)) {
                            anonymousClass5Jx2.f62205B.setVisibility(8);
                            anonymousClass5Jx2.f62208E.setVisibility(0);
                            anonymousClass5Jx2.f62207D.setNormalColorFilter(AnonymousClass0Ca.C(anonymousClass5Jx2.getContext(), C0164R.color.grey_2));
                            anonymousClass5Jx2.f62206C.setVisibility(0);
                        } else {
                            anonymousClass5Jx2.f62205B.setVisibility(0);
                            anonymousClass5Jx2.f62208E.setVisibility(8);
                            anonymousClass5Jx2.f62207D.setNormalColorFilter(0);
                            anonymousClass5Jx2.f62206C.setVisibility(8);
                        }
                        anonymousClass5Jx2.setButtonOnClickListener(new AnonymousClass5K1(anonymousClass5Jv3, i2, anonymousClass0Cm2, anonymousClass0EE));
                        if (z) {
                            anonymousClass5Jx2.setDismissButtonOnClickListener(new AnonymousClass5K2(anonymousClass5Jx2, anonymousClass5Jv3, anonymousClass0Cm2, anonymousClass5K42, anonymousClass5K3));
                        }
                        anonymousClass5Jx2.setDismissButtonVisibility(z);
                        int i7 = i2 + 1;
                        AnonymousClass0NN.B("ig_non_feed_activation_impression", null).F("card_type", anonymousClass5Jv3.lP()).B("pos", i2).H("completed", anonymousClass5Jv3.vW(anonymousClass0Cm2)).R();
                        i2 = i7;
                    } else {
                        anonymousClass5Jx2.setVisibility(8);
                    }
                    i6++;
                    i5 = 0;
                }
                AnonymousClass0cQ.H(r5, 1427901346, I);
                return view2;
            default:
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid view type supplied");
                AnonymousClass0cQ.H(r5, -1889301825, I);
                throw illegalArgumentException;
        }
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        Void voidR = (Void) obj2;
        if (((AnonymousClass5Jz) obj).f62220F) {
            anonymousClass0p9.A(0);
        }
        anonymousClass0p9.A(1);
    }
}

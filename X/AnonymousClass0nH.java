package X;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.imagebutton.IgImageButton;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0nH */
public final class AnonymousClass0nH extends AnonymousClass0TA {
    /* renamed from: B */
    public AnonymousClass0nI f10032B;
    /* renamed from: C */
    public final AnonymousClass0j7 f10033C;
    /* renamed from: D */
    public final AnonymousClass0jN f10034D;
    /* renamed from: E */
    public final AnonymousClass0EE f10035E;
    /* renamed from: F */
    private final Context f10036F;
    /* renamed from: G */
    private AnonymousClass0sf f10037G;

    public final int getViewTypeCount() {
        return 2;
    }

    public AnonymousClass0nH(Context context, AnonymousClass0j7 anonymousClass0j7, AnonymousClass0jN anonymousClass0jN, AnonymousClass0EE anonymousClass0EE) {
        this.f10036F = context;
        this.f10033C = anonymousClass0j7;
        this.f10034D = anonymousClass0jN;
        this.f10035E = anonymousClass0EE;
    }

    /* renamed from: B */
    private View m7628B(int i, ViewGroup viewGroup) {
        switch (i) {
            case 0:
                AnonymousClass0la anonymousClass0la = this.f10037G;
                if (anonymousClass0la == null) {
                    this.f10037G = new AnonymousClass0sf(this.f10036F, 0, false);
                } else {
                    this.f10037G = new AnonymousClass0sf(this.f10036F, 0, false);
                    this.f10037G.AA(anonymousClass0la.BA());
                }
                if (this.f10032B == null) {
                    this.f10032B = new AnonymousClass0nI(this.f10036F, this.f10033C);
                }
                Context context = this.f10036F;
                AnonymousClass0la anonymousClass0la2 = this.f10037G;
                AnonymousClass0nJ anonymousClass0nJ = this.f10032B;
                View inflate = LayoutInflater.from(context).inflate(C0164R.layout.visit_explore, viewGroup, false);
                RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0164R.id.visit_explore_carousel);
                recyclerView.setAdapter(anonymousClass0nJ);
                recyclerView.setLayoutManager(anonymousClass0la2);
                recyclerView.m6955A(new AnonymousClass0ru(0, context.getResources().getDimensionPixelSize(C0164R.dimen.photo_grid_spacing)));
                inflate.setTag(new AnonymousClass0so((TextView) inflate.findViewById(C0164R.id.visit_explore_title), (TextView) inflate.findViewById(C0164R.id.visit_explore_cta), recyclerView));
                return inflate;
            case 1:
                Context context2 = this.f10036F;
                View inflate2 = LayoutInflater.from(context2).inflate(C0164R.layout.visit_explore_grid, viewGroup, false);
                ViewGroup viewGroup2 = (ViewGroup) inflate2.findViewById(C0164R.id.visit_explore_grid_container);
                IgImageButton[][] igImageButtonArr = (IgImageButton[][]) Array.newInstance(IgImageButton.class, new int[]{3, 3});
                for (int i2 = 0; i2 < 3; i2++) {
                    View linearLayout = new LinearLayout(context2);
                    linearLayout.setOrientation(0);
                    if (i2 != 2) {
                        AnonymousClass0Nm.m3448a(linearLayout, context2.getResources().getDimensionPixelSize(C0164R.dimen.photo_grid_spacing));
                    }
                    int i3 = 0;
                    while (i3 < 3) {
                        viewGroup = i3 < 2 ? true : null;
                        LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
                        if (viewGroup != null) {
                            AnonymousClass0eY.m6370D(layoutParams, context2.getResources().getDimensionPixelSize(C0164R.dimen.photo_grid_spacing));
                        }
                        View igImageButton = new IgImageButton(context2);
                        igImageButton.setLayoutParams(layoutParams);
                        igImageButtonArr[i2][i3] = igImageButton;
                        linearLayout.addView(igImageButton);
                        i3++;
                    }
                    viewGroup2.addView(linearLayout, i2);
                }
                inflate2.setTag(new AnonymousClass0sn(inflate2, igImageButtonArr, (TextView) inflate2.findViewById(C0164R.id.visit_explore_title), (TextView) inflate2.findViewById(C0164R.id.visit_explore_cta)));
                return inflate2;
            default:
                throw new UnsupportedOperationException("Unhandled view type");
        }
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        Object obj3 = obj2;
        Object obj4 = obj;
        int I = AnonymousClass0cQ.m5859I(this, -2035038760);
        int i2 = i;
        if (view == null) {
            view = m7628B(i2, viewGroup);
        }
        int I2 = AnonymousClass0cQ.m5859I(this, -670796479);
        AnonymousClass0SC anonymousClass0SC;
        switch (i) {
            case 0:
                AnonymousClass0so anonymousClass0so = (AnonymousClass0so) view.getTag();
                anonymousClass0SC = (AnonymousClass0SC) obj4;
                int i3 = ((AnonymousClass0rA) obj3).f11144B;
                AnonymousClass0j7 anonymousClass0j7 = this.f10033C;
                anonymousClass0so.f11542D.setText(anonymousClass0SC.f4867I);
                anonymousClass0so.f11540B.setText(anonymousClass0SC.f4864F);
                anonymousClass0so.f11540B.setOnClickListener(new AnonymousClass0sq(anonymousClass0j7, anonymousClass0SC, i3));
                AnonymousClass0nI anonymousClass0nI = (AnonymousClass0nI) anonymousClass0so.f11541C.getAdapter();
                List<AnonymousClass0P7> list = anonymousClass0SC.f4863E;
                anonymousClass0nI.f10042F.clear();
                AnonymousClass0nL B = AnonymousClass0nL.m7653B();
                for (AnonymousClass0P7 anonymousClass0P7 : list) {
                    if (!B.m7655B(anonymousClass0P7)) {
                        anonymousClass0nI.f10042F.add(anonymousClass0P7);
                    }
                }
                anonymousClass0nI.notifyDataSetChanged();
                anonymousClass0nI.f10040D = i3;
                AnonymousClass0EE anonymousClass0EE = anonymousClass0j7.f9038B;
                AnonymousClass0NN.m3291B("visit_explore_impression", anonymousClass0EE).m3298F("session_id", anonymousClass0j7.f9042F.kR()).m3294B("m_ix", i3).m3310R();
                break;
            case 1:
                AnonymousClass0sn anonymousClass0sn = (AnonymousClass0sn) view.getTag();
                anonymousClass0SC = (AnonymousClass0SC) obj4;
                AnonymousClass0jN anonymousClass0jN = this.f10034D;
                AnonymousClass0EE anonymousClass0EE2 = this.f10035E;
                anonymousClass0sn.f11539E.setText(anonymousClass0SC.f4867I);
                anonymousClass0sn.f11537C.setText(anonymousClass0SC.f4864F);
                AnonymousClass0nL B2 = AnonymousClass0nL.m7653B();
                List arrayList = new ArrayList();
                for (AnonymousClass0P7 anonymousClass0P72 : anonymousClass0SC.f4863E) {
                    if (!B2.m7655B(anonymousClass0P72)) {
                        arrayList.add(anonymousClass0P72);
                    }
                }
                Iterator it = arrayList.iterator();
                int size = arrayList.size() / 3;
                for (int i4 = 0; i4 < size; i4++) {
                    for (int i5 = 0; i5 < 3; i5++) {
                        IgImageView igImageView = anonymousClass0sn.f11538D[i4][i5];
                        AnonymousClass0P7 anonymousClass0P73 = (AnonymousClass0P7) it.next();
                        igImageView.m8130H();
                        igImageView.setSource(anonymousClass0EE2.getModuleName());
                        igImageView.setUrl(anonymousClass0P73.HA());
                        igImageView.m8137O(anonymousClass0P73.wY());
                        igImageView.m8135M(false);
                        igImageView.m8134L(false);
                        igImageView.m8132J(anonymousClass0P73.iA());
                        igImageView.setEnableTouchOverlay(false);
                        igImageView.setVisibility(0);
                    }
                }
                while (size < 3) {
                    for (i2 = 0; i2 < 3; i2++) {
                        anonymousClass0sn.f11538D[size][i2].setVisibility(8);
                    }
                    size++;
                }
                anonymousClass0sn.f11536B.setOnClickListener(new AnonymousClass0sp(anonymousClass0jN, anonymousClass0SC));
                break;
            default:
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Unhandled view type");
                AnonymousClass0cQ.m5858H(this, -149971208, I2);
                throw unsupportedOperationException;
        }
        AnonymousClass0cQ.m5858H(this, 911906845, I2);
        AnonymousClass0cQ.m5858H(this, 337576300, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass0rA anonymousClass0rA = (AnonymousClass0rA) obj2;
        if (((AnonymousClass0SC) obj).f4865G != AnonymousClass0sr.GRID) {
            anonymousClass0p9.m7787A(1);
        } else {
            anonymousClass0p9.m7787A(0);
        }
    }
}

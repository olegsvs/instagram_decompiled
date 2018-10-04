package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.4rm */
public final class AnonymousClass4rm extends BaseAdapter {
    /* renamed from: B */
    public Context f57948B;
    /* renamed from: C */
    public AnonymousClass0jB f57949C;
    /* renamed from: D */
    public AnonymousClass3QK f57950D;
    /* renamed from: E */
    public AnonymousClass3QL f57951E;

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getItemViewType(int i) {
        return 0;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass4rm(Context context, AnonymousClass3QK anonymousClass3QK, AnonymousClass3QL anonymousClass3QL, AnonymousClass0jB anonymousClass0jB) {
        this.f57948B = context;
        this.f57950D = anonymousClass3QK;
        this.f57951E = anonymousClass3QL;
        this.f57949C = anonymousClass0jB;
    }

    public final int getCount() {
        return this.f57950D.B();
    }

    public final Object getItem(int i) {
        return this.f57950D.A(i);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            if (getItemViewType(i) == 0) {
                view = AnonymousClass0t2.D(this.f57948B, viewGroup);
            }
            throw new UnsupportedOperationException("Unhandled question view type");
        }
        if (getItemViewType(i) == 0) {
            Context context = this.f57948B;
            AnonymousClass0t8 anonymousClass0t8 = (AnonymousClass0t8) view.getTag();
            AnonymousClass3QK anonymousClass3QK = this.f57950D;
            AnonymousClass3QL anonymousClass3QL = this.f57951E;
            AnonymousClass0jB anonymousClass0jB = this.f57949C;
            AnonymousClass0mw A = anonymousClass3QK.A(i);
            if (A.f9946J == AnonymousClass1W0.COMMENT) {
                boolean z = A.f9943G;
                anonymousClass0t8.f11601E.setVisibility(8);
                CharSequence charSequence = A.f9941E;
                if (charSequence != null) {
                    anonymousClass0t8.f11600D.setHint(charSequence);
                }
                anonymousClass0t8.f11600D.setVisibility(0);
                anonymousClass0t8.f11600D.setText(A.f9938B);
                anonymousClass0t8.f11600D.postDelayed(new AnonymousClass3NO(anonymousClass0t8), 100);
                anonymousClass0t8.f11600D.setOnFocusChangeListener(new AnonymousClass3NP(A, anonymousClass0t8));
                anonymousClass0t8.f11600D.setOnTouchListener(new AnonymousClass1V7());
                anonymousClass0t8.f11600D.setImeOptions(6);
                anonymousClass0t8.f11600D.setRawInputType(1);
                anonymousClass0t8.f11600D.setOnEditorActionListener(new AnonymousClass1XG());
                if (z) {
                    AnonymousClass0t2.E(true, anonymousClass0t8.f11598B);
                }
                anonymousClass0t8.f11600D.addTextChangedListener(new AnonymousClass3NK(z, anonymousClass0t8, A));
                if (anonymousClass3QL.f41121C == -1) {
                    int B = AnonymousClass0t2.B(context, anonymousClass0t8.f11601E, anonymousClass3QK);
                    anonymousClass3QL.f41121C = B;
                    anonymousClass0t8.f11602F.getLayoutParams().height = B;
                } else {
                    anonymousClass0t8.f11602F.getLayoutParams().height = anonymousClass3QL.f41121C;
                }
            } else {
                AnonymousClass0mw anonymousClass0mw = A;
                anonymousClass0t8.f11600D.setVisibility(8);
                boolean C = A.C();
                i = new AnonymousClass0t9(context, A, anonymousClass3QK.f41117F, false);
                anonymousClass0t8.f11601E.setAdapter(i);
                anonymousClass0t8.f11601E.setVisibility(0);
                anonymousClass0t8.f11601E.setOnItemClickListener(new AnonymousClass3NM(anonymousClass3QL, context, anonymousClass0mw, C, anonymousClass3QK, anonymousClass0jB, anonymousClass0t8, i));
                if (anonymousClass3QL.f41121C == -1) {
                    anonymousClass0t8.f11601E.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass3NN(anonymousClass0t8, context, anonymousClass3QK, anonymousClass3QL));
                } else {
                    anonymousClass0t8.f11602F.getLayoutParams().height = anonymousClass3QL.f41121C;
                }
            }
            boolean z2 = anonymousClass3QK.f41115D != null;
            if (A.f9946J != AnonymousClass1W0.SINGLE || ((A.f9940D || A.f9939C) && (!A.f9940D || anonymousClass3QK.f41117F))) {
                int i2;
                boolean z3 = false;
                anonymousClass0t8.f11599C.setVisibility(0);
                TextView textView = anonymousClass0t8.f11598B;
                Resources resources = context.getResources();
                if (!A.f9940D) {
                    if (!A.f9939C) {
                        i2 = C0164R.string.next;
                        textView.setText(resources.getString(i2));
                        if (A.f9943G || A.D()) {
                            z3 = true;
                        }
                        AnonymousClass0t2.E(z3, anonymousClass0t8.f11598B);
                        anonymousClass0t8.f11598B.setOnClickListener(new AnonymousClass3NL(anonymousClass3QK, anonymousClass0jB, anonymousClass3QL, z2, A, context));
                    }
                }
                i2 = C0164R.string.survey_submit_button_title;
                textView.setText(resources.getString(i2));
                z3 = true;
                AnonymousClass0t2.E(z3, anonymousClass0t8.f11598B);
                anonymousClass0t8.f11598B.setOnClickListener(new AnonymousClass3NL(anonymousClass3QK, anonymousClass0jB, anonymousClass3QL, z2, A, context));
            } else {
                anonymousClass0t8.f11599C.setVisibility(4);
            }
            return view;
        }
        throw new UnsupportedOperationException("Unhandled question view type");
    }
}

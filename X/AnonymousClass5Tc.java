package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.AllCaps;
import android.text.Layout.Alignment;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewStub;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.ui.text.ConstrainedEditText;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.5Tc */
public final class AnonymousClass5Tc implements OnFocusChangeListener, TextWatcher, AnonymousClass2JW, AnonymousClass0Qd, AnonymousClass4Qi, AnonymousClass0Uy {
    /* renamed from: Q */
    private static final TextPaint f64526Q = new TextPaint();
    /* renamed from: B */
    public final AnonymousClass4Qj f64527B;
    /* renamed from: C */
    public ConstrainedEditText f64528C;
    /* renamed from: D */
    public final Context f64529D;
    /* renamed from: E */
    public View f64530E;
    /* renamed from: F */
    public final ViewStub f64531F;
    /* renamed from: G */
    public final AnonymousClass5cl f64532G;
    /* renamed from: H */
    public AnonymousClass0Ci f64533H;
    /* renamed from: I */
    public final View f64534I;
    /* renamed from: J */
    public RecyclerView f64535J;
    /* renamed from: K */
    private final AnonymousClass0hj f64536K;
    /* renamed from: L */
    private int f64537L;
    /* renamed from: M */
    private String f64538M = JsonProperty.USE_DEFAULT_NAME;
    /* renamed from: N */
    private final AnonymousClass0Uw f64539N;
    /* renamed from: O */
    private final int f64540O;
    /* renamed from: P */
    private final int f64541P;

    public final void Pp() {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final boolean ev(AnonymousClass1lB anonymousClass1lB) {
        return false;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public AnonymousClass5Tc(View view, AnonymousClass0hj anonymousClass0hj, AnonymousClass3e1 anonymousClass3e1, AnonymousClass0Uw anonymousClass0Uw, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass5cl anonymousClass5cl) {
        this.f64529D = view.getContext();
        this.f64536K = anonymousClass0hj;
        AnonymousClass0nJ anonymousClass4Qj = new AnonymousClass4Qj(anonymousClass3e1, this);
        this.f64527B = anonymousClass4Qj;
        anonymousClass4Qj.O(true);
        this.f64539N = anonymousClass0Uw;
        this.f64539N.A(this);
        this.f64532G = anonymousClass5cl;
        Resources resources = this.f64529D.getResources();
        this.f64540O = resources.getDimensionPixelSize(C0164R.dimen.mention_sticker_text_size);
        this.f64541P = (AnonymousClass0Nm.J(this.f64529D) - (resources.getDimensionPixelSize(C0164R.dimen.mention_sticker_padding) * 2)) - (resources.getDimensionPixelSize(C0164R.dimen.contextual_sticker_padding) * 2);
        this.f64534I = view.findViewById(C0164R.id.text_overlay_edit_text_container);
        this.f64531F = (ViewStub) view.findViewById(C0164R.id.mention_sticker_editor_stub);
    }

    /* renamed from: A */
    public final void m26905A() {
        if ((this.f64530E != null ? 1 : null) != null) {
            AnonymousClass14H.E(false, new View[]{this.f64534I, this.f64530E});
            this.f64528C.clearFocus();
            this.f64528C.getText().replace(0, this.f64528C.getText().length(), JsonProperty.USE_DEFAULT_NAME);
            this.f64533H = null;
        }
    }

    /* renamed from: B */
    private static boolean m26903B(AnonymousClass5Tc anonymousClass5Tc, float f) {
        CharSequence obj = anonymousClass5Tc.f64528C.getText().toString();
        TextPaint textPaint = f64526Q;
        textPaint.setTextSize(f);
        float measureText = textPaint.measureText(obj);
        int i = anonymousClass5Tc.f64541P;
        if (((float) i) > measureText && new StaticLayout(obj, f64526Q, i, Alignment.ALIGN_CENTER, 1.0f, null, Float.MIN_VALUE).getLineCount() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    private void m26904C() {
        if (TextUtils.isEmpty(this.f64528C.getText())) {
            this.f64528C.setTextSize(0, (float) this.f64540O);
            return;
        }
        f64526Q.set(this.f64528C.getPaint());
        int i = 2;
        int i2 = (int) (((float) this.f64540O) * 2.0f);
        int floor = ((int) Math.floor((double) (((float) (i2 - 2)) / 2.0f))) + 2;
        while (i < floor) {
            if (AnonymousClass5Tc.m26903B(this, ((float) floor) / 2.0f)) {
                i = floor;
            } else {
                i2 = floor;
            }
            floor = ((int) Math.floor((double) (((float) (i2 - i)) / 2.0f))) + i;
        }
        this.f64528C.setTextSize(0, ((float) floor) / 2.0f);
    }

    public final void Sp(int i, boolean z) {
        if (this.f64537L > i) {
            this.f64528C.clearFocus();
            this.f64539N.C(new AnonymousClass3Dy());
        }
        this.f64537L = i;
        this.f64528C.Sp(i, z);
        View view = this.f64535J;
        if (!z) {
            i = 0;
        }
        AnonymousClass0Nm.W(view, i);
    }

    public final /* bridge */ /* synthetic */ void WBA(Object obj, Object obj2, Object obj3) {
        AnonymousClass3AM anonymousClass3AM = (AnonymousClass3AM) obj2;
        if (AnonymousClass4Qd.f53960B[((AnonymousClass3AM) obj).ordinal()] == 1) {
            AnonymousClass5cl anonymousClass5cl = this.f64532G;
            AnonymousClass4Qe anonymousClass4Qe = new AnonymousClass4Qe(this.f64528C.getText().toString(), this.f64528C.getTextSize(), this.f64533H);
            if (AnonymousClass4Qf.C(anonymousClass4Qe.f53961B)) {
                AnonymousClass2Lb anonymousClass2Lb = new AnonymousClass2Lb();
                anonymousClass2Lb.f29352B = true;
                anonymousClass2Lb.f29354D = 5.0f;
                anonymousClass2Lb.f29355E = 0.425f;
                anonymousClass2Lb.f29364N = "TextOverlayController";
                AnonymousClass2Lc A = anonymousClass2Lb.A();
                List asList = Arrays.asList(new String[]{"mention_sticker_vibrant", "mention_sticker_subtle", "mention_sticker_rainbow"});
                Context context = anonymousClass5cl.f67411J;
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0164R.dimen.contextual_sticker_padding);
                AnonymousClass2bu anonymousClass2eE = new AnonymousClass2eE(context);
                float f = (float) dimensionPixelSize;
                AnonymousClass27w.C(context, anonymousClass2eE, anonymousClass4Qe.f53962C, f, f);
                anonymousClass2eE.H(AnonymousClass4Qf.B(context, anonymousClass4Qe.f53961B));
                anonymousClass2eE.f31957B = anonymousClass4Qe.f53963D;
                AnonymousClass2bu anonymousClass2eE2 = new AnonymousClass2eE(context);
                AnonymousClass27w.C(context, anonymousClass2eE2, anonymousClass4Qe.f53962C, f, f);
                CharSequence charSequence = anonymousClass4Qe.f53961B;
                Resources resources = context.getResources();
                Spannable spannableStringBuilder = new SpannableStringBuilder(charSequence);
                AnonymousClass3GE.C(spannableStringBuilder, resources, resources.getDimensionPixelSize(C0164R.dimen.contextual_sticker_padding));
                anonymousClass2eE2.H(spannableStringBuilder);
                anonymousClass2eE2.f31957B = anonymousClass4Qe.f53963D;
                AnonymousClass2bu anonymousClass2eE3 = new AnonymousClass2eE(context);
                AnonymousClass27w.C(context, anonymousClass2eE3, anonymousClass4Qe.f53962C, f, f);
                charSequence = anonymousClass4Qe.f53961B;
                Resources resources2 = context.getResources();
                Spannable spannableStringBuilder2 = new SpannableStringBuilder(charSequence);
                AnonymousClass3GE.B(spannableStringBuilder2, resources2, resources2.getDimensionPixelSize(C0164R.dimen.contextual_sticker_padding));
                anonymousClass2eE3.H(spannableStringBuilder2);
                anonymousClass2eE3.f31957B = anonymousClass4Qe.f53963D;
                anonymousClass5cl.m28127R(asList, new AnonymousClass2VC(context, new Drawable[]{anonymousClass2eE, anonymousClass2eE2, anonymousClass2eE3}), A);
            }
            anonymousClass5cl.m28131V(AnonymousClass4Pk.AVAILABLE);
            m26905A();
        }
        if (AnonymousClass4Qd.f53960B[anonymousClass3AM.ordinal()] == 1) {
            if ((this.f64530E != null ? 1 : null) == null) {
                this.f64530E = this.f64531F.inflate();
                ConstrainedEditText constrainedEditText = (ConstrainedEditText) this.f64530E.findViewById(C0164R.id.mention_composer);
                this.f64528C = constrainedEditText;
                constrainedEditText.A(this);
                this.f64528C.addTextChangedListener(this);
                this.f64528C.setFilters(new InputFilter[]{new AllCaps()});
                ConstrainedEditText constrainedEditText2 = this.f64528C;
                Resources resources3 = this.f64529D.getResources();
                constrainedEditText2.setHint(AnonymousClass3GE.E(resources3, resources3.getString(C0164R.string.mention_sticker_editor_hint), AnonymousClass4Qf.f53964B, null, resources3.getDimensionPixelSize(C0164R.dimen.contextual_sticker_padding)));
                this.f64528C.setOnFocusChangeListener(this);
                this.f64528C.setText(AnonymousClass4Qf.B(this.f64529D, JsonProperty.USE_DEFAULT_NAME));
                this.f64528C.setTypeface(AnonymousClass0nA.C(this.f64529D.getResources()));
                AnonymousClass2KB.B(this.f64528C, (float) this.f64529D.getResources().getDimensionPixelSize(C0164R.dimen.contextual_sticker_padding));
                RecyclerView recyclerView = (RecyclerView) this.f64530E.findViewById(C0164R.id.mention_suggestions);
                this.f64535J = recyclerView;
                recyclerView.setLayoutManager(new AnonymousClass0rr(this.f64529D, 0, false));
            }
            AnonymousClass14H.H(false, new View[]{this.f64534I, this.f64530E});
            this.f64528C.requestFocus();
            this.f64535J.setAdapter(this.f64527B);
            this.f64532G.m28131V(AnonymousClass4Pk.EDITING_MENTION);
        }
    }

    public final void Wz(ConstrainedEditText constrainedEditText, int i, int i2) {
        if (constrainedEditText.getText().length() > 0 && i < 1) {
            constrainedEditText.setSelection(1, Math.max(i2, 1));
        }
    }

    public final void afterTextChanged(Editable editable) {
        if (editable.length() > 0) {
            if (editable.charAt(0) != '@') {
                editable.insert(0, "@");
                return;
            } else if (editable.length() == 1) {
                CharSequence charSequence = JsonProperty.USE_DEFAULT_NAME;
                this.f64538M = charSequence;
                editable.replace(0, editable.length(), charSequence);
                return;
            } else if (!AnonymousClass4Qf.C(editable)) {
                editable.replace(0, editable.length(), this.f64538M);
                return;
            }
        }
        this.f64527B.P(editable);
        this.f64538M = editable.toString();
        m26904C();
    }

    public final void kf(AnonymousClass0Ci anonymousClass0Ci) {
        this.f64533H = anonymousClass0Ci;
        this.f64528C.getText().replace(0, this.f64528C.getText().length(), anonymousClass0Ci.uT());
        this.f64539N.C(new AnonymousClass3E4());
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.f64536K.A(this);
            AnonymousClass0Nm.k(view);
            return;
        }
        this.f64536K.D(this);
        AnonymousClass0Nm.N(view);
        m26905A();
    }
}

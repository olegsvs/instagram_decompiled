package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;
import java.util.Collections;

/* renamed from: X.5UT */
public final class AnonymousClass5UT implements OnFocusChangeListener, AnonymousClass0Qd, AnonymousClass0Uy, OnSeekBarChangeListener {
    /* renamed from: B */
    public ImageView f64869B;
    /* renamed from: C */
    public final AnonymousClass3DV f64870C;
    /* renamed from: D */
    public final ReboundViewPager f64871D;
    /* renamed from: E */
    public final Context f64872E;
    /* renamed from: F */
    public View f64873F;
    /* renamed from: G */
    public View f64874G;
    /* renamed from: H */
    public final ViewStub f64875H;
    /* renamed from: I */
    public final ReboundViewPager f64876I;
    /* renamed from: J */
    public final CirclePageIndicator f64877J;
    /* renamed from: K */
    public boolean f64878K;
    /* renamed from: L */
    public boolean f64879L;
    /* renamed from: M */
    public final AnonymousClass5cl f64880M;
    /* renamed from: N */
    public final View f64881N;
    /* renamed from: O */
    public int f64882O = -16777216;
    /* renamed from: P */
    public final AnonymousClass2KI f64883P;
    /* renamed from: Q */
    public EditText f64884Q;
    /* renamed from: R */
    public final AnonymousClass2Ga f64885R;
    /* renamed from: S */
    public SeekBar f64886S;
    /* renamed from: T */
    private final CirclePageIndicator f64887T;
    /* renamed from: U */
    private final AnonymousClass0hj f64888U;
    /* renamed from: V */
    private int f64889V;
    /* renamed from: W */
    private final AnonymousClass0Uw f64890W;

    public AnonymousClass5UT(AnonymousClass0Uw anonymousClass0Uw, View view, AnonymousClass0hj anonymousClass0hj, AnonymousClass5cl anonymousClass5cl, AnonymousClass4O1 anonymousClass4O1) {
        this.f64872E = view.getContext();
        this.f64888U = anonymousClass0hj;
        this.f64883P = new AnonymousClass4UM(this);
        this.f64880M = anonymousClass5cl;
        this.f64890W = anonymousClass0Uw;
        anonymousClass0Uw.A(this);
        this.f64881N = view.findViewById(C0164R.id.text_overlay_edit_text_container);
        this.f64875H = (ViewStub) view.findViewById(C0164R.id.slider_sticker_editor_stub);
        this.f64871D = (ReboundViewPager) view.findViewById(C0164R.id.colour_palette_pager);
        this.f64887T = (CirclePageIndicator) view.findViewById(C0164R.id.colour_palette_pager_indicator);
        this.f64876I = (ReboundViewPager) view.findViewById(C0164R.id.emoji_palette_pager);
        this.f64877J = (CirclePageIndicator) view.findViewById(C0164R.id.emoji_palette_pager_indicator);
        AnonymousClass3DV anonymousClass3DV = new AnonymousClass3DV(view.getContext(), AnonymousClass3Dd.f39320C, C0164R.layout.colour_palette, anonymousClass4O1);
        this.f64870C = anonymousClass3DV;
        anonymousClass3DV.f39314B = false;
        this.f64885R = new AnonymousClass2Ga(this.f64872E);
    }

    /* renamed from: B */
    public static void m27005B(AnonymousClass5UT anonymousClass5UT, int i) {
        AnonymousClass1m3.f22522B.D(((LayerDrawable) anonymousClass5UT.f64886S.getProgressDrawable()).getDrawable(i), null);
    }

    /* renamed from: C */
    public static void m27006C(AnonymousClass5UT anonymousClass5UT) {
        if (AnonymousClass5UT.m27007D(anonymousClass5UT)) {
            AnonymousClass14H.E(false, new View[]{anonymousClass5UT.f64881N, anonymousClass5UT.f64874G, anonymousClass5UT.f64871D, anonymousClass5UT.f64887T, anonymousClass5UT.f64876I, anonymousClass5UT.f64877J, anonymousClass5UT.f64869B});
            anonymousClass5UT.f64884Q.clearFocus();
        }
    }

    /* renamed from: D */
    public static boolean m27007D(AnonymousClass5UT anonymousClass5UT) {
        return anonymousClass5UT.f64874G != null ? true : null;
    }

    /* renamed from: E */
    public static void m27008E(AnonymousClass5UT anonymousClass5UT, AnonymousClass196 anonymousClass196) {
        boolean z = false;
        if (anonymousClass196 == null) {
            anonymousClass5UT.f64884Q.setText(JsonProperty.USE_DEFAULT_NAME);
            anonymousClass5UT.f64878K = false;
            AnonymousClass5UT.m27010G(anonymousClass5UT, "😍");
            anonymousClass5UT.f64882O = -16777216;
        } else {
            anonymousClass5UT.f64884Q.setText(anonymousClass196.f15069F);
            EditText editText = anonymousClass5UT.f64884Q;
            editText.setSelection(editText.getText().length());
            AnonymousClass5UT.m27010G(anonymousClass5UT, anonymousClass196.f15067D);
            if (-1 != anonymousClass196.A()) {
                z = true;
            }
            anonymousClass5UT.f64878K = z;
            if (z) {
                anonymousClass5UT.f64882O = anonymousClass196.A();
            } else {
                anonymousClass5UT.f64882O = anonymousClass196.B();
            }
        }
        AnonymousClass5UT.m27014K(anonymousClass5UT);
    }

    /* renamed from: F */
    public static void m27009F(AnonymousClass5UT anonymousClass5UT, int i, int i2) {
        AnonymousClass1m3.f22522B.C(((LayerDrawable) anonymousClass5UT.f64886S.getProgressDrawable()).getDrawable(i), i2);
    }

    /* renamed from: G */
    public static void m27010G(AnonymousClass5UT anonymousClass5UT, String str) {
        anonymousClass5UT.f64886S.setThumb(AnonymousClass4UN.B(anonymousClass5UT.f64872E, str, C0164R.dimen.slider_sticker_slider_handle_size));
        anonymousClass5UT.f64885R.f28354C = str;
    }

    /* renamed from: H */
    public static void m27011H(AnonymousClass5UT anonymousClass5UT) {
        if (anonymousClass5UT.f64878K) {
            anonymousClass5UT.f64869B.setImageResource(C0164R.drawable.text_bg_on);
        } else {
            anonymousClass5UT.f64869B.setImageResource(C0164R.drawable.text_bg_off);
        }
    }

    /* renamed from: I */
    public static void m27012I(AnonymousClass5UT anonymousClass5UT) {
        if (anonymousClass5UT.f64879L) {
            AnonymousClass14H.H(true, new View[]{anonymousClass5UT.f64871D, anonymousClass5UT.f64887T});
            AnonymousClass14H.E(false, new View[]{anonymousClass5UT.f64876I, anonymousClass5UT.f64877J});
            return;
        }
        AnonymousClass14H.H(true, new View[]{anonymousClass5UT.f64876I, anonymousClass5UT.f64877J});
        AnonymousClass14H.E(false, new View[]{anonymousClass5UT.f64871D, anonymousClass5UT.f64887T});
    }

    /* renamed from: J */
    public static void m27013J(AnonymousClass5UT anonymousClass5UT) {
        if (AnonymousClass5UT.m27007D(anonymousClass5UT)) {
            anonymousClass5UT.f64873F.setTranslationY((float) (((AnonymousClass0Nm.I(anonymousClass5UT.f64872E) - anonymousClass5UT.f64889V) - anonymousClass5UT.f64873F.getHeight()) / 2));
            anonymousClass5UT.f64876I.setTranslationY((float) (-anonymousClass5UT.f64889V));
            anonymousClass5UT.f64877J.setTranslationY((float) (-anonymousClass5UT.f64889V));
        }
    }

    /* renamed from: K */
    public static void m27014K(AnonymousClass5UT anonymousClass5UT) {
        if (anonymousClass5UT.f64878K) {
            anonymousClass5UT.f64884Q.setTextColor(AnonymousClass26h.C(anonymousClass5UT.f64882O));
            ((GradientDrawable) anonymousClass5UT.f64873F.getBackground()).setColor(anonymousClass5UT.f64882O);
        } else {
            anonymousClass5UT.f64884Q.setTextColor(anonymousClass5UT.f64882O);
            ((GradientDrawable) anonymousClass5UT.f64873F.getBackground()).setColor(-1);
        }
        if (anonymousClass5UT.f64878K) {
            AnonymousClass5UT.m27009F(anonymousClass5UT, 0, AnonymousClass26h.E(anonymousClass5UT.f64882O));
            if (anonymousClass5UT.f64884Q.getCurrentTextColor() == -1) {
                AnonymousClass5UT.m27009F(anonymousClass5UT, 1, -1);
            } else {
                AnonymousClass5UT.m27005B(anonymousClass5UT, 1);
            }
        } else {
            AnonymousClass5UT.m27005B(anonymousClass5UT, 0);
            AnonymousClass5UT.m27005B(anonymousClass5UT, 1);
        }
        if (anonymousClass5UT.f64878K) {
            anonymousClass5UT.f64884Q.setHintTextColor(AnonymousClass26h.E(anonymousClass5UT.f64882O));
        } else {
            anonymousClass5UT.f64884Q.setHintTextColor(AnonymousClass0Ca.C(anonymousClass5UT.f64872E, C0164R.color.slider_sticker_question_hint));
        }
    }

    public final void Sp(int i, boolean z) {
        if (this.f64889V > i) {
            this.f64884Q.clearFocus();
            this.f64890W.C(new AnonymousClass3Dy());
        }
        this.f64889V = i;
        AnonymousClass5UT.m27013J(this);
    }

    public final /* bridge */ /* synthetic */ void WBA(Object obj, Object obj2, Object obj3) {
        AnonymousClass3AM anonymousClass3AM = (AnonymousClass3AM) obj2;
        if (AnonymousClass4UL.f54583B[((AnonymousClass3AM) obj).ordinal()] == 1) {
            AnonymousClass5cl anonymousClass5cl = this.f64880M;
            AnonymousClass2GV anonymousClass2GV = new AnonymousClass2GV();
            anonymousClass2GV.f28305C = ((AnonymousClass2bu) this.f64886S.getThumb()).f31514M.toString();
            anonymousClass2GV.f28306D = this.f64884Q.getText().toString();
            anonymousClass2GV.f28307E = this.f64884Q.getCurrentTextColor();
            anonymousClass2GV.f28304B = this.f64878K ? this.f64882O : -1;
            AnonymousClass196 anonymousClass196 = new AnonymousClass196(anonymousClass2GV);
            anonymousClass5cl.m28131V(AnonymousClass4Pk.AVAILABLE);
            AnonymousClass5cl.m28091O(anonymousClass5cl);
            Drawable anonymousClass2Gd = new AnonymousClass2Gd(anonymousClass5cl.f67411J);
            anonymousClass2Gd.f28374C = true;
            anonymousClass2Gd.invalidateSelf();
            anonymousClass2Gd.f28377F = anonymousClass196;
            AnonymousClass2Gd.B(anonymousClass2Gd);
            AnonymousClass2Lb anonymousClass2Lb = new AnonymousClass2Lb();
            anonymousClass2Lb.f29352B = true;
            anonymousClass2Lb.f29354D = 1.5f;
            anonymousClass2Lb.f29355E = 0.25f;
            anonymousClass2Lb.f29364N = "TextOverlayController";
            AnonymousClass2Lc A = anonymousClass2Lb.A();
            String str = anonymousClass196.f15067D;
            AnonymousClass27n anonymousClass27n = new AnonymousClass27n();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("emoji_slider_");
            stringBuilder.append(str);
            anonymousClass27n.f26370G = stringBuilder.toString();
            AnonymousClass27l anonymousClass27l = new AnonymousClass27l("slider_sticker_bundle_id", Collections.singletonList(anonymousClass27n));
            anonymousClass27l.f26359E = AnonymousClass27p.SLIDER;
            anonymousClass5cl.m28127R(anonymousClass27l.A(), anonymousClass2Gd, A);
            this.f64884Q.removeTextChangedListener(this.f64883P);
            AnonymousClass5UT.m27008E(this, null);
            AnonymousClass5UT.m27006C(this);
        }
        if (AnonymousClass4UL.f54583B[anonymousClass3AM.ordinal()] == 1) {
            AnonymousClass196 anonymousClass1962 = ((AnonymousClass3EY) obj3).f39342B;
            if (!AnonymousClass5UT.m27007D(this)) {
                this.f64874G = this.f64875H.inflate();
                View findViewById = this.f64874G.findViewById(C0164R.id.slider_sticker_editor);
                this.f64873F = findViewById;
                AnonymousClass0Nm.U(findViewById, new AnonymousClass4UI(this));
                EditText editText = (EditText) this.f64873F.findViewById(C0164R.id.slider_sticker_question);
                this.f64884Q = editText;
                editText.setOnFocusChangeListener(this);
                AnonymousClass2KJ.B(this.f64884Q);
                if (VERSION.SDK_INT >= 21) {
                    this.f64884Q.setLetterSpacing(-0.03f);
                }
                this.f64884Q.setOnClickListener(new AnonymousClass4UJ(this));
                SeekBar seekBar = (SeekBar) this.f64873F.findViewById(C0164R.id.slider_sticker_slider);
                this.f64886S = seekBar;
                seekBar.setOnSeekBarChangeListener(this);
                AnonymousClass5UT.m27010G(this, "😍");
                this.f64874G.findViewById(C0164R.id.slider_particle_system).setBackgroundDrawable(this.f64885R);
                this.f64876I.setAdapter(new AnonymousClass4UH(this.f64872E, this));
                this.f64877J.A(0, 5);
                this.f64876I.A(this.f64877J);
                ImageView imageView = (ImageView) this.f64874G.findViewById(C0164R.id.slider_sticker_background_button);
                this.f64869B = imageView;
                imageView.setImageResource(C0164R.drawable.text_bg_off);
                AnonymousClass15z anonymousClass15z = new AnonymousClass15z(this.f64869B);
                anonymousClass15z.f14385E = new AnonymousClass4UK(this);
                anonymousClass15z.A();
            }
            AnonymousClass14H.H(false, new View[]{this.f64881N, this.f64874G, this.f64869B});
            this.f64884Q.requestFocus();
            this.f64886S.setProgress(10);
            AnonymousClass5UT.m27008E(this, anonymousClass1962);
            if (anonymousClass1962 == null) {
                this.f64879L = false;
            }
            AnonymousClass5UT.m27011H(this);
            AnonymousClass5UT.m27012I(this);
            this.f64884Q.addTextChangedListener(this.f64883P);
            this.f64871D.setAdapter(this.f64870C);
            this.f64880M.m28131V(AnonymousClass4Pk.EDITING_SLIDER);
        }
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.f64888U.A(this);
            AnonymousClass0Nm.k(view);
            return;
        }
        this.f64888U.D(this);
        AnonymousClass0Nm.N(view);
        AnonymousClass5UT.m27006C(this);
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            this.f64885R.B(((this.f64873F.getX() + ((float) this.f64873F.getPaddingLeft())) + ((float) this.f64886S.getPaddingLeft())) + ((float) this.f64886S.getThumb().getBounds().left), ((this.f64873F.getY() + ((float) this.f64873F.getPaddingTop())) + ((float) this.f64886S.getTop())) + ((float) this.f64886S.getThumb().getBounds().top));
            this.f64885R.C(((float) i) / 100.0f);
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f64879L = false;
        AnonymousClass5UT.m27012I(this);
        this.f64885R.A();
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        seekBar = this.f64885R;
        seekBar.f28355D.add(0, seekBar.f28353B);
        seekBar.f28353B = null;
    }
}

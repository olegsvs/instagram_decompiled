package com.instagram.arlink.ui;

import X.AnonymousClass0Ci;
import X.AnonymousClass0Cm;
import X.AnonymousClass0Co;
import X.AnonymousClass0Lq;
import X.AnonymousClass0Lu;
import X.AnonymousClass0Nm;
import X.AnonymousClass0QH;
import X.AnonymousClass0cQ;
import X.AnonymousClass0er;
import X.AnonymousClass14H;
import X.AnonymousClass1Ys;
import X.AnonymousClass2p1;
import X.AnonymousClass31B;
import X.AnonymousClass31I;
import X.AnonymousClass31J;
import X.AnonymousClass31K;
import X.AnonymousClass31L;
import X.AnonymousClass4AI;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.LinearGradient;
import android.graphics.Paint.FontMetrics;
import android.graphics.Shader.TileMode;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.C0164R;
import com.facebook.forker.Process;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.nametag.NametagCardView;
import com.instagram.ui.widget.nametag.UsernameTextView;
import com.instagram.user.follow.FollowButton;

public class NametagResultCardView extends FrameLayout {
    /* renamed from: B */
    public View f37040B;
    /* renamed from: C */
    public boolean f37041C;
    /* renamed from: D */
    public int f37042D;
    /* renamed from: E */
    public AnonymousClass4AI f37043E;
    /* renamed from: F */
    public boolean f37044F;
    /* renamed from: G */
    public TextView f37045G;
    /* renamed from: H */
    public boolean f37046H;
    /* renamed from: I */
    public AnonymousClass0Lu f37047I;
    /* renamed from: J */
    public CircularImageView f37048J;
    /* renamed from: K */
    public View f37049K;
    /* renamed from: L */
    public UsernameTextView f37050L;
    /* renamed from: M */
    public TextView f37051M;
    /* renamed from: N */
    private int f37052N;
    /* renamed from: O */
    private int f37053O;
    /* renamed from: P */
    private View f37054P;
    /* renamed from: Q */
    private FollowButton f37055Q;
    /* renamed from: R */
    private final AnonymousClass0QH f37056R = new AnonymousClass31J(this);
    /* renamed from: S */
    private TextView f37057S;
    /* renamed from: T */
    private final Runnable f37058T = new AnonymousClass31I(this);

    public NametagResultCardView(Context context) {
        super(context);
        m18226C();
    }

    public NametagResultCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m18226C();
    }

    public NametagResultCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m18226C();
    }

    /* renamed from: A */
    public final void m18227A(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Ci anonymousClass0Ci) {
        AnonymousClass0Lq Q = AnonymousClass0er.B(anonymousClass0Cm).Q(anonymousClass0Ci);
        boolean z = Q == AnonymousClass0Lq.FollowStatusFollowing && anonymousClass0Ci.n();
        this.f37046H = z;
        if (AnonymousClass0Co.D(anonymousClass0Cm, anonymousClass0Ci)) {
            this.f37055Q.setVisibility(8);
            this.f37057S.setText(C0164R.string.follow_status_you);
            this.f37057S.setVisibility(0);
        } else if (Q == AnonymousClass0Lq.FollowStatusFollowing) {
            this.f37055Q.setVisibility(8);
            TextView textView = this.f37057S;
            Resources resources = getResources();
            int i = this.f37044F ? C0164R.string.follow_status_now_following : this.f37046H ? C0164R.string.follow_status_mutual_following : C0164R.string.follow_status_already_following;
            textView.setText(AnonymousClass2p1.m17314D(resources, i, anonymousClass0Ci.uT()));
            this.f37057S.setVisibility(0);
        } else if (Q == AnonymousClass0Lq.FollowStatusRequested) {
            this.f37055Q.setVisibility(8);
            this.f37057S.setText(AnonymousClass2p1.m17314D(getResources(), C0164R.string.follow_status_requested, anonymousClass0Ci.uT()));
            this.f37057S.setVisibility(0);
        } else {
            this.f37055Q.setVisibility(0);
            this.f37055Q.A(anonymousClass0Cm, anonymousClass0Ci, this.f37056R);
            this.f37057S.setVisibility(8);
        }
        if (this.f37041C) {
            if (this.f37044F || !this.f37046H) {
                AnonymousClass14H.H(false, new View[]{this.f37049K});
            } else {
                this.f37049K.setAlpha(0.0f);
                this.f37043E.m23459C(this.f37042D, this.f37052N, false);
            }
        }
        this.f37051M.setOnClickListener(new AnonymousClass1Ys(this, anonymousClass0Ci));
        int i2 = this.f37053O;
        if (i2 > 0) {
            AnonymousClass0Nm.j(this.f37040B, i2);
            this.f37040B.setVisibility(0);
            return;
        }
        this.f37049K.setVisibility(8);
    }

    /* renamed from: B */
    public static void m18225B(NametagResultCardView nametagResultCardView) {
        int i;
        int i2;
        int i3 = (int) (((float) nametagResultCardView.f37042D) * 0.05f);
        nametagResultCardView.setPadding(i3, i3, i3, i3);
        int i4 = 2;
        nametagResultCardView.f37053O = nametagResultCardView.f37042D - (i3 * 2);
        View view = nametagResultCardView.f37049K;
        i3 = nametagResultCardView.f37053O;
        AnonymousClass0Nm.X(view, i3, i3);
        View view2 = nametagResultCardView.f37048J;
        int i5 = nametagResultCardView.f37042D;
        AnonymousClass0Nm.X(view2, (int) (((float) i5) * 0.25f), (int) (((float) i5) * 0.25f));
        FontMetrics fontMetrics = nametagResultCardView.f37050L.getPaint().getFontMetrics();
        nametagResultCardView.f37050L.m20533B((((float) nametagResultCardView.f37042D) * 0.038f) - fontMetrics.ascent, (int) (((float) nametagResultCardView.f37042D) * 0.83f));
        AnonymousClass31B anonymousClass31B = AnonymousClass31B.COLOR;
        AnonymousClass0Lu anonymousClass0Lu = nametagResultCardView.f37047I;
        if (anonymousClass0Lu != null) {
            anonymousClass31B = AnonymousClass31B.m18212B(anonymousClass0Lu.f3306E);
            i = nametagResultCardView.f37047I.f3305D;
            i2 = nametagResultCardView.f37047I.f3304C;
        } else {
            i = 2;
            i2 = -16777216;
        }
        if (anonymousClass31B == AnonymousClass31B.EMOJI && r2 == 0) {
            anonymousClass31B = AnonymousClass31B.COLOR;
            i2 = -16777216;
        } else {
            i4 = i;
        }
        switch (AnonymousClass31L.f37039B[anonymousClass31B.ordinal()]) {
            case 1:
                nametagResultCardView.setGradientTintColor(i4);
                break;
            case 2:
                nametagResultCardView.f37050L.getPaint().setShader(null);
                nametagResultCardView.f37050L.setTextColor(i2);
                break;
            case 3:
                nametagResultCardView.f37050L.getPaint().setShader(null);
                nametagResultCardView.f37050L.setTextColor(-16777216);
                break;
            default:
                break;
        }
        View view3 = nametagResultCardView.f37050L;
        LayoutParams layoutParams = (LayoutParams) view3.getLayoutParams();
        layoutParams.topMargin = (int) (((float) nametagResultCardView.f37042D) * 0.057f);
        view3.setLayoutParams(layoutParams);
        nametagResultCardView.f37045G.measure(MeasureSpec.makeMeasureSpec((int) (((float) nametagResultCardView.f37042D) * 0.83f), Process.WAIT_RESULT_TIMEOUT), MeasureSpec.makeMeasureSpec(0, 0));
        FontMetrics fontMetrics2 = nametagResultCardView.f37045G.getPaint().getFontMetrics();
        view3 = nametagResultCardView.f37045G;
        layoutParams = (LayoutParams) view3.getLayoutParams();
        layoutParams.topMargin = (int) ((((((float) nametagResultCardView.f37042D) * 0.057f) - fontMetrics.bottom) + fontMetrics2.top) - fontMetrics2.ascent);
        view3.setLayoutParams(layoutParams);
        nametagResultCardView.f37049K.setVisibility(0);
        nametagResultCardView.post(nametagResultCardView.f37058T);
    }

    /* renamed from: C */
    private void m18226C() {
        inflate(getContext(), C0164R.layout.nametag_result_card_layout, this);
        ((LinearLayout) findViewById(C0164R.id.nametag_card_container)).setLayoutTransition(new LayoutTransition());
        this.f37054P = findViewById(C0164R.id.dismiss_button);
        this.f37049K = findViewById(C0164R.id.user_container);
        this.f37048J = (CircularImageView) findViewById(C0164R.id.profile_photo);
        this.f37050L = (UsernameTextView) findViewById(C0164R.id.username_view);
        this.f37045G = (TextView) findViewById(C0164R.id.full_name_view);
        this.f37040B = findViewById(C0164R.id.button_container);
        FollowButton followButton = (FollowButton) findViewById(C0164R.id.follow_button);
        this.f37055Q = followButton;
        followButton.setClickPoint("nametag");
        this.f37057S = (TextView) findViewById(C0164R.id.follow_status_view);
        this.f37051M = (TextView) findViewById(C0164R.id.view_profile_button);
        if (VERSION.SDK_INT < 21) {
            this.f37051M.getPaint().setFakeBoldText(true);
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        setMeasuredDimension(measuredWidth, Math.max(getMeasuredHeight(), measuredWidth));
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.N(this, -1730258369);
        super.onSizeChanged(i, i2, i3, i4);
        this.f37042D = i;
        this.f37052N = i2;
        if (i != i3) {
            m18225B(this);
        } else if (i < i2 && i3 == i4 && !this.f37041C) {
            if (this.f37046H) {
                this.f37043E.m23459C(i, i2, true);
                AnonymousClass14H.C(this.f37049K).A(1.0f, 0.0f).K(true).N();
            }
            this.f37041C = true;
        }
        AnonymousClass0cQ.O(this, -18060450, N);
    }

    public void setDelegate(AnonymousClass4AI anonymousClass4AI) {
        this.f37043E = anonymousClass4AI;
        this.f37054P.setOnClickListener(new AnonymousClass31K(this));
    }

    private void setGradientTintColor(int i) {
        if (i >= NametagCardView.f43797M.length) {
            i = Math.min(2, NametagCardView.f43797M.length - 1);
        }
        this.f37050L.getPaint().setShader(new LinearGradient((float) this.f37050L.getMeasuredWidth(), 0.0f, 0.0f, (float) this.f37050L.getMeasuredHeight(), NametagCardView.f43797M[i][0], NametagCardView.f43797M[i][1], TileMode.CLAMP));
    }
}

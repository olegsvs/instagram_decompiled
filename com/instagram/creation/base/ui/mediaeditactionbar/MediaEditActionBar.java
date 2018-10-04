package com.instagram.creation.base.ui.mediaeditactionbar;

import X.AnonymousClass0F4;
import X.AnonymousClass0F8;
import X.AnonymousClass0G5;
import X.AnonymousClass0PP;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eU;
import X.AnonymousClass0eV;
import X.AnonymousClass27D;
import X.AnonymousClass3DF;
import X.AnonymousClass3DG;
import X.AnonymousClass3Hb;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.facebook.C0164R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.ui.widget.base.TriangleSpinner;

public class MediaEditActionBar extends ViewSwitcher implements AnonymousClass0F8 {
    /* renamed from: M */
    public static float f39194M = 1.5f;
    /* renamed from: B */
    public final TextView f39195B;
    /* renamed from: C */
    public final ColorFilterAlphaImageView f39196C;
    /* renamed from: D */
    public boolean f39197D;
    /* renamed from: E */
    public final boolean f39198E;
    /* renamed from: F */
    public final TextView f39199F;
    /* renamed from: G */
    public final LinearLayout f39200G;
    /* renamed from: H */
    public final TextView f39201H;
    /* renamed from: I */
    public final TriangleSpinner f39202I;
    /* renamed from: J */
    private final Paint f39203J;
    /* renamed from: K */
    private boolean f39204K;
    /* renamed from: L */
    private boolean f39205L = false;

    public MediaEditActionBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(C0164R.layout.media_edit_action_bar, this);
        ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) findViewById(C0164R.id.button_back);
        this.f39196C = colorFilterAlphaImageView;
        colorFilterAlphaImageView.setOnClickListener(new AnonymousClass3DF(this));
        this.f39201H = (TextView) findViewById(C0164R.id.action_bar_textview_title);
        this.f39202I = (TriangleSpinner) findViewById(C0164R.id.user_spinner);
        this.f39199F = (TextView) findViewById(C0164R.id.next_button_textview);
        this.f39198E = AnonymousClass27D.m14491D(getContext());
        Paint paint = new Paint();
        this.f39203J = paint;
        paint.setColor(AnonymousClass0G5.D(getContext(), C0164R.attr.creationDividerColor));
        this.f39203J.setStyle(Style.STROKE);
        this.f39203J.setStrokeWidth(1.0f);
        if (this.f39198E) {
            this.f39195B = null;
        } else {
            View frameLayout = new FrameLayout(getContext());
            View inflate = LayoutInflater.from(context).inflate(C0164R.layout.accept_reject_edit_buttons_small, frameLayout, false);
            inflate.setId(C0164R.id.primary_accept_buttons);
            View inflate2 = LayoutInflater.from(context).inflate(C0164R.layout.accept_reject_edit_buttons_small, frameLayout, false);
            inflate2.setId(C0164R.id.secondary_accept_buttons);
            setupDividers(inflate);
            setupDividers(inflate2);
            frameLayout.addView(inflate);
            frameLayout.addView(inflate2);
            addView(frameLayout);
            this.f39195B = (TextView) findViewById(C0164R.id.primary_accept_buttons).findViewById(C0164R.id.adjust_title);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f39200G = linearLayout;
        linearLayout.setId(C0164R.id.creation_secondary_actions);
        this.f39200G.setGravity(17);
        ((LinearLayout) getChildAt(0)).addView(this.f39200G, 1, new LayoutParams(0, -1, 1.0f));
        this.f39201H.setVisibility(8);
    }

    /* renamed from: A */
    public final void m19052A() {
        setupBackButton(AnonymousClass3DG.BACK);
        this.f39199F.setVisibility(0);
        LinearLayout linearLayout = this.f39200G;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        if (this.f39204K) {
            this.f39201H.setText(C0164R.string.new_profile_photo);
            this.f39201H.setVisibility(0);
            this.f39202I.setVisibility(8);
        } else if (this.f39205L) {
            this.f39201H.setVisibility(8);
            this.f39202I.setVisibility(0);
        } else {
            this.f39201H.setText(C0164R.string.share_photos_to);
            this.f39201H.setVisibility(0);
            this.f39202I.setVisibility(8);
        }
    }

    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.dispatchDraw(canvas);
        if (this.f39197D) {
            int left = getLeft();
            float bottom = (float) (getBottom() - 1);
            canvas2.drawLine((float) left, bottom, (float) getRight(), bottom, this.f39203J);
        }
    }

    public TriangleSpinner getUserSpinner() {
        return this.f39202I;
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.N(this, 1311023865);
        super.onAttachedToWindow();
        ((AnonymousClass0PP) getContext()).AJA(this);
        AnonymousClass0cQ.O(this, -464394390, N);
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.N(this, -49481709);
        super.onDetachedFromWindow();
        AnonymousClass0F4.f2058E.D(AnonymousClass3Hb.class, this);
        AnonymousClass0cQ.O(this, -1598417570, N);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onEvent(X.AnonymousClass0F6 r8) {
        /*
        r7 = this;
        r0 = 739066455; // 0x2c0d4257 float:2.0074131E-12 double:3.651473454E-315;
        r2 = X.AnonymousClass0cQ.I(r7, r0);
        r8 = (X.AnonymousClass3Hb) r8;
        r0 = -1397635106; // 0xffffffffacb1c7de float:-5.0528323E-12 double:NaN;
        r3 = X.AnonymousClass0cQ.I(r7, r0);
        r1 = r8.f39847D;
        r0 = com.instagram.creation.state.CreationState.ADJUST;
        r4 = 8;
        r5 = 0;
        if (r1 == r0) goto L_0x004e;
    L_0x0019:
        r1 = r8.f39847D;
        r0 = com.instagram.creation.state.CreationState.ALBUM_EDIT;
        if (r1 == r0) goto L_0x004e;
    L_0x001f:
        r1 = r8.f39847D;
        r0 = com.instagram.creation.state.CreationState.PHOTO_EDIT;
        if (r1 == r0) goto L_0x004e;
    L_0x0025:
        r1 = r8.f39847D;
        r0 = com.instagram.creation.state.CreationState.VIDEO_EDIT;
        if (r1 == r0) goto L_0x004e;
    L_0x002b:
        r1 = r8.f39847D;
        r0 = com.instagram.creation.state.CreationState.MANAGE;
        if (r1 == r0) goto L_0x004e;
    L_0x0031:
        r1 = r8.f39847D;
        r0 = com.instagram.creation.state.CreationState.SHARE;
        if (r1 == r0) goto L_0x004e;
    L_0x0037:
        r1 = r8.f39847D;
        r0 = com.instagram.creation.state.CreationState.MANAGE_DRAFTS;
        if (r1 == r0) goto L_0x004e;
    L_0x003d:
        r1 = r8.f39847D;
        r0 = com.instagram.creation.state.CreationState.ADVANCED_SETTINGS;
        if (r1 == r0) goto L_0x004e;
    L_0x0043:
        r1 = r8.f39847D;
        r0 = com.instagram.creation.state.CreationState.LIMIT_LOCATIONS;
        if (r1 != r0) goto L_0x004a;
    L_0x0049:
        goto L_0x004e;
    L_0x004a:
        r7.setVisibility(r4);
        goto L_0x0051;
    L_0x004e:
        r7.setVisibility(r5);
    L_0x0051:
        r1 = r8.f39847D;
        r0 = com.instagram.creation.state.CreationState.PHOTO_EDIT;
        r6 = 1;
        if (r1 == r0) goto L_0x0067;
    L_0x0058:
        r1 = r8.f39847D;
        r0 = com.instagram.creation.state.CreationState.VIDEO_EDIT;
        if (r1 == r0) goto L_0x0067;
    L_0x005e:
        r1 = r8.f39847D;
        r0 = com.instagram.creation.state.CreationState.ADJUST;
        if (r1 != r0) goto L_0x0065;
    L_0x0064:
        goto L_0x0067;
    L_0x0065:
        r1 = 0;
        goto L_0x0068;
    L_0x0067:
        r1 = 1;
    L_0x0068:
        r0 = r7.f39197D;
        if (r1 == r0) goto L_0x0071;
    L_0x006c:
        r7.f39197D = r1;
        r7.invalidate();
    L_0x0071:
        r0 = r7.f39199F;
        r0.setVisibility(r4);
        r0 = r7.f39202I;
        r0.setVisibility(r4);
        r0 = r8.f39847D;
        r0 = r0.ordinal();
        switch(r0) {
            case 0: goto L_0x014a;
            case 1: goto L_0x00a4;
            case 2: goto L_0x00ea;
            case 9: goto L_0x0086;
            case 11: goto L_0x0133;
            case 12: goto L_0x0100;
            case 13: goto L_0x0117;
            case 14: goto L_0x012f;
            case 15: goto L_0x00c7;
            case 17: goto L_0x0117;
            default: goto L_0x0084;
        };
    L_0x0084:
        goto L_0x017f;
    L_0x0086:
        r0 = r7.f39196C;
        r0.setVisibility(r5);
        r0 = r7.f39201H;
        r0.setVisibility(r5);
        r1 = r7.f39201H;
        r0 = 2131691517; // 0x7f0f07fd float:1.9012108E38 double:1.053195546E-314;
        r1.setText(r0);
        r0 = r7.f39200G;
        r0.setVisibility(r4);
        r0 = r7.f39199F;
        r0.setVisibility(r4);
        goto L_0x017f;
    L_0x00a4:
        r0 = r7.f39196C;
        r0.setVisibility(r5);
        r0 = X.AnonymousClass3DG.BACK;
        r7.setupBackButton(r0);
        r0 = r7.f39201H;
        r0.setVisibility(r5);
        r1 = r7.f39201H;
        r0 = 2131689653; // 0x7f0f00b5 float:1.9008327E38 double:1.053194625E-314;
        r1.setText(r0);
        r0 = r7.f39200G;
        r0.setVisibility(r4);
        r0 = r7.f39199F;
        r0.setVisibility(r4);
        goto L_0x017f;
    L_0x00c7:
        r0 = r7.f39196C;
        r0.setVisibility(r5);
        r0 = X.AnonymousClass3DG.CANCEL;
        r7.setupBackButton(r0);
        r0 = r7.f39201H;
        r0.setVisibility(r5);
        r1 = r7.f39201H;
        r0 = 2131692156; // 0x7f0f0a7c float:1.9013404E38 double:1.053195862E-314;
        r1.setText(r0);
        r0 = r7.f39200G;
        r0.setVisibility(r4);
        r0 = r7.f39199F;
        r0.setVisibility(r4);
        goto L_0x017f;
    L_0x00ea:
        r0 = r7.f39199F;
        r0.setVisibility(r5);
        r0 = r7.f39201H;
        r0.setVisibility(r4);
        r0 = r7.f39196C;
        r0.setVisibility(r5);
        r0 = r7.f39200G;
        r0.setVisibility(r5);
        goto L_0x017f;
    L_0x0100:
        r0 = X.AnonymousClass3DG.CANCEL;
        r7.setupBackButton(r0);
        r0 = r7.f39201H;
        r0.setVisibility(r5);
        r0 = r7.f39199F;
        r0.setVisibility(r5);
        r0 = r7.f39200G;
        if (r0 == 0) goto L_0x017f;
    L_0x0113:
        r0.setVisibility(r4);
        goto L_0x017f;
    L_0x0117:
        r0 = r7.f39199F;
        r0.setVisibility(r5);
        r0 = r7.f39201H;
        r0.setVisibility(r4);
        r0 = r7.f39196C;
        r0.setVisibility(r5);
        r0 = r7.f39200G;
        r0.setVisibility(r5);
        r7.setDisplayedChild(r5);
        goto L_0x017f;
    L_0x012f:
        r7.m19052A();
        goto L_0x017f;
    L_0x0133:
        r0 = X.AnonymousClass3DG.FINISH;
        r7.setupBackButton(r0);
        r1 = r7.f39201H;
        r0 = 2131691662; // 0x7f0f088e float:1.9012402E38 double:1.0531956177E-314;
        r1.setText(r0);
        r0 = r7.f39201H;
        r0.setVisibility(r5);
        r0 = r7.f39200G;
        if (r0 == 0) goto L_0x017f;
    L_0x0149:
        goto L_0x0113;
    L_0x014a:
        r0 = r7.f39198E;
        if (r0 == 0) goto L_0x016f;
    L_0x014e:
        r1 = r7.f39201H;
        r0 = r8.f39845B;
        r0 = r0.f39825B;
        r0 = (X.AnonymousClass3zU) r0;
        r0 = r0.f47987B;
        r1.setText(r0);
        r0 = r7.f39201H;
        r0.setVisibility(r5);
        r0 = X.AnonymousClass3DG.GONE;
        r7.setupBackButton(r0);
        r0 = r7.f39196C;
        r0.setVisibility(r4);
        r0 = r7.f39200G;
        if (r0 == 0) goto L_0x017f;
    L_0x016e:
        goto L_0x0113;
    L_0x016f:
        r1 = r7.f39195B;
        r0 = r8.f39845B;
        r0 = r0.f39825B;
        r0 = (X.AnonymousClass3zU) r0;
        r0 = r0.f47987B;
        r1.setText(r0);
        r7.setDisplayedChild(r6);
    L_0x017f:
        r0 = 436187193; // 0x19ffb039 float:2.6437558E-23 double:2.15505107E-315;
        X.AnonymousClass0cQ.H(r7, r0, r3);
        r0 = -1581578398; // 0xffffffffa1bb0762 float:-1.2673567E-18 double:NaN;
        X.AnonymousClass0cQ.H(r7, r0, r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar.onEvent(X.0F6):void");
    }

    public void setIsProfilePhoto(boolean z) {
        this.f39204K = z;
    }

    public void setShouldShowUserSpinner(boolean z) {
        this.f39205L = z;
    }

    public void setupBackButton(AnonymousClass3DG anonymousClass3DG) {
        switch (anonymousClass3DG.ordinal()) {
            case 0:
                this.f39196C.setImageResource(C0164R.drawable.instagram_arrow_back_24);
                this.f39196C.setBackground(new AnonymousClass0eU(getContext().getTheme(), AnonymousClass0eV.MODAL));
                return;
            case 3:
                this.f39196C.setImageResource(C0164R.drawable.instagram_x_outline_24);
                this.f39196C.setBackground(new AnonymousClass0eU(getContext().getTheme(), AnonymousClass0eV.MODAL));
                return;
            case 4:
                this.f39196C.setImageResource(C0164R.drawable.check);
                this.f39196C.setBackground(new AnonymousClass0eU(getContext().getTheme(), AnonymousClass0eV.MODAL));
                return;
            case 5:
                this.f39196C.setVisibility(8);
                return;
            default:
                return;
        }
    }

    private void setupDividers(View view) {
        View findViewById = view.findViewById(C0164R.id.button_cancel_adjust);
        Theme theme = getContext().getTheme();
        AnonymousClass0eV anonymousClass0eV = AnonymousClass0eV.MODAL;
        findViewById.setBackground(new AnonymousClass0eU(theme, anonymousClass0eV));
        view.findViewById(C0164R.id.button_accept_adjust).setBackground(new AnonymousClass0eU(getContext().getTheme(), anonymousClass0eV));
    }
}

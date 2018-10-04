package com.instagram.comments.controller;

import X.AnonymousClass0CC;
import X.AnonymousClass0Cd;
import X.AnonymousClass0Cm;
import X.AnonymousClass0Dt;
import X.AnonymousClass0FC;
import X.AnonymousClass0IJ;
import X.AnonymousClass0MM;
import X.AnonymousClass0Nm;
import X.AnonymousClass0P7;
import X.AnonymousClass0PZ;
import X.AnonymousClass0Px;
import X.AnonymousClass0SK;
import X.AnonymousClass0SL;
import X.AnonymousClass0SR;
import X.AnonymousClass0VA;
import X.AnonymousClass0q1;
import X.AnonymousClass0xI;
import X.AnonymousClass0xt;
import X.AnonymousClass0zU;
import X.AnonymousClass1Od;
import X.AnonymousClass2Hj;
import X.AnonymousClass4Ex;
import X.AnonymousClass4F0;
import X.AnonymousClass4F3;
import X.AnonymousClass4F6;
import X.AnonymousClass4F7;
import X.AnonymousClass4F8;
import X.AnonymousClass4F9;
import X.AnonymousClass4JB;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;
import java.util.Locale;

public class SimpleCommentComposerController extends AnonymousClass0VA implements AnonymousClass4JB {
    /* renamed from: B */
    public final AnonymousClass0SR f63726B;
    /* renamed from: C */
    public final Context f63727C;
    /* renamed from: D */
    public AnonymousClass4F6 f63728D;
    /* renamed from: E */
    public final boolean f63729E;
    /* renamed from: F */
    public final AnonymousClass0IJ f63730F;
    /* renamed from: G */
    public final AnonymousClass0PZ f63731G;
    /* renamed from: H */
    public AnonymousClass0P7 f63732H;
    /* renamed from: I */
    public final AnonymousClass0SK f63733I;
    /* renamed from: J */
    public final AnonymousClass0zU f63734J = new AnonymousClass4F7(this);
    /* renamed from: K */
    public final AnonymousClass0Cm f63735K;
    /* renamed from: L */
    private final AnonymousClass0xI f63736L;
    /* renamed from: M */
    private AnonymousClass4F0 f63737M;
    /* renamed from: N */
    private final AnonymousClass4F3 f63738N;
    /* renamed from: O */
    private final boolean f63739O;
    /* renamed from: P */
    private final String f63740P;
    public AnonymousClass4Ex mViewHolder;

    public SimpleCommentComposerController(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0IJ anonymousClass0IJ, String str, AnonymousClass0SR anonymousClass0SR, AnonymousClass0PZ anonymousClass0PZ, AnonymousClass0P7 anonymousClass0P7, AnonymousClass4F3 anonymousClass4F3, AnonymousClass0xI anonymousClass0xI, String str2, AnonymousClass0SK anonymousClass0SK) {
        this.f63727C = context;
        this.f63735K = anonymousClass0Cm;
        this.f63730F = anonymousClass0IJ;
        this.f63726B = anonymousClass0SR;
        this.f63731G = anonymousClass0PZ;
        this.f63732H = anonymousClass0P7;
        this.f63738N = anonymousClass4F3;
        this.f63736L = anonymousClass0xI;
        this.f63740P = str2;
        boolean z = true;
        boolean z2 = str.equals("main_feed") && ((Boolean) AnonymousClass0CC.LP.H(this.f63735K)).booleanValue();
        this.f63739O = z2;
        if (!str.equals("main_feed") || !((Boolean) AnonymousClass0CC.MP.H(this.f63735K)).booleanValue()) {
            z = false;
        }
        this.f63729E = z;
        this.f63733I = anonymousClass0SK;
    }

    /* renamed from: A */
    public final String m26622A() {
        return this.mViewHolder.f51886D.getText().toString();
    }

    /* renamed from: B */
    public static void m26621B(SimpleCommentComposerController simpleCommentComposerController) {
        String A = simpleCommentComposerController.m26622A();
        if (!A.isEmpty()) {
            simpleCommentComposerController.mViewHolder.f51886D.setText(JsonProperty.USE_DEFAULT_NAME);
            AnonymousClass0SK B = AnonymousClass0SL.B(A, simpleCommentComposerController.f63732H, simpleCommentComposerController.f63735K.B(), simpleCommentComposerController.f63734J.A(), simpleCommentComposerController.f63734J.B(), simpleCommentComposerController.f63733I);
            AnonymousClass0P7 anonymousClass0P7 = simpleCommentComposerController.f63732H;
            Activity activity = simpleCommentComposerController.f63730F.getActivity();
            Context context = simpleCommentComposerController.f63727C;
            Object obj = simpleCommentComposerController.f63731G;
            AnonymousClass0SL.C(anonymousClass0P7, B, activity, context, obj, AnonymousClass0xt.C(B, obj.getModuleName(), AnonymousClass0MM.G(simpleCommentComposerController.f63727C), AnonymousClass0Dt.B(simpleCommentComposerController.f63727C), simpleCommentComposerController.f63735K), simpleCommentComposerController.f63726B, null, true, simpleCommentComposerController.f63735K, true);
        }
    }

    /* renamed from: B */
    public final boolean m26623B() {
        if (TextUtils.isEmpty(m26622A().trim())) {
            this.mViewHolder.f51896N.setEnabled(false);
            this.mViewHolder.f51897O.setEnabled(false);
            return false;
        }
        this.mViewHolder.f51896N.setEnabled(true);
        this.mViewHolder.f51897O.setEnabled(true);
        return true;
    }

    public final void PGA(View view, Bundle bundle) {
        ComposerAutoCompleteTextView composerAutoCompleteTextView = this.mViewHolder.f51886D;
        Context context = this.f63727C;
        AnonymousClass0Cm anonymousClass0Cm = this.f63735K;
        Object obj = this.f63730F;
        composerAutoCompleteTextView.setAdapter(AnonymousClass1Od.B(context, anonymousClass0Cm, obj, new AnonymousClass0Px(context, obj.getLoaderManager()), AnonymousClass0q1.D(this.f63732H), false, ((Boolean) AnonymousClass0CC.lP.H(this.f63735K)).booleanValue(), ((Boolean) AnonymousClass0CC.kP.H(this.f63735K)).booleanValue()));
        if (AnonymousClass0Cd.f1698B.J()) {
            this.mViewHolder.f51886D.setHint(this.f63727C.getResources().getString(C0164R.string.comment_as_hint, new Object[]{this.f63735K.B().uT()}));
        } else {
            this.mViewHolder.f51886D.setHint(this.f63727C.getResources().getString(C0164R.string.comment_hint));
        }
        if (this.f63739O) {
            this.f63737M.A(this.mViewHolder.A());
        } else if (this.f63729E) {
            this.f63728D.A(null);
        }
        m26623B();
        this.mViewHolder.f51886D.requestFocus();
        this.mViewHolder.f51886D.setSelection(this.mViewHolder.f51886D.getText().length());
        AnonymousClass0Nm.k(this.mViewHolder.f51886D);
        if (this.f63733I != null) {
            this.mViewHolder.f51885C.f62018C.setVisibility(8);
            this.mViewHolder.f51885C.m26216B(this.f63727C.getResources().getString(C0164R.string.replying_to_user_format, new Object[]{this.f63733I.pT().uT()}));
            String uT = this.f63733I.pT().uT();
            CharSequence format = String.format(Locale.getDefault(), "@%s ", new Object[]{uT});
            this.mViewHolder.f51886D.removeTextChangedListener(this.f63734J);
            this.mViewHolder.f51886D.setText(JsonProperty.USE_DEFAULT_NAME);
            this.mViewHolder.f51886D.append(format);
            this.mViewHolder.f51886D.addTextChangedListener(this.f63734J);
        }
    }

    public final void St() {
        this.mViewHolder.f51886D.removeTextChangedListener(this.f63734J);
        super.St();
    }

    public final void Tk(AnonymousClass2Hj anonymousClass2Hj, Drawable drawable) {
        int B;
        this.mViewHolder.f51886D.getText().replace(Math.max(this.mViewHolder.f51886D.getSelectionStart(), 0), Math.max(this.mViewHolder.f51886D.getSelectionEnd(), 0), anonymousClass2Hj.f28577D);
        if (this.f63739O) {
            B = this.f63737M.B(anonymousClass2Hj);
        } else {
            B = ((Integer) this.f63728D.f51923E.get(anonymousClass2Hj)).intValue();
        }
        this.f63736L.C(this.f63732H, this.f63735K.f1759C, anonymousClass2Hj.f28577D, B, false, null, null);
    }

    public final void gi() {
        this.mViewHolder.f51886D.setOnEditorActionListener(null);
        AnonymousClass0FC.B().qVA(this.mViewHolder.f51886D);
        SimpleCommentComposerControllerLifecycleUtil.cleanupReferences(this);
    }

    public final void gx() {
        super.gx();
        this.mViewHolder.f51886D.addTextChangedListener(this.f63734J);
    }

    public final void wh(View view) {
        this.mViewHolder = new AnonymousClass4Ex(this.f63735K, view, this);
        this.mViewHolder.f51886D.setOnEditorActionListener(new AnonymousClass4F8(this));
        this.mViewHolder.f51886D.setText(this.f63740P);
        this.mViewHolder.f51886D.setDropDownWidth(AnonymousClass0Nm.J(this.f63727C));
        this.mViewHolder.f51886D.setAlwaysShowWhenEnoughToFilter(true);
        AnonymousClass0FC.B().IJA(this.mViewHolder.f51886D);
        this.mViewHolder.f51897O.setOnClickListener(new AnonymousClass4F9(this));
        this.mViewHolder.f51884B.B(this.f63735K.B().DQ(), null);
        this.mViewHolder.f51884B.setGradientSpinnerVisible(false);
        this.f63737M = new AnonymousClass4F0(this, this.f63735K);
        this.f63728D = new AnonymousClass4F6(this.f63727C, this.f63738N, this.f63735K, this.mViewHolder);
    }
}

package com.instagram.comments.controller;

import X.AnonymousClass0CC;
import X.AnonymousClass0Cd;
import X.AnonymousClass0Ci;
import X.AnonymousClass0Cm;
import X.AnonymousClass0Dt;
import X.AnonymousClass0FC;
import X.AnonymousClass0HV;
import X.AnonymousClass0Ie;
import X.AnonymousClass0Lo;
import X.AnonymousClass0Lp;
import X.AnonymousClass0MM;
import X.AnonymousClass0NN;
import X.AnonymousClass0Nm;
import X.AnonymousClass0P7;
import X.AnonymousClass0PZ;
import X.AnonymousClass0SK;
import X.AnonymousClass0SL;
import X.AnonymousClass0SR;
import X.AnonymousClass0SZ;
import X.AnonymousClass0Sb;
import X.AnonymousClass0VA;
import X.AnonymousClass0uT;
import X.AnonymousClass0xI;
import X.AnonymousClass0xt;
import X.AnonymousClass0zU;
import X.AnonymousClass188;
import X.AnonymousClass1Od;
import X.AnonymousClass1TN;
import X.AnonymousClass2Hj;
import X.AnonymousClass4Eq;
import X.AnonymousClass4Er;
import X.AnonymousClass4Es;
import X.AnonymousClass4Et;
import X.AnonymousClass4Ev;
import X.AnonymousClass4Ew;
import X.AnonymousClass4Ex;
import X.AnonymousClass4F0;
import X.AnonymousClass4F3;
import X.AnonymousClass4F6;
import X.AnonymousClass4JB;
import X.AnonymousClass5JE;
import X.AnonymousClass5S0;
import X.AnonymousClass5SB;
import X.AnonymousClass5SC;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnLayoutChangeListener;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Locale;

public class CommentComposerController extends AnonymousClass0VA implements AnonymousClass4F3, AnonymousClass4JB {
    /* renamed from: B */
    public int f63697B;
    /* renamed from: C */
    public final AnonymousClass0SR f63698C;
    /* renamed from: D */
    public final AnonymousClass5SC f63699D;
    /* renamed from: E */
    public final AnonymousClass0xI f63700E;
    /* renamed from: F */
    public final Context f63701F;
    /* renamed from: G */
    public final AnonymousClass4F0 f63702G;
    /* renamed from: H */
    public int f63703H = 0;
    /* renamed from: I */
    public AnonymousClass4F6 f63704I;
    /* renamed from: J */
    public boolean f63705J;
    /* renamed from: K */
    public boolean f63706K;
    /* renamed from: L */
    public boolean f63707L;
    /* renamed from: M */
    public boolean f63708M;
    /* renamed from: N */
    public boolean f63709N = false;
    /* renamed from: O */
    public final AnonymousClass0Ie f63710O;
    /* renamed from: P */
    public final AnonymousClass0PZ f63711P;
    /* renamed from: Q */
    public boolean f63712Q;
    /* renamed from: R */
    public AnonymousClass0P7 f63713R;
    /* renamed from: S */
    public final OnLayoutChangeListener f63714S = new AnonymousClass4Et(this);
    /* renamed from: T */
    public AnonymousClass0SK f63715T;
    /* renamed from: U */
    public boolean f63716U = false;
    /* renamed from: V */
    public final AnonymousClass0zU f63717V = new AnonymousClass4Ew(this);
    /* renamed from: W */
    public AnonymousClass1Od f63718W;
    /* renamed from: X */
    public final AnonymousClass5SB f63719X;
    /* renamed from: Y */
    public boolean f63720Y;
    /* renamed from: Z */
    public final AnonymousClass0Cm f63721Z;
    /* renamed from: a */
    private AnonymousClass0uT f63722a;
    /* renamed from: b */
    private int f63723b = 0;
    /* renamed from: c */
    private final AnonymousClass5JE f63724c;
    /* renamed from: d */
    private boolean f63725d = false;
    public AnonymousClass4Ex mViewHolder;

    public final void ed() {
    }

    public CommentComposerController(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Ie anonymousClass0Ie, AnonymousClass0SR anonymousClass0SR, AnonymousClass5SC anonymousClass5SC, AnonymousClass0PZ anonymousClass0PZ, AnonymousClass0uT anonymousClass0uT, AnonymousClass0xI anonymousClass0xI, AnonymousClass5SB anonymousClass5SB, AnonymousClass5JE anonymousClass5JE) {
        this.f63701F = context;
        this.f63721Z = anonymousClass0Cm;
        this.f63710O = anonymousClass0Ie;
        this.f63698C = anonymousClass0SR;
        this.f63699D = anonymousClass5SC;
        this.f63711P = anonymousClass0PZ;
        this.f63722a = anonymousClass0uT;
        this.f63719X = anonymousClass5SB;
        this.f63724c = anonymousClass5JE;
        this.f63702G = new AnonymousClass4F0(this, this.f63721Z);
        this.f63700E = anonymousClass0xI;
    }

    /* renamed from: A */
    public final void m26614A() {
        View listViewSafe = this.f63710O.getListViewSafe();
        if (listViewSafe != null) {
            int i = 0;
            int i2 = (this.mViewHolder.f51885C.f62022G ? this.f63697B : 0) + (this.f63705J ? this.f63703H : 0);
            if (this.f63706K) {
                i = this.f63723b;
            }
            AnonymousClass0Nm.a(listViewSafe, i2 + i);
        }
    }

    /* renamed from: B */
    public final int m26615B() {
        return this.mViewHolder.f51887E.getVisibility() == 0 ? this.mViewHolder.f51886D.getHeight() : 0;
    }

    /* renamed from: B */
    public static boolean m26601B(CommentComposerController commentComposerController) {
        AnonymousClass0P7 anonymousClass0P7 = commentComposerController.f63713R;
        return (anonymousClass0P7 == null || anonymousClass0P7.f4039n || commentComposerController.f63713R.mA() || commentComposerController.f63713R.eY()) ? false : true;
    }

    /* renamed from: C */
    public static int m26602C(CommentComposerController commentComposerController) {
        if (commentComposerController.mViewHolder.f51886D.getVisibility() != 0) {
            return 0;
        }
        commentComposerController.mViewHolder.f51886D.measure(MeasureSpec.makeMeasureSpec(commentComposerController.mViewHolder.f51886D.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(0, 0));
        return commentComposerController.mViewHolder.f51886D.getMeasuredHeight();
    }

    /* renamed from: C */
    public final void m26616C(boolean z) {
        this.mViewHolder.f51887E.setVisibility(z ? 0 : 8);
    }

    /* renamed from: D */
    public static Resources m26603D(CommentComposerController commentComposerController) {
        return commentComposerController.f63701F.getResources();
    }

    /* renamed from: D */
    public final void m26617D(AnonymousClass0SK anonymousClass0SK) {
        if (!anonymousClass0SK.equals(this.f63715T)) {
            this.f63715T = anonymousClass0SK;
            m26613N(this, anonymousClass0SK);
            if (m26604E(this)) {
                String uT = anonymousClass0SK.pT().uT();
                CharSequence format = String.format(Locale.getDefault(), "@%s ", new Object[]{uT});
                this.mViewHolder.f51886D.removeTextChangedListener(this.f63717V);
                this.mViewHolder.f51886D.setText(format);
                this.mViewHolder.f51886D.addTextChangedListener(this.f63717V);
                m26609J(this);
            }
        }
    }

    /* renamed from: E */
    public final void m26618E() {
        new AnonymousClass0Sb(this.f63701F).Q(C0164R.string.comments_disabled_title).I(this.f63701F.getString(C0164R.string.comments_disabled_message, new Object[]{this.f63713R.MA().uT()})).O(C0164R.string.ok, new AnonymousClass4Ev(this)).C().show();
    }

    /* renamed from: E */
    public static boolean m26604E(CommentComposerController commentComposerController) {
        return commentComposerController.mViewHolder != null ? true : null;
    }

    /* renamed from: F */
    public final void m26619F() {
        this.mViewHolder.f51886D.requestFocus();
        this.mViewHolder.f51886D.setSelection(this.mViewHolder.f51886D.getText().length());
        AnonymousClass0Nm.l(this.mViewHolder.f51886D);
    }

    /* renamed from: F */
    public static void m26605F(CommentComposerController commentComposerController) {
        if (commentComposerController.f63720Y) {
            commentComposerController.mViewHolder.f51889G.setVisibility(0);
        }
        commentComposerController.mViewHolder.f51885C.m26215A();
        commentComposerController.m26614A();
        m26608I(commentComposerController, false);
        AnonymousClass5JE anonymousClass5JE = commentComposerController.f63724c;
        if (anonymousClass5JE != null) {
            anonymousClass5JE.oi(commentComposerController.mViewHolder.f51885C);
        }
    }

    /* renamed from: G */
    public static void m26606G(CommentComposerController commentComposerController) {
        CommentComposerController commentComposerController2 = commentComposerController;
        String L = commentComposerController2.m26611L();
        if (!L.isEmpty()) {
            AnonymousClass0SK anonymousClass0SK = commentComposerController2.f63715T;
            AnonymousClass0P7 anonymousClass0P7 = commentComposerController2.f63713R;
            if (anonymousClass0P7 != null) {
                AnonymousClass0SK B = AnonymousClass0SL.B(L, anonymousClass0P7, commentComposerController2.f63721Z.B(), commentComposerController2.f63717V.A(), commentComposerController2.f63717V.B(), anonymousClass0SK);
                AnonymousClass0P7 anonymousClass0P72 = commentComposerController2.f63713R;
                Activity activity = commentComposerController2.f63710O.getActivity();
                Context context = commentComposerController2.f63710O.getContext();
                Object obj = commentComposerController2.f63711P;
                AnonymousClass0SL.C(anonymousClass0P72, B, activity, context, obj, AnonymousClass0xt.C(B, obj.getModuleName(), AnonymousClass0MM.G(commentComposerController2.f63701F), AnonymousClass0Dt.B(commentComposerController2.f63701F), commentComposerController2.f63721Z), commentComposerController2.f63698C, commentComposerController2.f63699D, true, commentComposerController2.f63721Z, null);
                if (anonymousClass0SK != null) {
                    if (anonymousClass0SK.I()) {
                        AnonymousClass0SK E = commentComposerController2.f63713R.D().E(anonymousClass0SK.f4905Y);
                        if (E != null) {
                            E.f4894N = true;
                        }
                    } else {
                        anonymousClass0SK.f4894N = true;
                    }
                }
                if (!(commentComposerController2.f63709N || B.I() || AnonymousClass188.D(B.f4910d).isEmpty())) {
                    AnonymousClass0SZ.B(commentComposerController2.f63710O.getActivity(), commentComposerController2.f63721Z, "348828055634303");
                    commentComposerController2.f63709N = true;
                }
            }
            commentComposerController2.mViewHolder.f51886D.setText(JsonProperty.USE_DEFAULT_NAME);
            commentComposerController2.f63715T = null;
            m26610K(commentComposerController2);
            m26605F(commentComposerController2);
        }
    }

    /* renamed from: G */
    public final boolean m26620G() {
        m26609J(this);
        if (this.f63713R != null) {
            if (!TextUtils.isEmpty(m26611L().trim())) {
                this.mViewHolder.f51896N.setEnabled(true);
                this.mViewHolder.f51897O.setEnabled(true);
                return true;
            }
        }
        this.mViewHolder.f51896N.setEnabled(false);
        this.mViewHolder.f51897O.setEnabled(false);
        return false;
    }

    /* renamed from: H */
    public static void m26607H(CommentComposerController commentComposerController) {
        if (!commentComposerController.f63725d) {
            AnonymousClass0Ci B = commentComposerController.f63721Z.B();
            if (!(!commentComposerController.f63713R.MA().equals(B) || B.qB == AnonymousClass0Lo.PrivacyStatusPrivate || B.f1713H == AnonymousClass0Lp.EVERYONE)) {
                AnonymousClass1TN.C(commentComposerController.f63701F, m26612M(commentComposerController, B.f1713H), 0).show();
            }
            commentComposerController.f63725d = true;
        }
    }

    /* renamed from: I */
    public static void m26608I(CommentComposerController commentComposerController, boolean z) {
        int height = z ? commentComposerController.mViewHolder.f51885C.getHeight() : 0;
        commentComposerController.mViewHolder.f51886D.setDropDownVerticalOffset(VERSION.SDK_INT >= 24 ? -height : height);
        commentComposerController.mViewHolder.f51886D.setDropDownCustomHeight(commentComposerController.f63710O.getListView().getMeasuredHeight() - height);
        if (commentComposerController.mViewHolder.f51886D.isPopupShowing()) {
            commentComposerController.mViewHolder.f51886D.showDropDown();
        }
    }

    /* renamed from: J */
    public static void m26609J(CommentComposerController commentComposerController) {
        if (!commentComposerController.f63707L) {
            return;
        }
        if (TextUtils.isEmpty(commentComposerController.m26611L())) {
            commentComposerController.mViewHolder.f51897O.setVisibility(8);
            commentComposerController.mViewHolder.f51894L.setVisibility(0);
            return;
        }
        commentComposerController.mViewHolder.f51897O.setVisibility(0);
        commentComposerController.mViewHolder.f51894L.setVisibility(8);
    }

    /* renamed from: K */
    public static void m26610K(CommentComposerController commentComposerController) {
        if (!m26604E(commentComposerController)) {
            return;
        }
        if (AnonymousClass0Cd.f1698B.J()) {
            commentComposerController.mViewHolder.f51886D.setHint(m26603D(commentComposerController).getString((commentComposerController.f63715T != null ? 1 : null) != null ? C0164R.string.reply_as_hint : C0164R.string.comment_as_hint, new Object[]{commentComposerController.f63721Z.B().uT()}));
        } else {
            commentComposerController.mViewHolder.f51886D.setHint(m26603D(commentComposerController).getString((commentComposerController.f63715T != null ? 1 : null) != null ? C0164R.string.reply_hint : C0164R.string.comment_hint));
        }
    }

    /* renamed from: L */
    private String m26611L() {
        return this.mViewHolder.f51886D.getText().toString();
    }

    /* renamed from: M */
    private static String m26612M(CommentComposerController commentComposerController, AnonymousClass0Lp anonymousClass0Lp) {
        switch (anonymousClass0Lp.ordinal()) {
            case 1:
                return m26603D(commentComposerController).getString(C0164R.string.commenting_limited_to_following);
            case 2:
                return m26603D(commentComposerController).getString(C0164R.string.commenting_limited_to_followers);
            case 3:
                return m26603D(commentComposerController).getString(C0164R.string.commenting_limited_to_followers_and_following);
            default:
                return JsonProperty.USE_DEFAULT_NAME;
        }
    }

    /* renamed from: N */
    private static void m26613N(CommentComposerController commentComposerController, AnonymousClass0SK anonymousClass0SK) {
        if (m26604E(commentComposerController)) {
            String string = m26603D(commentComposerController).getString(C0164R.string.replying_to_user_format, new Object[]{anonymousClass0SK.pT().uT()});
            if (commentComposerController.f63720Y) {
                commentComposerController.mViewHolder.f51889G.setVisibility(8);
            }
            commentComposerController.mViewHolder.f51885C.m26216B(string);
            commentComposerController.m26614A();
            m26608I(commentComposerController, true);
            m26610K(commentComposerController);
        }
    }

    public final void St() {
        if (this.f63706K && this.f63712Q) {
            AnonymousClass0HV D = AnonymousClass0HV.D(this.f63721Z);
            D.f2646B.edit().putInt("last_comment_emoji_picker_state", this.mViewHolder.B().f51914F.ordinal()).apply();
        }
        this.mViewHolder.f51886D.removeTextChangedListener(this.f63717V);
        super.St();
    }

    public final void Tk(AnonymousClass2Hj anonymousClass2Hj, Drawable drawable) {
        int B;
        if (this.f63705J) {
            B = this.f63702G.B(anonymousClass2Hj);
        } else {
            B = ((Integer) this.f63704I.f51923E.get(anonymousClass2Hj)).intValue();
        }
        this.mViewHolder.f51886D.getText().replace(Math.max(this.mViewHolder.f51886D.getSelectionStart(), 0), Math.max(this.mViewHolder.f51886D.getSelectionEnd(), 0), anonymousClass2Hj.f28577D);
        this.f63700E.C(this.f63713R, this.f63721Z.f1759C, anonymousClass2Hj.f28577D, B, false, false, this.f63715T);
    }

    public final void gi() {
        this.f63718W = null;
        this.mViewHolder.f51886D.setOnEditorActionListener(null);
        AnonymousClass0FC.B().qVA(this.mViewHolder.f51886D);
        if (this.mViewHolder.f51886D.getText().length() > 0) {
            AnonymousClass0xI anonymousClass0xI = this.f63700E;
            AnonymousClass0P7 anonymousClass0P7 = this.f63713R;
            String str = this.f63721Z.f1759C;
            AnonymousClass0SK anonymousClass0SK = this.f63715T;
            AnonymousClass0NN F = AnonymousClass0NN.B("instagram_comment_composer_abandon", anonymousClass0xI.f12507B).F("pk", str).F("m_pk", anonymousClass0P7.NO()).F("text", this.mViewHolder.f51886D.getText().toString());
            if (anonymousClass0SK != null) {
                F.F("parent_c_pk", anonymousClass0SK.XP()).F("parent_ca_pk", anonymousClass0SK.pT().getId());
            }
            F.R();
        }
        CommentComposerControllerLifecycleUtil.cleanupReferences(this);
    }

    public final void gt() {
        this.f63700E.B(this.f63713R, this.f63721Z.f1759C, this.f63715T);
    }

    public final void gx() {
        super.gx();
        this.mViewHolder.f51886D.addTextChangedListener(this.f63717V);
    }

    public final void ht(int i) {
        this.f63723b = i;
        m26614A();
    }

    public final void wh(View view) {
        AnonymousClass4Ex anonymousClass4Ex = new AnonymousClass4Ex(this.f63721Z, view, this);
        this.mViewHolder = anonymousClass4Ex;
        anonymousClass4Ex.f51886D.setOnEditorActionListener(new AnonymousClass4Eq(this));
        this.mViewHolder.f51886D.setBackButtonListener(this.f63722a);
        this.mViewHolder.f51886D.setDropDownWidth(AnonymousClass0Nm.J(this.f63701F));
        this.mViewHolder.f51886D.setAlwaysShowWhenEnoughToFilter(true);
        this.mViewHolder.f51886D.setAllowNewlines(((Boolean) AnonymousClass0CC.pE.H(this.f63721Z)).booleanValue());
        AnonymousClass0FC.B().IJA(this.mViewHolder.f51886D);
        this.mViewHolder.f51897O.setOnClickListener(new AnonymousClass4Er(this));
        this.mViewHolder.f51894L.setOnClickListener(new AnonymousClass4Es(this));
        this.mViewHolder.f51885C.setOnDismissListener(new AnonymousClass5S0(this));
        this.mViewHolder.f51884B.B(this.f63721Z.B().DQ(), null);
        this.mViewHolder.f51884B.setGradientSpinnerVisible(false);
        view.addOnLayoutChangeListener(this.f63714S);
        this.f63704I = new AnonymousClass4F6(this.f63701F, this, this.f63721Z, this.mViewHolder);
    }
}

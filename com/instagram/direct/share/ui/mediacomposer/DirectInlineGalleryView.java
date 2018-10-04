package com.instagram.direct.share.ui.mediacomposer;

import X.AnonymousClass0CC;
import X.AnonymousClass0Fx;
import X.AnonymousClass0G5;
import X.AnonymousClass0GG;
import X.AnonymousClass0Gn;
import X.AnonymousClass0OA;
import X.AnonymousClass0OK;
import X.AnonymousClass0Sy;
import X.AnonymousClass0TV;
import X.AnonymousClass0V1;
import X.AnonymousClass0WE;
import X.AnonymousClass14H;
import X.AnonymousClass15o;
import X.AnonymousClass1Ba;
import X.AnonymousClass1Bb;
import X.AnonymousClass1Km;
import X.AnonymousClass24y;
import X.AnonymousClass24z;
import X.AnonymousClass25A;
import X.AnonymousClass2FI;
import X.AnonymousClass2Uf;
import X.AnonymousClass3Zn;
import X.AnonymousClass3pG;
import X.AnonymousClass3pI;
import X.AnonymousClass4dq;
import X.AnonymousClass4dt;
import X.AnonymousClass4du;
import X.AnonymousClass4it;
import X.AnonymousClass4iu;
import X.AnonymousClass4iy;
import X.AnonymousClass4j0;
import X.AnonymousClass4j3;
import X.AnonymousClass4jN;
import X.AnonymousClass5Wi;
import X.AnonymousClass5Wm;
import X.AnonymousClass5Wo;
import X.AnonymousClass5Wp;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.C0164R;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.instagram.common.gallery.Medium;
import com.instagram.common.ui.widget.squareframelayout.SquareFrameLayout;
import com.instagram.common.ui.widget.videopreviewview.VideoPreviewView;
import com.instagram.direct.ui.inlinegallerysendbutton.InlineGallerySendButton;
import java.util.ArrayList;
import java.util.Map;

public class DirectInlineGalleryView extends SquareFrameLayout implements AnonymousClass0TV {
    /* renamed from: S */
    public static final long f56535S = (((long) ((Integer) AnonymousClass0CC.YG.G()).intValue()) * 1000);
    /* renamed from: B */
    public AnonymousClass5Wp f56536B;
    /* renamed from: C */
    public final GridView f56537C;
    /* renamed from: D */
    public AnonymousClass4j3 f56538D;
    /* renamed from: E */
    public AnonymousClass24z f56539E;
    /* renamed from: F */
    public Bitmap f56540F;
    /* renamed from: G */
    public final AnonymousClass4dq f56541G;
    /* renamed from: H */
    public int f56542H;
    /* renamed from: I */
    public boolean f56543I;
    /* renamed from: J */
    public boolean f56544J;
    /* renamed from: K */
    public final TextView f56545K;
    /* renamed from: L */
    public AnonymousClass2FI f56546L;
    /* renamed from: M */
    public final ImageView f56547M;
    /* renamed from: N */
    public final ArrayList f56548N;
    /* renamed from: O */
    public final InlineGallerySendButton f56549O;
    /* renamed from: P */
    public AnonymousClass5Wo f56550P;
    /* renamed from: Q */
    public final VideoPreviewView f56551Q;
    /* renamed from: R */
    private AnonymousClass4dq f56552R;

    public DirectInlineGalleryView(Context context) {
        this(context, null);
    }

    public DirectInlineGalleryView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DirectInlineGalleryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f56548N = new ArrayList();
        this.f56541G = new AnonymousClass5Wi(this);
        inflate(context, C0164R.layout.composer_layout, this);
        this.f56549O = (InlineGallerySendButton) findViewById(C0164R.id.inline_gallery_send_button);
        this.f56547M = (ImageView) findViewById(C0164R.id.photo_preview);
        VideoPreviewView videoPreviewView = (VideoPreviewView) findViewById(C0164R.id.video_preview);
        this.f56551Q = videoPreviewView;
        videoPreviewView.setScaleType(AnonymousClass15o.FIT);
        this.f56537C = (GridView) findViewById(C0164R.id.gallery_grid);
        TextView textView = (TextView) findViewById(C0164R.id.max_limit_view);
        this.f56545K = textView;
        textView.setText(getResources().getString(C0164R.string.selected_max_items, new Object[]{Long.valueOf(10)}));
        setBackgroundColor(-1);
        setClipChildren(false);
        this.f56544J = ((Boolean) AnonymousClass0CC.tG.G()).booleanValue();
    }

    /* renamed from: A */
    public final void m24879A() {
        AnonymousClass14H G = AnonymousClass14H.C(this.f56537C).J().K(true).G(((float) this.f56537C.getHeight()) * ((1.0f / ((float) this.f56537C.getNumColumns())) + 1.0f));
        G.f13862b = 4;
        G.N();
        AnonymousClass4jN.m24892K(this.f56550P.f65663B, false);
        this.f56543I = false;
        this.f56549O.setVisibility(0);
    }

    /* renamed from: B */
    public final boolean m24880B() {
        if (this.f56543I) {
            AnonymousClass5Wo anonymousClass5Wo = this.f56550P;
            AnonymousClass0V1.J(anonymousClass5Wo.f65663B.f56608n, "direct_composer_gallery_back_button", anonymousClass5Wo.f65663B.f56577I.BY()).R();
            return false;
        } else if (m24870E(this)) {
            m24868C(this);
            m24882D();
            return true;
        } else if (!m24871F(this)) {
            return false;
        } else {
            m24869D(this);
            m24882D();
            return true;
        }
    }

    /* renamed from: B */
    public static boolean m24867B(DirectInlineGalleryView directInlineGalleryView, Medium medium) {
        if (((long) medium.getDuration()) > f56535S) {
            Toast.makeText(directInlineGalleryView.getContext(), C0164R.string.video_import_too_long, 1).show();
            return false;
        } else if (!TextUtils.isEmpty(medium.f30926P)) {
            return true;
        } else {
            AnonymousClass0Gn.H("DirectInlineGalleryView", "attempted to load gallery media with null file path");
            Toast.makeText(directInlineGalleryView.getContext(), C0164R.string.unknown_error_occured, 1).show();
            return false;
        }
    }

    /* renamed from: C */
    public final void m24881C(Bitmap bitmap, int i, boolean z) {
        AnonymousClass0GG.B(AnonymousClass0Fx.B(), new AnonymousClass4iy(this, bitmap, i, z), 1190948976);
    }

    /* renamed from: C */
    public static void m24868C(DirectInlineGalleryView directInlineGalleryView) {
        directInlineGalleryView.f56547M.setVisibility(4);
        directInlineGalleryView.f56547M.setImageBitmap(null);
    }

    /* renamed from: D */
    public final void m24882D() {
        this.f56548N.clear();
        this.f56549O.setVisibility(8);
        this.f56545K.setVisibility(8);
        if ((this.f56539E != null ? 1 : null) == null) {
            int integer;
            Context context = getContext();
            this.f56539E = new AnonymousClass24z(context, ((FragmentActivity) context).E(), AnonymousClass24y.PHOTO_AND_VIDEO, ((Boolean) AnonymousClass0CC.gM.G()).booleanValue(), new AnonymousClass4iu(this));
            Resources resources = context.getResources();
            int i = resources.getDisplayMetrics().widthPixels;
            if (((Boolean) AnonymousClass0CC.uG.G()).booleanValue()) {
                integer = resources.getInteger(C0164R.integer.direct_gallery_grid_num_columns_increased);
            } else {
                integer = resources.getInteger(C0164R.integer.direct_gallery_grid_num_columns);
            }
            int round = Math.round((float) ((i - (resources.getDimensionPixelOffset(C0164R.dimen.direct_gallery_grid_spacing) * (integer - 1))) / integer));
            this.f56538D = new AnonymousClass4j3(this, new AnonymousClass2Uf(getContext(), round, round, AnonymousClass25A.f25726B, this.f56544J ^ 1, false));
            this.f56537C.setAdapter(this.f56538D);
            this.f56537C.setNumColumns(integer);
        }
        String str = "android.permission.READ_EXTERNAL_STORAGE";
        if (AnonymousClass1Ba.D(getContext(), str)) {
            AnonymousClass14H I;
            if (AnonymousClass1Ba.D(getContext(), str)) {
                this.f56539E.m14359A();
            }
            if (this.f56537C.getVisibility() != 0) {
                I = AnonymousClass14H.C(this.f56537C).J().K(true).I(((float) this.f56537C.getHeight()) * ((1.0f / ((float) this.f56537C.getNumColumns())) + 1.0f), 0.0f);
                I.f13863c = 0;
                I.N();
            }
            this.f56543I = true;
            AnonymousClass5Wo anonymousClass5Wo = this.f56550P;
            AnonymousClass4jN.m24892K(anonymousClass5Wo.f65663B, true);
            AnonymousClass4jN anonymousClass4jN = anonymousClass5Wo.f65663B;
            I = AnonymousClass14H.C(anonymousClass4jN.f56592X).J().A(anonymousClass4jN.f56592X.getAlpha(), 0.0f);
            I.f13862b = 8;
            I.N();
            I = AnonymousClass14H.C(anonymousClass4jN.f56593Y).J().A(anonymousClass4jN.f56593Y.getAlpha(), 1.0f);
            I.f13863c = 0;
            I.N();
            return;
        }
        m24877L(this);
    }

    /* renamed from: D */
    public static void m24869D(DirectInlineGalleryView directInlineGalleryView) {
        directInlineGalleryView.f56551Q.setVisibility(4);
        directInlineGalleryView.f56551Q.m18921H();
    }

    /* renamed from: E */
    public static boolean m24870E(DirectInlineGalleryView directInlineGalleryView) {
        return directInlineGalleryView.f56547M.getVisibility() == null ? true : null;
    }

    /* renamed from: F */
    public static boolean m24871F(DirectInlineGalleryView directInlineGalleryView) {
        return directInlineGalleryView.f56551Q.getVisibility() == null ? true : null;
    }

    /* renamed from: G */
    public static void m24872G(DirectInlineGalleryView directInlineGalleryView) {
        AnonymousClass2FI anonymousClass2FI = directInlineGalleryView.f56546L;
        if (anonymousClass2FI != null) {
            anonymousClass2FI.m14815A();
        }
        directInlineGalleryView.f56546L = null;
        directInlineGalleryView.f56539E.m14359A();
        directInlineGalleryView.m24882D();
    }

    /* renamed from: H */
    public static AnonymousClass0WE m24873H(Medium medium, Context context) {
        AnonymousClass3pG B = AnonymousClass3pG.m20808B(medium.f30924N);
        if (!AnonymousClass3pI.m20811B(context, B, false)) {
            return null;
        }
        AnonymousClass0OA D = AnonymousClass0OA.D(String.valueOf(System.nanoTime()));
        D.DB = medium.f30926P;
        D.KA(AnonymousClass0OK.DIRECT_SHARE);
        AnonymousClass1Km D2 = AnonymousClass3Zn.m20048D(B.f44944I, B.f44939D, (long) (((Integer) AnonymousClass0CC.Ck.G()).intValue() * JsonMappingException.MAX_REFS_TO_LIST));
        D2.f17205B = D2.f17206C;
        D.f3795I = D2.f17206C;
        D.MA(D2.f17224U, D2.f17214K);
        AnonymousClass3Zn.m20050F(D, D2);
        return new AnonymousClass0WE(D);
    }

    /* renamed from: I */
    public static void m24874I(DirectInlineGalleryView directInlineGalleryView, AnonymousClass4dt anonymousClass4dt) {
        Bitmap bitmap = directInlineGalleryView.f56540F;
        if (bitmap != null) {
            directInlineGalleryView.m24881C(bitmap, directInlineGalleryView.f56542H, anonymousClass4dt.f55900G);
            return;
        }
        directInlineGalleryView.f56552R = new AnonymousClass5Wm(directInlineGalleryView);
        if (AnonymousClass4du.f55903F == null) {
            AnonymousClass4du.f55903F = new AnonymousClass4du();
        }
        AnonymousClass4du.f55903F.m24636A(anonymousClass4dt, directInlineGalleryView.f56552R);
    }

    /* renamed from: J */
    public static void m24875J(DirectInlineGalleryView directInlineGalleryView, Medium medium) {
        m24869D(directInlineGalleryView);
        AnonymousClass0GG.B(AnonymousClass0Fx.B(), new AnonymousClass4j0(directInlineGalleryView, medium), 41688252);
    }

    /* renamed from: K */
    public static void m24876K(DirectInlineGalleryView directInlineGalleryView) {
        AnonymousClass0Sy.C();
        InlineGallerySendButton inlineGallerySendButton = directInlineGalleryView.f56549O;
        inlineGallerySendButton.f57064C.N((double) inlineGallerySendButton.f57063B);
    }

    /* renamed from: L */
    public static void m24877L(DirectInlineGalleryView directInlineGalleryView) {
        AnonymousClass1Ba.H(getRootActivity(directInlineGalleryView), directInlineGalleryView, new String[]{"android.permission.READ_EXTERNAL_STORAGE"});
    }

    /* renamed from: M */
    private void m24878M() {
        OnClickListener anonymousClass4it = new AnonymousClass4it(this);
        Context context = getContext();
        String H = AnonymousClass0G5.H(context, C0164R.attr.appName);
        getPermissionEmptyStateController().m14822H(context.getString(C0164R.string.storage_permission_rationale_title, new Object[]{H})).m14821G(context.getString(C0164R.string.storage_permission_rationale_message, new Object[]{H})).m14819E(C0164R.string.storage_permission_rationale_link).m14820F(anonymousClass4it);
    }

    public final void Zt(Map map) {
        if (map.containsKey("android.permission.READ_EXTERNAL_STORAGE")) {
            if (!((AnonymousClass1Bb) map.get("android.permission.READ_EXTERNAL_STORAGE")).equals(AnonymousClass1Bb.GRANTED)) {
                m24878M();
            } else if (!this.f56543I) {
                m24872G(this);
            }
        }
    }

    private AnonymousClass2FI getPermissionEmptyStateController() {
        if (this.f56546L == null) {
            this.f56546L = new AnonymousClass2FI(this, C0164R.layout.permission_empty_state_view);
        }
        return this.f56546L;
    }

    public static Activity getRootActivity(DirectInlineGalleryView directInlineGalleryView) {
        Activity activity = (Activity) directInlineGalleryView.getContext();
        return activity.getParent() == null ? activity : activity.getParent();
    }

    public void setGalleryDataLoadedListener(AnonymousClass5Wp anonymousClass5Wp) {
        this.f56536B = anonymousClass5Wp;
    }

    public void setUserActionListener(AnonymousClass5Wo anonymousClass5Wo) {
        this.f56550P = anonymousClass5Wo;
    }
}

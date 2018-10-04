package com.instagram.reels.fragment;

import X.AnonymousClass09e;
import X.AnonymousClass0CC;
import X.AnonymousClass0Ca;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0Gn;
import X.AnonymousClass0IL;
import X.AnonymousClass0IT;
import X.AnonymousClass0Iu;
import X.AnonymousClass0TM;
import X.AnonymousClass0cQ;
import X.AnonymousClass0ca;
import X.AnonymousClass0eT;
import X.AnonymousClass1g3;
import X.AnonymousClass2CP;
import X.AnonymousClass2CW;
import X.AnonymousClass2Ic;
import X.AnonymousClass2Id;
import X.AnonymousClass2Ie;
import X.AnonymousClass2If;
import X.AnonymousClass2Ii;
import X.AnonymousClass2Ik;
import X.AnonymousClass2JC;
import X.AnonymousClass2JP;
import X.AnonymousClass3FR;
import X.AnonymousClass3ht;
import X.AnonymousClass4xA;
import X.AnonymousClass5vM;
import X.AnonymousClass5vO;
import X.AnonymousClass5vP;
import X.AnonymousClass5vQ;
import X.AnonymousClass5vR;
import X.AnonymousClass5vS;
import X.AnonymousClass5vT;
import X.AnonymousClass5vU;
import X.AnonymousClass5vV;
import X.AnonymousClass5vW;
import X.AnonymousClass5vX;
import X.AnonymousClass5vY;
import X.AnonymousClass6Eo;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView.OnEditorActionListener;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.actionbar.ActionButton;
import com.instagram.pendingmedia.model.BrandedContentTag;
import java.util.ArrayList;
import java.util.Collection;

public class ReelMoreOptionsFragment extends AnonymousClass0TM implements AnonymousClass0IT {
    /* renamed from: B */
    public BrandedContentTag f5151B;
    /* renamed from: C */
    public AnonymousClass2CW f5152C;
    /* renamed from: D */
    public String f5153D;
    /* renamed from: E */
    public Boolean f5154E = null;
    /* renamed from: F */
    public boolean f5155F;
    /* renamed from: G */
    public AnonymousClass4xA f5156G;
    /* renamed from: H */
    public boolean f5157H;
    /* renamed from: I */
    public AnonymousClass5vX f5158I = AnonymousClass5vX.f70056C;
    /* renamed from: J */
    public String f5159J;
    /* renamed from: K */
    public Intent f5160K;
    /* renamed from: L */
    public String f5161L;
    /* renamed from: M */
    public final AnonymousClass3ht f5162M = new AnonymousClass5vU(this);
    /* renamed from: N */
    public AnonymousClass2Ie f5163N;
    /* renamed from: O */
    public AnonymousClass0Cm f5164O;
    /* renamed from: P */
    public AnonymousClass0Iu f5165P;
    /* renamed from: Q */
    public AnonymousClass3FR f5166Q;
    /* renamed from: R */
    private AnonymousClass2JC f5167R;
    /* renamed from: S */
    private AnonymousClass2Ii f5168S;
    /* renamed from: T */
    private AnonymousClass2Ii f5169T;
    /* renamed from: U */
    private final OnClickListener f5170U = new AnonymousClass5vR(this);
    /* renamed from: V */
    private final OnClickListener f5171V = new AnonymousClass5vQ(this);
    /* renamed from: W */
    private boolean f5172W;
    /* renamed from: X */
    private boolean f5173X;
    /* renamed from: Y */
    private boolean f5174Y;
    /* renamed from: Z */
    private boolean f5175Z;
    /* renamed from: a */
    private AnonymousClass2JP f5176a;
    /* renamed from: b */
    private final OnClickListener f5177b = new AnonymousClass5vT(this);
    /* renamed from: c */
    private final OnClickListener f5178c = new AnonymousClass5vS(this);
    /* renamed from: d */
    private AnonymousClass2Ic f5179d;
    /* renamed from: e */
    private SpannableStringBuilder f5180e;
    /* renamed from: f */
    private final AnonymousClass2Id f5181f = new AnonymousClass5vP(this);
    /* renamed from: g */
    private final OnEditorActionListener f5182g = new AnonymousClass5vO(this);
    /* renamed from: h */
    private AnonymousClass2JP f5183h;
    public Drawable mAddIconDrawable;
    public AnonymousClass2Ik mBrandedContentMetadataItem;
    public ActionButton mSaveButton;

    public final String getModuleName() {
        return "reel_more_options";
    }

    /* renamed from: B */
    public static void m4505B(ReelMoreOptionsFragment reelMoreOptionsFragment, AnonymousClass5vX anonymousClass5vX) {
        reelMoreOptionsFragment.f5158I = anonymousClass5vX;
        Collection arrayList = new ArrayList();
        if (reelMoreOptionsFragment.f5173X || reelMoreOptionsFragment.f5172W) {
            arrayList.add(new AnonymousClass2If(reelMoreOptionsFragment.getString(C0164R.string.add_link_header)));
        }
        if (reelMoreOptionsFragment.f5173X && !AnonymousClass5vX.f70057D.equals(anonymousClass5vX)) {
            arrayList.add(reelMoreOptionsFragment.f5169T);
        }
        if (AnonymousClass5vX.f70058E.equals(anonymousClass5vX)) {
            arrayList.add(reelMoreOptionsFragment.f5163N);
            arrayList.add(reelMoreOptionsFragment.f5183h);
        } else if (reelMoreOptionsFragment.f5172W) {
            arrayList.add(reelMoreOptionsFragment.f5168S);
            if (AnonymousClass5vX.f70057D.equals(anonymousClass5vX)) {
                arrayList.add(reelMoreOptionsFragment.f5179d);
            }
            if (AnonymousClass5vX.f70057D.equals(anonymousClass5vX)) {
                Boolean bool = reelMoreOptionsFragment.f5154E;
                if (bool != null && bool.booleanValue()) {
                    arrayList.add(reelMoreOptionsFragment.f5176a);
                }
            }
        }
        if (reelMoreOptionsFragment.f5174Y) {
            arrayList.add(new AnonymousClass2If(C0164R.string.branded_content));
            reelMoreOptionsFragment.mBrandedContentMetadataItem.f28742B = reelMoreOptionsFragment.f5175Z;
            arrayList.add(reelMoreOptionsFragment.mBrandedContentMetadataItem);
            arrayList.add(new AnonymousClass2JP(reelMoreOptionsFragment.f5180e));
        }
        reelMoreOptionsFragment.f5167R.setItems(arrayList);
    }

    /* renamed from: C */
    public static String m4506C(String str) {
        str = str.trim();
        if (str.length() <= 0 || str.matches("^https?://.+")) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("http://");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    /* renamed from: D */
    public static void m4507D(ReelMoreOptionsFragment reelMoreOptionsFragment) {
        Parcelable parcelable = reelMoreOptionsFragment.f5151B;
        if (parcelable != null) {
            reelMoreOptionsFragment.f5160K.putExtra("BRANDED_CONTENT_TAG", parcelable);
        }
        reelMoreOptionsFragment.getActivity().setResult(-1, reelMoreOptionsFragment.f5160K);
        reelMoreOptionsFragment.getActivity().onBackPressed();
    }

    /* renamed from: E */
    public static void m4508E(ReelMoreOptionsFragment reelMoreOptionsFragment) {
        Object obj;
        ActionButton actionButton;
        boolean z = false;
        if (!reelMoreOptionsFragment.f5155F && reelMoreOptionsFragment.f5151B == null && (!reelMoreOptionsFragment.f5173X || TextUtils.isEmpty(reelMoreOptionsFragment.f5163N.f28714B))) {
            if (!reelMoreOptionsFragment.f5172W || reelMoreOptionsFragment.f5161L == null) {
                obj = null;
                actionButton = reelMoreOptionsFragment.mSaveButton;
                if (!(reelMoreOptionsFragment.f5157H || r2 == null)) {
                    z = true;
                }
                actionButton.setEnabled(z);
            }
        }
        obj = 1;
        actionButton = reelMoreOptionsFragment.mSaveButton;
        z = true;
        actionButton.setEnabled(z);
    }

    /* renamed from: F */
    public static void m4509F(ReelMoreOptionsFragment reelMoreOptionsFragment, boolean z) {
        reelMoreOptionsFragment.f5168S.f28735F = z ^ 1;
        reelMoreOptionsFragment.f5168S.f28731B = AnonymousClass0Ca.m937C(reelMoreOptionsFragment.getContext(), C0164R.color.red_5);
        OnClickListener onClickListener = null;
        reelMoreOptionsFragment.f5168S.f28734E = z ? null : reelMoreOptionsFragment.mAddIconDrawable;
        reelMoreOptionsFragment.f5168S.f28738I = z ? null : reelMoreOptionsFragment.f5178c;
        AnonymousClass2Ii anonymousClass2Ii = reelMoreOptionsFragment.f5168S;
        if (z) {
            onClickListener = reelMoreOptionsFragment.f5177b;
        }
        anonymousClass2Ii.f28737H = onClickListener;
    }

    /* renamed from: G */
    public static void m4510G(ReelMoreOptionsFragment reelMoreOptionsFragment, boolean z) {
        OnClickListener onClickListener = null;
        reelMoreOptionsFragment.f5169T.f28734E = z ? null : reelMoreOptionsFragment.mAddIconDrawable;
        reelMoreOptionsFragment.f5169T.f28738I = z ? null : reelMoreOptionsFragment.f5171V;
        reelMoreOptionsFragment.f5169T.f28735F = z ^ 1;
        reelMoreOptionsFragment.f5169T.f28731B = AnonymousClass0Ca.m937C(reelMoreOptionsFragment.getContext(), C0164R.color.red_5);
        AnonymousClass2Ii anonymousClass2Ii = reelMoreOptionsFragment.f5169T;
        if (z) {
            onClickListener = reelMoreOptionsFragment.f5170U;
        }
        anonymousClass2Ii.f28737H = onClickListener;
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        ActionButton g = anonymousClass0eT.m6358g(C0164R.string.more_options_title, new AnonymousClass5vW(this));
        this.mSaveButton = g;
        g.setVisibility(0);
        anonymousClass0eT.m6354c(C0164R.drawable.instagram_x_outline_24, new AnonymousClass5vM(this));
        m4508E(this);
    }

    public final void onCreate(Bundle bundle) {
        AnonymousClass0IL anonymousClass0IL = this;
        int F = AnonymousClass0cQ.m5856F(this, 2044035448);
        super.onCreate(bundle);
        this.f5164O = AnonymousClass0Ce.m950G(getArguments());
        this.f5152C = AnonymousClass2CP.f27395B.A(this.f5164O);
        this.f5167R = new AnonymousClass2JC(getContext());
        this.f5151B = (BrandedContentTag) getArguments().getParcelable("BRANDED_CONTENT_TAG");
        boolean z = true;
        boolean z2 = getArguments().getBoolean("HAS_PRODUCT_STICKERS") && ((Boolean) AnonymousClass09e.f1097C.m846H(this.f5164O)).booleanValue();
        this.f5175Z = z2;
        if (bundle != null) {
            this.f5153D = bundle.getString("WEBLINK_URL", JsonProperty.USE_DEFAULT_NAME);
            this.f5159J = getArguments().getString("IGTV_LINK_MEDIA_ID", null);
            this.f5161L = bundle.getString("saved_instance_state_igtv_media_id", null);
        } else {
            this.f5153D = getArguments().getString("WEBLINK_URL", JsonProperty.USE_DEFAULT_NAME);
            this.f5159J = getArguments().getString("IGTV_LINK_MEDIA_ID", null);
        }
        this.f5173X = ((Boolean) AnonymousClass0CC.jm.m846H(this.f5164O)).booleanValue();
        if (!getArguments().getBoolean("OWNS_IGTV_VIDEOS", false) || !AnonymousClass2CP.f27395B.H(getContext(), this.f5164O)) {
            z = false;
        }
        this.f5172W = z;
        if (this.f5172W) {
            anonymousClass0IL.f5156G = AnonymousClass2CP.f27395B.G(getContext(), getLoaderManager(), this.f5164O, anonymousClass0IL, this.f5159J, anonymousClass0IL.f5152C);
        }
        anonymousClass0IL.f5174Y = anonymousClass0IL.f5164O.m1037B().m991H();
        AnonymousClass0cQ.m5857G(anonymousClass0IL, 1899935107, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.m5856F(this, 1657211188);
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        onCreateView.setBackgroundColor(AnonymousClass0Ca.m937C(getContext(), C0164R.color.white));
        AnonymousClass0cQ.m5857G(this, 1148666317, F);
        return onCreateView;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.m5856F(this, -458461781);
        super.onDestroyView();
        ReelMoreOptionsFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0cQ.m5857G(this, -983886685, F);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("WEBLINK_URL", this.f5163N.f28714B);
        String str = this.f5161L;
        if (str != null) {
            bundle.putString("saved_instance_state_igtv_media_id", str);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AnonymousClass3FR anonymousClass3FR = (AnonymousClass3FR) this.f5164O.m1036A(AnonymousClass3FR.class);
        this.f5166Q = anonymousClass3FR;
        if (anonymousClass3FR == null) {
            AnonymousClass0Gn.m1880G("ReelMoreOptionsFragment", new IllegalArgumentException("mWaterfall object is null. Not able to add any information to a non-existing pending media"));
            getActivity().onBackPressed();
            return;
        }
        CharSequence string;
        Drawable E = AnonymousClass0Ca.m939E(getContext(), C0164R.drawable.instagram_add_outline_24);
        r2.mAddIconDrawable = E;
        E.mutate().setColorFilter(AnonymousClass0ca.m5921B(AnonymousClass0Ca.m937C(getContext(), C0164R.color.grey_5)));
        r2.f5183h = new AnonymousClass2JP(AnonymousClass1g3.m12473C(getString(C0164R.string.weblink_preview_link), new SpannableStringBuilder(getString(C0164R.string.weblink_description_preview_link, getString(C0164R.string.weblink_preview_link))), new AnonymousClass5vY(r2)));
        boolean isEmpty = TextUtils.isEmpty(r2.f5153D) ^ true;
        r2.f5169T = new AnonymousClass2Ii(getString(C0164R.string.weblink_title), getString(C0164R.string.remove_weblink_action_button_text));
        m4510G(r2, isEmpty);
        r2.f5163N = new AnonymousClass2Ie(getString(C0164R.string.weblink_enter_url), r2.f5153D, r2.f5181f, r2.f5182g, Integer.valueOf(524288), true);
        if (r2.f5172W) {
            AnonymousClass4xA anonymousClass4xA = r2.f5156G;
            ClickableSpan anonymousClass5vY = new AnonymousClass5vY(r2);
            Resources resources = anonymousClass4xA.f58783C.getResources();
            r2.f5176a = new AnonymousClass2JP(AnonymousClass1g3.m12473C(resources.getString(C0164R.string.igtv_link_preview_link_text), new SpannableStringBuilder(resources.getString(C0164R.string.igtv_link_preview_explanation_text, new Object[]{resources.getString(C0164R.string.igtv_link_preview_link_text)})), anonymousClass5vY));
            r2.f5168S = new AnonymousClass2Ii(getString(C0164R.string.igtv_link_option), getString(C0164R.string.remove_weblink_action_button_text));
            m4509F(r2, r2.f5159J != null);
            r2.f5179d = r2.f5156G.f58784D;
        }
        r2.mBrandedContentMetadataItem = new AnonymousClass2Ik(C0164R.string.tag_business_partner, new AnonymousClass5vV(r2));
        BrandedContentTag brandedContentTag = r2.f5151B;
        if (brandedContentTag != null) {
            r2.mBrandedContentMetadataItem.f28743C = brandedContentTag.f27936D;
        } else {
            r2.mBrandedContentMetadataItem.f28743C = null;
        }
        String string2 = getString(C0164R.string.learn_more_text);
        if (r2.f5175Z) {
            string = getString(C0164R.string.add_partner_story_with_product_stickers_message);
        } else {
            string = getString(C0164R.string.add_partner_story_description, string2);
        }
        r2.f5180e = AnonymousClass1g3.m12473C(string2, new SpannableStringBuilder(string), new AnonymousClass6Eo(r2));
        if (isEmpty) {
            m4505B(r2, AnonymousClass5vX.f70058E);
        } else if (r2.f5159J != null) {
            m4505B(r2, AnonymousClass5vX.f70057D);
        } else {
            m4505B(r2, AnonymousClass5vX.f70056C);
        }
        setListAdapter(r2.f5167R);
    }
}

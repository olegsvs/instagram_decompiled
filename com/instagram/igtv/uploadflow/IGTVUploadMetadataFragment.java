package com.instagram.igtv.uploadflow;

import X.AnonymousClass0Ca;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Ci;
import X.AnonymousClass0Cm;
import X.AnonymousClass0FO;
import X.AnonymousClass0HV;
import X.AnonymousClass0IJ;
import X.AnonymousClass0IL;
import X.AnonymousClass0IT;
import X.AnonymousClass0IZ;
import X.AnonymousClass0Ir;
import X.AnonymousClass0Nm;
import X.AnonymousClass0OA;
import X.AnonymousClass0OB;
import X.AnonymousClass0OK;
import X.AnonymousClass0PZ;
import X.AnonymousClass0Qd;
import X.AnonymousClass0TJ;
import X.AnonymousClass0Ur;
import X.AnonymousClass0a2;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eT;
import X.AnonymousClass0eV;
import X.AnonymousClass0eW;
import X.AnonymousClass0ea;
import X.AnonymousClass0hj;
import X.AnonymousClass0iO;
import X.AnonymousClass0mE;
import X.AnonymousClass0rm;
import X.AnonymousClass13K;
import X.AnonymousClass15J;
import X.AnonymousClass15z;
import X.AnonymousClass25o;
import X.AnonymousClass2CI;
import X.AnonymousClass2CJ;
import X.AnonymousClass2Uu;
import X.AnonymousClass3I1;
import X.AnonymousClass3Ih;
import X.AnonymousClass3RE;
import X.AnonymousClass3ew;
import X.AnonymousClass3pG;
import X.AnonymousClass4DS;
import X.AnonymousClass4ur;
import X.AnonymousClass4vB;
import X.AnonymousClass4vC;
import X.AnonymousClass4vE;
import X.AnonymousClass4vF;
import X.AnonymousClass4vG;
import X.AnonymousClass4vH;
import X.AnonymousClass4vI;
import X.AnonymousClass4vJ;
import X.AnonymousClass4vK;
import X.AnonymousClass4vL;
import X.AnonymousClass4vM;
import X.AnonymousClass4vN;
import X.AnonymousClass4vO;
import X.AnonymousClass4vP;
import X.AnonymousClass4vQ;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.base.CreationSession;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.ui.widget.switchbutton.IgSwitch;

public class IGTVUploadMetadataFragment extends AnonymousClass0IJ implements AnonymousClass0PZ, AnonymousClass0IT, AnonymousClass0Qd {
    /* renamed from: B */
    public AnonymousClass3RE f58490B;
    /* renamed from: C */
    public AnonymousClass0iO f58491C;
    /* renamed from: D */
    public AnonymousClass4vQ f58492D = AnonymousClass4vQ.UNSET;
    /* renamed from: E */
    public boolean f58493E;
    /* renamed from: F */
    public AnonymousClass0OA f58494F;
    /* renamed from: G */
    public AnonymousClass0Cm f58495G;
    /* renamed from: H */
    private int f58496H;
    /* renamed from: I */
    private AnonymousClass0eT f58497I;
    /* renamed from: J */
    private final AnonymousClass3ew f58498J = AnonymousClass3ew.FACEBOOK;
    /* renamed from: K */
    private int f58499K;
    /* renamed from: L */
    private boolean f58500L;
    /* renamed from: M */
    private int f58501M;
    /* renamed from: N */
    private Medium f58502N;
    /* renamed from: O */
    private int f58503O;
    public ImageView mConnectSpinnerView;
    public IgSwitch mCrosspostToggle;
    public EditText mDescriptionTextView;
    public TextView mEditCoverText;
    public TextView mFacebookPageLabelTextView;
    public TextView mFacebookPageNameTextView;
    public AnonymousClass0hj mKeyboardHeightChangeDetector;
    public AnonymousClass2Uu mLoadingSpinnerDrawable;
    public ImageView mMediaPreview;
    public FrameLayout mMediaPreviewParentContainer;
    public TextView mPostButton;
    public AnonymousClass13K mPostButtonBouncyListener;
    public OnClickListener mPostButtonDisabledStateListener;
    public AnonymousClass0Ur mProcessingProgressDialog;
    public ScrollView mScrollView;
    public View mScrollViewContent;
    public View mTitleRequiredErrorIcon;
    public View mTitleRequiredErrorText;
    public EditText mTitleTextView;

    public final String getModuleName() {
        return "igtv_upload_metadata_fragment";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    /* renamed from: B */
    public static void m25372B(IGTVUploadMetadataFragment iGTVUploadMetadataFragment, boolean z) {
        View currentFocus = iGTVUploadMetadataFragment.getActivity().getCurrentFocus();
        if (currentFocus == null) {
            return;
        }
        if (currentFocus instanceof EditText) {
            EditText editText = (EditText) currentFocus;
            int height = (iGTVUploadMetadataFragment.mScrollView.getHeight() - iGTVUploadMetadataFragment.f58501M) - iGTVUploadMetadataFragment.f58496H;
            int scrollY = iGTVUploadMetadataFragment.mScrollView.getScrollY();
            int i = scrollY + height;
            int selectionEnd = editText.getSelectionEnd();
            Layout layout = editText.getLayout();
            int lineForOffset = layout.getLineForOffset(selectionEnd);
            int lineTop = layout.getLineTop(lineForOffset) + editText.getPaddingTop();
            int lineBottom = layout.getLineBottom(lineForOffset) + editText.getPaddingTop();
            lineForOffset = editText.getTop() - iGTVUploadMetadataFragment.f58496H;
            lineTop += lineForOffset;
            selectionEnd = iGTVUploadMetadataFragment.f58503O;
            lineTop -= selectionEnd;
            lineForOffset = (lineForOffset + lineBottom) + selectionEnd;
            if (lineTop >= scrollY) {
                if (lineForOffset > i) {
                    lineTop = lineForOffset - height;
                } else {
                    return;
                }
            }
            if (z) {
                iGTVUploadMetadataFragment.mScrollView.smoothScrollTo(0, lineTop);
            } else {
                iGTVUploadMetadataFragment.mScrollView.scrollTo(0, lineTop);
            }
        }
    }

    /* renamed from: C */
    public static void m25373C(IGTVUploadMetadataFragment iGTVUploadMetadataFragment) {
        if (iGTVUploadMetadataFragment.f58494F == null) {
            AnonymousClass3pG B = AnonymousClass3pG.B(iGTVUploadMetadataFragment.f58502N.f30924N);
            CreationSession creationSession = new CreationSession();
            iGTVUploadMetadataFragment.f58494F = AnonymousClass3Ih.B(iGTVUploadMetadataFragment.getContext(), 0, creationSession, B.f44944I);
            AnonymousClass3Ih.E(B, iGTVUploadMetadataFragment.f58494F, creationSession, AnonymousClass2CI.D(iGTVUploadMetadataFragment.getContext(), iGTVUploadMetadataFragment.f58495G), B.f44939D);
            iGTVUploadMetadataFragment.f58494F.oB = iGTVUploadMetadataFragment.f58502N.f30916F;
            iGTVUploadMetadataFragment.f58494F.KA(AnonymousClass0OK.FELIX);
            PendingMediaStore.C().E(iGTVUploadMetadataFragment.f58494F.UB, iGTVUploadMetadataFragment.f58494F);
        }
    }

    /* renamed from: D */
    public static void m25374D(IGTVUploadMetadataFragment iGTVUploadMetadataFragment) {
        if (TextUtils.isEmpty(iGTVUploadMetadataFragment.f58494F.DB)) {
            iGTVUploadMetadataFragment.mProcessingProgressDialog.show();
            Context context = iGTVUploadMetadataFragment.getContext();
            AnonymousClass0OA anonymousClass0OA = iGTVUploadMetadataFragment.f58494F;
            int J = AnonymousClass0Nm.J(iGTVUploadMetadataFragment.getContext());
            int I = AnonymousClass0Nm.I(iGTVUploadMetadataFragment.getContext());
            AnonymousClass3I1.B(context, AnonymousClass0rm.K(BitmapFactory.decodeFile(iGTVUploadMetadataFragment.f58502N.f30926P), J, I, 0, false), anonymousClass0OA, AnonymousClass2CI.D(iGTVUploadMetadataFragment.getContext(), iGTVUploadMetadataFragment.f58495G));
            iGTVUploadMetadataFragment.mProcessingProgressDialog.hide();
        }
    }

    /* renamed from: E */
    public static void m25375E(IGTVUploadMetadataFragment iGTVUploadMetadataFragment) {
        Object obj = (iGTVUploadMetadataFragment.f58495G.B().lB == null || AnonymousClass0FO.V(iGTVUploadMetadataFragment.f58495G)) ? null : 1;
        if (obj != null) {
            iGTVUploadMetadataFragment.m25380J();
        } else if (!AnonymousClass0FO.V(iGTVUploadMetadataFragment.f58495G)) {
            Bundle bundle = new Bundle();
            bundle.putString("pages_connect_header_subtitle", iGTVUploadMetadataFragment.getString(C0164R.string.igtv_page_connect_subtitle));
            bundle.putString("pages_no_admin_pages_header_string", iGTVUploadMetadataFragment.getString(C0164R.string.igtv_no_facebook_page));
            bundle.putString("pages_no_admin_pages_explanation_string", iGTVUploadMetadataFragment.getString(C0164R.string.igtv_no_facebook_page_explanation));
            AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(iGTVUploadMetadataFragment.getActivity());
            AnonymousClass0Ir.f2848B.A();
            AnonymousClass0IL anonymousClass4DS = new AnonymousClass4DS();
            anonymousClass4DS.setArguments(bundle);
            anonymousClass0IZ.f2754D = anonymousClass4DS;
            anonymousClass0IZ.B();
        }
    }

    /* renamed from: F */
    public static void m25376F(IGTVUploadMetadataFragment iGTVUploadMetadataFragment) {
        if (AnonymousClass0FO.V(iGTVUploadMetadataFragment.f58495G)) {
            iGTVUploadMetadataFragment.mFacebookPageLabelTextView.setText(AnonymousClass0a2.H(iGTVUploadMetadataFragment.f58495G).f28508D);
            iGTVUploadMetadataFragment.mFacebookPageNameTextView.setText(iGTVUploadMetadataFragment.getString(C0164R.string.igtv_upload_facebook_page));
            iGTVUploadMetadataFragment.mFacebookPageNameTextView.setVisibility(0);
            iGTVUploadMetadataFragment.mFacebookPageLabelTextView.setVisibility(0);
            m25377G(iGTVUploadMetadataFragment, false);
            iGTVUploadMetadataFragment.mCrosspostToggle.setToggleListener(new AnonymousClass4vP(iGTVUploadMetadataFragment));
            if (iGTVUploadMetadataFragment.mCrosspostToggle.isChecked() || !AnonymousClass0HV.D(iGTVUploadMetadataFragment.f58495G).f2646B.getBoolean("felix_crossposting_sticky_pref", true)) {
                iGTVUploadMetadataFragment.m25381K(false);
                return;
            }
            m25379I(iGTVUploadMetadataFragment);
            iGTVUploadMetadataFragment.m25381K(true);
        } else if (AnonymousClass0a2.K(iGTVUploadMetadataFragment.f58495G)) {
            iGTVUploadMetadataFragment.mFacebookPageNameTextView.setText(iGTVUploadMetadataFragment.getString(C0164R.string.igtv_upload_facebook_page));
            iGTVUploadMetadataFragment.mFacebookPageNameTextView.setVisibility(0);
            iGTVUploadMetadataFragment.mFacebookPageLabelTextView.setVisibility(8);
            m25377G(iGTVUploadMetadataFragment, false);
            if (iGTVUploadMetadataFragment.f58495G.B().lB != null) {
                iGTVUploadMetadataFragment.m25380J();
                return;
            }
            iGTVUploadMetadataFragment.mCrosspostToggle.setToggleListener(new AnonymousClass4vB(iGTVUploadMetadataFragment));
            iGTVUploadMetadataFragment.m25381K(false);
        } else if (!AnonymousClass0a2.K(iGTVUploadMetadataFragment.f58495G)) {
            iGTVUploadMetadataFragment.mFacebookPageNameTextView.setText(iGTVUploadMetadataFragment.getString(C0164R.string.igtv_upload_facebook_page));
            iGTVUploadMetadataFragment.mFacebookPageNameTextView.setVisibility(0);
            iGTVUploadMetadataFragment.mFacebookPageLabelTextView.setVisibility(8);
            m25377G(iGTVUploadMetadataFragment, false);
            iGTVUploadMetadataFragment.mCrosspostToggle.setToggleListener(new AnonymousClass4vC(iGTVUploadMetadataFragment));
            iGTVUploadMetadataFragment.m25381K(false);
        }
    }

    /* renamed from: G */
    public static void m25377G(IGTVUploadMetadataFragment iGTVUploadMetadataFragment, boolean z) {
        int i = 8;
        iGTVUploadMetadataFragment.mCrosspostToggle.setVisibility(z ? 8 : 0);
        ImageView imageView = iGTVUploadMetadataFragment.mConnectSpinnerView;
        if (z) {
            i = 0;
        }
        imageView.setVisibility(i);
        iGTVUploadMetadataFragment.mLoadingSpinnerDrawable.D(z);
    }

    /* renamed from: H */
    public static void m25378H(IGTVUploadMetadataFragment iGTVUploadMetadataFragment, boolean z) {
        float f = 1.0f;
        iGTVUploadMetadataFragment.mTitleRequiredErrorIcon.setAlpha(z ? 1.0f : 0.0f);
        View view = iGTVUploadMetadataFragment.mTitleRequiredErrorText;
        if (!z) {
            f = 0.0f;
        }
        view.setAlpha(f);
    }

    /* renamed from: I */
    public static void m25379I(IGTVUploadMetadataFragment iGTVUploadMetadataFragment) {
        m25373C(iGTVUploadMetadataFragment);
        AnonymousClass3ew anonymousClass3ew = iGTVUploadMetadataFragment.f58498J;
        AnonymousClass0OB anonymousClass0OB = iGTVUploadMetadataFragment.f58494F;
        if (iGTVUploadMetadataFragment.f58491C == null) {
            iGTVUploadMetadataFragment.f58491C = new AnonymousClass0iO(iGTVUploadMetadataFragment.f58495G, iGTVUploadMetadataFragment, iGTVUploadMetadataFragment, new AnonymousClass4vE(iGTVUploadMetadataFragment));
        }
        anonymousClass3ew.N(anonymousClass0OB, iGTVUploadMetadataFragment, iGTVUploadMetadataFragment.f58491C, iGTVUploadMetadataFragment.f58495G);
        iGTVUploadMetadataFragment.mCrosspostToggle.setChecked(iGTVUploadMetadataFragment.f58494F.TX());
    }

    /* renamed from: J */
    private void m25380J() {
        m25377G(this, true);
        AnonymousClass0Cm anonymousClass0Cm = this.f58495G;
        AnonymousClass0FO.Z(anonymousClass0Cm, anonymousClass0Cm.B().lB, new AnonymousClass4vF(this));
    }

    /* renamed from: K */
    private void m25381K(boolean z) {
        if (!this.f58492D.m25371B()) {
            this.f58492D = z ? AnonymousClass4vQ.YES : AnonymousClass4vQ.NO;
        }
    }

    public final void Sp(int i, boolean z) {
        this.f58501M = i;
        this.mScrollViewContent.setPadding(0, this.f58496H, 0, this.f58501M + this.f58499K);
        getView().post(new AnonymousClass4vG(this));
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        AnonymousClass0eT anonymousClass0eT2 = anonymousClass0eT;
        anonymousClass0eT.d(AnonymousClass0eW.B(AnonymousClass0eV.DEFAULT).A(AnonymousClass0Ca.C(getContext(), C0164R.color.igtv_upload_action_bar_color)).B());
        anonymousClass0eT.W(this.f58496H);
        anonymousClass0eT2.D(AnonymousClass0TJ.D(getContext(), C0164R.drawable.instagram_arrow_back_24, C0164R.color.white, C0164R.drawable.instagram_arrow_back_24, C0164R.color.white_50_transparent), C0164R.string.igtv_upload_flow_prev, new AnonymousClass4vO(this), null, false);
        View X = anonymousClass0eT.X(C0164R.layout.metadata_fragment_title_view, 0, 0);
        AnonymousClass0Ci B = this.f58495G.B();
        ((IgImageView) X.findViewById(C0164R.id.user_avatar)).setUrl(B.DQ());
        ((TextView) X.findViewById(C0164R.id.username)).setText(B.uT());
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            AnonymousClass0FO.E(i, i2, intent, new AnonymousClass4vN(this));
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 167897593);
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f58495G = AnonymousClass0Ce.G(getArguments());
        Window window = Z().getWindow();
        this.f58500L = AnonymousClass0ea.B(window, window.getDecorView());
        this.f58490B = new AnonymousClass3RE(this, arguments.getString("igtv_creation_session_id_arg"), arguments.getString("igtv_session_id_arg"));
        this.f58496H = getResources().getDimensionPixelSize(C0164R.dimen.igtv_metadata_fragment_action_bar_height);
        this.f58493E = AnonymousClass0HV.D(this.f58495G).f2646B.getBoolean("felix_crossposting_sticky_pref", true);
        AnonymousClass0cQ.G(this, -1530296728, F);
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        if (i2 == C0164R.anim.right_in && z && VERSION.SDK_INT > 21) {
            Context context = getContext();
            View view = getView();
            Animation loadAnimation = AnimationUtils.loadAnimation(context, C0164R.anim.right_in);
            loadAnimation.setAnimationListener(new AnonymousClass2CJ(view));
            return loadAnimation;
        }
        if (VERSION.SDK_INT > 21 && getView() != null) {
            AnonymousClass0mE.f9733B.h(getView(), 0.0f);
        }
        return super.onCreateAnimation(i, z, i2);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1511643364);
        View inflate = layoutInflater.inflate(C0164R.layout.upload_metadata_fragment, viewGroup, false);
        this.f58497I = new AnonymousClass0eT((ViewGroup) inflate.findViewById(C0164R.id.action_bar_container), new AnonymousClass4vH(this));
        AnonymousClass0cQ.G(this, -1841203553, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -1902607738);
        super.onDestroyView();
        IGTVUploadMetadataFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0cQ.G(this, -1636467828, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, -103399092);
        super.onPause();
        this.mKeyboardHeightChangeDetector.C();
        this.mKeyboardHeightChangeDetector.D(this);
        AnonymousClass0ea.E(Z().getWindow(), Z().getWindow().getDecorView(), this.f58500L);
        AnonymousClass0cQ.G(this, 898175769, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 953185477);
        super.onResume();
        AnonymousClass0ea.E(Z().getWindow(), Z().getWindow().getDecorView(), false);
        this.f58497I.R(this);
        AnonymousClass0OA anonymousClass0OA = this.f58494F;
        if (anonymousClass0OA == null || anonymousClass0OA.DB == null) {
            this.mMediaPreview.setImageBitmap(BitmapFactory.decodeFile(this.f58502N.f30926P));
        } else {
            this.mMediaPreview.setImageURI(Uri.parse(this.f58494F.DB));
        }
        m25376F(this);
        this.mKeyboardHeightChangeDetector.B(getActivity());
        this.mKeyboardHeightChangeDetector.A(this);
        AnonymousClass0cQ.G(this, -1321199980, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f58502N = (Medium) getArguments().getParcelable("igtv_gallery_medium_arg");
        AnonymousClass0Ur anonymousClass0Ur = new AnonymousClass0Ur(getContext());
        this.mProcessingProgressDialog = anonymousClass0Ur;
        anonymousClass0Ur.A(getString(C0164R.string.processing));
        this.mTitleTextView = (EditText) view.findViewById(C0164R.id.video_title);
        this.mDescriptionTextView = (EditText) view.findViewById(C0164R.id.video_description);
        this.mTitleTextView.addTextChangedListener(new AnonymousClass4vI(this));
        this.mDescriptionTextView.addTextChangedListener(new AnonymousClass4vJ(this));
        this.mCrosspostToggle = (IgSwitch) view.findViewById(C0164R.id.share_switch);
        this.mConnectSpinnerView = (ImageView) view.findViewById(C0164R.id.loading_connection_spinner_view);
        AnonymousClass25o B = AnonymousClass4ur.m25348B(getContext());
        this.mLoadingSpinnerDrawable = B;
        B.E(1.0f);
        this.mLoadingSpinnerDrawable.D(true);
        this.mConnectSpinnerView.setImageDrawable(this.mLoadingSpinnerDrawable);
        m25377G(this, false);
        this.mTitleRequiredErrorText = view.findViewById(C0164R.id.video_title_error);
        this.mTitleRequiredErrorIcon = view.findViewById(C0164R.id.video_title_error_icon);
        this.mPostButton = (TextView) view.findViewById(C0164R.id.post_button);
        AnonymousClass15z anonymousClass15z = new AnonymousClass15z(this.mPostButton);
        anonymousClass15z.f14386F = true;
        anonymousClass15z.f14385E = new AnonymousClass4vK(this);
        AnonymousClass13K A = anonymousClass15z.A();
        this.mPostButtonBouncyListener = A;
        A.F(false);
        this.mPostButtonDisabledStateListener = new AnonymousClass4vL(this);
        this.mPostButton.setOnClickListener(this.mPostButtonDisabledStateListener);
        this.mMediaPreviewParentContainer = (FrameLayout) view.findViewById(C0164R.id.preview_container);
        this.mMediaPreview = (ImageView) view.findViewById(C0164R.id.preview);
        this.mEditCoverText = (TextView) view.findViewById(C0164R.id.edit_cover);
        this.mFacebookPageNameTextView = (TextView) view.findViewById(C0164R.id.facebook_page_name);
        this.mFacebookPageLabelTextView = (TextView) view.findViewById(C0164R.id.facebook_page_label);
        AnonymousClass15J anonymousClass4vM = new AnonymousClass4vM(this);
        anonymousClass15z = new AnonymousClass15z(this.mMediaPreviewParentContainer);
        anonymousClass15z.f14386F = true;
        anonymousClass15z.f14385E = anonymousClass4vM;
        anonymousClass15z.A();
        anonymousClass15z = new AnonymousClass15z(this.mEditCoverText);
        anonymousClass15z.f14386F = true;
        anonymousClass15z.f14385E = anonymousClass4vM;
        anonymousClass15z.A();
        AnonymousClass0Nm.j(this.mMediaPreviewParentContainer, AnonymousClass0Nm.J(getContext()) / 3);
        this.mScrollView = (ScrollView) view.findViewById(C0164R.id.scroll_view_container);
        this.f58499K = getResources().getDimensionPixelSize(C0164R.dimen.igtv_upload_footer_height);
        this.mScrollViewContent = view.findViewById(C0164R.id.scroll_view_content);
        this.f58503O = Math.round(AnonymousClass0Nm.C(getContext(), 14));
        this.mKeyboardHeightChangeDetector = new AnonymousClass0hj();
    }
}

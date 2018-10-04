package com.instagram.archive.fragment;

import X.AnonymousClass0CC;
import X.AnonymousClass0Ca;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0GA;
import X.AnonymousClass0IJ;
import X.AnonymousClass0IL;
import X.AnonymousClass0Nm;
import X.AnonymousClass0Ny;
import X.AnonymousClass0ON;
import X.AnonymousClass0P7;
import X.AnonymousClass0Qd;
import X.AnonymousClass0Qf;
import X.AnonymousClass0cQ;
import X.AnonymousClass0ct;
import X.AnonymousClass0hR;
import X.AnonymousClass0hj;
import X.AnonymousClass0la;
import X.AnonymousClass0n8;
import X.AnonymousClass0oo;
import X.AnonymousClass0ov;
import X.AnonymousClass0rr;
import X.AnonymousClass107;
import X.AnonymousClass14H;
import X.AnonymousClass1fY;
import X.AnonymousClass1fZ;
import X.AnonymousClass1fa;
import X.AnonymousClass1gg;
import X.AnonymousClass2M2;
import X.AnonymousClass30l;
import X.AnonymousClass30m;
import X.AnonymousClass30u;
import X.AnonymousClass499;
import X.AnonymousClass49B;
import X.AnonymousClass49C;
import X.AnonymousClass49D;
import X.AnonymousClass49E;
import X.AnonymousClass49F;
import X.AnonymousClass49G;
import X.AnonymousClass49H;
import X.AnonymousClass49I;
import X.AnonymousClass49J;
import X.AnonymousClass5Rn;
import X.AnonymousClass5Ro;
import X.AnonymousClass5Rp;
import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.List;

public class InlineAddHighlightFragment extends AnonymousClass0IJ implements AnonymousClass1fY, AnonymousClass0Qd, AnonymousClass1fZ {
    /* renamed from: B */
    public AnonymousClass49H f50887B;
    /* renamed from: C */
    public String f50888C;
    /* renamed from: D */
    public AnonymousClass0Cm f50889D;
    /* renamed from: E */
    private AnonymousClass30u f50890E;
    /* renamed from: F */
    private boolean f50891F;
    /* renamed from: G */
    private boolean f50892G;
    /* renamed from: H */
    private final AnonymousClass0hj f50893H = new AnonymousClass0hj();
    /* renamed from: I */
    private int f50894I;
    /* renamed from: J */
    private AnonymousClass1gg f50895J;
    public TextView mActionButton;
    public CircularImageView mCreateHighlightCoverImage;
    public EditText mCreateHighlightEditText;
    public View mCreateHighlightView;
    public ViewStub mCreateHighlightViewStub;
    public AnonymousClass49J mDelegate;
    public AnonymousClass0ct mHeaderBackButtonStubHolder;
    public AnonymousClass0ct mHeaderNewButtonStubHolder;
    public TextView mHeaderText;
    public SpinnerImageView mLoadingSpinner;
    public RecyclerView mTrayRecyclerView;
    public View mView;

    public final String getModuleName() {
        return "inline_add_to_highlight";
    }

    public final void sv(String str, int i, List list) {
    }

    /* renamed from: B */
    public static String m23425B(InlineAddHighlightFragment inlineAddHighlightFragment) {
        EditText editText = inlineAddHighlightFragment.mCreateHighlightEditText;
        if (editText == null) {
            return JsonProperty.USE_DEFAULT_NAME;
        }
        String trim = editText.getText().toString().trim();
        if (trim.isEmpty()) {
            trim = inlineAddHighlightFragment.getString(C0164R.string.highlights_name_hint);
        }
        return trim;
    }

    /* renamed from: C */
    public static void m23426C(InlineAddHighlightFragment inlineAddHighlightFragment, AnonymousClass49H anonymousClass49H) {
        int i;
        int i2;
        int i3;
        int i4;
        switch (anonymousClass49H.ordinal()) {
            case 0:
                i = C0164R.string.cancel;
                i2 = C0164R.color.grey_9;
                i3 = C0164R.color.white;
                i4 = C0164R.color.grey_1;
                break;
            case 1:
                i = C0164R.string.add;
                i2 = C0164R.color.white;
                i3 = C0164R.color.blue_5;
                i4 = C0164R.color.blue_6;
                break;
            case 2:
                i = C0164R.string.add;
                i2 = C0164R.color.white;
                i3 = C0164R.color.grey_3;
                i4 = C0164R.color.grey_3;
                break;
            default:
                throw new IllegalArgumentException("Unhandled ActionButtonMode.");
        }
        inlineAddHighlightFragment.mActionButton.setText(i);
        inlineAddHighlightFragment.mActionButton.setTextColor(AnonymousClass0Ca.C(inlineAddHighlightFragment.getContext(), i2));
        Drawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, new ColorDrawable(AnonymousClass0Ca.C(inlineAddHighlightFragment.getContext(), i4)));
        stateListDrawable.addState(new int[0], new ColorDrawable(AnonymousClass0Ca.C(inlineAddHighlightFragment.getContext(), i3)));
        inlineAddHighlightFragment.mActionButton.setBackground(stateListDrawable);
        inlineAddHighlightFragment.f50887B = anonymousClass49H;
    }

    /* renamed from: D */
    public static boolean m23427D(InlineAddHighlightFragment inlineAddHighlightFragment) {
        return ((Boolean) AnonymousClass0CC.oN.H(inlineAddHighlightFragment.f50889D)).booleanValue();
    }

    /* renamed from: E */
    public static void m23428E(InlineAddHighlightFragment inlineAddHighlightFragment, boolean z) {
        EditText editText;
        inlineAddHighlightFragment.mHeaderText.setText(C0164R.string.create_highlights_title);
        inlineAddHighlightFragment.mHeaderText.setGravity(17);
        int i = 0;
        AnonymousClass0Nm.c(inlineAddHighlightFragment.mHeaderText, 0);
        if (inlineAddHighlightFragment.mCreateHighlightView == null) {
            View inflate = inlineAddHighlightFragment.mCreateHighlightViewStub.inflate();
            inlineAddHighlightFragment.mCreateHighlightView = inflate;
            inlineAddHighlightFragment.mCreateHighlightCoverImage = (CircularImageView) inflate.findViewById(C0164R.id.highlight_cover_image);
            editText = (EditText) inlineAddHighlightFragment.mCreateHighlightView.findViewById(C0164R.id.highlight_title);
            inlineAddHighlightFragment.mCreateHighlightEditText = editText;
            AnonymousClass30m.m18196J(editText, inlineAddHighlightFragment.f50889D);
            EditText editText2 = inlineAddHighlightFragment.mCreateHighlightEditText;
            editText2.addTextChangedListener(new AnonymousClass30l(editText2, new AnonymousClass49G(inlineAddHighlightFragment)));
        }
        inlineAddHighlightFragment.mCreateHighlightView.setVisibility(0);
        editText = inlineAddHighlightFragment.mCreateHighlightEditText;
        editText.setText(editText.getText().toString().trim());
        inlineAddHighlightFragment.mCreateHighlightEditText.requestFocus();
        AnonymousClass0Nm.k(inlineAddHighlightFragment.mCreateHighlightEditText);
        inlineAddHighlightFragment.mCreateHighlightCoverImage.setUrl(inlineAddHighlightFragment.mDelegate.RK());
        inlineAddHighlightFragment.mCreateHighlightCoverImage.setRotation((float) inlineAddHighlightFragment.f50894I);
        if (inlineAddHighlightFragment.f50891F) {
            CircularImageView circularImageView = inlineAddHighlightFragment.mCreateHighlightCoverImage;
            circularImageView.setScaleY(circularImageView.getScaleY() * -1.0f);
        }
        AnonymousClass49H anonymousClass49H = (m23427D(inlineAddHighlightFragment) && inlineAddHighlightFragment.mCreateHighlightEditText.getText().toString().isEmpty()) ? AnonymousClass49H.ADD_DISABLED : AnonymousClass49H.ADD;
        m23426C(inlineAddHighlightFragment, anonymousClass49H);
        AnonymousClass0ct anonymousClass0ct = inlineAddHighlightFragment.mHeaderBackButtonStubHolder;
        if (!z) {
            i = 8;
        }
        anonymousClass0ct.D(i);
        inlineAddHighlightFragment.mHeaderNewButtonStubHolder.D(8);
        inlineAddHighlightFragment.mTrayRecyclerView.setVisibility(8);
    }

    /* renamed from: F */
    public static void m23429F(InlineAddHighlightFragment inlineAddHighlightFragment) {
        Object obj;
        AnonymousClass0ct anonymousClass0ct;
        if (inlineAddHighlightFragment.m23430G() == AnonymousClass49I.IN_HEADER_AS_TEXT) {
            inlineAddHighlightFragment.mHeaderText.setText(C0164R.string.inline_choose_a_highlight_title);
            inlineAddHighlightFragment.mHeaderText.setGravity(8388627);
            AnonymousClass0Nm.c(inlineAddHighlightFragment.mHeaderText, inlineAddHighlightFragment.getContext().getResources().getDimensionPixelOffset(C0164R.dimen.row_padding));
        } else {
            inlineAddHighlightFragment.mHeaderText.setGravity(17);
            inlineAddHighlightFragment.mHeaderText.setText(C0164R.string.inline_add_highlight_title);
            AnonymousClass0Nm.c(inlineAddHighlightFragment.mHeaderText, 0);
        }
        inlineAddHighlightFragment.mTrayRecyclerView.setVisibility(0);
        AnonymousClass0Nm.O(inlineAddHighlightFragment.mCreateHighlightView);
        m23426C(inlineAddHighlightFragment, AnonymousClass49H.CANCEL);
        AnonymousClass0Nm.N(inlineAddHighlightFragment.mView);
        int i = 8;
        inlineAddHighlightFragment.mHeaderBackButtonStubHolder.D(8);
        if (inlineAddHighlightFragment.m23430G() != AnonymousClass49I.IN_HEADER) {
            if (inlineAddHighlightFragment.m23430G() != AnonymousClass49I.IN_HEADER_AS_TEXT) {
                obj = null;
                anonymousClass0ct = inlineAddHighlightFragment.mHeaderNewButtonStubHolder;
                if (obj != null) {
                    i = 0;
                }
                anonymousClass0ct.D(i);
            }
        }
        obj = 1;
        anonymousClass0ct = inlineAddHighlightFragment.mHeaderNewButtonStubHolder;
        if (obj != null) {
            i = 0;
        }
        anonymousClass0ct.D(i);
    }

    /* renamed from: G */
    private AnonymousClass49I m23430G() {
        return this.mDelegate.TK();
    }

    public final void Sp(int i, boolean z) {
        AnonymousClass14H.C((ViewGroup) getView().getParent()).J().K(true).G((float) (-i)).N();
    }

    public final void onCreate(Bundle bundle) {
        AnonymousClass0IL anonymousClass0IL = this;
        int F = AnonymousClass0cQ.F(this, -1374168497);
        super.onCreate(bundle);
        this.f50889D = AnonymousClass0Ce.G(getArguments());
        String string = getArguments().getString("current_reel_item_media_id");
        int i = getArguments().getInt("initial_selected_media_width");
        int i2 = getArguments().getInt("initial_selected_media_height");
        if (string != null) {
            AnonymousClass0P7 A = AnonymousClass107.f13182C.A(string);
            this.f50892G = A.TO() == AnonymousClass0ON.VIDEO;
            this.mDelegate = new AnonymousClass5Rn(getContext(), this.f50889D, A, i, i2, getArguments().getString("initial_selected_media_url"), (AnonymousClass0Qf) getArguments().getSerializable("reel_viewer_source"));
        } else {
            String string2 = getArguments().getString("InlineAddHighlightFragment.ARG_CAPTURED_MEDIA_FILE_PATH");
            this.f50892G = getArguments().getBoolean("InlineAddHighlightFragment.ARG_CAPTURED_MEDIA_IS_VIDEO");
            if (getArguments().getBoolean("InlineAddHighlightsFragment.ARG_IS_NEW_STORY_HIGHLIGHT_FROM_DIRECT_PICKER_SHEET")) {
                this.mDelegate = new AnonymousClass5Rp(this.f50889D, string2, this.f50892G, i, i2);
            } else {
                this.mDelegate = new AnonymousClass5Ro(this.f50889D, string2, this.f50892G, i, i2);
            }
        }
        this.f50891F = getArguments().getBoolean("InlineAddHighlightsFragment.ARG_IS_MEDIA_MIRRORED");
        this.f50894I = getArguments().getInt("InlineAddHighlightsFragment.ARG_MEDIA_ROTATION_DEGREES");
        AnonymousClass1gg anonymousClass1gg = new AnonymousClass1gg(getContext(), this.f50889D, m23430G() == AnonymousClass49I.IN_TRAY, getArguments().getBoolean("is_in_story_creation_flow_tray", false), false, anonymousClass0IL, AnonymousClass0Qf.PROFILE_HIGHLIGHTS_TRAY, null);
        anonymousClass0IL.f50895J = anonymousClass1gg;
        anonymousClass1gg.f21389C = anonymousClass0IL;
        anonymousClass0IL.f50890E = new AnonymousClass30u(new AnonymousClass49E(anonymousClass0IL), new AnonymousClass49F(anonymousClass0IL), getContext());
        AnonymousClass0cQ.G(anonymousClass0IL, -741290996, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1411186048);
        this.f50893H.A(this);
        View inflate = layoutInflater.inflate(C0164R.layout.layout_inline_add_highlight, viewGroup, false);
        AnonymousClass0cQ.G(this, 699565540, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -81922871);
        super.onDestroyView();
        this.f50893H.D(this);
        InlineAddHighlightFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0cQ.G(this, -80153311, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, -410223);
        super.onPause();
        AnonymousClass0Nm.N(this.mView);
        AnonymousClass0cQ.G(this, 26991, F);
    }

    public final void onStart() {
        int F = AnonymousClass0cQ.F(this, 1528235784);
        super.onStart();
        this.f50893H.B((Activity) getContext());
        AnonymousClass0cQ.G(this, 520486097, F);
    }

    public final void onStop() {
        int F = AnonymousClass0cQ.F(this, -1732596323);
        super.onStop();
        this.f50893H.C();
        AnonymousClass0cQ.G(this, -1914940269, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mView = view;
        this.mCreateHighlightViewStub = (ViewStub) view.findViewById(C0164R.id.inline_create_highlight_metadata_stub);
        AnonymousClass0ct anonymousClass0ct = new AnonymousClass0ct((ViewStub) view.findViewById(C0164R.id.inline_create_highlight_back_button_stub));
        this.mHeaderBackButtonStubHolder = anonymousClass0ct;
        anonymousClass0ct.f7268B = new AnonymousClass499(this);
        this.mHeaderNewButtonStubHolder = new AnonymousClass0ct((ViewStub) view.findViewById(m23430G() == AnonymousClass49I.IN_HEADER_AS_TEXT ? C0164R.id.inline_create_highlight_new_button_text_stub : C0164R.id.inline_create_highlight_new_button_stub));
        this.mHeaderNewButtonStubHolder.f7268B = new AnonymousClass49B(this);
        this.mHeaderText = (TextView) view.findViewById(C0164R.id.header_text);
        TextView textView = (TextView) view.findViewById(C0164R.id.action_button);
        this.mActionButton = textView;
        textView.setOnClickListener(new AnonymousClass49C(this));
        m23426C(this, AnonymousClass49H.CANCEL);
        this.mTrayRecyclerView = (RecyclerView) view.findViewById(C0164R.id.highlights_reel_tray_recycler_view);
        AnonymousClass0la anonymousClass0rr = new AnonymousClass0rr(getContext(), 0, false);
        this.mTrayRecyclerView.setLayoutManager(anonymousClass0rr);
        anonymousClass0rr.f9543B = true;
        this.mTrayRecyclerView.A(new AnonymousClass49D(this, getResources().getDimensionPixelSize(C0164R.dimen.reel_tray_item_separator)));
        this.mTrayRecyclerView.setAdapter(this.f50895J);
        this.mTrayRecyclerView.setVisibility(8);
        this.mLoadingSpinner = (SpinnerImageView) this.mView.findViewById(C0164R.id.loading_spinner);
        this.mLoadingSpinner.setLoadingStatus(AnonymousClass2M2.LOADING);
        AnonymousClass0Cm anonymousClass0Cm = this.f50889D;
        AnonymousClass0GA D = AnonymousClass0hR.D(anonymousClass0Cm, anonymousClass0Cm.f1759C, AnonymousClass0Ny.UseCacheWithTimeout, false);
        D.f2849B = new AnonymousClass1fa(this.f50889D, getContext(), this, true, null);
        schedule(D);
    }

    public final void ov(String str, int i, List list, AnonymousClass0oo anonymousClass0oo, String str2) {
        if (((AnonymousClass0ov) this.f50895J.f21397K.get(str)).f10439C) {
            this.mDelegate.pv(str, true, this);
            return;
        }
        this.f50888C = str;
        this.f50890E.m18199A(this.f50892G ^ true, null);
    }

    public final void qh() {
        m23428E(this, true);
    }

    public final void tn(List list, List list2, AnonymousClass0n8 anonymousClass0n8, boolean z) {
        this.mLoadingSpinner.setLoadingStatus(AnonymousClass2M2.SUCCESS);
        if (list.isEmpty()) {
            m23428E(this, false);
            return;
        }
        this.mDelegate.Cq(list, this.f50895J);
        m23429F(this);
    }
}

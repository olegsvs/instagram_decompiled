package com.instagram.archive.fragment;

import X.AnonymousClass0CC;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0IJ;
import X.AnonymousClass0IT;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eT;
import X.AnonymousClass308;
import X.AnonymousClass30Y;
import X.AnonymousClass30l;
import X.AnonymousClass30m;
import X.AnonymousClass30z;
import X.AnonymousClass492;
import X.AnonymousClass493;
import X.AnonymousClass495;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.switchbutton.IgSwitch;

public class HighlightsMetadataFragment extends AnonymousClass0IJ implements AnonymousClass0IT {
    /* renamed from: B */
    public AnonymousClass30Y f50863B;
    /* renamed from: C */
    public AnonymousClass30z f50864C;
    /* renamed from: D */
    public AnonymousClass0Cm f50865D;
    /* renamed from: E */
    private TextWatcher f50866E;
    /* renamed from: F */
    private InputMethodManager f50867F;
    public IgImageView mCoverImageView;
    public View mEditCoverImageButton;
    public EditText mHighlightTitle;
    public IgSwitch mLaunchStoryCreationWithHighlightStickerSwitch;

    public final String getModuleName() {
        return "reel_highlights_cover_title";
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.a(getResources().getString(C0164R.string.name_title));
        anonymousClass0eT.n(getFragmentManager().H() > 0);
        if (AnonymousClass30Y.m18171E().f36823D.isEmpty() && ((Boolean) AnonymousClass0CC.oN.H(this.f50865D)).booleanValue()) {
            anonymousClass0eT.P(getResources().getString(C0164R.string.done));
        } else {
            anonymousClass0eT.E(getResources().getString(C0164R.string.done), new AnonymousClass495(this));
        }
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 225840519);
        super.onCreate(bundle);
        this.f50865D = AnonymousClass0Ce.G(getArguments());
        this.f50863B = AnonymousClass30Y.m18171E();
        this.f50864C = (AnonymousClass30z) getArguments().getSerializable("highlight_management_source");
        AnonymousClass0cQ.G(this, -2051257162, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -674533194);
        View inflate = layoutInflater.inflate(C0164R.layout.layout_highlights_metadata_fragment, viewGroup, false);
        AnonymousClass0cQ.G(this, -1354970823, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, 32181911);
        super.onDestroyView();
        HighlightsMetadataFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0cQ.G(this, -1801876127, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, 81131133);
        super.onPause();
        this.f50867F.hideSoftInputFromWindow(this.mHighlightTitle.getWindowToken(), 0);
        this.mHighlightTitle.removeTextChangedListener(this.f50866E);
        AnonymousClass0cQ.G(this, 1259076449, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 16514081);
        super.onResume();
        if (this.f50863B.m18168B()) {
            this.f50863B.m18182K(getContext());
        }
        IgImageView igImageView = this.mCoverImageView;
        String E = this.f50863B.m18171E();
        igImageView.setOnLoadListener(new AnonymousClass308(getContext(), igImageView));
        igImageView.setUrl(E);
        getActivity().getWindow().setSoftInputMode(16);
        this.f50867F.showSoftInput(this.mHighlightTitle, 1);
        this.mHighlightTitle.addTextChangedListener(this.f50866E);
        AnonymousClass0cQ.G(this, -1999090712, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mCoverImageView = (IgImageView) view.findViewById(C0164R.id.highlight_cover_image);
        this.mEditCoverImageButton = view.findViewById(C0164R.id.edit_highlight_cover_button);
        OnClickListener anonymousClass492 = new AnonymousClass492(this);
        this.mEditCoverImageButton.setOnClickListener(anonymousClass492);
        this.mCoverImageView.setOnClickListener(anonymousClass492);
        EditText editText = (EditText) view.findViewById(C0164R.id.highlight_title);
        this.mHighlightTitle = editText;
        AnonymousClass30m.m18196J(editText, this.f50865D);
        this.mHighlightTitle.setText(AnonymousClass30Y.m18171E().f36823D);
        editText = this.mHighlightTitle;
        editText.setSelection(editText.getText().length());
        this.f50866E = new AnonymousClass30l(this.mHighlightTitle, new AnonymousClass493(this));
        this.f50867F = (InputMethodManager) getActivity().getSystemService("input_method");
        AnonymousClass0Cm anonymousClass0Cm = this.f50865D;
        if (AnonymousClass30m.m18194H(anonymousClass0Cm, anonymousClass0Cm.B())) {
            this.mLaunchStoryCreationWithHighlightStickerSwitch = (IgSwitch) ((ViewStub) view.findViewById(C0164R.id.highlight_sticker_entry_toggle_stub)).inflate().findViewById(C0164R.id.highlight_sticker_entry_toggle_switch);
        }
    }
}

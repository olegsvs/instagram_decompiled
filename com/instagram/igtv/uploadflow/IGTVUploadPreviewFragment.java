package com.instagram.igtv.uploadflow;

import X.AnonymousClass0Ca;
import X.AnonymousClass0IJ;
import X.AnonymousClass0IS;
import X.AnonymousClass0IT;
import X.AnonymousClass0Nm;
import X.AnonymousClass0PZ;
import X.AnonymousClass0TJ;
import X.AnonymousClass0bN;
import X.AnonymousClass0cQ;
import X.AnonymousClass0dd;
import X.AnonymousClass0eT;
import X.AnonymousClass0eV;
import X.AnonymousClass0eW;
import X.AnonymousClass0ea;
import X.AnonymousClass0mE;
import X.AnonymousClass268;
import X.AnonymousClass2CJ;
import X.AnonymousClass3RE;
import X.AnonymousClass3yY;
import X.AnonymousClass4vR;
import X.AnonymousClass4vS;
import X.AnonymousClass4vT;
import X.AnonymousClass4vU;
import X.AnonymousClass4vV;
import X.AnonymousClass4vW;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.ui.widget.videopreviewview.VideoPreviewView;

public class IGTVUploadPreviewFragment extends AnonymousClass0IJ implements AnonymousClass0PZ, AnonymousClass0IS, AnonymousClass0IT {
    /* renamed from: B */
    public AnonymousClass3RE f58510B;
    /* renamed from: C */
    public Medium f58511C;
    /* renamed from: D */
    private AnonymousClass0eT f58512D;
    /* renamed from: E */
    private final AnonymousClass3yY f58513E = new AnonymousClass4vR(this);
    /* renamed from: F */
    private boolean f58514F;
    public ImageView mPauseButton;
    public SeekBar mSeekBar;
    public VideoPreviewView mVideoPreviewView;
    public TextView mVideoTimer;

    public final String getModuleName() {
        return "igtv_upload_preview_fragment";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    /* renamed from: B */
    public static void m25382B(IGTVUploadPreviewFragment iGTVUploadPreviewFragment) {
        iGTVUploadPreviewFragment.mVideoPreviewView.I();
        iGTVUploadPreviewFragment.mPauseButton.setImageResource(C0164R.drawable.pause);
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        AnonymousClass0eT anonymousClass0eT2 = anonymousClass0eT;
        anonymousClass0eT.d(AnonymousClass0eW.B(AnonymousClass0eV.DEFAULT).A(AnonymousClass0Ca.C(getContext(), C0164R.color.transparent)).B());
        anonymousClass0eT.l(false);
        anonymousClass0eT2.D(AnonymousClass0TJ.D(getContext(), C0164R.drawable.instagram_arrow_back_24, C0164R.color.white, C0164R.drawable.instagram_arrow_back_24, C0164R.color.white_50_transparent), C0164R.string.igtv_upload_flow_prev, new AnonymousClass4vV(this), null, false);
        TextView textView = (TextView) anonymousClass0eT2.M(C0164R.layout.action_button_text_view, C0164R.string.igtv_upload_flow_prev, new AnonymousClass4vW(this), true, false);
        textView.setText(getResources().getString(C0164R.string.igtv_upload_flow_next));
        textView.setBackground(null);
    }

    public final boolean onBackPressed() {
        AnonymousClass0bN.f(AnonymousClass3RE.B(this.f58510B, "igtv_composer_dismiss_selected_video").B(), AnonymousClass0dd.REGULAR);
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1491296134);
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        Window window = Z().getWindow();
        this.f58514F = AnonymousClass0ea.B(window, window.getDecorView());
        this.f58510B = new AnonymousClass3RE(this, arguments.getString("igtv_creation_session_id_arg"), arguments.getString("igtv_session_id_arg"));
        AnonymousClass0cQ.G(this, 1238237008, F);
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        if (i2 == C0164R.anim.right_in && z && VERSION.SDK_INT > 21) {
            Context context = getContext();
            View view = getView();
            Animation loadAnimation = AnimationUtils.loadAnimation(context, C0164R.anim.right_in);
            loadAnimation.setAnimationListener(new AnonymousClass2CJ(view));
            return loadAnimation;
        }
        if (!(z || VERSION.SDK_INT <= 21 || getView() == null)) {
            AnonymousClass0mE.f9733B.h(getView(), 0.0f);
        }
        return super.onCreateAnimation(i, z, i2);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1102964368);
        View inflate = layoutInflater.inflate(C0164R.layout.igtv_upload_preview_viewer, viewGroup, false);
        this.f58512D = new AnonymousClass0eT((ViewGroup) inflate.findViewById(C0164R.id.action_bar_container), new AnonymousClass4vS(this));
        AnonymousClass0cQ.G(this, 118164034, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, 1224808416);
        super.onDestroyView();
        this.mVideoPreviewView.H();
        IGTVUploadPreviewFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0cQ.G(this, 557601122, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, 1724690891);
        super.onPause();
        AnonymousClass0ea.E(Z().getWindow(), Z().getWindow().getDecorView(), this.f58514F);
        this.mVideoPreviewView.G();
        this.mPauseButton.setImageResource(C0164R.drawable.play_icon);
        AnonymousClass0cQ.G(this, -167386123, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 630299784);
        super.onResume();
        this.f58512D.R(this);
        AnonymousClass0ea.E(Z().getWindow(), Z().getWindow().getDecorView(), false);
        if (this.mVideoPreviewView.C()) {
            m25382B(this);
        }
        AnonymousClass0cQ.G(this, 888445747, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mVideoPreviewView = (VideoPreviewView) view.findViewById(C0164R.id.pending_video_preview);
        Context context = getContext();
        this.mSeekBar = (SeekBar) view.findViewById(C0164R.id.scrubber);
        int C = (int) AnonymousClass0Nm.C(context, 11);
        this.mSeekBar.setThumb(new AnonymousClass268(C, C, -1, (int) AnonymousClass0Nm.C(context, 1)));
        this.mPauseButton = (ImageView) view.findViewById(C0164R.id.pause_button);
        this.mVideoTimer = (TextView) view.findViewById(C0164R.id.timer);
        this.f58511C = (Medium) getArguments().getParcelable("igtv_gallery_medium_arg");
        this.mSeekBar.setOnSeekBarChangeListener(new AnonymousClass4vT(this));
        this.mPauseButton.setOnClickListener(new AnonymousClass4vU(this));
        this.mVideoPreviewView.setVideoPath(this.f58511C.f30924N, this.f58513E);
    }
}

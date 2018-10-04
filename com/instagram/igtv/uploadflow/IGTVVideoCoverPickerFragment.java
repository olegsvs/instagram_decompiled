package com.instagram.igtv.uploadflow;

import X.AnonymousClass0Ca;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0IJ;
import X.AnonymousClass0IS;
import X.AnonymousClass0IT;
import X.AnonymousClass0Nm;
import X.AnonymousClass0OA;
import X.AnonymousClass0PZ;
import X.AnonymousClass0TJ;
import X.AnonymousClass0Ur;
import X.AnonymousClass0bt;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eT;
import X.AnonymousClass0eV;
import X.AnonymousClass0eW;
import X.AnonymousClass0ea;
import X.AnonymousClass1QG;
import X.AnonymousClass1Z8;
import X.AnonymousClass22r;
import X.AnonymousClass2CI;
import X.AnonymousClass3RE;
import X.AnonymousClass3oW;
import X.AnonymousClass4vX;
import X.AnonymousClass4vY;
import X.AnonymousClass4vZ;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.creation.base.ui.ConstrainedTextureView;
import com.instagram.pendingmedia.store.PendingMediaStore;

public class IGTVVideoCoverPickerFragment extends AnonymousClass0IJ implements AnonymousClass0PZ, AnonymousClass0IS, AnonymousClass0IT, AnonymousClass0bt {
    /* renamed from: B */
    public int f66062B;
    /* renamed from: C */
    public int f66063C;
    /* renamed from: D */
    public String f66064D;
    /* renamed from: E */
    public AnonymousClass0OA f66065E;
    /* renamed from: F */
    public AnonymousClass0Cm f66066F;
    /* renamed from: G */
    public AnonymousClass1Z8 f66067G;
    /* renamed from: H */
    private AnonymousClass0eT f66068H;
    /* renamed from: I */
    private AnonymousClass3RE f66069I;
    /* renamed from: J */
    private float f66070J;
    /* renamed from: K */
    private boolean f66071K;
    public AnonymousClass0Ur mCoverFrameExtractionProgressDialog;
    public LinearLayout mFilmStripHolderLayout;
    public FrameLayout mParentContainer;
    public ConstrainedTextureView mPreviewTextureView;
    public SeekBar mSeekBar;
    public AnonymousClass1QG mThumb;

    public final boolean bW() {
        return true;
    }

    public final String getModuleName() {
        return "igtv_cover_picker";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        AnonymousClass22r A = AnonymousClass0eW.B(AnonymousClass0eV.DEFAULT).A(AnonymousClass0Ca.C(getContext(), C0164R.color.transparent));
        A.f25416J = AnonymousClass0Ca.C(getContext(), C0164R.color.white);
        AnonymousClass0eT anonymousClass0eT2 = anonymousClass0eT;
        anonymousClass0eT.d(A.B());
        anonymousClass0eT.l(false);
        anonymousClass0eT2.D(AnonymousClass0TJ.D(getContext(), C0164R.drawable.instagram_x_outline_24, C0164R.color.white, C0164R.drawable.instagram_x_outline_24, C0164R.color.white_50_transparent), C0164R.string.igtv_cover_picker_flow_cancel, new AnonymousClass4vY(this), null, false);
        anonymousClass0eT.a(getString(C0164R.string.igtv_upload_cover_photo_screen_title));
        TextView textView = (TextView) anonymousClass0eT2.M(C0164R.layout.action_button_text_view, C0164R.string.igtv_upload_cover_photo_done, new AnonymousClass4vZ(this), true, false);
        textView.setText(getResources().getString(C0164R.string.igtv_upload_cover_photo_done));
        textView.setBackground(null);
    }

    public final boolean onBackPressed() {
        if (this.f66064D == null) {
            this.f66064D = "tap_exit";
        }
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1796063535);
        super.onCreate(bundle);
        this.f66066F = AnonymousClass0Ce.G(getArguments());
        Bundle arguments = getArguments();
        this.f66065E = PendingMediaStore.C().A(arguments.getString("igtv_pending_media_key_arg"));
        this.f66069I = new AnonymousClass3RE(this, arguments.getString("igtv_creation_session_id_arg"), arguments.getString("igtv_session_id_arg"));
        Window window = Z().getWindow();
        this.f66071K = AnonymousClass0ea.B(window, window.getDecorView());
        AnonymousClass0cQ.G(this, 1111851374, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1452983284);
        View inflate = layoutInflater.inflate(C0164R.layout.cover_picker_fragment, viewGroup, false);
        this.f66068H = new AnonymousClass0eT((ViewGroup) inflate.findViewById(C0164R.id.action_bar_container), new AnonymousClass4vX(this));
        AnonymousClass0cQ.G(this, 868763008, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, 1757972932);
        super.onDestroyView();
        String str = this.f66064D;
        if (str != null) {
            this.f66069I.B(str);
        }
        AnonymousClass0cQ.G(this, -374677594, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, -33186349);
        super.onPause();
        AnonymousClass0ea.E(Z().getWindow(), Z().getWindow().getDecorView(), this.f66071K);
        AnonymousClass1Z8 anonymousClass1Z8 = this.f66067G;
        AnonymousClass3oW anonymousClass3oW = anonymousClass1Z8.f20140N.f39955E;
        if (anonymousClass3oW != null) {
            anonymousClass3oW.B();
        }
        anonymousClass1Z8.f20139M.A();
        AnonymousClass0cQ.G(this, 849794353, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, -186254612);
        super.onResume();
        this.f66068H.R(this);
        AnonymousClass0ea.E(Z().getWindow(), Z().getWindow().getDecorView(), false);
        AnonymousClass1Z8 anonymousClass1Z8 = this.f66067G;
        anonymousClass1Z8.f20140N.f39952B = anonymousClass1Z8;
        AnonymousClass3oW anonymousClass3oW = anonymousClass1Z8.f20140N.f39955E;
        if (anonymousClass3oW != null) {
            anonymousClass3oW.D();
        }
        if (anonymousClass1Z8.f20132F.getChildCount() * anonymousClass1Z8.f20138L > 0 && anonymousClass1Z8.f20139M != null) {
            AnonymousClass1Z8.B(anonymousClass1Z8);
        }
        AnonymousClass0cQ.G(this, 1031780884, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Context context = getContext();
        AnonymousClass0Nm.F(context);
        this.f66070J = AnonymousClass0Nm.H(getResources().getDisplayMetrics());
        SeekBar seekBar = (SeekBar) view.findViewById(C0164R.id.scrubber_seekbar);
        this.mSeekBar = seekBar;
        seekBar.setProgress(0);
        int J = AnonymousClass0Nm.J(context) / 8;
        this.f66063C = J;
        this.f66062B = (int) (((float) J) / AnonymousClass0Nm.H(getResources().getDisplayMetrics()));
        this.mThumb = new AnonymousClass1QG(getResources());
        int C = (int) (((float) this.f66062B) + AnonymousClass0Nm.C(context, 0));
        this.mThumb.f18349D = true;
        AnonymousClass1QG anonymousClass1QG = this.mThumb;
        anonymousClass1QG.f18350E = (int) (((float) C) * this.f66070J);
        anonymousClass1QG.f18348C = C;
        this.mSeekBar.setThumb(this.mThumb);
        AnonymousClass0Nm.Z(this.mSeekBar, C);
        this.mFilmStripHolderLayout = (LinearLayout) view.findViewById(C0164R.id.filmstrip_keyframes_holder);
        this.f66067G = new AnonymousClass1Z8(getContext(), (FrameLayout) view.findViewById(C0164R.id.frame_container), this.mSeekBar, this.mThumb, this.mFilmStripHolderLayout, AnonymousClass2CI.D(getContext(), this.f66066F), this.f66065E, this, this.f66063C, this.f66062B);
    }
}

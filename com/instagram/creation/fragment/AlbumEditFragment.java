package com.instagram.creation.fragment;

import X.AnonymousClass0Cm;
import X.AnonymousClass0F4;
import X.AnonymousClass0F8;
import X.AnonymousClass0FH;
import X.AnonymousClass0IJ;
import X.AnonymousClass0IL;
import X.AnonymousClass0IS;
import X.AnonymousClass0OA;
import X.AnonymousClass0PJ;
import X.AnonymousClass0PK;
import X.AnonymousClass0PQ;
import X.AnonymousClass0PU;
import X.AnonymousClass0TK;
import X.AnonymousClass0cQ;
import X.AnonymousClass0ch;
import X.AnonymousClass0ci;
import X.AnonymousClass0e5;
import X.AnonymousClass0iq;
import X.AnonymousClass1Qo;
import X.AnonymousClass1Qs;
import X.AnonymousClass2NO;
import X.AnonymousClass2NY;
import X.AnonymousClass3CD;
import X.AnonymousClass3CJ;
import X.AnonymousClass3CK;
import X.AnonymousClass3Cc;
import X.AnonymousClass3Cj;
import X.AnonymousClass3Cl;
import X.AnonymousClass3Cs;
import X.AnonymousClass3Cu;
import X.AnonymousClass3D3;
import X.AnonymousClass3DG;
import X.AnonymousClass3GM;
import X.AnonymousClass3GU;
import X.AnonymousClass3HZ;
import X.AnonymousClass3Id;
import X.AnonymousClass3Ie;
import X.AnonymousClass3ym;
import X.AnonymousClass3zR;
import X.AnonymousClass4H2;
import X.AnonymousClass4H3;
import X.AnonymousClass4HA;
import X.AnonymousClass4I1;
import X.AnonymousClass4Ur;
import X.AnonymousClass4Us;
import X.AnonymousClass4Ut;
import X.AnonymousClass4Uu;
import X.AnonymousClass4Uv;
import X.AnonymousClass4Uw;
import X.AnonymousClass4Ux;
import X.AnonymousClass4Uy;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.facebook.C0164R;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.base.MediaSession;
import com.instagram.creation.base.PhotoSession;
import com.instagram.creation.base.VideoSession;
import com.instagram.creation.base.ui.effectpicker.EffectPicker;
import com.instagram.creation.base.ui.effectpicker.FilterPicker;
import com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.filterkit.filter.IgFilterGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AlbumEditFragment extends AnonymousClass0IJ implements AnonymousClass0IS {
    /* renamed from: B */
    public ViewSwitcher f64901B;
    /* renamed from: C */
    public ViewGroup f64902C;
    /* renamed from: D */
    public AnonymousClass3Cu f64903D;
    /* renamed from: E */
    public AnonymousClass0iq f64904E;
    /* renamed from: F */
    public CreationSession f64905F;
    /* renamed from: G */
    public boolean f64906G = false;
    /* renamed from: H */
    public ImageView f64907H;
    /* renamed from: I */
    public AnonymousClass0PJ f64908I;
    /* renamed from: J */
    public AnonymousClass0PK f64909J;
    /* renamed from: K */
    public boolean f64910K = false;
    /* renamed from: L */
    public AnonymousClass0PQ f64911L;
    /* renamed from: M */
    public boolean f64912M;
    /* renamed from: N */
    public AnonymousClass0Cm f64913N;
    /* renamed from: O */
    private List f64914O;
    /* renamed from: P */
    private final AnonymousClass0F8 f64915P = new AnonymousClass4Ur(this);
    public FilterPicker mFilterPicker;
    public AnonymousClass4HA mRenderViewController;

    public final String getModuleName() {
        return "albums_filter";
    }

    /* renamed from: B */
    public static boolean m27022B(AlbumEditFragment albumEditFragment) {
        for (VideoSession videoSession : albumEditFragment.f64905F.N()) {
            if (!albumEditFragment.f64908I.LP(videoSession.f39000N).hB) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: C */
    public static List m27023C() {
        Collection<AnonymousClass3Cj> C = AnonymousClass3Cl.C();
        AnonymousClass3Cu anonymousClass4H2 = new AnonymousClass4H2();
        List arrayList = new ArrayList();
        for (AnonymousClass3Cj anonymousClass4H3 : C) {
            arrayList.add(new AnonymousClass4H3(anonymousClass4H3, anonymousClass4H2));
        }
        return arrayList;
    }

    /* renamed from: D */
    public static int m27024D(AlbumEditFragment albumEditFragment) {
        int i = -1;
        for (int i2 = 0; i2 < albumEditFragment.f64914O.size(); i2++) {
            int i3;
            MediaSession mediaSession = (MediaSession) albumEditFragment.f64914O.get(i2);
            if (mediaSession.f38977C == AnonymousClass3CD.PHOTO) {
                i3 = ((PhotoFilter) mediaSession.f38976B.f38982E.B(15)).f50029G;
            } else if (mediaSession.f38977C == AnonymousClass3CD.VIDEO) {
                i3 = albumEditFragment.f64908I.LP(mediaSession.B()).AD;
            } else {
                i3 = -1;
            }
            if (i2 == 0) {
                i = i3;
            } else if (i != i3) {
                return -1;
            }
        }
        return i;
    }

    /* renamed from: E */
    public static void m27025E(AlbumEditFragment albumEditFragment, boolean z) {
        AnonymousClass3HZ.B(new AnonymousClass3zR());
        if (albumEditFragment.m27031b()) {
            albumEditFragment.f64903D.Hd(z);
            albumEditFragment.f64903D = null;
            albumEditFragment.f64901B.setDisplayedChild(0);
            albumEditFragment.f64902C.removeAllViews();
            albumEditFragment.mRenderViewController.A();
        }
    }

    /* renamed from: F */
    public static void m27026F(AlbumEditFragment albumEditFragment, MediaSession mediaSession, boolean z) {
        AnonymousClass3CJ.E(albumEditFragment.f64913N, albumEditFragment.getContext());
        AnonymousClass3CJ D = AnonymousClass3CJ.D(albumEditFragment.f64913N);
        D.E(albumEditFragment.getContext());
        D.G(z);
        switch (AnonymousClass4Uy.f54675B[mediaSession.f38977C.ordinal()]) {
            case 1:
                PhotoSession photoSession = mediaSession.f38976B;
                if (photoSession.f38980C != null) {
                    D.F(photoSession.f38980C, false, photoSession.f38981D);
                    D.H(photoSession.f38986I);
                    return;
                }
                return;
            case 2:
                int B = AnonymousClass3D3.B(albumEditFragment.getContext(), AnonymousClass3Cs.f39113J);
                AnonymousClass0OA LP = albumEditFragment.f64908I.LP(mediaSession.B());
                File file = new File(albumEditFragment.getContext().getExternalFilesDir(null), "icon_zero_frame.jpg");
                AnonymousClass3Id.D(albumEditFragment.getContext(), LP, file, B, B, 50);
                D.F(new CropInfo(B, B, new Rect(0, 0, B, B)), false, 0);
                D.H(file.getAbsolutePath());
                return;
            default:
                return;
        }
    }

    /* renamed from: G */
    private void m27027G() {
        CreationSession creationSession = this.f64905F;
        AnonymousClass0PJ anonymousClass0PJ = this.f64908I;
        creationSession.f38960N.clear();
        for (AnonymousClass1Qs anonymousClass1Qs : creationSession.f38965S) {
            MediaSession mediaSession = anonymousClass1Qs.f18481G;
            AnonymousClass0OA LP = anonymousClass0PJ.LP(mediaSession.B());
            if (mediaSession.f38977C == AnonymousClass3CD.PHOTO) {
                mediaSession.f38976B.f38982E = anonymousClass1Qs.f18479E.D();
            } else if (mediaSession.f38977C == AnonymousClass3CD.VIDEO) {
                LP.AD = anonymousClass1Qs.f18483I;
                LP.f3815c = anonymousClass1Qs.f18478D;
                LP.bC.f17220Q = anonymousClass1Qs.f18477C;
                LP.bC.f17209F = anonymousClass1Qs.f18476B;
                LP.hB = anonymousClass1Qs.f18480F;
            }
            creationSession.f38960N.add(mediaSession);
        }
        creationSession.f38956J = false;
        List arrayList = new ArrayList();
        for (MediaSession mediaSession2 : this.f64914O) {
            AnonymousClass0OA LP2 = this.f64908I.LP(mediaSession2.B());
            if (LP2 != null) {
                if (!LP2.OB) {
                    LP2.uB = null;
                }
                if (mediaSession2.f38977C == AnonymousClass3CD.PHOTO) {
                    PhotoSession photoSession = mediaSession2.f38976B;
                    AnonymousClass3GU.G(photoSession.f38982E, this.f64909J.gJ(photoSession.f38986I), this.f64909J.nN(photoSession.f38986I), photoSession.f38980C.f38972D, photoSession.f38980C.f38971C, photoSession.f38980C.f38970B, photoSession.f38981D);
                } else if (mediaSession2.f38977C == AnonymousClass3CD.VIDEO) {
                    AnonymousClass2NO.D(LP2.CD, getContext());
                }
                arrayList.add(LP2.f3837y);
            }
        }
        if (this.f64912M) {
            AnonymousClass4I1.B().A(arrayList);
        }
    }

    /* renamed from: H */
    private boolean m27028H() {
        if (this.f64912M || !this.f64908I.LP(this.f64905F.f38949C).f()) {
            if (!this.f64905F.f38956J) {
                for (MediaSession mediaSession : this.f64914O) {
                    String B = mediaSession.B();
                    AnonymousClass0OA LP = this.f64908I.LP(B);
                    AnonymousClass1Qs H = this.f64905F.H(B);
                    if (!LP.f()) {
                        boolean B2;
                        switch (mediaSession.f38977C.ordinal()) {
                            case 0:
                                IgFilterGroup igFilterGroup = mediaSession.f38976B.f38982E;
                                if (LP.NB && H != null) {
                                    B2 = AnonymousClass3GU.B(igFilterGroup, H.f18479E.D());
                                    break;
                                }
                                B2 = AnonymousClass3GU.F(igFilterGroup, true);
                                break;
                                break;
                            case 1:
                                if (LP.NB && H != null) {
                                    B2 = AnonymousClass3Id.C(LP, H.f18483I, H.f18478D, H.f18477C, H.f18476B, H.f18480F);
                                    break;
                                }
                                B2 = AnonymousClass3Id.B(LP);
                                break;
                                break;
                            default:
                                continue;
                        }
                        if (B2) {
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* renamed from: I */
    private void m27029I() {
        this.f64907H = (ImageView) getActivity().findViewById(C0164R.id.button_mode_mute);
        if (this.f64905F.P()) {
            this.f64907H.setVisibility(0);
            this.f64907H.setSelected(m27022B(this));
            this.f64907H.setOnClickListener(new AnonymousClass4Ux(this));
            return;
        }
        this.f64907H.setVisibility(8);
    }

    /* renamed from: J */
    private void m27030J() {
        View view = getView();
        if (view != null) {
            view.postDelayed(new AnonymousClass4Uw(this), 500);
        }
    }

    /* renamed from: b */
    public final boolean m27031b() {
        return this.f64903D != null;
    }

    public final void onAttach(android.content.Context r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        super.onAttach(r3);
        r1 = r2.getActivity();	 Catch:{ ClassCastException -> 0x0036 }
        r1 = (X.AnonymousClass0PI) r1;	 Catch:{ ClassCastException -> 0x0036 }
        r0 = r1.VK();	 Catch:{ ClassCastException -> 0x0036 }
        r2.f64905F = r0;	 Catch:{ ClassCastException -> 0x0036 }
        r0 = r1.rT();	 Catch:{ ClassCastException -> 0x0036 }
        r2.f64913N = r0;	 Catch:{ ClassCastException -> 0x0036 }
        r0 = r2.f64905F;	 Catch:{ ClassCastException -> 0x0036 }
        r0 = r0.I();	 Catch:{ ClassCastException -> 0x0036 }
        r2.f64914O = r0;	 Catch:{ ClassCastException -> 0x0036 }
        r0 = r2.getActivity();	 Catch:{ ClassCastException -> 0x0036 }
        r0 = (X.AnonymousClass0PK) r0;	 Catch:{ ClassCastException -> 0x0036 }
        r2.f64909J = r0;	 Catch:{ ClassCastException -> 0x0036 }
        r0 = r2.getActivity();	 Catch:{ ClassCastException -> 0x0036 }
        r0 = (X.AnonymousClass0PJ) r0;	 Catch:{ ClassCastException -> 0x0036 }
        r2.f64908I = r0;	 Catch:{ ClassCastException -> 0x0036 }
        r0 = r2.getActivity();	 Catch:{ ClassCastException -> 0x0036 }
        r0 = (X.AnonymousClass0PQ) r0;	 Catch:{ ClassCastException -> 0x0036 }
        r2.f64911L = r0;	 Catch:{ ClassCastException -> 0x0036 }
        return;	 Catch:{ ClassCastException -> 0x0036 }
    L_0x0036:
        r2 = new java.lang.ClassCastException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = r3.toString();
        r1.append(r0);
        r0 = " must implement CreationProvider";
        r1.append(r0);
        r0 = r1.toString();
        r2.<init>(r0);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.fragment.AlbumEditFragment.onAttach(android.content.Context):void");
    }

    public final boolean onBackPressed() {
        if (m27031b()) {
            m27025E(this, false);
            return true;
        } else if (m27028H()) {
            if (this.f64909J.JL().B(!this.f64912M ? AnonymousClass3Cc.SAVE_CAROUSEL_DRAFT : AnonymousClass3Cc.UNSAVED_ALBUM_CHANGES)) {
                return true;
            }
            m27027G();
            return false;
        } else {
            m27027G();
            AnonymousClass2NY.B().A("gallery");
            return false;
        }
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -2005487848);
        super.onCreate(bundle);
        this.f64912M = getArguments().getBoolean("standalone_mode", false);
        AnonymousClass0F4.f2058E.A(AnonymousClass1Qo.class, this.f64915P);
        AnonymousClass0cQ.G(this, 358172979, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1280810336);
        View inflate = layoutInflater.inflate(C0164R.layout.fragment_album_filter, viewGroup, false);
        AnonymousClass0cQ.G(this, 525299944, F);
        return inflate;
    }

    public final void onDestroy() {
        int F = AnonymousClass0cQ.F(this, -594881771);
        super.onDestroy();
        AnonymousClass0F4.f2058E.D(AnonymousClass1Qo.class, this.f64915P);
        AnonymousClass0cQ.G(this, 1150066134, F);
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, 1726943142);
        super.onDestroyView();
        unregisterLifecycleListener(this.mRenderViewController);
        AlbumEditFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0cQ.G(this, -827813553, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, -1010694696);
        super.onPause();
        AnonymousClass0iq anonymousClass0iq = this.f64904E;
        if (anonymousClass0iq != null) {
            anonymousClass0iq.A(false);
            this.f64904E = null;
        }
        AnonymousClass0cQ.G(this, 754059713, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, -1093514100);
        super.onResume();
        getActivity().setRequestedOrientation(1);
        getActivity().getWindow().addFlags(DexStore.LOAD_RESULT_MIXED_MODE);
        AnonymousClass0cQ.G(this, 658541008, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        AnonymousClass0IL anonymousClass0IL = this;
        View view2 = view;
        super.onViewCreated(view, bundle);
        LayoutInflater from = LayoutInflater.from(getContext());
        if (AnonymousClass0ci.B(AnonymousClass0ch.DEFAULT).f7231B) {
            m27026F(this, (MediaSession) this.f64914O.get(0), true);
            AnonymousClass3CJ.D(this.f64913N).D(AnonymousClass3GM.B());
        }
        for (PhotoSession photoSession : this.f64905F.M()) {
            AnonymousClass3GU.I(photoSession.f38982E, this.f64909J.gJ(photoSession.f38986I), this.f64909J.nN(photoSession.f38986I));
        }
        ReboundHorizontalScrollView reboundHorizontalScrollView = (ReboundHorizontalScrollView) view.findViewById(C0164R.id.render_scroll_view);
        AnonymousClass0e5 C = AnonymousClass0e5.C(28.0d, 15.0d);
        AnonymousClass0e5 C2 = AnonymousClass0e5.C(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 3.8d);
        reboundHorizontalScrollView.setSnappingSpringConfig(C);
        reboundHorizontalScrollView.setScrollingSpringConfig(C2);
        reboundHorizontalScrollView.setDeceleratingVelocity(((float) ViewConfiguration.get(getContext()).getScaledMinimumFlingVelocity()) * 2.0f);
        AnonymousClass0TK anonymousClass4HA = new AnonymousClass4HA(getActivity(), getContext(), this.f64909J, this.f64908I, reboundHorizontalScrollView, anonymousClass0IL, this.f64905F, (AnonymousClass0PU) getActivity(), anonymousClass0IL);
        anonymousClass0IL.mRenderViewController = anonymousClass4HA;
        registerLifecycleListener(anonymousClass4HA);
        anonymousClass0IL.f64901B = (ViewSwitcher) view2.findViewById(C0164R.id.album_edit_filter_view_switcher);
        anonymousClass0IL.f64902C = (ViewGroup) view2.findViewById(C0164R.id.adjust_container);
        ViewGroup viewGroup = (ViewGroup) anonymousClass0IL.f64901B.findViewById(C0164R.id.accept_buttons_container);
        viewGroup.getLayoutParams().height = getActivity().findViewById(C0164R.id.action_bar).getLayoutParams().height;
        View inflate = from.inflate(C0164R.layout.accept_reject_edit_buttons, viewGroup, false);
        inflate.setId(C0164R.id.primary_accept_buttons);
        viewGroup.removeAllViews();
        viewGroup.addView(inflate);
        getActivity().findViewById(C0164R.id.button_accept_adjust).setOnClickListener(new AnonymousClass4Us(anonymousClass0IL));
        getActivity().findViewById(C0164R.id.button_cancel_adjust).setOnClickListener(new AnonymousClass4Ut(anonymousClass0IL));
        int D = m27024D(anonymousClass0IL);
        FilterPicker filterPicker = (FilterPicker) view2.findViewById(C0164R.id.album_filter_picker);
        anonymousClass0IL.mFilterPicker = filterPicker;
        filterPicker.setFilterListener(new AnonymousClass4Uu(anonymousClass0IL, D));
        List arrayList = new ArrayList(m27023C());
        anonymousClass0IL.mFilterPicker.setEffects(arrayList);
        if (D >= 0) {
            int B = AnonymousClass3Ie.B(arrayList, D);
            EffectPicker effectPicker = anonymousClass0IL.mFilterPicker;
            if (B < 0) {
                B = 0;
            }
            effectPicker.setRestoreSelectedIndex(B);
        }
        if (AnonymousClass0ci.B(AnonymousClass0ch.DEFAULT).f7231B) {
            List arrayList2 = new ArrayList();
            for (AnonymousClass3ym anonymousClass3ym : anonymousClass0IL.mFilterPicker.getTileButtons()) {
                if (anonymousClass3ym.getTileInfo().oM() != -1) {
                    arrayList2.add(new AnonymousClass3CK(anonymousClass3ym.getTileInfo().oM(), anonymousClass3ym));
                }
            }
            AnonymousClass3CJ.D(anonymousClass0IL.f64913N).B(arrayList2);
        }
        MediaEditActionBar KO = anonymousClass0IL.f64909J.KO();
        if (anonymousClass0IL.f64912M) {
            KO.setupBackButton(AnonymousClass3DG.CANCEL);
        } else {
            KO.setupBackButton(AnonymousClass3DG.BACK);
        }
        TextView textView = (TextView) getActivity().findViewById(C0164R.id.next_button_textview);
        CharSequence string = getContext().getResources().getString(anonymousClass0IL.f64912M ? C0164R.string.done : C0164R.string.next);
        textView.setText(string);
        textView.setContentDescription(string);
        textView.setOnClickListener(new AnonymousClass4Uv(anonymousClass0IL));
        if ((AnonymousClass0FH.f2099C.f2100B.getInt("album_filter_tooltip_impressions", 0) < 2 ? 1 : null) != null) {
            m27030J();
            AnonymousClass0FH anonymousClass0FH = AnonymousClass0FH.f2099C;
            String str = "album_filter_tooltip_impressions";
            anonymousClass0FH.f2100B.edit().putInt(str, anonymousClass0FH.f2100B.getInt(str, 0) + 1).apply();
        }
        LinearLayout linearLayout = (LinearLayout) getActivity().findViewById(C0164R.id.creation_secondary_actions);
        linearLayout.removeAllViews();
        from.inflate(C0164R.layout.mute_audio_button, linearLayout);
        m27029I();
    }
}

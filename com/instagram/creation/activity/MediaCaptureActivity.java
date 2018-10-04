package com.instagram.creation.activity;

import X.AnonymousClass0CC;
import X.AnonymousClass0Cd;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0EQ;
import X.AnonymousClass0F4;
import X.AnonymousClass0F6;
import X.AnonymousClass0F8;
import X.AnonymousClass0FO;
import X.AnonymousClass0Fx;
import X.AnonymousClass0G5;
import X.AnonymousClass0GA;
import X.AnonymousClass0GG;
import X.AnonymousClass0GK;
import X.AnonymousClass0Gn;
import X.AnonymousClass0HV;
import X.AnonymousClass0Hx;
import X.AnonymousClass0IJ;
import X.AnonymousClass0IL;
import X.AnonymousClass0IV;
import X.AnonymousClass0Iz;
import X.AnonymousClass0Mt;
import X.AnonymousClass0OA;
import X.AnonymousClass0OK;
import X.AnonymousClass0ON;
import X.AnonymousClass0OO;
import X.AnonymousClass0PE;
import X.AnonymousClass0PF;
import X.AnonymousClass0PI;
import X.AnonymousClass0PJ;
import X.AnonymousClass0PK;
import X.AnonymousClass0PM;
import X.AnonymousClass0PN;
import X.AnonymousClass0PO;
import X.AnonymousClass0PP;
import X.AnonymousClass0PQ;
import X.AnonymousClass0PR;
import X.AnonymousClass0PS;
import X.AnonymousClass0PT;
import X.AnonymousClass0PU;
import X.AnonymousClass0PV;
import X.AnonymousClass0PW;
import X.AnonymousClass0Pu;
import X.AnonymousClass0a2;
import X.AnonymousClass0cJ;
import X.AnonymousClass0cQ;
import X.AnonymousClass0ch;
import X.AnonymousClass0ci;
import X.AnonymousClass0g0;
import X.AnonymousClass0g3;
import X.AnonymousClass17t;
import X.AnonymousClass1JM;
import X.AnonymousClass1Qn;
import X.AnonymousClass1Qo;
import X.AnonymousClass1Qp;
import X.AnonymousClass1Qr;
import X.AnonymousClass1Qs;
import X.AnonymousClass2Gx;
import X.AnonymousClass2NO;
import X.AnonymousClass2NY;
import X.AnonymousClass2bj;
import X.AnonymousClass3B1;
import X.AnonymousClass3B2;
import X.AnonymousClass3BZ;
import X.AnonymousClass3Bb;
import X.AnonymousClass3CD;
import X.AnonymousClass3CJ;
import X.AnonymousClass3Cc;
import X.AnonymousClass3Cd;
import X.AnonymousClass3DQ;
import X.AnonymousClass3GL;
import X.AnonymousClass3GU;
import X.AnonymousClass3Gc;
import X.AnonymousClass3Gh;
import X.AnonymousClass3HZ;
import X.AnonymousClass3Hb;
import X.AnonymousClass3Id;
import X.AnonymousClass3Ih;
import X.AnonymousClass3Ox;
import X.AnonymousClass3z9;
import X.AnonymousClass3zH;
import X.AnonymousClass3zQ;
import X.AnonymousClass3zS;
import X.AnonymousClass3zT;
import X.AnonymousClass3zU;
import X.AnonymousClass3zW;
import X.AnonymousClass3zX;
import X.AnonymousClass3zY;
import X.AnonymousClass3zZ;
import X.AnonymousClass3zb;
import X.AnonymousClass3zd;
import X.AnonymousClass3zf;
import X.AnonymousClass3zg;
import X.AnonymousClass44j;
import X.AnonymousClass44k;
import X.AnonymousClass44l;
import X.AnonymousClass44m;
import X.AnonymousClass44n;
import X.AnonymousClass44o;
import X.AnonymousClass44p;
import X.AnonymousClass4Gv;
import X.AnonymousClass4Gy;
import X.AnonymousClass4Gz;
import X.AnonymousClass4H0;
import X.AnonymousClass4HG;
import X.AnonymousClass4I1;
import X.AnonymousClass4Iq;
import X.AnonymousClass4Jz;
import X.AnonymousClass4YN;
import X.AnonymousClass5Ud;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Rect;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import com.facebook.C0164R;
import com.facebook.common.dextricks.DexStore;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.ui.widget.draggable.DraggableContainer;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.base.MediaSession;
import com.instagram.creation.base.PhotoSession;
import com.instagram.creation.base.VideoSession;
import com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar;
import com.instagram.creation.photo.crop.JHeadBridge;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.creation.photo.edit.filter.BasicAdjustFilter;
import com.instagram.creation.photo.edit.filter.BlurredLumAdjustFilter;
import com.instagram.creation.photo.edit.luxfilter.LocalLaplacianFilter;
import com.instagram.creation.photo.edit.luxfilter.LuxFilter;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;
import com.instagram.creation.state.CreationState;
import com.instagram.filterkit.filter.IgFilter;
import com.instagram.filterkit.filter.IgFilterGroup;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.pendingmedia.store.PendingMediaStoreSerializer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.webrtc.audio.WebRtcAudioRecord;

public class MediaCaptureActivity extends IgFragmentActivity implements AnonymousClass0PI, AnonymousClass0PJ, AnonymousClass0PK, AnonymousClass0PM, AnonymousClass0PN, AnonymousClass0PO, AnonymousClass0F8, AnonymousClass0PF, AnonymousClass0PP, AnonymousClass0PQ, AnonymousClass0PR, AnonymousClass0PS, AnonymousClass0PT, AnonymousClass0PU, AnonymousClass0PV, AnonymousClass0PW {
    /* renamed from: B */
    public View f4064B;
    /* renamed from: C */
    public AnonymousClass3Cd f4065C;
    /* renamed from: D */
    public AnonymousClass0IJ f4066D;
    /* renamed from: E */
    public AnonymousClass4Jz f4067E;
    /* renamed from: F */
    public AnonymousClass4Gv f4068F;
    /* renamed from: G */
    public AnonymousClass0GK f4069G;
    /* renamed from: H */
    public CreationSession f4070H;
    /* renamed from: I */
    public AnonymousClass0Cm f4071I;
    /* renamed from: J */
    private final Set f4072J = new HashSet();
    /* renamed from: K */
    private final Map f4073K = new HashMap();
    /* renamed from: L */
    private AnonymousClass1Qn f4074L;

    public final void zh(int i, int i2) {
    }

    public final void AJA(AnonymousClass0F8 anonymousClass0F8) {
        this.f4074L.m11370B(anonymousClass0F8);
    }

    /* renamed from: B */
    public static void m3816B(MediaCaptureActivity mediaCaptureActivity) {
        mediaCaptureActivity.VK().B();
        mediaCaptureActivity.f4073K.clear();
        if (AnonymousClass0ci.m5926B(AnonymousClass0ch.DEFAULT).f7231B) {
            AnonymousClass3CJ.E(mediaCaptureActivity.f4071I, mediaCaptureActivity);
        }
    }

    /* renamed from: C */
    public static void m3817C(MediaCaptureActivity mediaCaptureActivity, boolean z, AnonymousClass0OA anonymousClass0OA, AnonymousClass0OA anonymousClass0OA2, String str) {
        String str2;
        if (z) {
            str2 = anonymousClass0OA.DB;
        } else {
            str2 = anonymousClass0OA.SC;
        }
        AnonymousClass0GG.m1763B(AnonymousClass0Fx.m1698B(), new AnonymousClass3BZ(str2, str, new WeakReference(new AnonymousClass4Gy(mediaCaptureActivity, z, anonymousClass0OA2, str))), -382968601);
    }

    /* renamed from: D */
    public static AnonymousClass0OA m3818D(MediaCaptureActivity mediaCaptureActivity, Uri uri, String str) {
        m3816B(mediaCaptureActivity);
        AnonymousClass0OA B = AnonymousClass3Ih.B(mediaCaptureActivity.getApplicationContext(), mediaCaptureActivity.getIntent().getIntExtra("mediaSource", 2), mediaCaptureActivity.VK(), uri.toString());
        B.ZC = str;
        mediaCaptureActivity.sUA(B);
        return B;
    }

    public final void Dc() {
        runOnUiThread(new AnonymousClass4H0(this));
    }

    /* renamed from: E */
    public static void m3819E(MediaCaptureActivity mediaCaptureActivity, PhotoSession photoSession, boolean z, boolean z2) {
        AnonymousClass0OA LP = mediaCaptureActivity.LP(photoSession.f38985H);
        mediaCaptureActivity.f4067E.A(photoSession.f38986I);
        if (LP.NB) {
            if (z2) {
                IgFilter luxFilter;
                AnonymousClass1JM anonymousClass1JM = LP.AC;
                IgFilterGroup igFilterGroup = photoSession.f38982E;
                Rect rect = photoSession.f38980C.f38970B;
                int i = photoSession.f38981D;
                if (anonymousClass1JM.f17014K != null) {
                    IgFilter photoFilter = new PhotoFilter(AnonymousClass3Ox.B().B(anonymousClass1JM.f17014K.intValue()), igFilterGroup.f48235F);
                    photoFilter.G(Math.round(anonymousClass1JM.f17013J.floatValue() * 100.0f));
                    igFilterGroup.F(15, photoFilter);
                    igFilterGroup.G(15, true);
                }
                if (anonymousClass1JM.f17016M != null) {
                    luxFilter = new LuxFilter();
                    luxFilter.F(Math.round(anonymousClass1JM.f17016M.floatValue() * 100.0f));
                    igFilterGroup.F(9, luxFilter);
                    igFilterGroup.G(9, true);
                }
                luxFilter = new BasicAdjustFilter();
                if (anonymousClass1JM.f17006C != null) {
                    luxFilter.f49496B = Math.round(anonymousClass1JM.f17006C.floatValue() * 100.0f);
                    luxFilter.invalidate();
                }
                if (anonymousClass1JM.f17007D != null) {
                    luxFilter.f49498D = Math.round(anonymousClass1JM.f17007D.floatValue() * 100.0f);
                    luxFilter.invalidate();
                }
                if (anonymousClass1JM.f17020Q != null) {
                    luxFilter.f49502H = Math.round(anonymousClass1JM.f17020Q.floatValue() * 100.0f);
                    luxFilter.invalidate();
                }
                if (anonymousClass1JM.f17024U != null) {
                    luxFilter.f49505K = Math.round(anonymousClass1JM.f17024U.floatValue() * 100.0f);
                    luxFilter.invalidate();
                }
                if (anonymousClass1JM.f17033d != null) {
                    luxFilter.f49516V = Math.round(anonymousClass1JM.f17033d.floatValue() * 100.0f);
                    luxFilter.invalidate();
                }
                if (anonymousClass1JM.f17012I != null) {
                    luxFilter.f49500F = Math.round(anonymousClass1JM.f17012I.floatValue() * 100.0f);
                    luxFilter.invalidate();
                }
                if (anonymousClass1JM.f17032c != null) {
                    luxFilter.f49511Q = anonymousClass1JM.f17032c.intValue();
                    luxFilter.invalidate();
                    luxFilter.f49513S = Math.round(anonymousClass1JM.f17031b.floatValue() * 100.0f);
                    luxFilter.invalidate();
                }
                if (anonymousClass1JM.f17030a != null) {
                    luxFilter.f49507M = anonymousClass1JM.f17030a.intValue();
                    luxFilter.invalidate();
                    luxFilter.f49509O = Math.round(anonymousClass1JM.f17029Z.floatValue() * 100.0f);
                    luxFilter.invalidate();
                }
                if (luxFilter.A()) {
                    igFilterGroup.F(13, luxFilter);
                    igFilterGroup.G(13, true);
                }
                luxFilter = new BlurredLumAdjustFilter();
                if (anonymousClass1JM.f17022S != null) {
                    luxFilter.D(Math.round(anonymousClass1JM.f17022S.floatValue() * 100.0f));
                }
                if (anonymousClass1JM.f17021R != null) {
                    luxFilter.C(Math.round(anonymousClass1JM.f17021R.floatValue() * 100.0f));
                }
                if (anonymousClass1JM.f17015L != null) {
                    luxFilter.B(Math.round(anonymousClass1JM.f17015L.floatValue() * 100.0f));
                }
                if (luxFilter.A()) {
                    igFilterGroup.F(12, luxFilter);
                    igFilterGroup.G(12, true);
                }
                luxFilter = new LocalLaplacianFilter();
                if (anonymousClass1JM.f17023T != null) {
                    luxFilter.f50065D = Math.round(anonymousClass1JM.f17023T.floatValue() * 100.0f);
                    luxFilter.invalidate();
                    igFilterGroup.F(10, luxFilter);
                    igFilterGroup.G(10, true);
                }
                luxFilter = new SurfaceCropFilter();
                if (anonymousClass1JM.f17010G != null) {
                    luxFilter.L((int) anonymousClass1JM.f17010G.x, (int) anonymousClass1JM.f17010G.y, rect, i);
                }
                if (anonymousClass1JM.f17017N != null) {
                    luxFilter.Q(anonymousClass1JM.f17017N.floatValue());
                }
                if (anonymousClass1JM.f17018O != null) {
                    luxFilter.R(anonymousClass1JM.f17018O.floatValue());
                }
                if (anonymousClass1JM.f17019P != null) {
                    luxFilter.S(anonymousClass1JM.f17019P.floatValue());
                }
                if (anonymousClass1JM.f17008E != null) {
                    luxFilter.P(anonymousClass1JM.f17008E.intValue());
                }
                igFilterGroup.F(1, luxFilter);
                igFilterGroup.G(1, true);
                AnonymousClass3GU.G(photoSession.f38982E, mediaCaptureActivity.gJ(photoSession.f38986I), mediaCaptureActivity.nN(photoSession.f38986I), photoSession.f38980C.f38972D, photoSession.f38980C.f38971C, photoSession.f38980C.f38970B, photoSession.f38981D);
            }
            if (!z) {
                photoSession.f38987J = photoSession.f38982E.D();
            }
        }
        if (z) {
            ((SurfaceCropFilter) photoSession.f38982E.B(1)).f50082J = true;
        }
    }

    public final void Ec(Uri uri) {
        AnonymousClass0PE B;
        AnonymousClass0g3.CropPhoto.m6583C();
        if (this.f4070H.f38951E == AnonymousClass0g0.PROFILE_PHOTO) {
            B = AnonymousClass0PE.m3804B(this, uri);
            B.f4056B.putInt("CropFragment.largestDimension", 1080);
        } else {
            B = AnonymousClass0PE.m3805C(this, uri);
        }
        VK().f38961O = 0;
        AnonymousClass3HZ.B(new AnonymousClass3zd(B.f4056B));
    }

    /* renamed from: F */
    private void m3820F(CreationState[] creationStateArr) {
        if (this.f4074L == null) {
            this.f4074L = new AnonymousClass1Qn(creationStateArr);
            this.f4068F = new AnonymousClass4Gv(this, this.f4071I, mo382D(), VK());
            AnonymousClass1Qn anonymousClass1Qn = this.f4074L;
            CreationState creationState = CreationState.f39831G;
            anonymousClass1Qn.m11369A(creationState, AnonymousClass44m.class, CreationState.f39839O);
            anonymousClass1Qn.m11369A(creationState, AnonymousClass3zd.class, CreationState.f39832H);
            anonymousClass1Qn.m11369A(CreationState.f39832H, AnonymousClass44m.class, CreationState.f39839O);
            creationState = CreationState.f39839O;
            anonymousClass1Qn.m11369A(creationState, AnonymousClass3zU.class, CreationState.f39827C);
            anonymousClass1Qn.m11369A(creationState, AnonymousClass3zZ.class, CreationState.f39837M);
            CreationState creationState2 = CreationState.f39840P;
            anonymousClass1Qn.m11369A(creationState, AnonymousClass3zb.class, creationState2);
            creationState = CreationState.f39831G;
            anonymousClass1Qn.m11369A(creationState, AnonymousClass3zT.class, creationState2);
            anonymousClass1Qn.m11369A(creationState, AnonymousClass3zY.class, CreationState.f39838N);
            anonymousClass1Qn.m11369A(CreationState.f39838N, AnonymousClass3zT.class, CreationState.f39840P);
            CreationState creationState3 = CreationState.f39831G;
            Class cls = AnonymousClass44o.class;
            creationState2 = CreationState.f39844T;
            anonymousClass1Qn.m11369A(creationState3, cls, creationState2);
            creationState3 = CreationState.f39843S;
            anonymousClass1Qn.m11369A(creationState3, cls, creationState2);
            anonymousClass1Qn.m11369A(CreationState.f39831G, AnonymousClass3zg.class, creationState3);
            creationState = CreationState.f39844T;
            anonymousClass1Qn.m11369A(creationState, AnonymousClass3zU.class, CreationState.f39827C);
            anonymousClass1Qn.m11369A(creationState, AnonymousClass3zb.class, CreationState.f39840P);
            anonymousClass1Qn.m11369A(creationState, AnonymousClass3zZ.class, CreationState.f39837M);
            anonymousClass1Qn.m11369A(CreationState.f39831G, AnonymousClass44l.class, CreationState.f39829E);
            creationState = CreationState.f39829E;
            anonymousClass1Qn.m11369A(creationState, AnonymousClass44n.class, CreationState.f39839O);
            anonymousClass1Qn.m11369A(creationState, AnonymousClass44p.class, CreationState.f39844T);
            anonymousClass1Qn.m11369A(creationState, AnonymousClass3zb.class, CreationState.f39840P);
            anonymousClass1Qn.m11369A(creationState, AnonymousClass44j.class, CreationState.f39833I);
            anonymousClass1Qn.m11369A(creationState, AnonymousClass3zU.class, CreationState.f39827C);
            creationState = CreationState.f39840P;
            anonymousClass1Qn.m11369A(creationState, AnonymousClass3zX.class, CreationState.f39836L);
            anonymousClass1Qn.m11369A(creationState, AnonymousClass3zQ.class, CreationState.f39828D);
            anonymousClass1Qn.m11369A(CreationState.f39828D, AnonymousClass3zS.class, CreationState.f39830F);
            creationState = CreationState.f39840P;
            anonymousClass1Qn.m11369A(creationState, AnonymousClass44n.class, CreationState.f39839O);
            anonymousClass1Qn.m11369A(creationState, AnonymousClass44p.class, CreationState.f39844T);
            anonymousClass1Qn.m11369A(creationState, AnonymousClass44k.class, CreationState.f39829E);
            anonymousClass1Qn.m11369A(creationState, AnonymousClass3zf.class, CreationState.f39841Q);
            anonymousClass1Qn.m11369A(CreationState.f39828D, AnonymousClass3zW.class, CreationState.f39835K);
            AnonymousClass0F4.f2058E.m1504A(AnonymousClass3HZ.class, this.f4074L);
            this.f4074L.m11370B(this);
            return;
        }
        throw new RuntimeException("State machine already initialised.");
    }

    public final void FE() {
        AnonymousClass0GK anonymousClass0GK = this.f4069G;
        if (!((Boolean) AnonymousClass0CC.rj.m845G()).booleanValue()) {
            anonymousClass0GK.m1785A();
            AnonymousClass0OO anonymousClass0OO = anonymousClass0GK.f2342D.f3780D;
            synchronized (anonymousClass0OO) {
                if (anonymousClass0OO.f3893D != null) {
                    anonymousClass0OO.f3893D.yWA();
                }
            }
        }
    }

    /* renamed from: G */
    private void m3821G() {
        if (VK().f38950D.f17259C) {
            AnonymousClass3HZ.B(new AnonymousClass44m());
        } else {
            AnonymousClass4YN.B(this.f4070H, this, false, this);
        }
    }

    public final void GE() {
        if (!AnonymousClass0cJ.m5755E(mo382D())) {
            return;
        }
        if (this.f4070H.f38951E == AnonymousClass0g0.PROFILE_PHOTO) {
            setResult(-1, new Intent(this.f4070H.K()));
            finish();
            return;
        }
        AnonymousClass3HZ.B(new AnonymousClass3zb());
    }

    public final void HJA(Runnable runnable) {
        PendingMediaStoreSerializer.m1814C().m1817A(runnable);
    }

    public final AnonymousClass3Cd JL() {
        return this.f4065C;
    }

    public final void Jc(Uri uri) {
        m3818D(this, uri, uri.getPath());
        AnonymousClass3HZ.B(new AnonymousClass3zg());
    }

    public final MediaEditActionBar KO() {
        return (MediaEditActionBar) findViewById(C0164R.id.action_bar);
    }

    public final void Kc(AnonymousClass0OA anonymousClass0OA) {
        AnonymousClass3HZ.B(new AnonymousClass44o());
    }

    public final void Km(Uri uri, Location location, CropInfo cropInfo, int i, int i2) {
        Lm(uri.getPath(), location, cropInfo, i, i2);
    }

    public final AnonymousClass0OA LP(String str) {
        return PendingMediaStore.m3537C().m3539A(str);
    }

    public final void Lm(String str, Location location, CropInfo cropInfo, int i, int i2) {
        if (AnonymousClass2NY.B().f29719P) {
            AnonymousClass2NY.B().B("edit_photo");
        }
        if (this.f4070H.f38951E != AnonymousClass0g0.PROFILE_PHOTO) {
            AnonymousClass0CC.IF.m843E(this.f4071I);
        }
        AnonymousClass0OA C = AnonymousClass0OA.m3548C(String.valueOf(System.nanoTime()));
        C.tB = JHeadBridge.getExifData(str);
        C.oB = VK().f38959M;
        C.qB = str;
        C.ZC = getIntent().getStringExtra("sourceMediaId");
        eUA(C);
        CreationSession Y = VK().Y(str);
        Y.D().f38980C = cropInfo;
        Y.D().f38981D = i;
        Y = Y.V(location);
        Y.f38961O = i2;
        Y.W(C.UB);
        m3821G();
    }

    public final void My() {
        for (MediaSession mediaSession : this.f4070H.I()) {
            AnonymousClass0OA LP = LP(mediaSession.B());
            if (LP.NB && !LP.OB) {
                AnonymousClass0OA B = AnonymousClass0OA.m3547B(LP, String.valueOf(System.nanoTime()));
                B.uB = null;
                LP.f3837y = B.getId();
                PendingMediaStore.m3537C().m3543E(B.UB, B);
                if (mediaSession.f38977C == AnonymousClass3CD.f38974C) {
                    m3817C(this, false, LP, B, AnonymousClass3Bb.C(this));
                } else if (mediaSession.f38977C == AnonymousClass3CD.f38975D) {
                    VideoSession videoSession = mediaSession.f38978D;
                    AnonymousClass3Id.E(B, videoSession.f39003Q, videoSession.f38991E, videoSession.f38990D, videoSession.f38989C, videoSession.f38993G);
                    m3817C(this, true, LP, B, AnonymousClass2NO.F(this).getAbsolutePath());
                }
            }
        }
        AnonymousClass0F4.f2058E.m1506C(new AnonymousClass1Qo());
    }

    public final AnonymousClass4HG NI(String str, String str2) {
        AnonymousClass4Jz anonymousClass4Jz = this.f4067E;
        if (!anonymousClass4Jz.f52750C.containsKey(str)) {
            anonymousClass4Jz.f52750C.put(str, new AnonymousClass4HG(anonymousClass4Jz.f52749B, str2, anonymousClass4Jz));
        }
        return (AnonymousClass4HG) anonymousClass4Jz.f52750C.get(str);
    }

    public final void Qd(boolean z) {
        List<AnonymousClass0OA> arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        for (MediaSession mediaSession : this.f4070H.I()) {
            AnonymousClass0OA LP = LP(mediaSession.B());
            LP.SC = mediaSession.A();
            if (mediaSession.f38977C == AnonymousClass3CD.f38975D) {
                LP.f3795I = this.f4070H.f38948B;
            }
            arrayList.add(LP);
            arrayList2.add(LP.f3837y);
        }
        AnonymousClass0OA A = PendingMediaStore.m3537C().m3539A(this.f4070H.f38949C);
        AnonymousClass0GK.m1770D(A);
        A.AA(true);
        for (AnonymousClass0OA anonymousClass0OA : arrayList) {
            anonymousClass0OA.uB = A.UB;
            anonymousClass0OA.AA(true);
            anonymousClass0OA.OB = true;
        }
        A.m3606z(arrayList);
        PendingMediaStoreSerializer.m1814C().m1814C();
        if (z) {
            this.f4070H.S(this);
            AnonymousClass4I1.B().A(arrayList2);
        }
        Dc();
    }

    public final void TUA(AnonymousClass0OA anonymousClass0OA, List list) {
        String G = anonymousClass0OA.m3561G();
        for (AnonymousClass0OA anonymousClass0OA2 : list) {
            anonymousClass0OA2.f3811Y = G;
        }
        PendingMediaStore C = PendingMediaStore.m3537C();
        C.m3545G(AnonymousClass0ON.PHOTO);
        C.m3545G(AnonymousClass0ON.VIDEO);
        C.m3543E(anonymousClass0OA.UB, anonymousClass0OA);
        for (AnonymousClass0OA anonymousClass0OA3 : list) {
            C.m3543E(anonymousClass0OA3.UB, anonymousClass0OA3);
        }
        PendingMediaStoreSerializer.m1814C().m1814C();
    }

    public final CreationSession VK() {
        return this.f4070H;
    }

    public final void aWA(AnonymousClass0OA anonymousClass0OA) {
        anonymousClass0OA.KA(AnonymousClass0OK.UNKNOWN);
        this.f4069G.m1795K(anonymousClass0OA);
    }

    public final void ct(String str, Location location, int i, int i2) {
        if (AnonymousClass0cJ.m5755E(mo382D())) {
            AnonymousClass0OA C = AnonymousClass0OA.m3548C(String.valueOf(System.nanoTime()));
            C.tB = JHeadBridge.getExifData(str);
            eUA(C);
            CreationSession VK = VK();
            VK.D().f38981D = i;
            VK = VK.V(location);
            VK.f38961O = i2;
            VK.W(C.UB);
            AnonymousClass0Iz.f2854L.m2407J(this, "camera_capture");
            m3821G();
        }
    }

    public final void dWA(AnonymousClass0OA anonymousClass0OA) {
        anonymousClass0OA.f3795I = VK().C();
        this.f4069G.m1797O(anonymousClass0OA);
    }

    public final void eUA(AnonymousClass0OA anonymousClass0OA) {
        AnonymousClass0GK.m1779M(anonymousClass0OA);
    }

    public final AnonymousClass3Gc gJ(String str) {
        return this.f4067E.C(str);
    }

    public final AnonymousClass3zH gQ(String str) {
        return this.f4067E.D(str);
    }

    public final void iLA() {
        HJA(new AnonymousClass4Gz(this));
    }

    public final AnonymousClass3Gh nN(String str) {
        return this.f4067E.E(str);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        AnonymousClass0IL anonymousClass0IL = this.f4066D;
        if (anonymousClass0IL != null) {
            anonymousClass0IL.onActivityResult(i, i2, intent);
        }
        if (this.f4072J.remove(Integer.valueOf(i))) {
            anonymousClass0IL = mo382D().mo1453E(C0164R.id.layout_container_main);
            if (anonymousClass0IL != null) {
                anonymousClass0IL.onActivityResult(i, i2, intent);
            }
        }
    }

    public final void onBackPressed() {
        if (!this.f4068F.A(this.f4074L)) {
            super.onBackPressed();
        }
    }

    public final void onCancel() {
        onBackPressed();
    }

    public final void onCreate(Bundle bundle) {
        Object obj;
        IgFilterGroup F;
        String K;
        CreationState creationState;
        Intent intent;
        boolean booleanExtra;
        AnonymousClass0IL anonymousClass4Iq;
        Bundle arguments;
        int B = AnonymousClass0cQ.m5852B(this, 626492978);
        this.f4071I = AnonymousClass0Ce.m950G(getIntent().getExtras());
        AnonymousClass0G5.m1728I(this);
        View view = null;
        if (!AnonymousClass0Cd.f1698B.m970N()) {
            AnonymousClass0EQ.f1975B.m1399A(this, null);
        }
        Object obj2 = this.f4071I;
        if (AnonymousClass0a2.m5426K(obj2)) {
            long currentTimeMillis = System.currentTimeMillis();
            if (AnonymousClass0FO.f2123C == -1) {
                AnonymousClass0FO.f2123C = AnonymousClass0Mt.m3244G().getLong("last_permissions_check", 0);
            }
            if (currentTimeMillis - AnonymousClass0FO.f2123C >= 86400000) {
                obj = 1;
                if (obj != null) {
                    AnonymousClass17t anonymousClass17t = new AnonymousClass17t();
                    anonymousClass17t.f14853E = AnonymousClass0Pu.GET;
                    anonymousClass17t.f14856H = "me/permissions/";
                    anonymousClass17t.f14850B = AnonymousClass0a2.m5417B(obj2);
                    AnonymousClass0GA C = anonymousClass17t.m9513D(AnonymousClass2bj.class).m9512C();
                    C.f2849B = new AnonymousClass2Gx(obj2);
                    AnonymousClass0FO.f2122B.schedule(C);
                }
                getWindow().setFormat(1);
                getWindow().addFlags(DexStore.LOAD_RESULT_DEX2OAT_QUICKEN_ATTEMPTED);
                setContentView(C0164R.layout.activity_media_host);
                if (AnonymousClass0G5.m1723D(this, C0164R.attr.actionBarShadowVisibility) == 0) {
                    view = findViewById(C0164R.id.action_bar_shadow);
                }
                this.f4064B = view;
                this.f4065C = new AnonymousClass3Cd(this, this);
                this.f4067E = new AnonymousClass4Jz(this, this, this.f4065C);
                if (bundle == null) {
                    this.f4070H = (CreationSession) bundle.getParcelable("MediaCaptureActivity.CREATION_SESSION");
                    if (VK().R()) {
                        F = VK().F();
                        K = VK().K();
                        if (F != null) {
                            F.f48231B = new AnonymousClass3z9();
                            AnonymousClass3GU.I(F, gJ(K), nN(K));
                        }
                    }
                    Parcelable[] parcelableArray = bundle.getParcelableArray("MediaCaptureActivity.BUNDLE_STATE");
                    m3820F((CreationState[]) Arrays.copyOf(parcelableArray, parcelableArray.length, CreationState[].class));
                } else {
                    this.f4070H = new CreationSession();
                    synchronized (AnonymousClass4I1.class) {
                        if (AnonymousClass4I1.f52428E != null) {
                            AnonymousClass4I1.f52428E = null;
                        }
                    }
                    VK().f38951E = AnonymousClass0g0.values()[getIntent().getIntExtra("captureType", 0)];
                    VK().f38950D = (MediaCaptureConfig) getIntent().getParcelableExtra("captureConfig");
                    AnonymousClass0HV.m2008D(this.f4071I).m2049k("off");
                }
                super.onCreate(bundle);
                this.f4069G = AnonymousClass0GK.m1772F(this, this.f4071I, "MediaCaptureActivity");
                if (VK().f38951E == AnonymousClass0g0.PROFILE_PHOTO) {
                    KO().setIsProfilePhoto(true);
                    VK().f38967U = AnonymousClass1Qp.SQUARE;
                }
                if (bundle == null) {
                    Intent intent2 = getIntent();
                    creationState = intent2.hasExtra("videoFilePath") ? CreationState.f39843S : intent2.hasExtra("isCrop") ? intent2.getBooleanExtra("autoCenterCrop", false) ? CreationState.f39839O : CreationState.f39832H : CreationState.f39831G;
                    intent = getIntent();
                    switch (AnonymousClass1Qr.f18475B[creationState.ordinal()]) {
                        case 1:
                            Uri uri = (Uri) intent.getParcelableExtra("videoFilePath");
                            booleanExtra = intent.getBooleanExtra("videoRectangleCrop", false);
                            m3818D(this, uri, intent.getStringExtra("sourceMediaId"));
                            if (booleanExtra) {
                                VK().f38967U = AnonymousClass1Qp.RECTANGULAR;
                            }
                            AnonymousClass0Hx.f2719B.mo558A();
                            anonymousClass4Iq = new AnonymousClass4Iq();
                            break;
                        case 2:
                            anonymousClass4Iq = AnonymousClass0Hx.f2719B.mo558A().m3803C(false);
                            Uri uri2 = (Uri) intent.getParcelableExtra("CropFragment.imageUri");
                            AnonymousClass0OA C2 = AnonymousClass0OA.m3548C(String.valueOf(System.nanoTime()));
                            eUA(C2);
                            C2.tB = JHeadBridge.getExifData(uri2.getPath());
                            C2.ZC = intent.getStringExtra("sourceMediaId");
                            m3816B(this);
                            CreationSession Y = VK().Y(uri2.getPath());
                            Y.f38961O = 2;
                            Y.W(C2.UB);
                            break;
                        case 3:
                            AnonymousClass0Hx.f2719B.mo558A();
                            anonymousClass4Iq = new AnonymousClass5Ud();
                            anonymousClass4Iq.setArguments(intent.getExtras());
                            break;
                        case 4:
                            anonymousClass4Iq = AnonymousClass0Hx.f2719B.mo558A().m3801A(false);
                            this.f4066D = (AnonymousClass0IJ) anonymousClass4Iq;
                            break;
                        default:
                            anonymousClass4Iq = null;
                            break;
                    }
                    if (anonymousClass4Iq != null) {
                        finish();
                        AnonymousClass0cQ.m5853C(this, -1280003574, B);
                        return;
                    }
                    m3820F(new CreationState[]{creationState});
                    arguments = anonymousClass4Iq.getArguments();
                    if (arguments == null) {
                        arguments = new Bundle();
                    }
                    arguments.putString("IgSessionManager.USER_ID", this.f4071I.f1759C);
                    anonymousClass4Iq.setArguments(arguments);
                    AnonymousClass0IV B2 = mo382D().mo1450B();
                    B2.mo1623N(C0164R.id.layout_container_main, anonymousClass4Iq, "MediaCaptureActivity");
                    B2.mo1615F();
                }
                AnonymousClass0cQ.m5853C(this, -1471242184, B);
            }
        }
        obj = null;
        if (obj != null) {
            AnonymousClass17t anonymousClass17t2 = new AnonymousClass17t();
            anonymousClass17t2.f14853E = AnonymousClass0Pu.GET;
            anonymousClass17t2.f14856H = "me/permissions/";
            anonymousClass17t2.f14850B = AnonymousClass0a2.m5417B(obj2);
            AnonymousClass0GA C3 = anonymousClass17t2.m9513D(AnonymousClass2bj.class).m9512C();
            C3.f2849B = new AnonymousClass2Gx(obj2);
            AnonymousClass0FO.f2122B.schedule(C3);
        }
        getWindow().setFormat(1);
        getWindow().addFlags(DexStore.LOAD_RESULT_DEX2OAT_QUICKEN_ATTEMPTED);
        setContentView(C0164R.layout.activity_media_host);
        if (AnonymousClass0G5.m1723D(this, C0164R.attr.actionBarShadowVisibility) == 0) {
            view = findViewById(C0164R.id.action_bar_shadow);
        }
        this.f4064B = view;
        this.f4065C = new AnonymousClass3Cd(this, this);
        this.f4067E = new AnonymousClass4Jz(this, this, this.f4065C);
        if (bundle == null) {
            this.f4070H = new CreationSession();
            synchronized (AnonymousClass4I1.class) {
                if (AnonymousClass4I1.f52428E != null) {
                    AnonymousClass4I1.f52428E = null;
                }
            }
            VK().f38951E = AnonymousClass0g0.values()[getIntent().getIntExtra("captureType", 0)];
            VK().f38950D = (MediaCaptureConfig) getIntent().getParcelableExtra("captureConfig");
            AnonymousClass0HV.m2008D(this.f4071I).m2049k("off");
        } else {
            this.f4070H = (CreationSession) bundle.getParcelable("MediaCaptureActivity.CREATION_SESSION");
            if (VK().R()) {
                F = VK().F();
                K = VK().K();
                if (F != null) {
                    F.f48231B = new AnonymousClass3z9();
                    AnonymousClass3GU.I(F, gJ(K), nN(K));
                }
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray("MediaCaptureActivity.BUNDLE_STATE");
            m3820F((CreationState[]) Arrays.copyOf(parcelableArray2, parcelableArray2.length, CreationState[].class));
        }
        super.onCreate(bundle);
        this.f4069G = AnonymousClass0GK.m1772F(this, this.f4071I, "MediaCaptureActivity");
        if (VK().f38951E == AnonymousClass0g0.PROFILE_PHOTO) {
            KO().setIsProfilePhoto(true);
            VK().f38967U = AnonymousClass1Qp.SQUARE;
        }
        if (bundle == null) {
            Intent intent22 = getIntent();
            if (intent22.hasExtra("videoFilePath")) {
            }
            intent = getIntent();
            switch (AnonymousClass1Qr.f18475B[creationState.ordinal()]) {
                case 1:
                    Uri uri3 = (Uri) intent.getParcelableExtra("videoFilePath");
                    booleanExtra = intent.getBooleanExtra("videoRectangleCrop", false);
                    m3818D(this, uri3, intent.getStringExtra("sourceMediaId"));
                    if (booleanExtra) {
                        VK().f38967U = AnonymousClass1Qp.RECTANGULAR;
                    }
                    AnonymousClass0Hx.f2719B.mo558A();
                    anonymousClass4Iq = new AnonymousClass4Iq();
                    break;
                case 2:
                    anonymousClass4Iq = AnonymousClass0Hx.f2719B.mo558A().m3803C(false);
                    Uri uri22 = (Uri) intent.getParcelableExtra("CropFragment.imageUri");
                    AnonymousClass0OA C22 = AnonymousClass0OA.m3548C(String.valueOf(System.nanoTime()));
                    eUA(C22);
                    C22.tB = JHeadBridge.getExifData(uri22.getPath());
                    C22.ZC = intent.getStringExtra("sourceMediaId");
                    m3816B(this);
                    CreationSession Y2 = VK().Y(uri22.getPath());
                    Y2.f38961O = 2;
                    Y2.W(C22.UB);
                    break;
                case 3:
                    AnonymousClass0Hx.f2719B.mo558A();
                    anonymousClass4Iq = new AnonymousClass5Ud();
                    anonymousClass4Iq.setArguments(intent.getExtras());
                    break;
                case 4:
                    anonymousClass4Iq = AnonymousClass0Hx.f2719B.mo558A().m3801A(false);
                    this.f4066D = (AnonymousClass0IJ) anonymousClass4Iq;
                    break;
                default:
                    anonymousClass4Iq = null;
                    break;
            }
            if (anonymousClass4Iq != null) {
                m3820F(new CreationState[]{creationState});
                arguments = anonymousClass4Iq.getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                arguments.putString("IgSessionManager.USER_ID", this.f4071I.f1759C);
                anonymousClass4Iq.setArguments(arguments);
                AnonymousClass0IV B22 = mo382D().mo1450B();
                B22.mo1623N(C0164R.id.layout_container_main, anonymousClass4Iq, "MediaCaptureActivity");
                B22.mo1615F();
            } else {
                finish();
                AnonymousClass0cQ.m5853C(this, -1280003574, B);
                return;
            }
        }
        AnonymousClass0cQ.m5853C(this, -1471242184, B);
    }

    public final void onDestroy() {
        int B = AnonymousClass0cQ.m5852B(this, 1287033004);
        super.onDestroy();
        if (AnonymousClass0ci.m5926B(AnonymousClass0ch.DEFAULT).f7231B) {
            AnonymousClass3CJ.E(this.f4071I, this);
        }
        AnonymousClass0F4.f2058E.m1507D(AnonymousClass3HZ.class, this.f4074L).m1507D(AnonymousClass3Hb.class, this);
        AnonymousClass3Cd anonymousClass3Cd = this.f4065C;
        anonymousClass3Cd.f39081E = true;
        AnonymousClass3Cc anonymousClass3Cc = anonymousClass3Cd.f39080D;
        if (anonymousClass3Cc != null) {
            AnonymousClass3Cd.C(anonymousClass3Cd, anonymousClass3Cc);
        }
        anonymousClass3Cd.f39083G.removeCallbacksAndMessages(null);
        anonymousClass3Cd.f39083G = null;
        this.f4065C = null;
        this.f4073K.clear();
        this.f4068F = null;
        this.f4067E.B();
        this.f4067E = null;
        this.f4074L = null;
        this.f4066D = null;
        AnonymousClass0cQ.m5853C(this, -297892077, B);
    }

    public final /* bridge */ /* synthetic */ void onEvent(AnonymousClass0F6 anonymousClass0F6) {
        int i;
        int I = AnonymousClass0cQ.m5859I(this, 34608888);
        AnonymousClass3Hb anonymousClass3Hb = (AnonymousClass3Hb) anonymousClass0F6;
        int I2 = AnonymousClass0cQ.m5859I(this, 267407777);
        DraggableContainer draggableContainer = (DraggableContainer) findViewById(C0164R.id.root);
        if (AnonymousClass3B1.f38644B.D()) {
            draggableContainer.f38653C.m1960A();
            draggableContainer.f38653C.setVisibility(4);
            AnonymousClass3B2 anonymousClass3B2 = AnonymousClass3B1.f38644B;
            anonymousClass3B2.C();
            anonymousClass3B2.B(false);
            anonymousClass3B2.f38646C = null;
        }
        if (!draggableContainer.f38656F.isEmpty()) {
            draggableContainer.f38656F = new Rect();
        }
        if (anonymousClass3Hb.f39847D != CreationState.f39831G) {
            if (anonymousClass3Hb.f39847D != CreationState.f39832H) {
                boolean z = true;
                if (this.f4070H.Q()) {
                    boolean z2 = anonymousClass3Hb.f39845B.f39825B instanceof AnonymousClass3zT;
                    if (anonymousClass3Hb.f39846C != CreationState.f39833I) {
                        z = false;
                    }
                    if ((anonymousClass3Hb.f39847D == CreationState.f39829E || z2) && (anonymousClass3Hb.f39846C == CreationState.f39831G || anonymousClass3Hb.f39846C == CreationState.f39844T || z || z2)) {
                        if (z) {
                            this.f4067E.B();
                        }
                        for (MediaSession mediaSession : VK().I()) {
                            if (mediaSession.f38977C == AnonymousClass3CD.f38974C) {
                                m3819E(this, mediaSession.f38976B, z, true);
                            } else if (mediaSession.f38977C == AnonymousClass3CD.f38975D) {
                                VideoSession videoSession = mediaSession.f38978D;
                                AnonymousClass0OA LP = LP(videoSession.f39000N);
                                Object obj = this.f4067E;
                                obj.f52750C.put(videoSession.f39000N, new AnonymousClass4HG(obj.f52749B, LP.DB, obj));
                                if (LP.NB && !z) {
                                    videoSession.A(LP);
                                    videoSession.f39003Q = LP.AD;
                                    videoSession.f38991E = LP.f3815c;
                                    videoSession.f38990D = LP.bC.f17220Q;
                                    videoSession.f38989C = LP.bC.f17209F;
                                    videoSession.f38993G = LP.hB;
                                }
                            }
                        }
                        if (z) {
                            CreationSession creationSession = this.f4070H;
                            for (MediaSession mediaSession2 : creationSession.f38960N) {
                                AnonymousClass1Qs anonymousClass1Qs = (AnonymousClass1Qs) creationSession.f38955I.get(mediaSession2.A());
                                if (mediaSession2.f38977C == AnonymousClass3CD.f38974C) {
                                    PhotoSession photoSession = mediaSession2.f38976B;
                                    if (anonymousClass1Qs != null) {
                                        IgFilterGroup D = anonymousClass1Qs.f18479E.D();
                                        if (D != null) {
                                            photoSession.f38982E = D;
                                        }
                                    }
                                }
                            }
                            creationSession.f38955I.clear();
                        }
                        this.f4070H.S(this);
                    }
                } else if (VK().R()) {
                    Object obj2 = anonymousClass3Hb.f39847D == CreationState.f39839O ? 1 : null;
                    boolean z3 = gQ(VK().K()) != null;
                    if (VK().F() == null) {
                        z = false;
                    }
                    m3819E(this, VK().L(VK().K()), false, anonymousClass3Hb.f39845B.f39825B instanceof AnonymousClass3zT);
                    if (obj2 != null && VK().F() == null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Transition: ");
                        stringBuilder.append(anonymousClass3Hb.f39846C.ordinal());
                        stringBuilder.append(" ImageRenderer: ");
                        stringBuilder.append(z3);
                        stringBuilder.append(" FilterGroup: ");
                        stringBuilder.append(z);
                        stringBuilder.append(" Path: ");
                        stringBuilder.append(VK().K());
                        AnonymousClass0Gn.m1881H("MediaCaptureActivity_InvalidFilterGroup", stringBuilder.toString());
                    }
                }
                this.f4068F.B(anonymousClass3Hb);
                if (this.f4064B != null) {
                    if (anonymousClass3Hb.f39847D != null) {
                        i = AnonymousClass1Qr.f18475B[anonymousClass3Hb.f39847D.ordinal()];
                        if (i != 2) {
                            switch (i) {
                                case 5:
                                case 6:
                                case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.f4064B.setVisibility(0);
                    }
                    this.f4064B.setVisibility(8);
                }
                AnonymousClass0cQ.m5858H(this, 842412490, I2);
                AnonymousClass0cQ.m5858H(this, 968218911, I);
            }
        }
        m3816B(this);
        this.f4067E.B();
        if (anonymousClass3Hb.f39846C != CreationState.f39829E) {
            AnonymousClass4I1.B().f52431D.clear();
        }
        this.f4068F.B(anonymousClass3Hb);
        if (this.f4064B != null) {
            if (anonymousClass3Hb.f39847D != null) {
                i = AnonymousClass1Qr.f18475B[anonymousClass3Hb.f39847D.ordinal()];
                if (i != 2) {
                    switch (i) {
                        case 5:
                        case 6:
                        case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            break;
                        default:
                            break;
                    }
                }
                this.f4064B.setVisibility(0);
            }
            this.f4064B.setVisibility(8);
        }
        AnonymousClass0cQ.m5858H(this, 842412490, I2);
        AnonymousClass0cQ.m5858H(this, 968218911, I);
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 27) {
            AnonymousClass0F4.f2058E.m1505B(AnonymousClass3DQ.f39285F);
            return true;
        } else if (i == 80) {
            AnonymousClass0F4.f2058E.m1505B(AnonymousClass3DQ.f39282C);
            return true;
        } else if (i != 130) {
            switch (i) {
                case 168:
                    AnonymousClass0F4.f2058E.m1505B(AnonymousClass3DQ.f39286G);
                    return true;
                case 169:
                    AnonymousClass0F4.f2058E.m1505B(AnonymousClass3DQ.f39287H);
                    return true;
                default:
                    return super.onKeyDown(i, keyEvent);
            }
        } else {
            AnonymousClass0F4.f2058E.m1505B(AnonymousClass3DQ.f39284E);
            return true;
        }
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 130) {
            return super.onKeyUp(i, keyEvent);
        }
        AnonymousClass0F4.f2058E.m1505B(AnonymousClass3DQ.f39283D);
        return true;
    }

    public final void onResume() {
        int B = AnonymousClass0cQ.m5852B(this, -256134851);
        super.onResume();
        PendingMediaStore.m3538D(getApplicationContext());
        AnonymousClass0cQ.m5853C(this, 1296159166, B);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AnonymousClass1Qn anonymousClass1Qn = this.f4074L;
        Parcelable[] parcelableArr = new CreationState[anonymousClass1Qn.f18461B.size()];
        anonymousClass1Qn.f18461B.copyInto(parcelableArr);
        bundle.putParcelableArray("MediaCaptureActivity.BUNDLE_STATE", parcelableArr);
        bundle.putParcelable("MediaCaptureActivity.CREATION_SESSION", VK());
    }

    public final void rE() {
        PendingMediaStoreSerializer.m1814C().m1814C();
    }

    public final AnonymousClass0Cm rT() {
        return this.f4071I;
    }

    public final void sUA(AnonymousClass0OA anonymousClass0OA) {
        AnonymousClass0GK.m1780N(anonymousClass0OA);
    }

    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        this.f4072J.add(Integer.valueOf(i));
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public final AnonymousClass3GL uL(String str) {
        if (!this.f4073K.containsKey(str)) {
            this.f4073K.put(str, new AnonymousClass3GL(gJ(str)));
        }
        return (AnonymousClass3GL) this.f4073K.get(str);
    }

    public final void ze() {
        onBackPressed();
    }
}

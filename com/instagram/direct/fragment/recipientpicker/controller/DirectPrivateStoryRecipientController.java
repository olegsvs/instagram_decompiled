package com.instagram.direct.fragment.recipientpicker.controller;

import X.AnonymousClass0CC;
import X.AnonymousClass0Ca;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0E6;
import X.AnonymousClass0EE;
import X.AnonymousClass0ES;
import X.AnonymousClass0F4;
import X.AnonymousClass0F6;
import X.AnonymousClass0F8;
import X.AnonymousClass0G5;
import X.AnonymousClass0Gd;
import X.AnonymousClass0Gn;
import X.AnonymousClass0HV;
import X.AnonymousClass0IE;
import X.AnonymousClass0IL;
import X.AnonymousClass0Ie;
import X.AnonymousClass0LH;
import X.AnonymousClass0Nm;
import X.AnonymousClass0OA;
import X.AnonymousClass0Px;
import X.AnonymousClass0Qd;
import X.AnonymousClass0Sn;
import X.AnonymousClass0Sy;
import X.AnonymousClass0T1;
import X.AnonymousClass0UX;
import X.AnonymousClass0Um;
import X.AnonymousClass0V1;
import X.AnonymousClass0VB;
import X.AnonymousClass0VF;
import X.AnonymousClass0VK;
import X.AnonymousClass0ZR;
import X.AnonymousClass0cO;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eT;
import X.AnonymousClass0ea;
import X.AnonymousClass0eb;
import X.AnonymousClass0hi;
import X.AnonymousClass0hj;
import X.AnonymousClass0ip;
import X.AnonymousClass0kV;
import X.AnonymousClass0yJ;
import X.AnonymousClass14H;
import X.AnonymousClass1EM;
import X.AnonymousClass1EV;
import X.AnonymousClass1SI;
import X.AnonymousClass1SL;
import X.AnonymousClass1Sd;
import X.AnonymousClass1St;
import X.AnonymousClass1T2;
import X.AnonymousClass238;
import X.AnonymousClass2IF;
import X.AnonymousClass3e1;
import X.AnonymousClass3jm;
import X.AnonymousClass3jn;
import X.AnonymousClass3jo;
import X.AnonymousClass4Ou;
import X.AnonymousClass4Yh;
import X.AnonymousClass4ZZ;
import X.AnonymousClass4b8;
import X.AnonymousClass4b9;
import X.AnonymousClass4bA;
import X.AnonymousClass4bB;
import X.AnonymousClass4bC;
import X.AnonymousClass4bD;
import X.AnonymousClass4bE;
import X.AnonymousClass4bG;
import X.AnonymousClass4dp;
import X.AnonymousClass4ig;
import X.AnonymousClass4ih;
import X.AnonymousClass4ii;
import X.AnonymousClass4im;
import X.AnonymousClass4in;
import X.AnonymousClass4io;
import X.AnonymousClass4kf;
import X.AnonymousClass4l0;
import X.AnonymousClass4l6;
import X.AnonymousClass4lC;
import X.AnonymousClass5Ir;
import X.AnonymousClass5V1;
import X.AnonymousClass5V2;
import X.AnonymousClass5V3;
import X.AnonymousClass5V4;
import X.AnonymousClass5V5;
import X.AnonymousClass5V6;
import X.AnonymousClass5V7;
import X.AnonymousClass5V8;
import X.AnonymousClass5V9;
import X.AnonymousClass5VA;
import X.AnonymousClass5VB;
import X.AnonymousClass5VC;
import X.AnonymousClass5VD;
import X.AnonymousClass5Wz;
import X.AnonymousClass5aC;
import X.AnonymousClass5bO;
import X.AnonymousClass5bP;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewStub;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.C0164R;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.ui.widget.search.SearchController;
import com.instagram.ui.widget.search.StickySearchBarAnimationHelper;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DirectPrivateStoryRecipientController implements OnScrollListener, AnonymousClass3jn, AnonymousClass0VB, AnonymousClass0F8, AnonymousClass0Qd {
    private final AnonymousClass4l6 AB = new AnonymousClass5V2(this);
    /* renamed from: B */
    public boolean f65147B;
    private final boolean BB;
    /* renamed from: C */
    public boolean f65148C;
    private boolean CB;
    /* renamed from: D */
    public AnonymousClass4ig f65149D;
    private AnonymousClass0UX DB;
    /* renamed from: E */
    public boolean f65150E;
    private final AnonymousClass4kf EB = new AnonymousClass5VC(this);
    /* renamed from: F */
    public boolean f65151F;
    private final AnonymousClass5V7 FB = new AnonymousClass5V7(this);
    /* renamed from: G */
    public AnonymousClass0kV f65152G;
    private final boolean GB;
    /* renamed from: H */
    public final AnonymousClass0Ie f65153H;
    /* renamed from: I */
    public final Set f65154I = new HashSet();
    /* renamed from: J */
    public final AnonymousClass0hj f65155J = new AnonymousClass0hj();
    /* renamed from: K */
    public AnonymousClass5V1 f65156K;
    /* renamed from: L */
    public int f65157L;
    /* renamed from: M */
    public int f65158M;
    /* renamed from: N */
    public LinkedHashSet f65159N;
    /* renamed from: O */
    public AnonymousClass4im f65160O;
    /* renamed from: P */
    public String[] f65161P;
    /* renamed from: Q */
    public List f65162Q;
    /* renamed from: R */
    public AnonymousClass5Wz f65163R;
    /* renamed from: S */
    public AnonymousClass4l0 f65164S;
    /* renamed from: T */
    public AnonymousClass3e1 f65165T;
    /* renamed from: U */
    public List f65166U;
    /* renamed from: V */
    public final HashSet f65167V = new HashSet();
    /* renamed from: W */
    public AnonymousClass4Ou f65168W;
    /* renamed from: X */
    public boolean f65169X;
    /* renamed from: Y */
    public boolean f65170Y;
    /* renamed from: Z */
    public AnonymousClass1EV f65171Z;
    /* renamed from: a */
    public AnonymousClass0Cm f65172a;
    /* renamed from: b */
    public AnonymousClass0Um f65173b = AnonymousClass0Um.NONE;
    /* renamed from: c */
    public final AnonymousClass5VB f65174c = new AnonymousClass5VB(this);
    /* renamed from: d */
    private final AnonymousClass5bP f65175d = new AnonymousClass5bP(this);
    /* renamed from: e */
    private final AnonymousClass4lC f65176e = new AnonymousClass5V8(this);
    /* renamed from: f */
    private final AnonymousClass5VA f65177f = new AnonymousClass5VA(this);
    /* renamed from: g */
    private final AnonymousClass5bO f65178g = new AnonymousClass5bO(this);
    /* renamed from: h */
    private final AnonymousClass5V9 f65179h = new AnonymousClass5V9(this);
    /* renamed from: i */
    private boolean f65180i;
    /* renamed from: j */
    private boolean f65181j;
    /* renamed from: k */
    private final AnonymousClass5V3 f65182k = new AnonymousClass5V3(this);
    /* renamed from: l */
    private boolean f65183l;
    /* renamed from: m */
    private boolean f65184m;
    public AnonymousClass238 mCustomScrollAwayNavigationController;
    public AnonymousClass5Ir mFastScrollController;
    public FrameLayout mListContainer;
    public ListView mListView;
    public SearchController mSearchController;
    public TextView mSheetActionButton;
    public StickySearchBarAnimationHelper mStickySearchBarAnimationHelper;
    /* renamed from: n */
    private boolean f65185n;
    /* renamed from: o */
    private boolean f65186o;
    /* renamed from: p */
    private String f65187p;
    /* renamed from: q */
    private final OnScrollListener f65188q;
    /* renamed from: r */
    private boolean f65189r;
    /* renamed from: s */
    private int f65190s;
    /* renamed from: t */
    private final AnonymousClass4kf f65191t = new AnonymousClass5VD(this);
    /* renamed from: u */
    private int f65192u;
    /* renamed from: v */
    private int f65193v;
    /* renamed from: w */
    private final AnonymousClass0hi f65194w = new AnonymousClass0hi();
    /* renamed from: x */
    private AnonymousClass0ES f65195x;
    /* renamed from: y */
    private int f65196y;
    /* renamed from: z */
    private int f65197z;

    public DirectPrivateStoryRecipientController(AnonymousClass0Ie anonymousClass0Ie, boolean z, boolean z2, OnScrollListener onScrollListener) {
        this.f65153H = anonymousClass0Ie;
        this.BB = z;
        this.GB = z2;
        this.f65188q = onScrollListener;
    }

    /* renamed from: A */
    public final void m27124A(AnonymousClass0eT anonymousClass0eT) {
        if (this.f65170Y) {
            anonymousClass0eT.Z(C0164R.string.share);
            if (this.f65181j) {
                anonymousClass0eT.F(AnonymousClass0eb.OVERFLOW, new AnonymousClass4b8(this));
            }
        } else {
            anonymousClass0eT.Z(C0164R.string.direct_send_to);
        }
        anonymousClass0eT.n(true);
        anonymousClass0eT.c(C0164R.drawable.instagram_arrow_back_24, new AnonymousClass4b9(this));
        if (this.CB) {
            AnonymousClass4Yh.B(this.f65153H.getContext(), anonymousClass0eT);
            anonymousClass0eT.E(this.f65153H.getString(C0164R.string.direct_new_group), new AnonymousClass4bA(this));
            anonymousClass0eT.l(false);
            return;
        }
        anonymousClass0eT.l(true);
    }

    /* renamed from: B */
    public final AnonymousClass1SI m27125B(DirectShareTarget directShareTarget) {
        String str = this.f65187p;
        if (str != null) {
            return new AnonymousClass4ih(this.f65172a, str, directShareTarget);
        }
        AnonymousClass0LH.E(this.f65161P);
        return new AnonymousClass4ii(this.f65161P, directShareTarget, this.f65172a);
    }

    /* renamed from: C */
    public final void m27126C(int i, int i2, Intent intent) {
        if (i != 1337) {
            if (i == 2001) {
                if (i2 == -1) {
                    DirectShareTarget directShareTarget = (DirectShareTarget) intent.getParcelableExtra("bundle_extra_share_target");
                    int G = this.f65163R.m27353G(directShareTarget);
                    if (G == -1) {
                        Context context = this.f65153H.getContext();
                        AnonymousClass0EE anonymousClass0EE = this.f65153H;
                        Toast.makeText(context, C0164R.string.direct_story_recipient_picker_max_thread_size_reached, 0).show();
                        AnonymousClass0V1.f(anonymousClass0EE, "direct_compose_too_many_recipients_alert");
                    } else {
                        AnonymousClass4dp.B(true, this.f65153H, directShareTarget, G, 3, null, directShareTarget.f5604E.f5871C);
                        this.f65163R.m27356J(this.f65170Y, this.f65150E, true, this.f65169X);
                    }
                    m27119F(this);
                }
            }
        } else if (i2 == -1) {
            this.f65193v++;
        } else {
            this.f65192u++;
        }
    }

    public final void Cl() {
        AnonymousClass0V1.R(this.f65153H, this.f65165T.LQ());
    }

    /* renamed from: D */
    public static void m27117D(DirectPrivateStoryRecipientController directPrivateStoryRecipientController, int i, boolean z) {
        Throwable e;
        Intent intent;
        AnonymousClass4im anonymousClass4im;
        List<AnonymousClass1SI> arrayList;
        ArrayList arrayList2;
        int i2;
        FragmentActivity activity;
        AnonymousClass0IL anonymousClass0IL;
        if (z) {
            WeakReference weakReference;
            ImageView imageView;
            AnonymousClass5V1 anonymousClass5V1 = directPrivateStoryRecipientController.f65156K;
            AnonymousClass0cO B = AnonymousClass0cO.B();
            Bitmap bitmap = null;
            try {
                View view = directPrivateStoryRecipientController.f65153H.getView();
                if (view != null) {
                    View rootView = view.getRootView();
                    bitmap = Bitmap.createBitmap(rootView.getWidth() / 2, rootView.getHeight() / 2, Config.RGB_565);
                    try {
                        Canvas canvas = new Canvas(bitmap);
                        canvas.scale(0.5f, 0.5f);
                        rootView.draw(canvas);
                    } catch (OutOfMemoryError e2) {
                        e = e2;
                    }
                }
            } catch (OutOfMemoryError e3) {
                e = e3;
                AnonymousClass0Gn.E("DirectPrivateStoryRecipientController", "Failed to create screenshot", e);
                B.f7119B = bitmap;
                weakReference = B.f7120C;
                imageView = weakReference == null ? null : (ImageView) weakReference.get();
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap);
                    imageView.setVisibility(0);
                }
                intent = new Intent();
                anonymousClass4im = directPrivateStoryRecipientController.f65160O;
                AnonymousClass0Sy.C();
                arrayList = new ArrayList(anonymousClass4im.f56492C.size());
                for (AnonymousClass4in anonymousClass4in : anonymousClass4im.f56492C.values()) {
                    if (AnonymousClass4im.B(anonymousClass4in)) {
                        arrayList.add(anonymousClass4in.f56494B);
                    }
                }
                arrayList2 = new ArrayList(arrayList.size());
                for (AnonymousClass1SI anonymousClass1SI : arrayList) {
                    if (anonymousClass1SI instanceof AnonymousClass4ii) {
                        arrayList2.add(((AnonymousClass4ii) anonymousClass1SI).f56484B);
                    }
                }
                intent.putExtra("bundle_extra_user_tapped_done_button", z);
                intent.putExtra("bundle_extra_one_tap_send_taps", directPrivateStoryRecipientController.f65196y).putExtra("bundle_extra_one_tap_undo_taps", directPrivateStoryRecipientController.f65197z).putExtra("bundle_extra_pending_media_keys", directPrivateStoryRecipientController.f65161P).putParcelableArrayListExtra("bundle_extra_parcelable_story_share_targets", arrayList2).putExtra("bundle_extra_user_story_target", directPrivateStoryRecipientController.f65173b).putExtra("bundle_extra_is_one_tap_send", directPrivateStoryRecipientController.f65160O.E());
                if (directPrivateStoryRecipientController.f65189r) {
                    intent.putExtra("DirectPrivateStoryRecipientFragment.DIRECT_SHOULD_SHARE_TO_FB", directPrivateStoryRecipientController.f65168W.D());
                }
                intent.putExtra("bundle_extra_num_whatsapp_share_attempts", directPrivateStoryRecipientController.f65158M);
                intent.putExtra("bundle_extra_num_whatsapp_share_successes", directPrivateStoryRecipientController.f65193v);
                intent.putExtra("bundle_extra_num_whatsapp_share_cancels", directPrivateStoryRecipientController.f65192u);
                if (directPrivateStoryRecipientController.f65148C) {
                    i2 = directPrivateStoryRecipientController.f65157L;
                    if (i2 > 0) {
                        AnonymousClass4ig anonymousClass4ig = directPrivateStoryRecipientController.f65149D;
                        i2 = anonymousClass4ig == null ? 0 : Collections.unmodifiableSet(anonymousClass4ig.f56478B).size();
                    }
                    intent.putExtra("bundle_extra_num_blast_list_candidates", i2);
                }
                if (directPrivateStoryRecipientController.f65153H.getTargetFragment() == null) {
                }
                activity = directPrivateStoryRecipientController.f65153H.getActivity();
                activity.setResult(i, intent);
                activity.finish();
                if (i == -1) {
                    activity.overridePendingTransition(0, 0);
                }
                anonymousClass0IL = directPrivateStoryRecipientController.f65156K;
                if (anonymousClass0IL != null) {
                    anonymousClass0IL.getActivity().onBackPressed();
                }
            }
            B.f7119B = bitmap;
            weakReference = B.f7120C;
            if (weakReference == null) {
            }
            if (imageView != null) {
                imageView.setImageBitmap(bitmap);
                imageView.setVisibility(0);
            }
        }
        intent = new Intent();
        anonymousClass4im = directPrivateStoryRecipientController.f65160O;
        AnonymousClass0Sy.C();
        arrayList = new ArrayList(anonymousClass4im.f56492C.size());
        for (AnonymousClass4in anonymousClass4in2 : anonymousClass4im.f56492C.values()) {
            if (AnonymousClass4im.B(anonymousClass4in2)) {
                arrayList.add(anonymousClass4in2.f56494B);
            }
        }
        arrayList2 = new ArrayList(arrayList.size());
        for (AnonymousClass1SI anonymousClass1SI2 : arrayList) {
            if (anonymousClass1SI2 instanceof AnonymousClass4ii) {
                arrayList2.add(((AnonymousClass4ii) anonymousClass1SI2).f56484B);
            }
        }
        intent.putExtra("bundle_extra_user_tapped_done_button", z);
        intent.putExtra("bundle_extra_one_tap_send_taps", directPrivateStoryRecipientController.f65196y).putExtra("bundle_extra_one_tap_undo_taps", directPrivateStoryRecipientController.f65197z).putExtra("bundle_extra_pending_media_keys", directPrivateStoryRecipientController.f65161P).putParcelableArrayListExtra("bundle_extra_parcelable_story_share_targets", arrayList2).putExtra("bundle_extra_user_story_target", directPrivateStoryRecipientController.f65173b).putExtra("bundle_extra_is_one_tap_send", directPrivateStoryRecipientController.f65160O.E());
        if (directPrivateStoryRecipientController.f65189r) {
            intent.putExtra("DirectPrivateStoryRecipientFragment.DIRECT_SHOULD_SHARE_TO_FB", directPrivateStoryRecipientController.f65168W.D());
        }
        intent.putExtra("bundle_extra_num_whatsapp_share_attempts", directPrivateStoryRecipientController.f65158M);
        intent.putExtra("bundle_extra_num_whatsapp_share_successes", directPrivateStoryRecipientController.f65193v);
        intent.putExtra("bundle_extra_num_whatsapp_share_cancels", directPrivateStoryRecipientController.f65192u);
        if (directPrivateStoryRecipientController.f65148C) {
            i2 = directPrivateStoryRecipientController.f65157L;
            if (i2 > 0) {
                AnonymousClass4ig anonymousClass4ig2 = directPrivateStoryRecipientController.f65149D;
                if (anonymousClass4ig2 == null) {
                }
            }
            intent.putExtra("bundle_extra_num_blast_list_candidates", i2);
        }
        if (directPrivateStoryRecipientController.f65153H.getTargetFragment() == null && (directPrivateStoryRecipientController.f65153H.getTargetRequestCode() == 13364 || directPrivateStoryRecipientController.f65153H.getTargetRequestCode() == 13365)) {
            directPrivateStoryRecipientController.f65153H.getTargetFragment().onActivityResult(directPrivateStoryRecipientController.f65153H.getTargetRequestCode(), i, intent);
        } else {
            activity = directPrivateStoryRecipientController.f65153H.getActivity();
            activity.setResult(i, intent);
            activity.finish();
            if (i == -1) {
                activity.overridePendingTransition(0, 0);
            }
        }
        anonymousClass0IL = directPrivateStoryRecipientController.f65156K;
        if (anonymousClass0IL != null) {
            anonymousClass0IL.getActivity().onBackPressed();
        }
    }

    /* renamed from: D */
    public final boolean m27127D() {
        m27117D(this, this.f65160O.E() ? -1 : 0, false);
        return true;
    }

    /* renamed from: E */
    public final void m27128E() {
        Iterator it;
        Bundle arguments = this.f65153H.getArguments();
        AnonymousClass0Cm G = AnonymousClass0Ce.G(arguments);
        this.f65172a = G;
        this.f65181j = AnonymousClass0yJ.D(G);
        boolean z = false;
        this.f65183l = arguments.getBoolean("DirectPrivateStoryRecipientFragment.CAN_SHOW_FB_STORY_OPTION", false);
        this.f65186o = arguments.getBoolean("DirectPrivateStoryRecipientFragment.CAN_SHOW_WHATSAPP_SHARE_OPTION", false);
        this.f65184m = arguments.getBoolean("DirectPrivateStoryRecipientFragment.CAN_SHOW_HIGHLIGHTS_OPTION", false);
        boolean z2 = this.f65183l && !((Boolean) AnonymousClass0CC.lK.H(this.f65172a)).booleanValue() && ((Boolean) AnonymousClass0CC.LW.H(this.f65172a)).booleanValue();
        this.f65189r = z2;
        this.f65152G = new AnonymousClass0kV(this.f65153H.getActivity(), this.f65172a);
        this.f65168W = new AnonymousClass4Ou(this.f65172a, new AnonymousClass5V4(this));
        this.f65168W.C(arguments.getBoolean("DirectPrivateStoryRecipientFragment.DIRECT_SHOULD_SHARE_TO_FB", this.f65168W.D()));
        this.f65170Y = arguments.getBoolean("DirectPrivateStoryRecipientFragment.SHOW_STORY_BUTTON", false);
        this.f65150E = arguments.getBoolean("DirectPrivateStoryRecipientFragment.CAN_SHOW_EXTERNAL_SHARE_OPTIONS", false);
        this.CB = arguments.getBoolean("DirectPrivateStoryRecipientFragment.SHOW_SEARCH_IN_ACTION_BAR", false);
        this.f65180i = arguments.getBoolean("DirectPrivateStoryRecipientFragment.DISABLE_FAST_SCROLL", true);
        this.f65169X = arguments.getBoolean("DirectPrivateStoryRecipientFragment.SHOULD_SHOW_SUGGESTED_AND_RECENT_TITLE_HEADERS", false);
        this.f65185n = arguments.getBoolean("DirectPrivateStoryRecipientFragment.SHOW_SHARE_HEADER", false);
        this.f65161P = arguments.getStringArray("DirectPrivateStoryRecipientFragment.PENDING_MEDIA_KEYS");
        this.f65166U = arguments.getParcelableArrayList("bundle_share_media_logging_info");
        if (this.GB) {
            String[] strArr = this.f65161P;
            if (strArr != null && strArr.length == 1) {
                z = true;
            }
        }
        this.f65148C = z;
        this.f65187p = arguments.getString("bundle_share_text");
        this.f65159N = new LinkedHashSet();
        if (this.f65161P != null) {
            this.f65162Q = new ArrayList();
            for (String str : this.f65161P) {
                Collection arrayList;
                AnonymousClass0VK B;
                AnonymousClass0OA A = PendingMediaStore.C().A(str);
                List list = null;
                List list2;
                if (A == null) {
                    list2 = null;
                } else {
                    list2 = A.U(AnonymousClass0ZR.class);
                }
                if (r1 != null) {
                    Set set = this.f65154I;
                    arrayList = new ArrayList();
                    for (AnonymousClass0ZR anonymousClass0ZR : r1) {
                        arrayList.add(anonymousClass0ZR.f6344E);
                    }
                    set.addAll(arrayList);
                }
                if (A != null) {
                    list = A.V(AnonymousClass0VK.class, new AnonymousClass1Sd());
                }
                if (r0 != null) {
                    LinkedHashSet linkedHashSet = this.f65159N;
                    Collection arrayList2 = new ArrayList();
                    for (AnonymousClass0VK B2 : r0) {
                        arrayList2.addAll(B2.A());
                    }
                    linkedHashSet.addAll(arrayList2);
                }
                if (A != null) {
                    this.f65162Q.add(A);
                    if (this.f65148C && this.f65149D == null) {
                        AnonymousClass4ig anonymousClass4ig;
                        B2 = AnonymousClass0VK.B(A);
                        if (B2 != null) {
                            arrayList = B2.A();
                            if (!arrayList.isEmpty()) {
                                anonymousClass4ig = new AnonymousClass4ig(str, new HashSet(arrayList), this.f65172a);
                                this.f65149D = anonymousClass4ig;
                            }
                        }
                        anonymousClass4ig = null;
                        this.f65149D = anonymousClass4ig;
                    }
                }
            }
        }
        Set set2 = this.f65154I;
        AnonymousClass0Um anonymousClass0Um = AnonymousClass0Um.ALL;
        if (!set2.contains(anonymousClass0Um)) {
            set2 = this.f65154I;
            anonymousClass0Um = AnonymousClass0Um.FAVORITES;
            if (set2.contains(anonymousClass0Um)) {
            }
            this.f65160O = new AnonymousClass4im(new AnonymousClass5V5(this));
            for (AnonymousClass0Um anonymousClass0Um2 : this.f65154I) {
                this.f65160O.A(AnonymousClass4io.C(anonymousClass0Um2), new AnonymousClass1SL(this.f65161P, anonymousClass0Um2, this.f65172a, false));
            }
            it = this.f65159N.iterator();
            while (it.hasNext()) {
                DirectShareTarget directShareTarget = (DirectShareTarget) it.next();
                this.f65160O.A(AnonymousClass4io.B(directShareTarget), new AnonymousClass4ii(this.f65161P, directShareTarget, this.f65172a));
            }
            if (this.f65149D != null) {
                this.f65160O.A(AnonymousClass4io.f56500E, this.f65149D);
            }
            this.f65195x = new AnonymousClass4bB(this);
        }
        this.f65173b = anonymousClass0Um;
        this.f65160O = new AnonymousClass4im(new AnonymousClass5V5(this));
        for (AnonymousClass0Um anonymousClass0Um22 : this.f65154I) {
            this.f65160O.A(AnonymousClass4io.C(anonymousClass0Um22), new AnonymousClass1SL(this.f65161P, anonymousClass0Um22, this.f65172a, false));
        }
        it = this.f65159N.iterator();
        while (it.hasNext()) {
            DirectShareTarget directShareTarget2 = (DirectShareTarget) it.next();
            this.f65160O.A(AnonymousClass4io.B(directShareTarget2), new AnonymousClass4ii(this.f65161P, directShareTarget2, this.f65172a));
        }
        if (this.f65149D != null) {
            this.f65160O.A(AnonymousClass4io.f56500E, this.f65149D);
        }
        this.f65195x = new AnonymousClass4bB(this);
    }

    /* renamed from: E */
    public static void m27118E(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        LayoutParams layoutParams = (LayoutParams) directPrivateStoryRecipientController.mListContainer.getLayoutParams();
        layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, directPrivateStoryRecipientController.f65160O.E() ? directPrivateStoryRecipientController.f65190s + AnonymousClass0ip.B(directPrivateStoryRecipientController.f65153H.getContext()) : directPrivateStoryRecipientController.f65190s);
        directPrivateStoryRecipientController.mListContainer.setLayoutParams(layoutParams);
    }

    /* renamed from: F */
    public final void m27129F() {
        AnonymousClass0F4.f2058E.D(AnonymousClass1EM.class, this);
        OnScrollListener onScrollListener = this.mFastScrollController;
        if (onScrollListener != null) {
            this.f65194w.B(onScrollListener);
        }
        onScrollListener = this.mStickySearchBarAnimationHelper;
        if (onScrollListener != null) {
            this.f65194w.B(onScrollListener);
            this.f65153H.unregisterLifecycleListener(this.mStickySearchBarAnimationHelper);
        }
        onScrollListener = this.mCustomScrollAwayNavigationController;
        if (onScrollListener != null) {
            this.f65194w.B(onScrollListener);
        }
        onScrollListener = this.f65188q;
        if (onScrollListener != null) {
            this.f65194w.B(onScrollListener);
        }
        this.f65153H.unregisterLifecycleListener(this.mSearchController);
        AnonymousClass14H.C(this.mSheetActionButton).J();
        DirectPrivateStoryRecipientControllerLifecycleUtil.cleanupReferences(this);
    }

    /* renamed from: F */
    public static void m27119F(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        directPrivateStoryRecipientController.mSheetActionButton.setText(C0164R.string.done);
        directPrivateStoryRecipientController.mSheetActionButton.setBackgroundResource(AnonymousClass0G5.F(directPrivateStoryRecipientController.f65153H.getContext(), C0164R.attr.directPaletteGradientSelector));
        boolean E = directPrivateStoryRecipientController.f65160O.E();
        AnonymousClass5V1 anonymousClass5V1 = directPrivateStoryRecipientController.f65156K;
        if (E) {
            AnonymousClass14H G = AnonymousClass14H.C(directPrivateStoryRecipientController.mSheetActionButton).J().K(true).G(0.0f);
            G.f13863c = 0;
            G.f13848N = new AnonymousClass4bG(directPrivateStoryRecipientController);
            G.N();
            return;
        }
        m27118E(directPrivateStoryRecipientController);
        directPrivateStoryRecipientController.mSheetActionButton.setClickable(false);
        G = AnonymousClass14H.C(directPrivateStoryRecipientController.mSheetActionButton).J().K(true).G((float) AnonymousClass0ip.B(directPrivateStoryRecipientController.f65153H.getContext()));
        G.f13862b = 8;
        G.N();
    }

    /* renamed from: G */
    public final void m27130G() {
        new AnonymousClass0Sn(TransparentModalActivity.class, "direct_story_create_group", new Bundle(), (Activity) AnonymousClass0T1.B(this.f65153H.getContext(), Activity.class), this.f65172a.f1759C).C(this.f65153H, 2001);
    }

    /* renamed from: G */
    public static void m27120G(DirectPrivateStoryRecipientController directPrivateStoryRecipientController, List list, List list2, List list3, List list4) {
        boolean isEmpty = directPrivateStoryRecipientController.f65165T.LQ().isEmpty();
        if (list != null) {
            AnonymousClass5Wz anonymousClass5Wz = directPrivateStoryRecipientController.f65163R;
            anonymousClass5Wz.f65710b.clear();
            anonymousClass5Wz.f65702T.clear();
            anonymousClass5Wz.f65703U.clear();
            AnonymousClass5Wz.m27341E(anonymousClass5Wz);
            anonymousClass5Wz.f65710b.addAll(list);
        }
        if (list2 != null) {
            anonymousClass5Wz = directPrivateStoryRecipientController.f65163R;
            anonymousClass5Wz.f65700R.clear();
            anonymousClass5Wz.f65702T.clear();
            anonymousClass5Wz.f65703U.clear();
            anonymousClass5Wz.f65700R.addAll(list2);
        }
        if (list3 != null) {
            anonymousClass5Wz = directPrivateStoryRecipientController.f65163R;
            AnonymousClass5Wz.m27341E(anonymousClass5Wz);
            anonymousClass5Wz.f65689G = (List) AnonymousClass0LH.E(list3);
        }
        if (list4 != null) {
            anonymousClass5Wz = directPrivateStoryRecipientController.f65163R;
            anonymousClass5Wz.f65690H.clear();
            anonymousClass5Wz.f65690H.addAll(list4);
        }
        AnonymousClass5Wz anonymousClass5Wz2 = directPrivateStoryRecipientController.f65163R;
        boolean z = true;
        boolean z2 = directPrivateStoryRecipientController.f65170Y && isEmpty;
        boolean z3 = directPrivateStoryRecipientController.f65150E && isEmpty;
        boolean z4 = directPrivateStoryRecipientController.f65169X && isEmpty;
        anonymousClass5Wz2.m27356J(z2, z3, isEmpty, z4);
        Object obj = ((list == null || list.isEmpty()) && ((list2 == null || list2.isEmpty()) && (list3 == null || list3.isEmpty()))) ? null : 1;
        AnonymousClass0UX anonymousClass0UX = directPrivateStoryRecipientController.DB;
        synchronized (anonymousClass0UX) {
            z4 = anonymousClass0UX.f5469E;
        }
        if (!z4 || obj != null) {
            z = false;
        }
        AnonymousClass2IF.B(z, directPrivateStoryRecipientController.f65153H.getView());
    }

    /* renamed from: H */
    public final void m27131H() {
        if (!this.mSearchController.C()) {
            this.mSearchController.A(false, 0.0f);
        }
        this.f65160O.G();
    }

    /* renamed from: H */
    public static void m27121H(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        AnonymousClass5Wz anonymousClass5Wz = directPrivateStoryRecipientController.f65163R;
        if (anonymousClass5Wz != null) {
            anonymousClass5Wz.m27356J(directPrivateStoryRecipientController.f65170Y, directPrivateStoryRecipientController.f65150E, true, directPrivateStoryRecipientController.f65169X);
        }
    }

    /* renamed from: I */
    public final void m27132I() {
        this.f65155J.B(this.f65153H.getActivity());
        AnonymousClass0CC.iH.E(this.f65172a);
    }

    /* renamed from: I */
    public static void m27122I(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        directPrivateStoryRecipientController.f65163R.m27356J(directPrivateStoryRecipientController.f65170Y, directPrivateStoryRecipientController.f65150E, true, directPrivateStoryRecipientController.f65169X);
        m27119F(directPrivateStoryRecipientController);
        m27118E(directPrivateStoryRecipientController);
    }

    public final void Iz(String str) {
        String G = AnonymousClass0IE.G(str);
        if (!TextUtils.isEmpty(G)) {
            AnonymousClass0CC.gH.E(this.f65172a);
            AnonymousClass0V1.b(this.f65153H, G);
        }
        this.f65165T.mQA(G);
    }

    /* renamed from: J */
    public final void m27133J(View view, FrameLayout frameLayout) {
        this.mListContainer = frameLayout;
        Context context = this.f65153H.getContext();
        AnonymousClass0Cm anonymousClass0Cm = this.f65172a;
        AnonymousClass4kf anonymousClass4kf = this.EB;
        AnonymousClass4kf anonymousClass4kf2 = this.f65191t;
        AnonymousClass5bO anonymousClass5bO = this.f65178g;
        AnonymousClass4lC anonymousClass4lC = this.f65176e;
        AnonymousClass5bP anonymousClass5bP = this.f65175d;
        AnonymousClass5V9 anonymousClass5V9 = this.f65179h;
        AnonymousClass5VA anonymousClass5VA = this.f65177f;
        AnonymousClass5V7 anonymousClass5V7 = this.FB;
        AnonymousClass5V3 anonymousClass5V3 = this.f65182k;
        AnonymousClass5VB anonymousClass5VB = this.f65174c;
        boolean z = this.f65181j;
        boolean z2 = this.f65183l;
        boolean z3 = this.f65186o;
        boolean z4 = this.f65184m;
        boolean z5 = this.f65189r;
        boolean z6 = this.CB;
        AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
        this.f65163R = new AnonymousClass5Wz(context, anonymousClass0Cm2, anonymousClass4kf, anonymousClass4kf2, anonymousClass5bO, anonymousClass4lC, anonymousClass5bP, anonymousClass5V9, anonymousClass5VA, anonymousClass5V7, anonymousClass5V3, anonymousClass5VB, z, z2, z3, z4, z5, z6 ^ 1, z6, this.f65148C, ((Boolean) AnonymousClass0CC.dI.H(this.f65172a)).booleanValue(), this.f65185n, this.f65152G, this.f65195x, this.f65168W, this.f65161P, this, this.f65153H);
        Iterator it = this.f65159N.iterator();
        while (it.hasNext()) {
            r0.f65163R.m27352F((DirectShareTarget) it.next());
        }
        View view2 = view;
        r0.mListView = (ListView) view2.findViewById(16908298);
        r0.f65165T = AnonymousClass1T2.C(r0.f65153H.getContext(), r0.f65172a, new AnonymousClass0Px(r0.f65153H.getContext(), r0.f65153H.getLoaderManager()), r0.f65153H, (String) AnonymousClass0E6.D(AnonymousClass0CC.gH, r0.f65172a), false, "raven", true, ((Boolean) AnonymousClass0E6.D(AnonymousClass0CC.BI, r0.f65172a)).booleanValue(), ((Boolean) AnonymousClass0E6.D(AnonymousClass0CC.CI, r0.f65172a)).booleanValue());
        r0.f65164S = new AnonymousClass4l0(r0.f65153H.getContext(), r0.f65172a, r0.AB, r0.f65195x, new AnonymousClass5V6(r0), r0);
        r0.f65165T.EPA(r0.f65164S);
        r0.mSearchController = new SearchController(r0.f65153H.getActivity(), (ViewGroup) view2, 0, r0.f65164S, r0, true, null);
        r0.f65153H.registerLifecycleListener(r0.mSearchController);
        r0.mListView.setAdapter(r0.f65163R);
        r0.f65163R.m27356J(r0.f65170Y, r0.f65150E, true, r0.f65169X);
        r0.f65153H.getListView().setOnScrollListener(r0);
        TextView textView = (TextView) view2.findViewById(C0164R.id.button_send);
        r0.mSheetActionButton = textView;
        textView.setOnClickListener(new AnonymousClass4bC(r0));
        r0.mSheetActionButton.setVisibility(8);
        r0.f65155J.A(r0);
        AnonymousClass0F4.f2058E.A(AnonymousClass1EM.class, r0);
        AnonymousClass0UX B = AnonymousClass0UX.B(r0.f65172a);
        r0.DB = B;
        if (!B.B()) {
            r0.DB.A();
        }
        m27123J(r0);
        r0.f65153H.schedule(new AnonymousClass4bE(r0));
        m27118E(r0);
        m27119F(r0);
        int B2 = AnonymousClass0ip.B(r0.f65153H.getContext());
        if (r0.CB) {
            View findViewById = ((ViewStub) view2.findViewById(C0164R.id.action_bar_search_stub)).inflate().findViewById(C0164R.id.direct_action_bar_search_bar);
            findViewById.setOnClickListener(new AnonymousClass4bD(r0));
            if (VERSION.SDK_INT >= 21) {
                findViewById.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
                findViewById.setElevation((float) r0.f65153H.getResources().getDimensionPixelSize(C0164R.dimen.direct_action_bar_search_bar_elevation));
            }
            int dimensionPixelSize = r0.f65153H.getResources().getDimensionPixelSize(C0164R.dimen.direct_action_bar_search_container_offset_recipient_picker);
            AnonymousClass0Nm.f(r0.mListContainer, dimensionPixelSize);
            B2 += dimensionPixelSize;
        } else if (!((Boolean) AnonymousClass0CC.GI.H(r0.f65172a)).booleanValue()) {
            r0.mStickySearchBarAnimationHelper = new StickySearchBarAnimationHelper(r0.f65153H.getActivity(), r0.mSearchController, r0.mListView, r0.f65163R, 1);
            r0.mCustomScrollAwayNavigationController = new AnonymousClass238(1, AnonymousClass0eT.E(r0.f65153H.getActivity()).f7727C, r0.mStickySearchBarAnimationHelper);
            r0.f65194w.A(r0.mStickySearchBarAnimationHelper);
            r0.f65194w.A(r0.mCustomScrollAwayNavigationController);
            r0.f65153H.registerLifecycleListener(r0.mStickySearchBarAnimationHelper);
        }
        OnScrollListener onScrollListener = r0.f65188q;
        if (onScrollListener != null) {
            r0.f65194w.A(onScrollListener);
        }
        ListView listView = r0.f65153H.getListView();
        if (!r0.f65180i) {
            listView.setVerticalScrollBarEnabled(false);
        } else if (((Boolean) AnonymousClass0CC.HI.H(r0.f65172a)).booleanValue()) {
            listView.setVerticalScrollBarEnabled(false);
            ViewStub viewStub = (ViewStub) view2.findViewById(C0164R.id.direct_fast_scroll_container);
            BaseAdapter baseAdapter = r0.f65163R;
            r0.mFastScrollController = new AnonymousClass5Ir(new AnonymousClass5aC(listView, baseAdapter, r0.f65163R), listView, baseAdapter, baseAdapter, viewStub.inflate());
            r0.f65194w.A(r0.mFastScrollController);
            AnonymousClass0Nm.h(viewStub, B2);
        }
        AnonymousClass0Um anonymousClass0Um = (AnonymousClass0Um) r0.f65153H.getArguments().getSerializable("DirectPrivateStoryRecipientController.USER_STORY_TARGET");
        if (!r0.f65154I.contains(AnonymousClass0Um.FAVORITES) && !r0.f65154I.contains(AnonymousClass0Um.ALL) && anonymousClass0Um != null && r0.f65161P != null) {
            r0.f65173b = anonymousClass0Um;
            AnonymousClass4im anonymousClass4im = r0.f65160O;
            AnonymousClass4io C = AnonymousClass4io.C(anonymousClass0Um);
            AnonymousClass1SI anonymousClass1SL = new AnonymousClass1SL(r0.f65161P, anonymousClass0Um, r0.f65172a, r0.f65168W.D());
            AnonymousClass0Sy.C();
            anonymousClass4im.B(C);
            AnonymousClass4in anonymousClass4in = new AnonymousClass4in(anonymousClass4im.f56493D, anonymousClass4im.f56491B, anonymousClass1SL, 0);
            anonymousClass4im.f56492C.put(C, anonymousClass4in);
            AnonymousClass0LH.B(anonymousClass4in.f56496D == 0);
            anonymousClass4in.f56495C = AnonymousClass0Gd.E();
            AnonymousClass4in.B(anonymousClass4in);
        }
    }

    /* renamed from: J */
    public static void m27123J(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        List arrayList;
        List arrayList2;
        directPrivateStoryRecipientController.f65163R.f65708Z = false;
        AnonymousClass0UX anonymousClass0UX = directPrivateStoryRecipientController.DB;
        synchronized (anonymousClass0UX) {
            arrayList = new ArrayList(anonymousClass0UX.f5471G);
        }
        if (directPrivateStoryRecipientController.f65148C) {
            AnonymousClass0Cm anonymousClass0Cm = directPrivateStoryRecipientController.f65172a;
            Collection collection = AnonymousClass0VF.f5666D;
            try {
                String string = AnonymousClass0HV.D(anonymousClass0Cm).f2646B.getString("direct_blast_list_candidates", null);
                if (string != null) {
                    AnonymousClass0VF parseFromJson = AnonymousClass4ZZ.parseFromJson(string);
                    if (parseFromJson.f5667B.size() >= 2) {
                        collection = AnonymousClass0VF.B(new LinkedHashSet(parseFromJson.f5667B), collection);
                    } else {
                        throw new IOException("Not enough targets parsed");
                    }
                }
            } catch (Throwable e) {
                AnonymousClass0HV.D(anonymousClass0Cm).RA(null);
                AnonymousClass0Gn.L("BlastListCandidatesManager_error_deserializing_last_send", e);
            }
            arrayList2 = new ArrayList(collection);
        } else {
            arrayList2 = null;
        }
        m27120G(directPrivateStoryRecipientController, arrayList, null, null, arrayList2);
    }

    public final boolean KV(SearchController searchController) {
        StickySearchBarAnimationHelper stickySearchBarAnimationHelper = this.mStickySearchBarAnimationHelper;
        return stickySearchBarAnimationHelper != null && stickySearchBarAnimationHelper.KV(searchController);
    }

    public final void Pv(AnonymousClass3e1 anonymousClass3e1) {
        if (TextUtils.isEmpty(anonymousClass3e1.LQ())) {
            m27123J(this);
            return;
        }
        String string;
        int D;
        AnonymousClass2IF.B(false, this.f65153H.getView());
        boolean uX = anonymousClass3e1.uX();
        boolean UX = anonymousClass3e1.UX();
        if (!uX) {
            if (!UX) {
                this.f65163R.f65708Z = false;
                m27120G(this, ((AnonymousClass1St) anonymousClass3e1.uQ()).f18851B, null, null, null);
            }
        }
        if (UX) {
            string = this.f65153H.getResources().getString(C0164R.string.search_for_x, new Object[]{r5});
            D = AnonymousClass0G5.D(this.f65153H.getContext(), C0164R.attr.directPaletteColor5);
        } else {
            string = this.f65153H.getContext().getString(C0164R.string.searching);
            D = AnonymousClass0Ca.C(this.f65153H.getContext(), C0164R.color.grey_5);
        }
        AnonymousClass5Wz anonymousClass5Wz = this.f65163R;
        anonymousClass5Wz.f65708Z = true;
        anonymousClass5Wz.f65705W.f43664B = uX;
        anonymousClass5Wz.f65704V.A(string, D);
        m27120G(this, ((AnonymousClass1St) anonymousClass3e1.uQ()).f18851B, null, null, null);
    }

    public final void Sp(int i, boolean z) {
        if (!this.f65181j) {
            this.f65190s = i;
            this.mSheetActionButton.setTranslationY((float) (-i));
            m27118E(this);
        }
    }

    public final void UBA(SearchController searchController, AnonymousClass3jo anonymousClass3jo, AnonymousClass3jo anonymousClass3jo2) {
        StickySearchBarAnimationHelper stickySearchBarAnimationHelper = this.mStickySearchBarAnimationHelper;
        if (stickySearchBarAnimationHelper != null) {
            stickySearchBarAnimationHelper.UBA(searchController, anonymousClass3jo, anonymousClass3jo2);
        }
    }

    public final float UI(SearchController searchController, AnonymousClass3jm anonymousClass3jm) {
        StickySearchBarAnimationHelper stickySearchBarAnimationHelper = this.mStickySearchBarAnimationHelper;
        if (stickySearchBarAnimationHelper == null) {
            return 0.0f;
        }
        return stickySearchBarAnimationHelper.UI(searchController, anonymousClass3jm);
    }

    public final void Vd(SearchController searchController, float f, float f2, AnonymousClass3jm anonymousClass3jm) {
        StickySearchBarAnimationHelper stickySearchBarAnimationHelper = this.mStickySearchBarAnimationHelper;
        if (stickySearchBarAnimationHelper != null) {
            stickySearchBarAnimationHelper.Vd(searchController, f, f2, anonymousClass3jm);
        }
    }

    public final /* bridge */ /* synthetic */ void onEvent(AnonymousClass0F6 anonymousClass0F6) {
        int I = AnonymousClass0cQ.I(this, -335585880);
        AnonymousClass1EM anonymousClass1EM = (AnonymousClass1EM) anonymousClass0F6;
        int I2 = AnonymousClass0cQ.I(this, -1134982440);
        if (TextUtils.isEmpty(this.f65165T.LQ())) {
            m27123J(this);
        }
        AnonymousClass0cQ.H(this, 243720563, I2);
        AnonymousClass0cQ.H(this, 1307206266, I);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int I = AnonymousClass0cQ.I(this, 242945115);
        this.f65194w.onScroll(absListView, i, i2, i3);
        AnonymousClass0cQ.H(this, -2109551807, I);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int I = AnonymousClass0cQ.I(this, 1511194374);
        this.f65194w.onScrollStateChanged(absListView, i);
        AnonymousClass0cQ.H(this, 2131385329, I);
    }

    public final void zy(SearchController searchController, boolean z) {
        StickySearchBarAnimationHelper stickySearchBarAnimationHelper = this.mStickySearchBarAnimationHelper;
        if (stickySearchBarAnimationHelper != null) {
            stickySearchBarAnimationHelper.zy(searchController, z);
        } else if (this.BB) {
            AnonymousClass0eT.E(this.f65153H.getActivity()).k(z ^ 1);
            AnonymousClass0ea.D(this.f65153H.getActivity(), AnonymousClass0G5.D(this.f65153H.getContext(), C0164R.attr.backgroundColorPrimaryDark));
        }
    }
}

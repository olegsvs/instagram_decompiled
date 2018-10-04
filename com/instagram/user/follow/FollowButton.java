package com.instagram.user.follow;

import X.AnonymousClass0Ca;
import X.AnonymousClass0Ci;
import X.AnonymousClass0Cm;
import X.AnonymousClass0Co;
import X.AnonymousClass0HV;
import X.AnonymousClass0Lo;
import X.AnonymousClass0Lq;
import X.AnonymousClass0MM;
import X.AnonymousClass0OR;
import X.AnonymousClass0P7;
import X.AnonymousClass0QH;
import X.AnonymousClass0cQ;
import X.AnonymousClass0ca;
import X.AnonymousClass0dB;
import X.AnonymousClass0db;
import X.AnonymousClass0eS;
import X.AnonymousClass0er;
import X.AnonymousClass0hq;
import X.AnonymousClass0iq;
import X.AnonymousClass0ui;
import X.AnonymousClass0x5;
import X.AnonymousClass173;
import X.AnonymousClass174;
import X.AnonymousClass177;
import X.AnonymousClass19R;
import X.AnonymousClass19S;
import X.AnonymousClass19T;
import X.AnonymousClass19U;
import X.AnonymousClass3lJ;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.user.userdetail.UserDetailEntryInfo;

public class FollowButton extends UpdatableButton {
    /* renamed from: B */
    public Rect f12842B;
    /* renamed from: C */
    public int f12843C;
    /* renamed from: D */
    public int f12844D;
    /* renamed from: E */
    public Handler f12845E;
    /* renamed from: F */
    public boolean f12846F;
    /* renamed from: G */
    public AnonymousClass0iq f12847G;
    /* renamed from: H */
    public AnonymousClass19T f12848H;
    /* renamed from: I */
    public final Runnable f12849I;
    /* renamed from: J */
    public AnonymousClass19U f12850J;
    /* renamed from: K */
    public AnonymousClass19T f12851K;
    /* renamed from: L */
    public final AnonymousClass0ui f12852L;
    /* renamed from: M */
    public Rect f12853M;
    /* renamed from: N */
    private String f12854N;
    /* renamed from: O */
    private int f12855O;
    /* renamed from: P */
    private UserDetailEntryInfo f12856P;
    /* renamed from: Q */
    private String f12857Q;
    /* renamed from: R */
    private String f12858R;
    /* renamed from: S */
    private int f12859S;
    /* renamed from: T */
    private boolean f12860T;
    /* renamed from: U */
    private boolean f12861U;

    public FollowButton(Context context) {
        this(context, null, 0);
    }

    public FollowButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FollowButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12844D = C0164R.color.white;
        this.f12852L = new AnonymousClass19R(this);
        this.f12849I = new AnonymousClass19S(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0eS.FollowButton, i, 0);
        String nonResourceString = obtainStyledAttributes.getNonResourceString(2);
        this.f12855O = obtainStyledAttributes.getResourceId(0, -1);
        this.f12843C = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        if ("large".equals(nonResourceString)) {
            this.f12851K = AnonymousClass19T.LARGE;
        } else if ("medium".equals(nonResourceString)) {
            this.f12851K = AnonymousClass19T.MEDIUM;
        } else if ("actionbaricon".equals(nonResourceString)) {
            this.f12851K = AnonymousClass19T.ACTIONBARICON;
        } else {
            this.f12851K = AnonymousClass19T.SMALL;
        }
        this.f12848H = this.f12851K;
        this.f12859S = getInnerSpacing();
        this.f12850J = AnonymousClass19U.FULL;
    }

    /* renamed from: A */
    public final void m8654A(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Ci anonymousClass0Ci, AnonymousClass0QH anonymousClass0QH) {
        m8655B(anonymousClass0Cm, anonymousClass0Ci, anonymousClass0QH, null, null, null);
    }

    /* renamed from: B */
    public final void m8655B(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Ci anonymousClass0Ci, AnonymousClass0QH anonymousClass0QH, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0db anonymousClass0db, AnonymousClass0hq anonymousClass0hq) {
        m8656C(anonymousClass0Cm, anonymousClass0Ci, true, anonymousClass0QH, anonymousClass0P7, anonymousClass0db, anonymousClass0hq);
    }

    /* renamed from: B */
    public static void m8649B(FollowButton followButton, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Ci anonymousClass0Ci, AnonymousClass0QH anonymousClass0QH, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0db anonymousClass0db, AnonymousClass0hq anonymousClass0hq) {
        AnonymousClass0Ci anonymousClass0Ci2 = anonymousClass0Ci;
        AnonymousClass0Lq Q = AnonymousClass0er.m6431B(anonymousClass0Cm).m6439Q(anonymousClass0Ci2);
        if (!(AnonymousClass0MM.m3152H(followButton.getContext()) || AnonymousClass0HV.m2007C().f2646B.getBoolean("seen_offline_follow_nux", false))) {
            View view = (View) followButton.getParent();
            while (view != null && !(view instanceof ListView)) {
                if (!(view.getParent() instanceof View)) {
                    break;
                }
                view = (View) view.getParent();
            }
            if ((view instanceof ListView) && (Q == AnonymousClass0Lq.FollowStatusFollowing || Q == AnonymousClass0Lq.FollowStatusNotFollowing)) {
                String T = anonymousClass0Ci2.m1003T();
                CharSequence string = followButton.getResources().getString(C0164R.string.offline_unfollow_nux_title, new Object[]{T});
                if (Q == AnonymousClass0Lq.FollowStatusNotFollowing) {
                    if (anonymousClass0Ci2.qB == AnonymousClass0Lo.PrivacyStatusPrivate) {
                        string = followButton.getResources().getString(C0164R.string.offline_follow_request_nux_title);
                    } else {
                        string = followButton.getResources().getString(C0164R.string.offline_follow_nux_title, new Object[]{T});
                    }
                }
                AnonymousClass173 anonymousClass173 = new AnonymousClass173((Activity) followButton.getContext(), new AnonymousClass174(string));
                anonymousClass173.f14642H = AnonymousClass177.BELOW_ANCHOR;
                anonymousClass173.f14636B = false;
                anonymousClass173.f14640F = followButton.f12852L;
                anonymousClass173.f14646L = false;
                followButton.f12847G = anonymousClass173.m9461C(followButton).m9459A();
                if (followButton.f12842B == null) {
                    followButton.f12842B = new Rect();
                }
                if (followButton.f12853M == null) {
                    followButton.f12853M = new Rect();
                }
                view.getGlobalVisibleRect(followButton.f12853M);
                if (followButton.f12845E == null) {
                    followButton.f12845E = new Handler(Looper.getMainLooper());
                }
                AnonymousClass0OR.m3627G(followButton.f12845E, followButton.f12849I, -845598558);
                AnonymousClass0OR.m3626F(followButton.f12845E, followButton.f12849I, 500, 244950762);
            }
        }
        m8653F(followButton, Q);
        AnonymousClass0x5.m8474F(AnonymousClass0x5.m8471C(anonymousClass0Cm), anonymousClass0Ci2, followButton.f12854N, anonymousClass0P7, anonymousClass0db, anonymousClass0hq, followButton.f12858R, followButton.f12857Q, followButton.f12856P, null);
        Intent intent = new Intent("com.instagram.android.widget.BROADCAST_FOLLOW_STATUS_CHANGED");
        intent.putExtra("com.instagram.android.widget.BROADCAST_FOLLOW_STATUS_CHANGED_USER_ID", anonymousClass0Ci2.getId());
        AnonymousClass0dB.m5947C(intent);
        AnonymousClass0QH anonymousClass0QH2 = anonymousClass0QH;
        if (anonymousClass0QH != null) {
            anonymousClass0QH2.zf(anonymousClass0Ci2);
        }
    }

    /* renamed from: C */
    public static String m8650C(FollowButton followButton, Context context, AnonymousClass0Lq anonymousClass0Lq, String str, boolean z) {
        if (z) {
            return context.getResources().getString(C0164R.string.following_button_unblock_voice, new Object[]{str});
        }
        switch (anonymousClass0Lq.ordinal()) {
            case 1:
                return context.getResources().getString(C0164R.string.following_button_loading_voice, new Object[]{str});
            case 2:
                return context.getResources().getString(C0164R.string.following_button_follow_voice, new Object[]{str});
            case 3:
                String string;
                if (followButton.f12861U) {
                    string = context.getResources().getString(C0164R.string.following_button_unfollow_voice, new Object[]{str});
                } else {
                    string = context.getResources().getString(C0164R.string.following_button_following_voice, new Object[]{str});
                }
                return string;
            case 4:
                return context.getResources().getString(C0164R.string.following_button_requested_voice, new Object[]{str});
            default:
                throw new UnsupportedOperationException("Unhandled follow type");
        }
    }

    /* renamed from: C */
    public final void m8656C(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Ci anonymousClass0Ci, boolean z, AnonymousClass0QH anonymousClass0QH, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0db anonymousClass0db, AnonymousClass0hq anonymousClass0hq) {
        AnonymousClass0Ci anonymousClass0Ci2 = anonymousClass0Ci;
        if (anonymousClass0Ci != null) {
            AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
            anonymousClass0Cm = AnonymousClass0er.m6431B(anonymousClass0Cm).m6439Q(anonymousClass0Ci);
            FollowButton followButton = this;
            m8653F(this, anonymousClass0Cm);
            if (AnonymousClass0Co.m1044D(anonymousClass0Cm2, anonymousClass0Ci)) {
                setVisibility(8);
                return;
            }
            int i;
            setVisibility(0);
            this.f12851K = this.f12850J == AnonymousClass19U.CONDENSED ? AnonymousClass19T.SMALL : this.f12848H;
            boolean z2 = anonymousClass0Ci.f1721P;
            boolean z3 = true;
            Object obj = (!z || z2) ? null : 1;
            if (anonymousClass0Cm == AnonymousClass0Lq.FollowStatusFetching) {
                z3 = false;
            }
            setEnabled(z3);
            Object obj2 = (this.f12851K != AnonymousClass19T.SMALL || obj == null) ? null : 1;
            if (obj2 != null) {
                setImageResource(this.f12851K.m9664A(anonymousClass0Cm));
                ColorFilter B = AnonymousClass0ca.m5921B(AnonymousClass0Ca.m937C(getContext(), this.f12844D));
                if (getDrawable() != null) {
                    getDrawable().mutate().setColorFilter(B);
                }
            } else {
                setImageResource(0);
            }
            if (z2) {
                i = C0164R.string.following_button_unblock;
            } else {
                i = m8651D(this, anonymousClass0Ci, anonymousClass0Cm);
            }
            if (i != 0) {
                setContentDescription(m8650C(this, getContext(), anonymousClass0Cm, anonymousClass0Ci.m1003T(), z2));
            }
            if (this.f12843C != -1) {
                setTextColor(AnonymousClass0Ca.m937C(getContext(), this.f12843C));
            }
            if (!this.f12851K.m9665B() || i == 0) {
                setText(JsonProperty.USE_DEFAULT_NAME);
            } else {
                setText(i);
            }
            setOnClickListener(new AnonymousClass3lJ(followButton, anonymousClass0Ci2, anonymousClass0Cm2, anonymousClass0QH, anonymousClass0Cm, anonymousClass0P7, anonymousClass0db, anonymousClass0hq));
        }
    }

    /* renamed from: D */
    public static int m8651D(FollowButton followButton, AnonymousClass0Ci anonymousClass0Ci, AnonymousClass0Lq anonymousClass0Lq) {
        switch (anonymousClass0Lq.ordinal()) {
            case 0:
                return 0;
            case 1:
                return C0164R.string.following_button_loading;
            case 2:
                if (followButton.f12860T && anonymousClass0Ci.m1023n()) {
                    return C0164R.string.following_button_follow_back;
                }
                return C0164R.string.following_button_follow;
            case 3:
                return followButton.f12861U ? C0164R.string.unfollow : C0164R.string.following_button_following;
            case 4:
                return C0164R.string.following_button_requested;
            default:
                throw new UnsupportedOperationException("Unhandled follow type");
        }
    }

    /* renamed from: E */
    private void m8652E() {
        if (this.f12847G != null) {
            Handler handler = this.f12845E;
            if (handler != null) {
                AnonymousClass0OR.m3627G(handler, this.f12849I, 1948326945);
            }
            this.f12847G.m7042A(false);
        }
    }

    /* renamed from: F */
    private static void m8653F(FollowButton followButton, AnonymousClass0Lq anonymousClass0Lq) {
        int i;
        if (anonymousClass0Lq == AnonymousClass0Lq.FollowStatusNotFollowing) {
            followButton.setFollow(true);
            i = followButton.f12855O;
            if (i == -1) {
                i = C0164R.color.white;
            }
        } else {
            if (anonymousClass0Lq == AnonymousClass0Lq.FollowStatusFollowing || anonymousClass0Lq == AnonymousClass0Lq.FollowStatusRequested) {
                followButton.setFollow(false);
                i = followButton.f12855O;
                if (i == -1) {
                    i = C0164R.color.grey_9;
                }
            }
            followButton.refreshDrawableState();
        }
        followButton.f12844D = i;
        followButton.refreshDrawableState();
    }

    public String getClickPoint() {
        return this.f12854N;
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.m5864N(this, 763743629);
        super.onAttachedToWindow();
        this.f12846F = true;
        AnonymousClass0cQ.m5865O(this, 1229197339, N);
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.m5864N(this, 89749637);
        super.onDetachedFromWindow();
        this.f12846F = false;
        AnonymousClass0iq anonymousClass0iq = this.f12847G;
        if (anonymousClass0iq != null) {
            if (anonymousClass0iq.m7043B()) {
                m8652E();
            }
            this.f12847G = null;
        }
        AnonymousClass0cQ.m5865O(this, 2032464042, N);
    }

    public void setClickPoint(String str) {
        this.f12854N = str;
    }

    public void setEntryInfo(UserDetailEntryInfo userDetailEntryInfo) {
        this.f12856P = userDetailEntryInfo;
    }

    public void setEntryModule(String str) {
        this.f12857Q = str;
    }

    public void setEntryTrigger(String str) {
        this.f12858R = str;
    }

    private void setFollow(boolean z) {
        setBlueButton(z);
    }

    public void setFollowButtonSize(AnonymousClass19U anonymousClass19U) {
        this.f12850J = anonymousClass19U;
        setInnerSpacing(anonymousClass19U == AnonymousClass19U.FULL ? this.f12859S : 0);
    }

    public void setShouldShowFollowBack(boolean z) {
        this.f12860T = z;
    }

    public void setShouldShowUnfollow(boolean z) {
        this.f12861U = z;
    }
}

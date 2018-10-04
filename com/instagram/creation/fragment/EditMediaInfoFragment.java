package com.instagram.creation.fragment;

import X.AnonymousClass0CC;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Ci;
import X.AnonymousClass0Cm;
import X.AnonymousClass0Dc;
import X.AnonymousClass0Dt;
import X.AnonymousClass0F4;
import X.AnonymousClass0F8;
import X.AnonymousClass0GA;
import X.AnonymousClass0Hj;
import X.AnonymousClass0IE;
import X.AnonymousClass0IJ;
import X.AnonymousClass0IL;
import X.AnonymousClass0IT;
import X.AnonymousClass0IW;
import X.AnonymousClass0It;
import X.AnonymousClass0Iz;
import X.AnonymousClass0JI;
import X.AnonymousClass0LQ;
import X.AnonymousClass0Nm;
import X.AnonymousClass0ON;
import X.AnonymousClass0P7;
import X.AnonymousClass0PZ;
import X.AnonymousClass0Pt;
import X.AnonymousClass0Pu;
import X.AnonymousClass0Px;
import X.AnonymousClass0cQ;
import X.AnonymousClass0ct;
import X.AnonymousClass0eT;
import X.AnonymousClass0jY;
import X.AnonymousClass0jZ;
import X.AnonymousClass0m3;
import X.AnonymousClass0vI;
import X.AnonymousClass0zI;
import X.AnonymousClass107;
import X.AnonymousClass1DO;
import X.AnonymousClass1DP;
import X.AnonymousClass1Od;
import X.AnonymousClass1VH;
import X.AnonymousClass1WT;
import X.AnonymousClass1YC;
import X.AnonymousClass1fg;
import X.AnonymousClass32u;
import X.AnonymousClass3LN;
import X.AnonymousClass3LO;
import X.AnonymousClass3LP;
import X.AnonymousClass3Nn;
import X.AnonymousClass3OK;
import X.AnonymousClass3Yl;
import X.AnonymousClass3cV;
import X.AnonymousClass4Uz;
import X.AnonymousClass4V0;
import X.AnonymousClass4V2;
import X.AnonymousClass4V4;
import X.AnonymousClass4V5;
import X.AnonymousClass4V6;
import X.AnonymousClass4V7;
import X.AnonymousClass4V8;
import X.AnonymousClass4V9;
import X.AnonymousClass4VA;
import X.AnonymousClass4VB;
import X.AnonymousClass4VC;
import X.AnonymousClass4VD;
import X.AnonymousClass4VE;
import X.AnonymousClass4VH;
import X.AnonymousClass4XP;
import X.AnonymousClass4XW;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.instagram.common.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.creation.location.NearbyVenuesService;
import com.instagram.location.intf.LocationSignalPackage;
import com.instagram.model.venue.Venue;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.tagging.activity.MediaTaggingInfo;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class EditMediaInfoFragment extends AnonymousClass0IJ implements AnonymousClass0PZ, AnonymousClass0IT {
    /* renamed from: B */
    public AnonymousClass1Od f54695B;
    /* renamed from: C */
    public final OnClickListener f54696C = new AnonymousClass4VC(this);
    /* renamed from: D */
    public String f54697D;
    /* renamed from: E */
    public Handler f54698E;
    /* renamed from: F */
    public boolean f54699F;
    /* renamed from: G */
    public Location f54700G;
    /* renamed from: H */
    public LocationSignalPackage f54701H;
    /* renamed from: I */
    public final AnonymousClass1DO f54702I = new AnonymousClass4V7(this);
    /* renamed from: J */
    public AnonymousClass0P7 f54703J;
    /* renamed from: K */
    public String f54704K;
    /* renamed from: L */
    public final AnonymousClass1DP f54705L = new AnonymousClass4V6(this);
    /* renamed from: M */
    public final OnLayoutChangeListener f54706M = new AnonymousClass4VD(this);
    /* renamed from: N */
    public final OnClickListener f54707N = new AnonymousClass4VA(this);
    /* renamed from: O */
    public final OnClickListener f54708O = new AnonymousClass4VB(this);
    /* renamed from: P */
    public AnonymousClass0ct f54709P;
    /* renamed from: Q */
    public boolean f54710Q;
    /* renamed from: R */
    public BrandedContentTag f54711R = null;
    /* renamed from: S */
    public HashMap f54712S = new HashMap();
    /* renamed from: T */
    public HashMap f54713T = new HashMap();
    /* renamed from: U */
    public ArrayList f54714U = new ArrayList();
    /* renamed from: V */
    public ArrayList f54715V = new ArrayList();
    /* renamed from: W */
    public ArrayList f54716W = new ArrayList();
    /* renamed from: X */
    public AnonymousClass0Cm f54717X;
    /* renamed from: Y */
    public Venue f54718Y;
    /* renamed from: Z */
    private final AnonymousClass0F8 f54719Z = new AnonymousClass4V8(this);
    /* renamed from: a */
    private AnonymousClass0ct f54720a;
    /* renamed from: b */
    private AnonymousClass3LP f54721b;
    /* renamed from: c */
    private boolean f54722c;
    /* renamed from: d */
    private boolean f54723d;
    /* renamed from: e */
    private boolean f54724e;
    /* renamed from: f */
    private AnonymousClass0m3 f54725f;
    /* renamed from: g */
    private boolean f54726g;
    /* renamed from: h */
    private final AnonymousClass0F8 f54727h = new AnonymousClass4V9(this);
    /* renamed from: i */
    private final boolean f54728i = ((Boolean) AnonymousClass0CC.gl.G()).booleanValue();
    public TextView mBelowUsernameLabel;
    public IgAutoCompleteTextView mCaption;
    public TextView mExtraLocationLabel;
    public View mFailedView;
    public View mScrollView;
    public View mTextContainer;
    public TextView mTimestamp;
    public CircularImageView mUserImageView;
    public TextView mUsername;

    public final String getModuleName() {
        return "edit_media_info";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    /* renamed from: B */
    public static AnonymousClass0Pt m24373B(Context context, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0Cm anonymousClass0Cm, String str, Venue venue) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cm);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = AnonymousClass0IE.E("media/%s/edit_media/", new Object[]{anonymousClass0P7.getId()});
        AnonymousClass0Pt N = anonymousClass0Pt.D("caption_text", str).D("device_id", AnonymousClass0Dt.B(context)).M(AnonymousClass3cV.class).N();
        try {
            String B = AnonymousClass3Yl.m19974B(venue);
            N.D("location", B);
            if (venue != null && "facebook_events".equals(venue.f6707D)) {
                N.D("event", B);
            }
        } catch (Throwable e) {
            AnonymousClass0Dc.G("EditMediaInfoFragment", "Unable to parse location", e);
        }
        return N;
    }

    /* renamed from: C */
    public static CharSequence m24374C(EditMediaInfoFragment editMediaInfoFragment) {
        CharSequence string = editMediaInfoFragment.getString(C0164R.string.add_location);
        if (editMediaInfoFragment.f54726g) {
            string = editMediaInfoFragment.getString(C0164R.string.add_location);
        } else {
            Venue venue = editMediaInfoFragment.f54718Y;
            if (venue != null) {
                string = venue.f6716M;
            } else if (editMediaInfoFragment.f54703J.AD != null) {
                venue = editMediaInfoFragment.f54703J.AD;
                editMediaInfoFragment.f54718Y = venue;
                string = venue.f6716M;
            }
        }
        CharSequence spannableString = new SpannableString(string);
        spannableString.setSpan(new AnonymousClass4V0(editMediaInfoFragment), 0, spannableString.length(), 33);
        return spannableString;
    }

    /* renamed from: D */
    public static void m24375D(EditMediaInfoFragment editMediaInfoFragment) {
        AnonymousClass0JI.getInstance().removeLocationUpdates(editMediaInfoFragment.f54705L);
        AnonymousClass0JI.getInstance().cancelSignalPackageRequest(editMediaInfoFragment.f54702I);
        Activity activity = editMediaInfoFragment.getActivity();
        AnonymousClass0Cm anonymousClass0Cm = editMediaInfoFragment.f54717X;
        Location location = editMediaInfoFragment.f54700G;
        LocationSignalPackage locationSignalPackage = editMediaInfoFragment.f54701H;
        AnonymousClass0P7 anonymousClass0P7 = editMediaInfoFragment.f54703J;
        NearbyVenuesService.m24431F(activity, anonymousClass0Cm, location, locationSignalPackage, Long.valueOf(anonymousClass0P7 != null ? anonymousClass0P7.FA().longValue() : -1));
    }

    /* renamed from: E */
    public static void m24376E(EditMediaInfoFragment editMediaInfoFragment) {
        AnonymousClass0P7 anonymousClass0P7 = editMediaInfoFragment.f54703J;
        if (anonymousClass0P7 != null) {
            Object obj;
            String obj2;
            boolean z;
            boolean L;
            int i;
            AnonymousClass0P7 S;
            String id;
            boolean M;
            boolean D;
            if (anonymousClass0P7.f4028c == null) {
                obj = JsonProperty.USE_DEFAULT_NAME;
            } else {
                obj = editMediaInfoFragment.f54703J.f4028c.f4910d;
            }
            IgAutoCompleteTextView igAutoCompleteTextView = editMediaInfoFragment.mCaption;
            if (igAutoCompleteTextView != null) {
                if (igAutoCompleteTextView.getText() != null) {
                    obj2 = editMediaInfoFragment.mCaption.getText().toString();
                    z = true;
                    if (m24380I(editMediaInfoFragment)) {
                        L = m24383L(editMediaInfoFragment.f54703J, editMediaInfoFragment.f54715V, editMediaInfoFragment.f54714U);
                    } else {
                        for (i = 0; i < editMediaInfoFragment.f54703J.Q(); i++) {
                            S = editMediaInfoFragment.f54703J.S(i);
                            id = S.getId();
                            if (m24383L(S, (List) editMediaInfoFragment.f54713T.get(id), (List) editMediaInfoFragment.f54712S.get(id))) {
                                L = true;
                                break;
                            }
                        }
                        L = false;
                    }
                    M = m24384M(editMediaInfoFragment.f54703J.v(), editMediaInfoFragment.f54716W);
                    D = AnonymousClass32u.m18288D(editMediaInfoFragment.f54703J.fA() ? new BrandedContentTag(editMediaInfoFragment.f54703J.z(), editMediaInfoFragment.f54703J.BA()) : null, editMediaInfoFragment.f54711R);
                    if (obj2.equals(obj) && AnonymousClass0LQ.B(editMediaInfoFragment.f54703J.AD, editMediaInfoFragment.f54718Y) && !r7 && !M) {
                        if (D) {
                            z = false;
                        }
                    }
                    editMediaInfoFragment.f54723d = z;
                    AnonymousClass0eT.E(editMediaInfoFragment.getActivity()).S(editMediaInfoFragment.f54723d);
                }
            }
            obj2 = JsonProperty.USE_DEFAULT_NAME;
            z = true;
            if (m24380I(editMediaInfoFragment)) {
                L = m24383L(editMediaInfoFragment.f54703J, editMediaInfoFragment.f54715V, editMediaInfoFragment.f54714U);
            } else {
                for (i = 0; i < editMediaInfoFragment.f54703J.Q(); i++) {
                    S = editMediaInfoFragment.f54703J.S(i);
                    id = S.getId();
                    if (m24383L(S, (List) editMediaInfoFragment.f54713T.get(id), (List) editMediaInfoFragment.f54712S.get(id))) {
                        L = true;
                        break;
                    }
                }
                L = false;
            }
            M = m24384M(editMediaInfoFragment.f54703J.v(), editMediaInfoFragment.f54716W);
            if (editMediaInfoFragment.f54703J.fA()) {
            }
            D = AnonymousClass32u.m18288D(editMediaInfoFragment.f54703J.fA() ? new BrandedContentTag(editMediaInfoFragment.f54703J.z(), editMediaInfoFragment.f54703J.BA()) : null, editMediaInfoFragment.f54711R);
            if (D) {
                z = false;
            }
            editMediaInfoFragment.f54723d = z;
            AnonymousClass0eT.E(editMediaInfoFragment.getActivity()).S(editMediaInfoFragment.f54723d);
        }
    }

    /* renamed from: F */
    public static void m24377F(EditMediaInfoFragment editMediaInfoFragment) {
        Window N = editMediaInfoFragment.m24385N();
        if (editMediaInfoFragment.f54722c) {
            N.setSoftInputMode(16);
            editMediaInfoFragment.mCaption.clearFocus();
            AnonymousClass0Nm.N(editMediaInfoFragment.mCaption);
            return;
        }
        editMediaInfoFragment.f54722c = true;
        N.setSoftInputMode(21);
        editMediaInfoFragment.mCaption.requestFocus();
        AnonymousClass0Nm.k(editMediaInfoFragment.mCaption);
    }

    /* renamed from: G */
    public static void m24378G(EditMediaInfoFragment editMediaInfoFragment, boolean z) {
        editMediaInfoFragment.f54724e = z;
        if (editMediaInfoFragment.getView() != null) {
            AnonymousClass0eT.E(editMediaInfoFragment.getActivity()).Y(editMediaInfoFragment.f54724e);
        }
    }

    /* renamed from: H */
    public static void m24379H(EditMediaInfoFragment editMediaInfoFragment, Venue venue, boolean z) {
        editMediaInfoFragment.f54718Y = venue;
        editMediaInfoFragment.f54726g = z;
        if (editMediaInfoFragment.getView() != null) {
            m24382K(editMediaInfoFragment);
        }
        m24376E(editMediaInfoFragment);
    }

    /* renamed from: I */
    public static boolean m24380I(EditMediaInfoFragment editMediaInfoFragment) {
        return editMediaInfoFragment.f54703J.iA();
    }

    /* renamed from: J */
    public static void m24381J(EditMediaInfoFragment editMediaInfoFragment) {
        if (editMediaInfoFragment.getView() == null) {
            return;
        }
        if (editMediaInfoFragment.f54699F) {
            int i;
            if (editMediaInfoFragment.mFailedView == null) {
                View inflate = ((ViewStub) editMediaInfoFragment.getView().findViewById(C0164R.id.edit_media_failed_view_stub)).inflate();
                editMediaInfoFragment.mFailedView = inflate;
                ((ViewGroup) inflate).getChildAt(0).setOnClickListener(new AnonymousClass4V5(editMediaInfoFragment));
            }
            if (AnonymousClass0ON.B(editMediaInfoFragment.getArguments().getInt("EditMediaFragment.ARGUMENT_MEDIA_TYPE")) == AnonymousClass0ON.PHOTO) {
                i = C0164R.string.edit_failed_subtitle_photo;
            } else {
                i = C0164R.string.edit_failed_subtitle_video;
            }
            Toast.makeText(editMediaInfoFragment.getActivity(), i, 0).show();
            AnonymousClass0eT.D(AnonymousClass0eT.E(editMediaInfoFragment.getActivity()));
            return;
        }
        View view = editMediaInfoFragment.mFailedView;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: K */
    public static void m24382K(EditMediaInfoFragment editMediaInfoFragment) {
        AnonymousClass0IL anonymousClass0IL = editMediaInfoFragment;
        if (anonymousClass0IL.f54703J != null) {
            AnonymousClass0Ci B = anonymousClass0IL.f54717X.B();
            anonymousClass0IL.mUserImageView.setUrl(B.DQ());
            anonymousClass0IL.mUsername.setText(B.uT());
            anonymousClass0IL.mBelowUsernameLabel.setVisibility(0);
            anonymousClass0IL.mUsername.setGravity(80);
            anonymousClass0IL.mTimestamp.setGravity(80);
            CharSequence spannableStringBuilder = new SpannableStringBuilder();
            if (anonymousClass0IL.f54717X.B().H()) {
                CharSequence charSequence;
                BrandedContentTag brandedContentTag = anonymousClass0IL.f54711R;
                if (brandedContentTag != null) {
                    charSequence = brandedContentTag.f27936D;
                } else {
                    charSequence = anonymousClass0IL.getString(C0164R.string.add_partner);
                }
                CharSequence spannableString = new SpannableString(charSequence);
                spannableString.setSpan(new AnonymousClass4V2(anonymousClass0IL), 0, spannableString.length(), 33);
                spannableStringBuilder.append(spannableString);
                anonymousClass0IL.mBelowUsernameLabel.setText(spannableStringBuilder);
                anonymousClass0IL.mBelowUsernameLabel.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass4Uz(anonymousClass0IL));
            } else {
                AnonymousClass0Nm.O(anonymousClass0IL.mExtraLocationLabel);
                spannableStringBuilder.append(m24374C(anonymousClass0IL));
            }
            anonymousClass0IL.mBelowUsernameLabel.setHighlightColor(0);
            anonymousClass0IL.mBelowUsernameLabel.setText(spannableStringBuilder);
            anonymousClass0IL.mBelowUsernameLabel.setMovementMethod(LinkMovementMethod.getInstance());
            if (anonymousClass0IL.mTimestamp.getVisibility() == 0) {
                anonymousClass0IL.mTimestamp.setText(anonymousClass0IL.f54703J.d(anonymousClass0IL.getContext()));
            }
            CharSequence charSequence2 = anonymousClass0IL.f54697D;
            if (charSequence2 != null) {
                anonymousClass0IL.mCaption.setText(charSequence2);
            } else if (anonymousClass0IL.f54703J.f4028c != null) {
                anonymousClass0IL.mCaption.setText(anonymousClass0IL.f54703J.f4028c.f4910d);
            }
            if (m24380I(anonymousClass0IL)) {
                View A = anonymousClass0IL.f54720a.A();
                AnonymousClass3LO anonymousClass3LO = (AnonymousClass3LO) A.getTag();
                if (anonymousClass3LO == null) {
                    anonymousClass3LO = new AnonymousClass3LO();
                    ViewGroup viewGroup = (ViewGroup) A.findViewById(C0164R.id.carousel_media_group);
                    anonymousClass3LO.f40313E = AnonymousClass3OK.m19512C(A);
                    anonymousClass3LO.f40310B = new AnonymousClass0vI((ViewStub) A.findViewById(C0164R.id.media_indicator_view_stub), anonymousClass3LO.f40313E);
                    anonymousClass3LO.f40314F = (ReboundViewPager) A.findViewById(C0164R.id.carousel_viewpager);
                    anonymousClass3LO.f40312D = (CirclePageIndicator) A.findViewById(C0164R.id.carousel_page_indicator);
                    anonymousClass3LO.f40314F.setPageSpacing(0.0f);
                    A.setTag(anonymousClass3LO);
                }
                if (anonymousClass0IL.f54725f == null) {
                    anonymousClass0IL.f54725f = new AnonymousClass0m3(anonymousClass0IL.f54703J);
                    anonymousClass0IL.f54725f.f9707p = true;
                    anonymousClass0IL.f54725f.N(anonymousClass0IL.getArguments().getInt("EditMediaFragment.ARGUMENT_MEDIA_CAROUSEL_INDEX", 0));
                }
                AnonymousClass3LP anonymousClass3LP = anonymousClass0IL.f54721b;
                AnonymousClass0P7 anonymousClass0P7 = anonymousClass0IL.f54703J;
                AnonymousClass0m3 anonymousClass0m3 = anonymousClass0IL.f54725f;
                HashMap hashMap = anonymousClass0IL.f54713T;
                HashMap hashMap2 = anonymousClass0IL.f54712S;
                if (!(anonymousClass3LO.f40311C == null || anonymousClass3LO.f40311C == anonymousClass0m3)) {
                    anonymousClass3LO.f40311C.Y(anonymousClass3LO.f40310B.f12002B);
                }
                anonymousClass3LO.f40311C = anonymousClass0m3;
                AnonymousClass0zI.B(anonymousClass3LO.f40310B, anonymousClass0P7, anonymousClass0m3, anonymousClass3LP.f40318E);
                anonymousClass3LO.f40314F.B();
                List list = (List) hashMap.get(anonymousClass0P7.S(anonymousClass0m3.f9673H).getId());
                List list2 = (List) hashMap2.get(anonymousClass0P7.S(anonymousClass0m3.f9673H).getId());
                Integer valueOf = Integer.valueOf((list != null ? list.size() : 0) + (list2 != null ? list2.size() : 0));
                if (anonymousClass3LP.f40319F) {
                    AnonymousClass3OK.m19511B(anonymousClass3LO.f40313E, anonymousClass3LP.f40317D, anonymousClass0P7, anonymousClass0m3, anonymousClass3LP.f40316C, valueOf.intValue());
                } else {
                    anonymousClass3LO.f40313E.m22010A();
                }
                anonymousClass3LO.f40312D.A(anonymousClass0m3.f9673H, anonymousClass0P7.Q());
                anonymousClass3LO.f40314F.A(anonymousClass3LO.f40312D);
                HashMap hashMap3 = hashMap2;
                HashMap hashMap4 = hashMap;
                Adapter anonymousClass1WT = new AnonymousClass1WT(anonymousClass3LP.f40316C, anonymousClass0P7, anonymousClass0m3, hashMap4, hashMap3, anonymousClass3LP.f40315B, anonymousClass3LO.f40310B, anonymousClass3LO.f40313E, anonymousClass3LP.f40317D, anonymousClass3LP.f40318E, editMediaInfoFragment);
                if (((Boolean) AnonymousClass0CC.DE.H(anonymousClass3LP.f40318E)).booleanValue()) {
                    anonymousClass3LO.f40314F.setExtraBufferSize(0);
                }
                anonymousClass3LO.f40314F.setAdapter(anonymousClass1WT);
                anonymousClass3LO.f40314F.G(anonymousClass0m3.f9673H);
                anonymousClass3LO.f40314F.setOverScrollOnEdgeItems(false);
                anonymousClass3LO.f40314F.A(new AnonymousClass3LN(anonymousClass3LP, anonymousClass0m3, anonymousClass0P7, anonymousClass3LO));
            } else if (!anonymousClass0IL.f54703J.iA()) {
                MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) anonymousClass0IL.f54709P.A();
                IgImageView igImageView = (IgImageView) mediaFrameLayout.findViewById(C0164R.id.edit_media_imageview);
                View findViewById = mediaFrameLayout.findViewById(C0164R.id.edit_media_video_indicator);
                if (anonymousClass0IL.f54703J.YA()) {
                    igImageView.setUrl(anonymousClass0IL.f54703J.mB.toString());
                } else {
                    igImageView.setUrl(anonymousClass0IL.f54703J.x(anonymousClass0IL.getContext()));
                }
                mediaFrameLayout.setAspectRatio(anonymousClass0IL.f54703J.L());
                if (anonymousClass0IL.m24387P()) {
                    CharSequence quantityString;
                    int i;
                    OnClickListener onClickListener;
                    Button button = (Button) ((MediaFrameLayout) anonymousClass0IL.f54709P.A()).findViewById(C0164R.id.edit_media_photo_tags_indicator);
                    button.setVisibility(0);
                    if (anonymousClass0IL.f54715V.isEmpty()) {
                        if (anonymousClass0IL.f54714U.isEmpty()) {
                            if (!anonymousClass0IL.f54716W.isEmpty()) {
                                quantityString = anonymousClass0IL.getResources().getQuantityString(C0164R.plurals.num_products_formatted, anonymousClass0IL.f54716W.size(), new Object[]{Integer.valueOf(anonymousClass0IL.f54716W.size())});
                                i = C0164R.drawable.tag_edit_product;
                                onClickListener = anonymousClass0IL.f54708O;
                            } else if (AnonymousClass1fg.I(anonymousClass0IL.f54717X)) {
                                quantityString = anonymousClass0IL.getString(C0164R.string.tag);
                                i = C0164R.drawable.tag_edit;
                                onClickListener = anonymousClass0IL.f54696C;
                            } else {
                                quantityString = anonymousClass0IL.getString(C0164R.string.people_tagging_add_people);
                                i = C0164R.drawable.tag_badge;
                                onClickListener = anonymousClass0IL.f54707N;
                            }
                            button.setText(quantityString);
                            button.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
                            button.setOnClickListener(onClickListener);
                        }
                    }
                    quantityString = anonymousClass0IL.getResources().getQuantityString(C0164R.plurals.x_people, anonymousClass0IL.f54715V.size() + anonymousClass0IL.f54714U.size(), new Object[]{Integer.valueOf(anonymousClass0IL.f54715V.size() + anonymousClass0IL.f54714U.size())});
                    i = C0164R.drawable.tag_badge;
                    onClickListener = anonymousClass0IL.f54707N;
                    button.setText(quantityString);
                    button.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
                    button.setOnClickListener(onClickListener);
                }
                if (anonymousClass0IL.f54703J.TO() == AnonymousClass0ON.VIDEO) {
                    findViewById.setVisibility(0);
                }
            }
        }
    }

    /* renamed from: L */
    private static boolean m24383L(AnonymousClass0P7 anonymousClass0P7, List list, List list2) {
        if (!m24384M(anonymousClass0P7.m(), list)) {
            if (!m24384M(anonymousClass0P7.b(), list2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: M */
    private static boolean m24384M(java.util.List r3, java.util.List r4) {
        /*
        r2 = 0;
        r0 = 1;
        if (r3 != 0) goto L_0x000e;
    L_0x0004:
        if (r4 == 0) goto L_0x000d;
    L_0x0006:
        r0 = r4.isEmpty();
        if (r0 != 0) goto L_0x000d;
    L_0x000c:
        r2 = 1;
    L_0x000d:
        return r2;
    L_0x000e:
        if (r4 != 0) goto L_0x0011;
    L_0x0010:
        return r0;
    L_0x0011:
        r0 = new java.util.ArrayList;
        r0.<init>(r3);
        r0.removeAll(r4);
        r1 = new java.util.ArrayList;
        r1.<init>(r4);
        r1.removeAll(r3);
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x000c;
    L_0x0027:
        r0 = r1.isEmpty();
        if (r0 != 0) goto L_0x000d;
    L_0x002d:
        goto L_0x000c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.fragment.EditMediaInfoFragment.M(java.util.List, java.util.List):boolean");
    }

    /* renamed from: N */
    private Window m24385N() {
        Activity activity = getActivity();
        while (activity.getParent() != null) {
            activity = activity.getParent();
        }
        return activity.getWindow();
    }

    /* renamed from: O */
    private void m24386O(int i) {
        if (Z() instanceof AnonymousClass0Hj) {
            ((AnonymousClass0Hj) Z()).CSA(i);
        }
    }

    /* renamed from: P */
    private boolean m24387P() {
        switch (this.f54703J.TO().ordinal()) {
            case 0:
                return true;
            case 1:
                return this.f54728i;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public final TextView m24388b() {
        if (this.mExtraLocationLabel == null) {
            this.mExtraLocationLabel = (TextView) ((ViewStub) getView().findViewById(C0164R.id.extra_location_label_stub)).inflate();
        }
        return this.mExtraLocationLabel;
    }

    /* renamed from: c */
    public final void m24389c() {
        Intent E;
        if (m24380I(this)) {
            Context context = getContext();
            String str = r2.f54717X.f1759C;
            AnonymousClass0P7 anonymousClass0P7 = r2.f54703J;
            HashMap hashMap = r2.f54713T;
            HashMap hashMap2 = r2.f54712S;
            int i = r2.f54725f.f9673H;
            boolean z = r2.f54728i;
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (int i3 = 0; i3 < anonymousClass0P7.Q(); i3++) {
                AnonymousClass0P7 S = anonymousClass0P7.S(i3);
                if (S.TO() == AnonymousClass0ON.PHOTO || (S.TO() == AnonymousClass0ON.VIDEO && z)) {
                    MediaTaggingInfo mediaTaggingInfo = new MediaTaggingInfo(S.getId().split("_")[0], S.x(context), S.TO(), (ArrayList) hashMap.get(S.getId()), (ArrayList) hashMap2.get(S.getId()), null);
                    if (S.L() > 0.0f) {
                        mediaTaggingInfo.f43448C = S.L();
                        mediaTaggingInfo.f43450E = true;
                    }
                    mediaTaggingInfo.f43447B = i3;
                    arrayList.add(mediaTaggingInfo);
                    if (i3 == i) {
                        i2 = arrayList.size() - 1;
                    }
                }
            }
            E = AnonymousClass1YC.E(context, str, arrayList, 35, i2);
        } else {
            E = AnonymousClass1YC.E(getContext(), r2.f54717X.f1759C, AnonymousClass1YC.D(r2.f54703J.NO(), r2.f54703J.x(getContext()), r2.f54703J.L(), 0, r2.f54703J.TO(), r2.f54715V, r2.f54714U, null), 20, 0);
        }
        AnonymousClass0Iz.f2854L.I(getActivity());
        AnonymousClass0IW.L(E, JsonMappingException.MAX_REFS_TO_LIST, r2);
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        View g = anonymousClass0eT.g(C0164R.string.edit_info, new AnonymousClass4V4(this));
        if (this.f54699F) {
            g.setVisibility(8);
            return;
        }
        anonymousClass0eT.Y(this.f54724e);
        g.setEnabled(this.f54723d);
    }

    /* renamed from: d */
    public final void m24390d() {
        AnonymousClass0Iz.f2854L.I(getActivity());
        AnonymousClass0IW.L(AnonymousClass1YC.F(getContext(), this.f54717X.f1759C, this.f54703J.NO(), this.f54703J.L(), this.f54703J.x(getContext()), this.f54703J.TO(), this.f54716W), 1001, this);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Object obj;
        super.onActivityResult(i, i2, intent);
        if (i != JsonMappingException.MAX_REFS_TO_LIST) {
            if (i != 1001) {
                obj = null;
                if (i2 == -1 && r1 != null) {
                    ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("media_tagging_info_list");
                    if (m24380I(this)) {
                        int size = parcelableArrayListExtra.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            MediaTaggingInfo mediaTaggingInfo = (MediaTaggingInfo) parcelableArrayListExtra.get(i3);
                            this.f54713T.put(this.f54703J.S(mediaTaggingInfo.f43447B).getId(), mediaTaggingInfo.f43454I);
                        }
                        this.f54725f.N(intent.getIntExtra("last_page", 0));
                    } else {
                        MediaTaggingInfo mediaTaggingInfo2 = (MediaTaggingInfo) parcelableArrayListExtra.get(0);
                        this.f54715V = mediaTaggingInfo2.f43454I;
                        this.f54714U = mediaTaggingInfo2.f43449D;
                        this.f54716W = mediaTaggingInfo2.f43455J;
                    }
                    m24376E(this);
                    return;
                }
            }
        }
        obj = 1;
        if (i2 == -1) {
        }
    }

    public final void onCreate(Bundle bundle) {
        AnonymousClass0IL anonymousClass0IL = this;
        int F = AnonymousClass0cQ.F(this, 1118663305);
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        this.f54717X = AnonymousClass0Ce.G(getArguments());
        AnonymousClass0F4.f2058E.A(AnonymousClass4XP.class, this.f54719Z).A(AnonymousClass4XW.class, this.f54727h);
        this.f54698E = new Handler();
        if (bundle != null) {
            this.f54715V = bundle2.getParcelableArrayList("people_tags");
            this.f54714U = bundle2.getParcelableArrayList("fb_friend_tags");
            this.f54716W = bundle2.getParcelableArrayList("product_tags");
            ArrayList stringArrayList = bundle2.getStringArrayList("carousel_media_ids");
            if (stringArrayList != null) {
                int size = stringArrayList.size();
                for (int i = 0; i < size; i++) {
                    String str = (String) stringArrayList.get(i);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("carousel_people_tags");
                    stringBuilder.append(str);
                    ArrayList parcelableArrayList = bundle2.getParcelableArrayList(stringBuilder.toString());
                    if (parcelableArrayList != null) {
                        this.f54713T.put(str, parcelableArrayList);
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("carousel_fb_friend_tags");
                    stringBuilder.append(str);
                    parcelableArrayList = bundle2.getParcelableArrayList(stringBuilder.toString());
                    if (parcelableArrayList != null) {
                        this.f54712S.put(str, parcelableArrayList);
                    }
                }
            }
            this.f54710Q = true;
            this.f54718Y = (Venue) bundle2.getParcelable("venue");
            this.f54726g = bundle2.getBoolean("venue_cleared");
        }
        this.f54704K = getArguments().getString("EditMediaFragment.ARGUMENT_MEDIA_ID");
        AnonymousClass0P7 A = AnonymousClass107.f13182C.A(this.f54704K);
        this.f54703J = A;
        if (A == null) {
            AnonymousClass0GA B = AnonymousClass0It.B(this.f54704K, this.f54717X);
            B.f2849B = new AnonymousClass4VH(this);
            schedule(B);
        } else {
            if (!this.f54710Q) {
                if (m24380I(this)) {
                    this.f54713T = this.f54703J.T();
                    this.f54712S = this.f54703J.R();
                } else {
                    if (this.f54703J.m() != null) {
                        this.f54715V = this.f54703J.m();
                    }
                    if (this.f54703J.b() != null) {
                        this.f54714U = this.f54703J.b();
                    }
                }
                if (this.f54703J.v() != null) {
                    this.f54716W = this.f54703J.v();
                }
            }
            if (this.f54703J.fA()) {
                this.f54711R = new BrandedContentTag(this.f54703J.z(), this.f54703J.BA());
            }
        }
        anonymousClass0IL.f54721b = new AnonymousClass3LP(getContext(), new AnonymousClass0jZ(getContext(), this.f54717X, anonymousClass0IL, new AnonymousClass3Nn(this.f54703J), new AnonymousClass0jY()), new AnonymousClass1VH(this), this.f54717X, anonymousClass0IL.f54728i);
        AnonymousClass0cQ.G(anonymousClass0IL, 1215713838, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1008489550);
        View inflate = layoutInflater.inflate(C0164R.layout.layout_edit_media_info, viewGroup, false);
        this.mScrollView = inflate.findViewById(C0164R.id.edit_media_scroll_view);
        this.mUserImageView = (CircularImageView) inflate.findViewById(C0164R.id.edit_media_user_imageview);
        this.mUsername = (TextView) inflate.findViewById(C0164R.id.edit_media_username);
        this.mBelowUsernameLabel = (TextView) inflate.findViewById(C0164R.id.below_username_label);
        this.mTimestamp = (TextView) inflate.findViewById(C0164R.id.edit_media_timestamp);
        this.mCaption = (IgAutoCompleteTextView) inflate.findViewById(C0164R.id.edit_media_caption);
        this.mTextContainer = inflate.findViewById(C0164R.id.edit_media_linear_layout);
        this.f54709P = new AnonymousClass0ct((ViewStub) inflate.findViewById(C0164R.id.single_media_group_stub));
        this.f54720a = new AnonymousClass0ct((ViewStub) inflate.findViewById(C0164R.id.carousel_media_group_stub));
        this.mCaption.addTextChangedListener(new AnonymousClass4VE(this));
        Context context = getContext();
        this.f54695B = AnonymousClass1Od.B(context, this.f54717X, this, new AnonymousClass0Px(context, getLoaderManager()), null, null, null, null);
        this.mCaption.setAlwaysShowWhenEnoughToFilter(true);
        this.mCaption.setAdapter(this.f54695B);
        this.mScrollView.addOnLayoutChangeListener(this.f54706M);
        m24386O(8);
        AnonymousClass0cQ.G(this, -911550738, F);
        return inflate;
    }

    public final void onDestroy() {
        int F = AnonymousClass0cQ.F(this, 931004003);
        super.onDestroy();
        AnonymousClass0F4.f2058E.D(AnonymousClass4XP.class, this.f54719Z).D(AnonymousClass4XW.class, this.f54727h);
        AnonymousClass0cQ.G(this, 66184387, F);
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, 1496428916);
        super.onDestroyView();
        this.mUserImageView = null;
        this.mUsername = null;
        this.mBelowUsernameLabel = null;
        this.mExtraLocationLabel = null;
        this.mTimestamp = null;
        this.mCaption = null;
        this.mFailedView = null;
        this.f54709P = null;
        this.f54720a = null;
        m24386O(0);
        AnonymousClass0cQ.G(this, -1209876219, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, 1066294855);
        super.onPause();
        m24385N().setSoftInputMode(48);
        AnonymousClass0Nm.N(this.mCaption);
        AnonymousClass0JI.getInstance().removeLocationUpdates(this.f54705L);
        AnonymousClass0JI.getInstance().cancelSignalPackageRequest(this.f54702I);
        AnonymousClass0cQ.G(this, 1530373287, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, -890600391);
        super.onResume();
        if (this.f54699F) {
            m24381J(this);
        } else {
            m24382K(this);
            if (this.f54700G == null) {
                if (((Boolean) AnonymousClass0CC.ei.H(this.f54717X)).booleanValue()) {
                    AnonymousClass0JI.getInstance().requestLocationSignalPackage(this.f54702I, "EditMediaInfoFragment");
                } else {
                    Location lastLocation = AnonymousClass0JI.getInstance().getLastLocation();
                    if (lastLocation == null || !AnonymousClass0JI.getInstance().isLocationValid(lastLocation)) {
                        AnonymousClass0JI.getInstance().requestLocationUpdates(this.f54705L, "EditMediaInfoFragment");
                    } else {
                        this.f54700G = lastLocation;
                        AnonymousClass0JI.getInstance().removeLocationUpdates(this.f54705L);
                    }
                }
            }
        }
        m24377F(this);
        AnonymousClass0cQ.G(this, -1743298891, F);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        int i;
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("people_tags", this.f54715V);
        bundle.putParcelableArrayList("fb_friend_tags", this.f54714U);
        bundle.putParcelableArrayList("product_tags", this.f54716W);
        bundle.putParcelable("venue", this.f54718Y);
        bundle.putBoolean("venue_cleared", this.f54726g);
        Collection arrayList = new ArrayList(this.f54713T.keySet());
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            ArrayList arrayList2 = (ArrayList) this.f54713T.get(str);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("carousel_people_tags");
            stringBuilder.append(str);
            bundle.putParcelableArrayList(stringBuilder.toString(), arrayList2);
        }
        Collection arrayList3 = new ArrayList(this.f54712S.keySet());
        i = arrayList3.size();
        for (int i2 = 0; i2 < i; i2++) {
            str = (String) arrayList3.get(i2);
            arrayList2 = (ArrayList) this.f54712S.get(str);
            stringBuilder = new StringBuilder();
            stringBuilder.append("carousel_fb_friend_tags");
            stringBuilder.append(str);
            bundle.putParcelableArrayList(stringBuilder.toString(), arrayList2);
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList3);
        bundle.putStringArrayList("carousel_media_ids", arrayList4);
    }
}

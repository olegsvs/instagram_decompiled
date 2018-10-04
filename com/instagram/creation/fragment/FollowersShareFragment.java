package com.instagram.creation.fragment;

import X.AnonymousClass0CC;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Ci;
import X.AnonymousClass0Cm;
import X.AnonymousClass0F4;
import X.AnonymousClass0F8;
import X.AnonymousClass0FO;
import X.AnonymousClass0Fx;
import X.AnonymousClass0GG;
import X.AnonymousClass0GK;
import X.AnonymousClass0Gn;
import X.AnonymousClass0HV;
import X.AnonymousClass0IJ;
import X.AnonymousClass0IS;
import X.AnonymousClass0IW;
import X.AnonymousClass0Iz;
import X.AnonymousClass0JI;
import X.AnonymousClass0Jn;
import X.AnonymousClass0Lm;
import X.AnonymousClass0Mt;
import X.AnonymousClass0NN;
import X.AnonymousClass0Nm;
import X.AnonymousClass0OA;
import X.AnonymousClass0OC;
import X.AnonymousClass0OK;
import X.AnonymousClass0ON;
import X.AnonymousClass0PI;
import X.AnonymousClass0PJ;
import X.AnonymousClass0PK;
import X.AnonymousClass0PL;
import X.AnonymousClass0PR;
import X.AnonymousClass0Sb;
import X.AnonymousClass0TK;
import X.AnonymousClass0a2;
import X.AnonymousClass0cQ;
import X.AnonymousClass0iO;
import X.AnonymousClass0iq;
import X.AnonymousClass0iy;
import X.AnonymousClass0kV;
import X.AnonymousClass173;
import X.AnonymousClass174;
import X.AnonymousClass177;
import X.AnonymousClass1Ba;
import X.AnonymousClass1DO;
import X.AnonymousClass1DP;
import X.AnonymousClass1YC;
import X.AnonymousClass1ak;
import X.AnonymousClass1fg;
import X.AnonymousClass2E0;
import X.AnonymousClass2MW;
import X.AnonymousClass2MY;
import X.AnonymousClass2MZ;
import X.AnonymousClass2Ma;
import X.AnonymousClass2Mb;
import X.AnonymousClass2Md;
import X.AnonymousClass2Me;
import X.AnonymousClass2NY;
import X.AnonymousClass2bB;
import X.AnonymousClass2ck;
import X.AnonymousClass32q;
import X.AnonymousClass3Cc;
import X.AnonymousClass3Gv;
import X.AnonymousClass3HZ;
import X.AnonymousClass3ev;
import X.AnonymousClass3ew;
import X.AnonymousClass3f3;
import X.AnonymousClass3zI;
import X.AnonymousClass3zQ;
import X.AnonymousClass3zX;
import X.AnonymousClass4VI;
import X.AnonymousClass4VJ;
import X.AnonymousClass4VL;
import X.AnonymousClass4VM;
import X.AnonymousClass4VN;
import X.AnonymousClass4VO;
import X.AnonymousClass4VP;
import X.AnonymousClass4VS;
import X.AnonymousClass4VY;
import X.AnonymousClass4VZ;
import X.AnonymousClass4Vc;
import X.AnonymousClass4Ve;
import X.AnonymousClass4Vf;
import X.AnonymousClass4Vg;
import X.AnonymousClass4Vh;
import X.AnonymousClass4Vi;
import X.AnonymousClass4Vj;
import X.AnonymousClass4Vk;
import X.AnonymousClass4Vl;
import X.AnonymousClass4Vn;
import X.AnonymousClass4WB;
import X.AnonymousClass4WC;
import X.AnonymousClass4WD;
import X.AnonymousClass4WF;
import X.AnonymousClass4Wj;
import X.AnonymousClass4Wt;
import X.AnonymousClass4X0;
import X.AnonymousClass4X1;
import X.AnonymousClass4X2;
import X.AnonymousClass4X3;
import X.AnonymousClass4X4;
import X.AnonymousClass4XW;
import X.AnonymousClass4XX;
import X.AnonymousClass4Xb;
import X.AnonymousClass53S;
import X.AnonymousClass5JR;
import X.AnonymousClass5JS;
import X.AnonymousClass63b;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0164R;
import com.facebook.common.dextricks.DexStore;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.MediaSession;
import com.instagram.creation.base.PhotoSession;
import com.instagram.creation.location.NearbyVenuesService;
import com.instagram.location.intf.LocationSignalPackage;
import com.instagram.model.fbfriend.FbFriend;
import com.instagram.model.fbfriend.FbFriendTag;
import com.instagram.model.venue.Venue;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.pendingmedia.store.PendingMediaStoreSerializer;
import com.instagram.tagging.activity.MediaTaggingInfo;
import com.instagram.ui.widget.switchbutton.IgSwitch;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;
import java.io.File;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FollowersShareFragment extends AnonymousClass0IJ implements AnonymousClass0IS, AnonymousClass5JR {
    /* renamed from: k */
    public static boolean f64917k;
    /* renamed from: B */
    public List f64918B;
    /* renamed from: C */
    public boolean f64919C;
    /* renamed from: D */
    public AnonymousClass32q f64920D;
    /* renamed from: E */
    public AnonymousClass4Xb f64921E;
    /* renamed from: F */
    public AnonymousClass2MW f64922F;
    /* renamed from: G */
    public AnonymousClass0kV f64923G;
    /* renamed from: H */
    public boolean f64924H;
    /* renamed from: I */
    public boolean f64925I;
    /* renamed from: J */
    public LocationSignalPackage f64926J;
    /* renamed from: K */
    public AnonymousClass0OA f64927K;
    /* renamed from: L */
    public Location f64928L;
    /* renamed from: M */
    public AnonymousClass0PJ f64929M;
    /* renamed from: N */
    public final OnClickListener f64930N = new AnonymousClass4VI(this);
    /* renamed from: O */
    public Location f64931O;
    /* renamed from: P */
    public AnonymousClass0PL f64932P;
    /* renamed from: Q */
    public boolean f64933Q;
    /* renamed from: R */
    public CreationSession f64934R;
    /* renamed from: S */
    public AnonymousClass53S f64935S;
    /* renamed from: T */
    public AnonymousClass63b f64936T;
    /* renamed from: U */
    public long f64937U = -1;
    /* renamed from: V */
    public AnonymousClass0Cm f64938V;
    /* renamed from: W */
    public AnonymousClass0F8 f64939W = new AnonymousClass4Vk(this);
    /* renamed from: X */
    public AnonymousClass0F8 f64940X;
    /* renamed from: Y */
    public final boolean f64941Y = ((Boolean) AnonymousClass0CC.gl.G()).booleanValue();
    /* renamed from: Z */
    private final AnonymousClass0F8 f64942Z = new AnonymousClass4VS(this);
    /* renamed from: a */
    private final AnonymousClass0F8 f64943a = new AnonymousClass4Ve(this);
    /* renamed from: b */
    private final AnonymousClass0F8 f64944b = new AnonymousClass4Vf(this);
    /* renamed from: c */
    private final AnonymousClass0F8 f64945c = new AnonymousClass4Vc(this);
    /* renamed from: d */
    private AnonymousClass0iO f64946d;
    /* renamed from: e */
    private AnonymousClass1ak f64947e;
    /* renamed from: f */
    private final AnonymousClass1DO f64948f = new AnonymousClass4Vj(this);
    /* renamed from: g */
    private final AnonymousClass1DP f64949g = new AnonymousClass4Vi(this);
    /* renamed from: h */
    private final AnonymousClass0F8 f64950h = new AnonymousClass4Vg(this);
    /* renamed from: i */
    private final OnClickListener f64951i = new AnonymousClass4VJ(this);
    /* renamed from: j */
    private final AnonymousClass0F8 f64952j = new AnonymousClass4Vh(this);
    public View mAddHashtagsRow;
    public View mAdvancedSettingRow;
    public IgAutoCompleteTextView mCaptionBox;
    public ImageView mFavoritesIcon;
    public IgSwitch mFavoritesSwitch;
    public AnonymousClass4X4 mLocationSuggestionsRow;
    public View mPeopleTagRow;
    public TextView mPeopleTextView;
    public View mProductTagRow;
    public TextView mProductTextView;
    public AnonymousClass5JS mShareTable;
    public View mShareTitleContainer;
    public TextView mUploadButtonTextView;

    public final String getModuleName() {
        return "metadata_followers_share";
    }

    public final void AAA(AnonymousClass3ew anonymousClass3ew) {
        m27047Q(anonymousClass3ew);
        if (anonymousClass3ew.J(this.f64938V, this.f64927K)) {
            anonymousClass3ew.N(this.f64927K, this, this.f64946d, this.f64938V);
            this.mShareTable.m26228A(this.f64927K);
        }
    }

    /* renamed from: B */
    public static void m27032B(FollowersShareFragment followersShareFragment, List list) {
        View inflate;
        AnonymousClass4X4 anonymousClass4X4 = followersShareFragment.mLocationSuggestionsRow;
        List subList = list.subList(0, Math.min(5, list.size()));
        Context context = anonymousClass4X4.f54933F.getContext();
        LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i = 0;
        layoutParams.setMargins(0, 0, context.getResources().getDimensionPixelSize(C0164R.dimen.location_suggestion_right_margin), 0);
        while (i < subList.size()) {
            Venue venue = (Venue) subList.get(i);
            if (venue.f6707D.equals("facebook_events")) {
                inflate = LayoutInflater.from(context).inflate(C0164R.layout.suggested_event_button, anonymousClass4X4.f54936I, false);
                ((TextView) inflate.findViewById(C0164R.id.event_text)).setText(venue.f6716M);
                inflate.setOnClickListener(new AnonymousClass4X0(anonymousClass4X4, venue, i));
            } else {
                inflate = (Button) LayoutInflater.from(context).inflate(C0164R.layout.suggested_location_button, anonymousClass4X4.f54936I, false);
                inflate.setMaxWidth(anonymousClass4X4.f54932E);
                inflate.setText(venue.f6716M);
                inflate.setOnClickListener(new AnonymousClass4X1(anonymousClass4X4, venue, i));
            }
            anonymousClass4X4.f54936I.addView(inflate, layoutParams);
            i++;
        }
        inflate = LayoutInflater.from(context).inflate(C0164R.layout.suggested_location_search_button, anonymousClass4X4.f54936I, false);
        inflate.setOnClickListener(new AnonymousClass4X2(anonymousClass4X4));
        anonymousClass4X4.f54936I.addView(inflate, layoutParams);
        anonymousClass4X4.f54934G = true;
        AnonymousClass4X4 anonymousClass4X42 = followersShareFragment.mLocationSuggestionsRow;
        AnonymousClass4X4.B(anonymousClass4X42, anonymousClass4X42.f54935H);
    }

    /* renamed from: C */
    public static void m27033C(FollowersShareFragment followersShareFragment, Location location) {
        followersShareFragment.m27048R(location);
        if (followersShareFragment.f64928L == null || followersShareFragment.f64926J != null) {
            Activity activity = followersShareFragment.getActivity();
            if (activity != null) {
                NearbyVenuesService.F(activity, followersShareFragment.f64938V, location, followersShareFragment.f64926J, Long.valueOf(followersShareFragment.f64937U));
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: D */
    public static void m27034D(com.instagram.creation.fragment.FollowersShareFragment r16, android.view.View r17) {
        /*
        r0 = 2131299432; // 0x7f090c68 float:1.8216865E38 double:1.0530018304E-314;
        r9 = r17;
        r2 = r9.findViewById(r0);
        r2 = (android.widget.TextView) r2;
        r0 = X.AnonymousClass0CC.UY;
        r1 = r0.G();
        r1 = (java.lang.String) r1;
        r0 = "also_share_post";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0022;
    L_0x001b:
        r0 = 2131692740; // 0x7f0f0cc4 float:1.9014589E38 double:1.0531961503E-314;
        r2.setText(r0);
        goto L_0x0037;
    L_0x0022:
        r0 = "also_post";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0031;
    L_0x002a:
        r0 = 2131692739; // 0x7f0f0cc3 float:1.9014587E38 double:1.05319615E-314;
        r2.setText(r0);
        goto L_0x0037;
    L_0x0031:
        r0 = 2131692742; // 0x7f0f0cc6 float:1.9014593E38 double:1.0531961513E-314;
        r2.setText(r0);
    L_0x0037:
        r0 = 2131296731; // 0x7f0901db float:1.8211387E38 double:1.053000496E-314;
        r5 = r9.findViewById(r0);
        r5 = (android.widget.LinearLayout) r5;
        r0 = 2131298195; // 0x7f090793 float:1.8214356E38 double:1.053001219E-314;
        r4 = r5.findViewById(r0);
        r4 = (com.instagram.common.ui.widget.imageview.CircularImageView) r4;
        r0 = 2131299703; // 0x7f090d77 float:1.8217415E38 double:1.053001964E-314;
        r3 = r5.findViewById(r0);
        r0 = 2131297457; // 0x7f0904b1 float:1.821286E38 double:1.0530008546E-314;
        r1 = r9.findViewById(r0);
        r1 = (android.view.ViewGroup) r1;
        r0 = X.AnonymousClass0Cd.f1698B;
        r0 = r0.J();
        r8 = r16;
        if (r0 != 0) goto L_0x0069;
    L_0x0063:
        r0 = r8.f64927K;
        r0 = r0.NB;
        if (r0 == 0) goto L_0x00af;
    L_0x0069:
        r0 = 0;
        r4.setVisibility(r0);
        r0 = r8.f64934R;
        r2 = r0.f38951E;
        r0 = X.AnonymousClass0g0.PROFILE_PHOTO;
        if (r2 != r0) goto L_0x008c;
    L_0x0075:
        r2 = r8.getResources();
        r0 = 2131165340; // 0x7f07009c float:1.7944894E38 double:1.05293558E-314;
        r2 = r2.getDimensionPixelSize(r0);
        r0 = r8.f64927K;
        r0 = r0.DB;
        r0 = X.AnonymousClass0rm.F(r0, r2, r2);
        r4.setImageBitmap(r0);
        goto L_0x0099;
    L_0x008c:
        r0 = r8.f64938V;
        r0 = r0.B();
        r0 = r0.DQ();
        r4.setUrl(r0);
    L_0x0099:
        r5.removeView(r3);
        r5.addView(r3);
        r3 = r8.mCaptionBox;
        r2 = r8.getResources();
        r0 = 2131166838; // 0x7f070676 float:1.7947933E38 double:1.05293632E-314;
        r0 = r2.getDimensionPixelSize(r0);
        X.AnonymousClass0Nm.d(r3, r0);
    L_0x00af:
        r2 = r8.getResources();
        r0 = 2131165315; // 0x7f070083 float:1.7944844E38 double:1.0529355677E-314;
        r3 = r2.getDimensionPixelSize(r0);
        r2 = r8.mCaptionBox;
        r0 = 1075838976; // 0x40200000 float:2.5 double:5.315350785E-315;
        r2.f13039C = r0;
        r2.f13038B = r3;
        r2 = r8.mCaptionBox;
        r0 = r2.getTop();
        r2.setDropDownVerticalOffset(r0);
        r0 = r8.f64934R;
        r2 = r0.Q();
        r0 = 0;
        if (r2 == 0) goto L_0x00ed;
    L_0x00d4:
        r2 = r8.f64934R;
        r2 = r2.I();
        r2 = r2.get(r0);
        r2 = (com.instagram.creation.base.MediaSession) r2;
        r3 = r2.B();
        r2 = r8.f64929M;
        r2 = r2.LP(r3);
        r11 = r2.DB;
        goto L_0x00f1;
    L_0x00ed:
        r2 = r8.f64927K;
        r11 = r2.DB;
    L_0x00f1:
        r6 = new X.4Xb;
        r7 = r8.f64938V;
        r10 = r8.f64927K;
        r12 = r10.NB;
        r6.<init>(r7, r8, r9, r10, r11, r12);
        r8.f64921E = r6;
        r3 = r6.f54989F;
        r2 = 2131296732; // 0x7f0901dc float:1.8211389E38 double:1.0530004964E-314;
        r2 = r3.findViewById(r2);
        r2 = (com.instagram.ui.widget.textview.IgAutoCompleteTextView) r2;
        r6.f54986C = r2;
        r3 = r6.f54989F;
        r2 = 2131298194; // 0x7f090792 float:1.8214354E38 double:1.0530012187E-314;
        r5 = r3.findViewById(r2);
        r5 = (android.widget.FrameLayout) r5;
        X.AnonymousClass4Xb.C(r6, r5);
        r2 = r6.f54988E;
        r2 = r2.k();
        r3 = 0;
        if (r2 == 0) goto L_0x0141;
    L_0x0122:
        r4 = r6.f54989F;
        r2 = 2131296383; // 0x7f09007f float:1.8210681E38 double:1.053000324E-314;
        r2 = r4.findViewById(r2);
        r2 = (com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView) r2;
        r2.setVisibility(r3);
        r2 = r6.f54987D;
        r4 = r2.getContext();
        r2 = 2131689662; // 0x7f0f00be float:1.9008346E38 double:1.0531946296E-314;
        r2 = r4.getString(r2);
        r5.setContentDescription(r2);
        goto L_0x017e;
    L_0x0141:
        r2 = r6.f54988E;
        r4 = r2.gB;
        r2 = X.AnonymousClass0ON.PHOTO;
        if (r4 != r2) goto L_0x015a;
    L_0x0149:
        r2 = r6.f54987D;
        r4 = r2.getContext();
        r2 = 2131692090; // 0x7f0f0a3a float:1.901327E38 double:1.053195829E-314;
        r2 = r4.getString(r2);
        r5.setContentDescription(r2);
        goto L_0x017e;
    L_0x015a:
        r2 = r6.f54988E;
        r2 = r2.s();
        if (r2 == 0) goto L_0x017e;
    L_0x0162:
        r4 = r6.f54989F;
        r2 = 2131296733; // 0x7f0901dd float:1.821139E38 double:1.053000497E-314;
        r2 = r4.findViewById(r2);
        r2.setVisibility(r3);
        r2 = r6.f54987D;
        r4 = r2.getContext();
        r2 = 2131693381; // 0x7f0f0f45 float:1.9015889E38 double:1.053196467E-314;
        r2 = r4.getString(r2);
        r5.setContentDescription(r2);
    L_0x017e:
        r2 = new X.4XY;
        r2.<init>(r6);
        r5.setOnClickListener(r2);
        r2 = r6.f54988E;
        r2 = r2.f3809W;
        if (r2 == 0) goto L_0x01a2;
    L_0x018c:
        r4 = r6.f54986C;
        r2 = r6.f54988E;
        r2 = r2.f3809W;
        r4.setText(r2);
        r4 = r6.f54986C;
        r2 = r4.getText();
        r2 = r2.length();
        r4.setSelection(r2);
    L_0x01a2:
        r2 = r6.f54987D;
        r10 = r2.getContext();
        r11 = r6.f54991H;
        r12 = r6.f54987D;
        r13 = new X.0Px;
        r2 = r12.getLoaderManager();
        r13.<init>(r10, r2);
        r14 = 0;
        r15 = 0;
        r16 = 0;
        r17 = 0;
        r2 = X.AnonymousClass1Od.B(r10, r11, r12, r13, r14, r15, r16, r17);
        r6.f54985B = r2;
        r4 = r6.f54986C;
        r2 = 1;
        r4.setAlwaysShowWhenEnoughToFilter(r2);
        r4 = r6.f54986C;
        r2 = r6.f54985B;
        r4.setAdapter(r2);
        r4 = r6.f54986C;
        r2 = new X.4XZ;
        r2.<init>(r6);
        r4.setOnTouchListener(r2);
        r2 = r6.f54990G;
        if (r2 == 0) goto L_0x0201;
    L_0x01dc:
        r4 = r6.f54989F;
        r2 = 2131299703; // 0x7f090d77 float:1.8217415E38 double:1.053001964E-314;
        r2 = r4.findViewById(r2);
        r2 = (android.widget.LinearLayout) r2;
        r2.setPadding(r3, r3, r3, r3);
        r3 = r6.f54989F;
        r2 = 2131297194; // 0x7f0903aa float:1.8212326E38 double:1.0530007246E-314;
        r2 = r3.findViewById(r2);
        r2 = (android.view.ViewStub) r2;
        r3 = r2.inflate();
        r2 = new X.4Xa;
        r2.<init>(r6);
        r3.setOnClickListener(r2);
    L_0x0201:
        r5 = new X.5JS;
        r11 = r8.getContext();
        r4 = r8.f64918B;
        r3 = r8.f64938V;
        r2 = new X.5UV;
        r2.<init>(r8);
        r10 = r5;
        r12 = r9;
        r13 = r4;
        r14 = r3;
        r15 = r2;
        r10.<init>(r11, r12, r13, r14, r15);
        r8.mShareTable = r5;
        r5.setOnSharingToggleListener(r8);
        r3 = r8.getResources();
        r2 = 2131166828; // 0x7f07066c float:1.7947912E38 double:1.0529363153E-314;
        r3 = r3.getDimensionPixelSize(r2);
        r2 = r8.mShareTable;
        r2.setPadding(r3, r0, r3, r0);
        r3 = r8.mShareTable;
        r2 = r8.f64927K;
        r3.m26228A(r2);
        r2 = r8.mShareTable;
        r1.addView(r2);
        m27043M(r8);
        r2 = r8.f64938V;
        r2 = X.AnonymousClass0yJ.D(r2);
        r4 = 8;
        if (r2 == 0) goto L_0x028c;
    L_0x0246:
        r2 = r8.f64938V;
        r2 = X.AnonymousClass0yJ.I(r2);
        if (r2 != 0) goto L_0x028c;
    L_0x024e:
        r2 = 2131299434; // 0x7f090c6a float:1.821687E38 double:1.0530018313E-314;
        r2 = r9.findViewById(r2);
        r2 = (android.view.ViewStub) r2;
        r5 = r2.inflate();
        r2 = new X.4VT;
        r2.<init>(r8);
        r5.setOnLongClickListener(r2);
        r2 = 2131296821; // 0x7f090235 float:1.821157E38 double:1.0530005403E-314;
        r2 = r9.findViewById(r2);
        r2 = (android.widget.ImageView) r2;
        r8.mFavoritesIcon = r2;
        r2.setVisibility(r4);
        r2 = 2131299435; // 0x7f090c6b float:1.8216871E38 double:1.053001832E-314;
        r3 = r9.findViewById(r2);
        r3 = (com.instagram.ui.widget.switchbutton.IgSwitch) r3;
        r8.mFavoritesSwitch = r3;
        r2 = new X.4VU;
        r2.<init>(r8);
        r3.setToggleListener(r2);
        r2 = new X.4VV;
        r2.<init>(r8);
        r5.setOnClickListener(r2);
    L_0x028c:
        r2 = 2131298189; // 0x7f09078d float:1.8214344E38 double:1.053001216E-314;
        r3 = r9.findViewById(r2);
        r8.mPeopleTagRow = r3;
        r2 = 2131298192; // 0x7f090790 float:1.821435E38 double:1.0530012177E-314;
        r2 = r3.findViewById(r2);
        r2 = (android.widget.TextView) r2;
        r8.mPeopleTextView = r2;
        r3 = r8.mPeopleTagRow;
        r2 = 2131299646; // 0x7f090d3e float:1.82173E38 double:1.053001936E-314;
        r2 = r3.findViewById(r2);
        r2 = (android.widget.ImageView) r2;
        r5 = 8;
        r2.setVisibility(r5);
        r2 = r8.f64924H;
        if (r2 == 0) goto L_0x02e7;
    L_0x02b4:
        r2 = 2131296341; // 0x7f090055 float:1.8210596E38 double:1.053000303E-314;
        r2 = r9.findViewById(r2);
        r2 = (android.view.ViewStub) r2;
        r3 = r2.inflate();
        r8.mAddHashtagsRow = r3;
        r2 = new X.4Va;
        r2.<init>(r8);
        r3.setOnClickListener(r2);
        r2 = "capture_flow_v2";
        r2 = X.AnonymousClass0NS.B(r2);
        r6 = r2.E();
        r2 = "creation_add_hashtags_row_impression";
        r3 = X.AnonymousClass0NN.B(r2, r8);
        r2 = "waterfall_id";
        r2 = r3.K(r2, r6);
        r2.R();
        m27042L(r8);
    L_0x02e7:
        r3 = X.AnonymousClass4Vd.f54753C;
        r2 = r8.f64927K;
        r2 = r2.gB;
        r2 = r2.ordinal();
        r2 = r3[r2];
        r7 = 0;
        switch(r2) {
            case 1: goto L_0x0310;
            case 2: goto L_0x0301;
            default: goto L_0x02f7;
        };
    L_0x02f7:
        r2 = r8.f64934R;
        r2 = r2.Q();
        if (r2 != 0) goto L_0x0312;
    L_0x02ff:
        r6 = 0;
        goto L_0x0324;
    L_0x0301:
        r3 = X.AnonymousClass0CC.Xd;
        r2 = r8.f64938V;
        r2 = r3.H(r2);
        r2 = (java.lang.Boolean) r2;
        r6 = r2.booleanValue();
        goto L_0x0324;
    L_0x0310:
        r6 = 1;
        goto L_0x0324;
    L_0x0312:
        r2 = r8.f64934R;
        r2 = r2.O();
        if (r2 == 0) goto L_0x031b;
    L_0x031a:
        goto L_0x0310;
    L_0x031b:
        r2 = r8.f64934R;
        r2 = r2.P();
        if (r2 == 0) goto L_0x02ff;
    L_0x0323:
        goto L_0x0301;
    L_0x0324:
        r2 = r8.f64938V;
        r2 = r2.B();
        r3 = r2.GC;
        r2 = X.AnonymousClass2HP.APPROVED;
        if (r3 == r2) goto L_0x0337;
    L_0x0330:
        r2 = X.AnonymousClass2HP.ONBOARDED;
        if (r3 != r2) goto L_0x0335;
    L_0x0334:
        goto L_0x0337;
    L_0x0335:
        r2 = 0;
        goto L_0x0338;
    L_0x0337:
        r2 = 1;
    L_0x0338:
        if (r6 == 0) goto L_0x033d;
    L_0x033a:
        if (r2 == 0) goto L_0x033d;
    L_0x033c:
        r7 = 1;
    L_0x033d:
        if (r7 == 0) goto L_0x03b6;
    L_0x033f:
        r3 = X.AnonymousClass2NY.B();
        r2 = 1;
        r3.f29738i = r2;
        r2 = 2131299653; // 0x7f090d45 float:1.8217313E38 double:1.0530019395E-314;
        r2 = r9.findViewById(r2);
        r2 = (android.view.ViewStub) r2;
        r3 = r2.inflate();
        r8.mProductTagRow = r3;
        r2 = 2131298193; // 0x7f090791 float:1.8214352E38 double:1.053001218E-314;
        r2 = r3.findViewById(r2);
        r2 = (android.widget.TextView) r2;
        r8.mProductTextView = r2;
        r2 = 2131299658; // 0x7f090d4a float:1.8217324E38 double:1.053001942E-314;
        r2 = r9.findViewById(r2);
        r2 = (android.view.ViewStub) r2;
        r2.inflate();
        r3 = r8.mProductTagRow;
        r2 = 2131299651; // 0x7f090d43 float:1.821731E38 double:1.0530019386E-314;
        r2 = r3.findViewById(r2);
        r2 = (android.widget.ImageView) r2;
        r2.setVisibility(r5);
        r6 = r8.f64936T;
        r2 = r6.f71338C;
        r2 = X.AnonymousClass1fg.I(r2);
        if (r2 != 0) goto L_0x03a1;
    L_0x0384:
        r2 = r6.f71338C;
        r5 = X.AnonymousClass2FT.B(r2);
        r3 = "tag_products_tooltip_seen_count";
        r2 = 0;
        r3 = r5.getInt(r3, r2);
        r2 = 3;
        if (r3 >= r2) goto L_0x0396;
    L_0x0394:
        r2 = 1;
        goto L_0x0397;
    L_0x0396:
        r2 = 0;
    L_0x0397:
        if (r2 == 0) goto L_0x03a1;
    L_0x0399:
        r2 = X.AnonymousClass63b.m28840B(r6);
        if (r2 == 0) goto L_0x03a1;
    L_0x039f:
        r2 = 1;
        goto L_0x03a2;
    L_0x03a1:
        r2 = 0;
    L_0x03a2:
        if (r2 == 0) goto L_0x03b6;
    L_0x03a4:
        r6 = r8.f64936T;
        r5 = r8.getView();
        r3 = r8.mProductTagRow;
        if (r3 == 0) goto L_0x03b6;
    L_0x03ae:
        r2 = new X.63a;
        r2.<init>(r6, r5, r3);
        r5.post(r2);
    L_0x03b6:
        m27044N(r8);
        r2 = r8.getContext();
        r5 = android.view.LayoutInflater.from(r2);
        r3 = 2131428209; // 0x7f0b0371 float:1.8478056E38 double:1.0530654546E-314;
        r2 = r9;
        r2 = (android.view.ViewGroup) r2;
        r5 = r5.inflate(r3, r2, r0);
        r7 = new X.4X4;
        r2 = 2131298186; // 0x7f09078a float:1.8214338E38 double:1.0530012147E-314;
        r2 = r5.findViewById(r2);
        r7.<init>(r2);
        r8.mLocationSuggestionsRow = r7;
        r2 = r8.f64927K;
        r6 = r2.wC;
        r7.f54930C = r8;
        r3 = r7.f54931D;
        r2 = new X.4Wu;
        r2.<init>(r7);
        r3.setOnClickListener(r2);
        r3 = r7.f54929B;
        r2 = new X.4Wv;
        r2.<init>(r7);
        r3.setOnClickListener(r2);
        r7.f54937J = r6;
        r2 = r7.f54937J;
        if (r2 != 0) goto L_0x03ff;
    L_0x03f9:
        r2 = r7.f54935H;
        X.AnonymousClass4X4.B(r7, r2);
        goto L_0x0404;
    L_0x03ff:
        r2 = X.AnonymousClass4X3.LOCATION_NAMED;
        X.AnonymousClass4X4.B(r7, r2);
    L_0x0404:
        r2 = r8.f64938V;
        r2 = X.AnonymousClass0yJ.D(r2);
        if (r2 == 0) goto L_0x0413;
    L_0x040c:
        r3 = 3;
        r2 = r8.mProductTagRow;
        if (r2 == 0) goto L_0x0414;
    L_0x0411:
        r3 = 4;
        goto L_0x0414;
    L_0x0413:
        r3 = 2;
    L_0x0414:
        r1.addView(r5, r3);
        r2 = r8.mLocationSuggestionsRow;
        r1 = r8.f64927K;
        r1 = r1.wC;
        r2.f54937J = r1;
        if (r1 == 0) goto L_0x0426;
    L_0x0421:
        r1 = X.AnonymousClass4X3.LOCATION_NAMED;
        X.AnonymousClass4X4.B(r2, r1);
    L_0x0426:
        r1 = 2131298042; // 0x7f0906fa float:1.8214046E38 double:1.0530011436E-314;
        r1 = r5.findViewById(r1);
        r1 = (android.widget.ImageView) r1;
        r1.setVisibility(r4);
        m27037G(r8);
        r1 = new X.4VK;
        r1.<init>(r8);
        r8.f64940X = r1;
        r1 = r8.f64928L;
        if (r1 == 0) goto L_0x0441;
    L_0x0440:
        goto L_0x0443;
    L_0x0441:
        r1 = r8.f64931O;
    L_0x0443:
        r1 = com.instagram.creation.location.NearbyVenuesService.D(r1);
        if (r1 == 0) goto L_0x044c;
    L_0x0449:
        m27032B(r8, r1);
    L_0x044c:
        r3 = X.AnonymousClass0F4.f2058E;
        r2 = X.AnonymousClass4XX.class;
        r1 = r8.f64940X;
        r3.A(r2, r1);
        r1 = r8.f64928L;
        if (r1 == 0) goto L_0x046c;
    L_0x0459:
        r6 = r8.getActivity();
        r5 = r8.f64938V;
        r4 = r8.f64928L;
        r3 = r8.f64926J;
        r1 = r8.f64937U;
        r1 = java.lang.Long.valueOf(r1);
        com.instagram.creation.location.NearbyVenuesService.F(r6, r5, r4, r3, r1);
    L_0x046c:
        r2 = r8.getActivity();
        r1 = 2131298287; // 0x7f0907ef float:1.8214543E38 double:1.0530012646E-314;
        r2 = r2.findViewById(r1);
        r2 = (android.widget.TextView) r2;
        r8.mUploadButtonTextView = r2;
        r1 = 2131692720; // 0x7f0f0cb0 float:1.9014548E38 double:1.0531961404E-314;
        r2.setText(r1);
        r2 = r8.mUploadButtonTextView;
        r1 = new X.4VW;
        r1.<init>(r8);
        r2.setOnClickListener(r1);
        r1 = r8.f64927K;
        r2 = r1.gB;
        r1 = X.AnonymousClass0ON.VIDEO;
        if (r2 != r1) goto L_0x04ad;
    L_0x0493:
        r2 = X.AnonymousClass0CC.gj;
        r1 = r8.f64938V;
        r1 = r2.H(r1);
        r1 = (java.lang.Boolean) r1;
        r1 = r1.booleanValue();
        if (r1 == 0) goto L_0x04ad;
    L_0x04a3:
        r1 = 2131299437; // 0x7f090c6d float:1.8216875E38 double:1.053001833E-314;
        r1 = r9.findViewById(r1);
        r1.setVisibility(r0);
    L_0x04ad:
        r1 = 2131296376; // 0x7f090078 float:1.8210667E38 double:1.0530003205E-314;
        r1 = r9.findViewById(r1);
        r1 = (android.view.ViewStub) r1;
        r2 = r1.inflate();
        r8.mAdvancedSettingRow = r2;
        r1 = 2131296374; // 0x7f090076 float:1.8210663E38 double:1.0530003195E-314;
        r1 = r2.findViewById(r1);
        r1.setVisibility(r0);
        r1 = r8.mAdvancedSettingRow;
        r0 = new X.4VX;
        r0.<init>(r8);
        r1.setOnClickListener(r0);
        r0 = r8.f64938V;
        r0 = r0.B();
        r0 = r0.H();
        if (r0 == 0) goto L_0x04e3;
    L_0x04dc:
        r1 = X.AnonymousClass2NY.B();
        r0 = 1;
        r1.f29708E = r0;
    L_0x04e3:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.fragment.FollowersShareFragment.D(com.instagram.creation.fragment.FollowersShareFragment, android.view.View):void");
    }

    /* renamed from: E */
    public static void m27035E(FollowersShareFragment followersShareFragment) {
        AnonymousClass0HV D = AnonymousClass0HV.D(followersShareFragment.f64938V);
        if (D.f2646B.getInt("xshare_feed_post_nux_display_count", 0) < 3) {
            AnonymousClass173 C = new AnonymousClass173(followersShareFragment.getActivity(), new AnonymousClass174(followersShareFragment.getResources().getString(C0164R.string.xshare_feed_tooltip))).C(followersShareFragment.f64932P.KO());
            C.f14642H = AnonymousClass177.BELOW_ANCHOR;
            C.f14640F = new AnonymousClass4VP(followersShareFragment, D);
            C.A().C();
        }
    }

    /* renamed from: F */
    public static void m27036F(FollowersShareFragment followersShareFragment) {
        String stringWriter;
        if (followersShareFragment.f64927K.f3804R != null) {
            try {
                BrandedContentTag brandedContentTag = followersShareFragment.f64927K.f3804R;
                Writer stringWriter2 = new StringWriter();
                JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter2);
                AnonymousClass2bB.C(createGenerator, brandedContentTag, true);
                createGenerator.close();
                stringWriter = stringWriter2.toString();
            } catch (Throwable e) {
                AnonymousClass0Gn.L(followersShareFragment.getModuleName(), e);
            }
            AnonymousClass3HZ.B(new AnonymousClass3zQ(followersShareFragment.f64927K.f3813a, stringWriter, followersShareFragment.f64927K.vB));
        }
        stringWriter = null;
        AnonymousClass3HZ.B(new AnonymousClass3zQ(followersShareFragment.f64927K.f3813a, stringWriter, followersShareFragment.f64927K.vB));
    }

    /* renamed from: G */
    public static void m27037G(FollowersShareFragment followersShareFragment) {
        if (((Boolean) AnonymousClass0CC.ei.H(followersShareFragment.f64938V)).booleanValue()) {
            AnonymousClass0JI.getInstance().requestLocationSignalPackage(followersShareFragment.f64948f, "FollowersShareFragment");
            if (followersShareFragment.f64934R.f38958L != null) {
                followersShareFragment.f64948f.Pq(followersShareFragment.f64934R.f38958L);
                return;
            }
            return;
        }
        Location lastLocation = AnonymousClass0JI.getInstance().getLastLocation();
        if (lastLocation == null || !AnonymousClass0JI.getInstance().isLocationValid(lastLocation)) {
            AnonymousClass0JI.getInstance().requestLocationUpdates(followersShareFragment.f64949g, "FollowersShareFragment");
        } else {
            m27033C(followersShareFragment, lastLocation);
        }
    }

    /* renamed from: H */
    public static void m27038H(FollowersShareFragment followersShareFragment, Venue venue, int i) {
        followersShareFragment.f64927K.wC = venue;
        followersShareFragment.f64927K.hC = i;
    }

    /* renamed from: I */
    public static void m27039I(FollowersShareFragment followersShareFragment) {
        Intent intent = new Intent();
        View findViewById = followersShareFragment.getView().findViewById(C0164R.id.row_caption_followshare);
        followersShareFragment.f64927K.f3809W = AnonymousClass4Xb.B(findViewById);
        followersShareFragment.f64927K.KA(AnonymousClass0OK.FOLLOWERS_SHARE);
        if (((Boolean) AnonymousClass0CC.PU.H(followersShareFragment.f64938V)).booleanValue() && AnonymousClass0HV.D(followersShareFragment.f64938V).Q("feed")) {
            followersShareFragment.f64927K.f3817e = new AnonymousClass2E0(AnonymousClass0HV.D(followersShareFragment.f64938V).R("feed"));
        }
        AnonymousClass0GK.E(followersShareFragment.getActivity(), followersShareFragment.f64938V).H(followersShareFragment.f64927K);
        AnonymousClass2NY.B().E("post_attempt");
        if (followersShareFragment.f64927K.gB == AnonymousClass0ON.PHOTO) {
            if (followersShareFragment.f64927K.NB) {
                followersShareFragment.m27046P(followersShareFragment.f64927K);
            } else {
                AnonymousClass0PK anonymousClass0PK = (AnonymousClass0PK) followersShareFragment.getActivity();
                anonymousClass0PK.JL().B(AnonymousClass3Cc.PROCESSING);
                anonymousClass0PK.gQ(followersShareFragment.f64934R.K()).E(new AnonymousClass3zI(followersShareFragment.getContext(), followersShareFragment.f64934R.D(), anonymousClass0PK.JL(), (AnonymousClass0PR) followersShareFragment.getContext(), followersShareFragment.f64934R.f38950D, followersShareFragment.f64934R.f38961O), followersShareFragment.f64934R.F(), new AnonymousClass3Gv[]{AnonymousClass3Gv.GALLERY});
            }
            followersShareFragment.m27045O(followersShareFragment.f64927K.f3834v, true);
        } else if (followersShareFragment.f64934R.Q()) {
            for (PhotoSession photoSession : followersShareFragment.f64934R.M()) {
                AnonymousClass0OA LP = followersShareFragment.f64929M.LP(photoSession.f38985H);
                followersShareFragment.m27046P(LP);
                followersShareFragment.m27045O(LP.f3834v, false);
            }
        }
        AnonymousClass3f3.C(followersShareFragment, followersShareFragment.f64927K.getId(), "composer");
        intent.putExtra("CaptureFlowHelper.RESULT_KEY_POST_TYPE", "CaptureFlowHelper.RESULT_VALUE_MEDIA_POSTED");
        followersShareFragment.getActivity().setResult(-1, intent);
        followersShareFragment.getActivity().finish();
        AnonymousClass0F4.f2058E.C(new AnonymousClass4Vl());
    }

    /* renamed from: J */
    public static void m27040J(FollowersShareFragment followersShareFragment) {
        if (AnonymousClass1fg.I(followersShareFragment.f64938V)) {
            Intent G;
            AnonymousClass0Iz.f2854L.I(followersShareFragment.getActivity());
            AnonymousClass0OA anonymousClass0OA;
            if (followersShareFragment.f64934R.Q()) {
                List<AnonymousClass0OA> arrayList = new ArrayList();
                for (MediaSession mediaSession : followersShareFragment.f64934R.I()) {
                    String B = mediaSession.B();
                    switch (mediaSession.f38977C.ordinal()) {
                        case 1:
                            if (!((Boolean) AnonymousClass0CC.Xd.H(followersShareFragment.f64938V)).booleanValue()) {
                                break;
                            }
                        case 0:
                            arrayList.add(followersShareFragment.f64929M.LP(B));
                            break;
                        default:
                            break;
                    }
                }
                Context activity = followersShareFragment.getActivity();
                String str = followersShareFragment.f64938V.f1759C;
                ArrayList arrayList2 = new ArrayList();
                for (AnonymousClass0OA anonymousClass0OA2 : arrayList) {
                    arrayList2.add(new MediaTaggingInfo(anonymousClass0OA2.UB, new File(anonymousClass0OA2.DB).toURI().toString(), anonymousClass0OA2.gB, null, null, anonymousClass0OA2.HC));
                }
                G = AnonymousClass1YC.G(activity, str, arrayList2, 20);
            } else {
                Context context = followersShareFragment.getContext();
                anonymousClass0OA2 = followersShareFragment.f64927K;
                G = AnonymousClass1YC.F(context, followersShareFragment.f64938V.f1759C, anonymousClass0OA2.UB, anonymousClass0OA2.f3795I, new File(anonymousClass0OA2.DB).toURI().toString(), anonymousClass0OA2.gB, anonymousClass0OA2.HC);
            }
            AnonymousClass0IW.L(G, 1001, followersShareFragment);
            return;
        }
        f64917k = true;
        AnonymousClass0Cm anonymousClass0Cm = followersShareFragment.f64938V;
        AnonymousClass1fg.H(anonymousClass0Cm, anonymousClass0Cm.B(), followersShareFragment.getContext(), "creation_flow");
    }

    /* renamed from: K */
    public static void m27041K(FollowersShareFragment followersShareFragment) {
        AnonymousClass0JI.getInstance().removeLocationUpdates(followersShareFragment.f64949g);
        AnonymousClass0JI.getInstance().cancelSignalPackageRequest(followersShareFragment.f64948f);
    }

    /* renamed from: L */
    public static void m27042L(FollowersShareFragment followersShareFragment) {
        View view = followersShareFragment.mAddHashtagsRow;
        if (view != null) {
            ((TextView) view.findViewById(C0164R.id.hashtag_count)).setText(AnonymousClass4Wj.B(followersShareFragment.getActivity(), followersShareFragment.f64927K.BB));
        }
    }

    /* renamed from: M */
    public static void m27043M(FollowersShareFragment followersShareFragment) {
        Object obj = null;
        for (AnonymousClass3ew anonymousClass3ew : AnonymousClass3ew.C(followersShareFragment.getContext(), followersShareFragment.f64938V)) {
            if (anonymousClass3ew.J(followersShareFragment.f64938V, followersShareFragment.f64927K)) {
                obj = 1;
            } else {
                anonymousClass3ew.M(followersShareFragment.f64927K, false);
            }
        }
        followersShareFragment.mShareTable.m26228A(followersShareFragment.f64927K);
        boolean A = followersShareFragment.f64927K.b().A();
        float f = (obj == null || A) ? 0.3f : 1.0f;
        followersShareFragment.mShareTable.setAlpha(f);
        followersShareFragment.mShareTitleContainer.setAlpha(f);
        followersShareFragment.mShareTable.setOnSharingToggleListener(followersShareFragment);
        followersShareFragment.mShareTable.setEnabled(A ^ true);
    }

    /* renamed from: N */
    public static void m27044N(FollowersShareFragment followersShareFragment) {
        Object obj;
        List I;
        CharSequence charSequence;
        if (!(followersShareFragment.f64927K.gB == AnonymousClass0ON.PHOTO || (followersShareFragment.f64934R.Q() && followersShareFragment.f64934R.O()))) {
            if (followersShareFragment.f64941Y) {
                if (followersShareFragment.f64927K.gB != AnonymousClass0ON.VIDEO) {
                    if (followersShareFragment.f64934R.Q()) {
                    }
                }
            }
            obj = null;
            if (obj == null) {
                followersShareFragment.mPeopleTagRow.setVisibility(8);
            } else if (AnonymousClass1YC.H(followersShareFragment.f64934R) <= 0) {
                followersShareFragment.mPeopleTagRow.setAlpha(0.3f);
                followersShareFragment.mPeopleTagRow.setOnClickListener(null);
                followersShareFragment.mPeopleTextView.setVisibility(8);
            } else {
                followersShareFragment.mPeopleTagRow.setAlpha(1.0f);
                followersShareFragment.mPeopleTagRow.setOnClickListener(followersShareFragment.f64930N);
                I = AnonymousClass1YC.I(followersShareFragment.f64934R);
                if (I.isEmpty()) {
                    TextView textView = followersShareFragment.mPeopleTextView;
                    if (I.size() != 1) {
                        charSequence = (String) I.get(0);
                    } else {
                        charSequence = followersShareFragment.getString(C0164R.string.people_tagging_x_people, new Object[]{Integer.valueOf(I.size())});
                    }
                    textView.setText(charSequence);
                    followersShareFragment.mPeopleTextView.setVisibility(0);
                } else {
                    followersShareFragment.mPeopleTextView.setVisibility(8);
                }
            }
            followersShareFragment.m27049S();
        }
        obj = 1;
        if (obj == null) {
            followersShareFragment.mPeopleTagRow.setVisibility(8);
        } else if (AnonymousClass1YC.H(followersShareFragment.f64934R) <= 0) {
            followersShareFragment.mPeopleTagRow.setAlpha(1.0f);
            followersShareFragment.mPeopleTagRow.setOnClickListener(followersShareFragment.f64930N);
            I = AnonymousClass1YC.I(followersShareFragment.f64934R);
            if (I.isEmpty()) {
                followersShareFragment.mPeopleTextView.setVisibility(8);
            } else {
                TextView textView2 = followersShareFragment.mPeopleTextView;
                if (I.size() != 1) {
                    charSequence = followersShareFragment.getString(C0164R.string.people_tagging_x_people, new Object[]{Integer.valueOf(I.size())});
                } else {
                    charSequence = (String) I.get(0);
                }
                textView2.setText(charSequence);
                followersShareFragment.mPeopleTextView.setVisibility(0);
            }
        } else {
            followersShareFragment.mPeopleTagRow.setAlpha(0.3f);
            followersShareFragment.mPeopleTagRow.setOnClickListener(null);
            followersShareFragment.mPeopleTextView.setVisibility(8);
        }
        followersShareFragment.m27049S();
    }

    /* renamed from: O */
    private void m27045O(ArrayList arrayList, boolean z) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            FbFriend fbFriend = ((FbFriendTag) arrayList.get(i)).f27813B;
            if (fbFriend != null) {
                AnonymousClass1ak anonymousClass1ak = this.f64947e;
                String id = fbFriend.getId();
                AnonymousClass0Cm anonymousClass0Cm = this.f64938V;
                AnonymousClass0NN C = AnonymousClass1ak.C(anonymousClass1ak, "invite_tag_share_attempt");
                C.F("receiver_fbid", id);
                C.F("tag_post_type", z ? "single_photo" : "sidecar");
                AnonymousClass1ak.B(C, anonymousClass0Cm);
                C.R();
            }
        }
    }

    /* renamed from: P */
    private void m27046P(AnonymousClass0OA anonymousClass0OA) {
        Object obj = (AnonymousClass1Ba.D(getContext(), "android.permission.WRITE_EXTERNAL_STORAGE") && AnonymousClass0HV.D(this.f64938V).X()) ? 1 : null;
        if (obj != null) {
            AnonymousClass0GG.B(AnonymousClass0Fx.B(), new AnonymousClass4VY(this, anonymousClass0OA.DB), -1791551369);
        }
    }

    /* renamed from: Q */
    private void m27047Q(AnonymousClass3ew anonymousClass3ew) {
        if (this.mAdvancedSettingRow == null || !anonymousClass3ew.equals(AnonymousClass3ew.FACEBOOK)) {
            return;
        }
        Object obj;
        if (anonymousClass3ew.I(this.f64927K)) {
            obj = (AnonymousClass0HV.D(this.f64938V).f2646B.getInt("fb_feed_crossposting_advanced_settings_tooltip", 0) < 3 && AnonymousClass0Mt.C() && this.f64919C) ? 1 : null;
            if (obj != null) {
                AnonymousClass2MW anonymousClass2MW = this.f64922F;
                AnonymousClass0Cm anonymousClass0Cm = this.f64938V;
                View findViewById = this.mAdvancedSettingRow.findViewById(C0164R.id.advanced_settings_text_view);
                if (anonymousClass2MW.f29560B == null) {
                    AnonymousClass173 anonymousClass173 = new AnonymousClass173((Activity) findViewById.getContext(), new AnonymousClass174(findViewById.getResources().getString(C0164R.string.story_auto_xpost_to_fb_tooltip_text)));
                    anonymousClass173.f14646L = true;
                    AnonymousClass173 C = anonymousClass173.C(findViewById);
                    C.f14642H = AnonymousClass177.BELOW_ANCHOR;
                    C.f14636B = true;
                    C.f14638D = 3000;
                    C.f14640F = new AnonymousClass2ck(anonymousClass2MW, anonymousClass0Cm);
                    anonymousClass2MW.f29560B = C.A();
                }
                anonymousClass2MW.f29560B.C();
                return;
            }
            return;
        }
        AnonymousClass0Cm anonymousClass0Cm2 = this.f64938V;
        Context context = getContext();
        boolean z = this.f64919C;
        AnonymousClass0HV D = AnonymousClass0HV.D(anonymousClass0Cm2);
        obj = (!AnonymousClass0Mt.C() && AnonymousClass0a2.K(anonymousClass0Cm2) && D.f2646B.getInt("feed_fb_autoshare_upsell_dialog_display_count", 0) < 3 && AnonymousClass2Mb.B(D.f2646B.getLong("feed_fb_autoshare_upsell_dialog_last_seen_sec", 0)) && anonymousClass0Cm2.B().j() && z && ((Boolean) AnonymousClass0CC.mK.H(anonymousClass0Cm2)).booleanValue()) ? 1 : null;
        if (obj != null) {
            new AnonymousClass0Sb(context).Q(C0164R.string.feed_auto_xpost_to_fb_upsell_dialog_title).H(C0164R.string.feed_auto_xpost_to_fb_upsell_dialog_message).E(true).F(true).B().O(C0164R.string.feed_auto_xpost_to_fb_upsell_dialog_confirm, new AnonymousClass2Ma(this)).L(C0164R.string.not_now, new AnonymousClass2MZ(this)).N(new AnonymousClass2MY(this)).C().show();
            AnonymousClass0NN.B("ig_feed_share_sheet_share_to_fb_dialog", this).H("dialog_impression", true).R();
            AnonymousClass0HV D2 = AnonymousClass0HV.D(anonymousClass0Cm2);
            D2.f2646B.edit().putInt("feed_fb_autoshare_upsell_dialog_display_count", D2.f2646B.getInt("feed_fb_autoshare_upsell_dialog_display_count", 0) + 1).apply();
            D2.f2646B.edit().putLong("feed_fb_autoshare_upsell_dialog_last_seen_sec", TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())).apply();
        }
        AnonymousClass2MW anonymousClass2MW2 = this.f64922F;
        AnonymousClass0iq anonymousClass0iq = anonymousClass2MW2.f29560B;
        if (anonymousClass0iq != null && anonymousClass0iq.B()) {
            anonymousClass2MW2.f29560B.A(true);
        }
    }

    /* renamed from: R */
    private void m27048R(Location location) {
        this.f64931O = location;
        if (location != null) {
            this.f64927K.EC = location.getLatitude();
            this.f64927K.FC = location.getLongitude();
        }
        m27041K(this);
    }

    /* renamed from: S */
    private void m27049S() {
        if (this.mProductTagRow != null) {
            if (AnonymousClass1YC.I(this.f64934R).isEmpty()) {
                int H = AnonymousClass1YC.H(this.f64934R);
                this.mProductTagRow.setAlpha(1.0f);
                this.mProductTagRow.setOnClickListener(this.f64951i);
                if (H > 0) {
                    this.mProductTextView.setText(getResources().getQuantityString(C0164R.plurals.num_products_formatted, H, new Object[]{Integer.valueOf(H)}));
                    this.mProductTextView.setVisibility(0);
                    return;
                }
                this.mProductTextView.setVisibility(8);
                return;
            }
            this.mProductTagRow.setAlpha(0.3f);
            this.mProductTagRow.setOnClickListener(null);
            this.mProductTextView.setVisibility(8);
        }
    }

    /* renamed from: b */
    public final void m27050b(AnonymousClass0Ci anonymousClass0Ci) {
        if (AnonymousClass53S.m25644B(this.f64927K)) {
            this.f64927K.b().f16858B = anonymousClass0Ci.equals(this.f64938V.B()) ? null : anonymousClass0Ci.getId();
            m27043M(this);
        }
    }

    /* renamed from: c */
    public final void m27051c() {
        String C = AnonymousClass4Wt.C(this.f64938V.f1759C);
        AnonymousClass4Wt.D(this, C);
        AnonymousClass2NY.B().f29724U = true;
        Location location = this.f64928L;
        if (location == null) {
            location = this.f64931O;
        }
        AnonymousClass3HZ.B(new AnonymousClass3zX(C, location, this.f64937U));
    }

    /* renamed from: d */
    public final void m27052d(Venue venue, int i) {
        m27038H(this, venue, i);
        Location location = this.f64928L;
        this.f64928L = location;
        if (location != null) {
            this.f64927K.f3828p = location.getLatitude();
            this.f64927K.f3829q = location.getLongitude();
        }
        m27048R(this.f64931O);
        Location location2 = this.f64928L;
        if (location2 != null) {
            this.f64927K.ZB = location2.getLatitude();
            this.f64927K.aB = this.f64928L.getLongitude();
        } else {
            location2 = this.f64931O;
            if (location2 != null) {
                this.f64927K.ZB = location2.getLatitude();
                this.f64927K.aB = this.f64931O.getLongitude();
            }
        }
        if (getView() != null) {
            AnonymousClass4X4 anonymousClass4X4 = this.mLocationSuggestionsRow;
            anonymousClass4X4.f54937J = venue;
            if (venue != null) {
                AnonymousClass4X4.B(anonymousClass4X4, AnonymousClass4X3.LOCATION_NAMED);
            }
            this.mShareTable.m26228A(this.f64927K);
        }
        AnonymousClass2NY.B().f29724U = true;
        PendingMediaStoreSerializer.C().C();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        super.onActivityResult(i, i2, intent);
        if (i != JsonMappingException.MAX_REFS_TO_LIST) {
            if (i != 1001) {
                if (i != 49581) {
                    AnonymousClass3ev.B(this.f64938V, i3, i4, intent2, this.f64946d.f8701B, this.f64927K);
                    AnonymousClass5JS anonymousClass5JS = this.mShareTable;
                    if (anonymousClass5JS != null) {
                        anonymousClass5JS.m26228A(this.f64927K);
                        return;
                    }
                    return;
                } else if (i2 == -1) {
                    this.f64927K.BB = intent.getParcelableArrayListExtra("extra_selected_hashtags");
                    m27042L(this);
                    return;
                } else {
                    return;
                }
            }
        }
        if (i2 == -1) {
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("media_tagging_info_list");
            int size = parcelableArrayListExtra.size();
            for (int i5 = 0; i5 < size; i5++) {
                MediaTaggingInfo mediaTaggingInfo = (MediaTaggingInfo) parcelableArrayListExtra.get(i5);
                AnonymousClass0OA LP = this.f64929M.LP(mediaTaggingInfo.f43451F);
                if (i == JsonMappingException.MAX_REFS_TO_LIST) {
                    LP.yB = mediaTaggingInfo.f43454I;
                    LP.f3834v = mediaTaggingInfo.f43449D;
                } else {
                    LP.HC = mediaTaggingInfo.f43455J;
                    AnonymousClass2NY.B().f29736g = mediaTaggingInfo.f43455J.size();
                }
                m27044N(this);
            }
            this.f64929M.rE();
        }
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        AnonymousClass0F4.f2058E.A(AnonymousClass4Vl.class, this.f64942Z);
        this.f64932P = (AnonymousClass0PL) getActivity();
    }

    public final boolean onBackPressed() {
        if (this.f64927K.iC != AnonymousClass0OC.DRAFT) {
            AnonymousClass0GK.E(getActivity(), this.f64938V);
            AnonymousClass0OA anonymousClass0OA = this.f64927K;
            AnonymousClass0OC anonymousClass0OC = AnonymousClass0OC.NOT_UPLOADED;
            anonymousClass0OA.iC = anonymousClass0OC;
            anonymousClass0OA.y(anonymousClass0OC);
            PendingMediaStoreSerializer.C().C();
            if (this.f64927K.k()) {
                this.f64927K.z(new ArrayList());
            }
        }
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 804483905);
        super.onCreate(bundle);
        this.f64938V = AnonymousClass0Ce.G(getArguments());
        this.f64923G = new AnonymousClass0kV(getActivity(), this.f64938V);
        AnonymousClass0TK B = AnonymousClass0Jn.f2942B.B(this.f64938V);
        this.f64936T = B;
        registerLifecycleListener(B);
        this.f64920D = new AnonymousClass32q(getActivity());
        this.f64934R = ((AnonymousClass0PI) getContext()).VK();
        this.f64929M = (AnonymousClass0PJ) getActivity();
        this.f64928L = this.f64934R.G();
        this.f64946d = new AnonymousClass0iO(this.f64938V, this, this, new AnonymousClass4VL(this));
        boolean z = !((Boolean) AnonymousClass0CC.kK.H(this.f64938V)).booleanValue() && ((Boolean) AnonymousClass0CC.kJ.H(this.f64938V)).booleanValue();
        this.f64919C = z;
        this.f64924H = ((Boolean) AnonymousClass0CC.LN.H(this.f64938V)).booleanValue();
        this.f64929M.HJA(new AnonymousClass4VM(this));
        if (bundle == null) {
            bundle = getArguments();
        }
        if (bundle != null) {
            this.f64925I = bundle.getBoolean("favorites_switch_enabled", false);
            if (bundle.getBoolean("INTENT_EXTRA_RENDER_IMAGE", false)) {
                this.f64933Q = true;
                AnonymousClass0PK anonymousClass0PK = (AnonymousClass0PK) getActivity();
                anonymousClass0PK.JL().B(AnonymousClass3Cc.PROCESSING);
                anonymousClass0PK.gQ(this.f64934R.K()).E(new AnonymousClass3zI(getContext(), this.f64934R.D(), anonymousClass0PK.JL(), new AnonymousClass4VN(this), this.f64934R.f38950D, this.f64934R.f38961O), this.f64934R.F(), new AnonymousClass3Gv[]{AnonymousClass3Gv.UPLOAD});
            }
        }
        AnonymousClass0F4.f2058E.A(AnonymousClass4Vn.class, this.f64952j);
        AnonymousClass0F4.f2058E.A(AnonymousClass4WB.class, this.f64944b);
        AnonymousClass0F4.f2058E.A(AnonymousClass4WF.class, this.f64950h);
        AnonymousClass0F4.f2058E.A(AnonymousClass4WC.class, this.f64943a);
        AnonymousClass0F4.f2058E.A(AnonymousClass4WD.class, this.f64945c);
        AnonymousClass0CC.oY.E(this.f64938V);
        this.f64935S = new AnonymousClass53S(getActivity(), this.f64938V, this);
        AnonymousClass0OA anonymousClass0OA = this.f64927K;
        AnonymousClass3f3.E(this, anonymousClass0OA != null ? anonymousClass0OA.getId() : "null", "composer");
        AnonymousClass0cQ.G(this, 1867456787, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1541169668);
        View inflate = layoutInflater.inflate(C0164R.layout.fragment_followers_share_metadata, viewGroup, false);
        this.mCaptionBox = (IgAutoCompleteTextView) inflate.findViewById(C0164R.id.caption_text_view);
        this.mShareTitleContainer = inflate.findViewById(C0164R.id.share_title_container);
        AnonymousClass0cQ.G(this, 116749413, F);
        return inflate;
    }

    public final void onDestroy() {
        int F = AnonymousClass0cQ.F(this, 2131607319);
        super.onDestroy();
        AnonymousClass0F4.f2058E.D(AnonymousClass4XW.class, this.f64939W);
        AnonymousClass0F4.f2058E.D(AnonymousClass4Vn.class, this.f64952j);
        AnonymousClass0F4.f2058E.D(AnonymousClass4WC.class, this.f64943a);
        AnonymousClass0F4.f2058E.D(AnonymousClass4WB.class, this.f64944b);
        AnonymousClass0F4.f2058E.D(AnonymousClass4WF.class, this.f64950h);
        AnonymousClass0F4.f2058E.D(AnonymousClass4WD.class, this.f64945c);
        AnonymousClass0cQ.G(this, -318735711, F);
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, 996345453);
        super.onDestroyView();
        m27041K(this);
        if (this.f64940X != null) {
            AnonymousClass0F4.f2058E.D(AnonymousClass4XX.class, this.f64940X);
        }
        this.f64921E = null;
        FollowersShareFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0cQ.G(this, 817938007, F);
    }

    public final void onDetach() {
        int F = AnonymousClass0cQ.F(this, -77477914);
        super.onDetach();
        AnonymousClass0F4.f2058E.D(AnonymousClass4Vl.class, this.f64942Z);
        AnonymousClass0cQ.G(this, -2010916673, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, -1404160504);
        super.onPause();
        AnonymousClass0Nm.N(getView());
        getActivity().getWindow().setSoftInputMode(0);
        this.f64927K.f3809W = this.f64921E.f54986C.getText().toString();
        PendingMediaStoreSerializer.C().C();
        m27041K(this);
        AnonymousClass0cQ.G(this, 1816313596, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 2125116302);
        super.onResume();
        getActivity().setRequestedOrientation(-1);
        getActivity().getWindow().setSoftInputMode(16);
        getActivity().getWindow().clearFlags(DexStore.LOAD_RESULT_MIXED_MODE);
        if (f64917k && AnonymousClass1fg.I(this.f64938V)) {
            f64917k = false;
            m27040J(this);
        }
        this.f64929M.HJA(new AnonymousClass4VZ(this));
        AnonymousClass0Cm anonymousClass0Cm = this.f64938V;
        View view = this.mPeopleTagRow;
        AnonymousClass0HV D = AnonymousClass0HV.D(anonymousClass0Cm);
        Object obj = (!AnonymousClass0FO.Q() || D.f2646B.getInt("preference_fb_friend_tag_tooltip_display_count", 0) >= 3 || new Date().getTime() - D.f2646B.getLong("preference_fb_friend_tag_tooltip_last_display_ts", 0) <= AnonymousClass2Me.f29567C || !((Boolean) AnonymousClass0CC.jX.H(anonymousClass0Cm)).booleanValue()) ? null : 1;
        if (obj != null) {
            if (AnonymousClass2Me.f29568D == null) {
                AnonymousClass2Me.f29568D = new AnonymousClass2Me();
            }
            view.post(new AnonymousClass2Md(AnonymousClass2Me.f29568D, anonymousClass0Cm, view));
        }
        AnonymousClass0cQ.G(this, 1926135775, F);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("favorites_switch_enabled", this.f64925I);
        bundle.putBoolean("INTENT_EXTRA_RENDER_IMAGE", this.f64933Q);
    }

    public final void onStop() {
        int F = AnonymousClass0cQ.F(this, 1188762401);
        m27041K(this);
        super.onStop();
        AnonymousClass0cQ.G(this, 1846157224, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f64932P.KO().setShouldShowUserSpinner(false);
        this.f64929M.HJA(new AnonymousClass4VO(this, view));
        this.f64947e = new AnonymousClass1ak(this, AnonymousClass0iy.PHOTO_TAG);
    }
}

package com.instagram.business.instantexperiences.ui;

import X.AnonymousClass0Cm;
import X.AnonymousClass5h9;
import X.AnonymousClass5hJ;
import X.AnonymousClass6Cy;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public class InstantExperiencesBrowserChrome extends LinearLayout {
    /* renamed from: B */
    public TextView f68178B;
    /* renamed from: C */
    public TextView f68179C;
    /* renamed from: D */
    public TextView f68180D;
    /* renamed from: E */
    public Context f68181E;
    /* renamed from: F */
    public AnonymousClass5hJ f68182F;
    /* renamed from: G */
    public AnonymousClass6Cy f68183G;
    /* renamed from: H */
    public final OnClickListener f68184H = new AnonymousClass5h9(this);
    /* renamed from: I */
    public ImageView f68185I;
    /* renamed from: J */
    public Executor f68186J;
    /* renamed from: K */
    public AnonymousClass0Cm f68187K;

    public InstantExperiencesBrowserChrome(Context context) {
        super(context);
    }

    public InstantExperiencesBrowserChrome(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68181E = context;
    }

    public static CharSequence[] getMenuOptions(InstantExperiencesBrowserChrome instantExperiencesBrowserChrome) {
        List arrayList = new ArrayList();
        CharSequence[] charSequenceArr = new CharSequence[arrayList.size()];
        arrayList.add(instantExperiencesBrowserChrome.getContext().getString(C0164R.string.instant_experiences_refresh));
        arrayList.add(instantExperiencesBrowserChrome.getContext().getString(C0164R.string.instant_experiences_copy_link));
        Uri parse = Uri.parse(instantExperiencesBrowserChrome.f68182F.m28274A().getUrl());
        Object obj = (parse == null || !("http".equals(parse.getScheme()) || "https".equals(parse.getScheme()))) ? null : 1;
        if (obj != null) {
            arrayList.add(instantExperiencesBrowserChrome.getContext().getString(C0164R.string.instant_experiences_open_with));
        }
        arrayList.add(instantExperiencesBrowserChrome.getContext().getString(C0164R.string.instant_experiences_clear_autofill));
        return (CharSequence[]) arrayList.toArray(charSequenceArr);
    }

    public void setInstantExperiencesBrowserChromeListener(AnonymousClass6Cy anonymousClass6Cy) {
        this.f68183G = anonymousClass6Cy;
    }
}
